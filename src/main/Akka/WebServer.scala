import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer

import scala.io.StdIn

object WebServer{
  def main(args: Array[String]) {

    implicit val system = ActorSystem("my-system")
    implicit val materializer = ActorMaterializer()
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.dispatcher

    //http://localhost:8080/?username=admin&password=1234
    def secure(route: Route):Route = {
      parameter("username","password") {(username,password) =>
        if(username == "admin" && password == "1234") {
          route
        } else {
          ctx => ctx.complete(401, "bad user")
        }
      }
    }
    val route =
         secure { // http://localhost:8080/welcome?username=admin&password=1234
             path("welcome") {
               get {
                 complete("Welcome to the potato & steak take-away!")
               }
             }
         } ~
         path("") {
           get {
             complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
           }
         } ~
         path("order" / "potatoes") {
           parameter("mashed".as[Boolean], "number".as[Int], "special" ?) {
             (mashed, number, special) =>
               complete {
                 s"You have orderd ${mashed} potatoes,${number + 1} (one is free)" +
                   s"Special wished: ${special.getOrElse("none")}"
               }
           }
         }


    val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)

    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}