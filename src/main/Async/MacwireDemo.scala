package Async
import com.softwaremill.macwire._  //useful for dependence wiring

object MacwireDemo extends App {
  case class Field()
  case class Digger()
  case class PotatoFarm(field: Field, digger: Digger) {
    println("New potato farm! Rejoice!")
  }

  case class CowPasture(potatoFarm: PotatoFarm)
  case class Meatery(cowPasture: CowPasture)

  case class Restaurant(potatoFarm: PotatoFarm, meatery: Meatery) {
    def orderSteakWithPotatoes():Unit = {
      println(s"Welcome to $this. Here's your order")
    }
  }

//  lazy val field = new Field()
//  lazy val potatoFarm = new PotatoFarm(field,digger)
//  lazy val digger = new Digger()
//
//  lazy val cowPasture = new CowPasture()
//  lazy val meatery = new Meatery(cowPasture)
//  lazy val restaurant = new Restaurant(potatoFarm,meatery)

  trait CropModule {
    lazy val field = wire[Field]
    //  lazy val potatoFarm = wire[PotatoFarm] // singlton
    //   if want to change the scope from singlton to not singlton
    //  just change to
    def potatoFarm = wire[PotatoFarm]
    lazy val digger = wire[Digger]
  }

  trait LivestockModule  extends CropModule{
    lazy val cowPasture = wire[CowPasture]
    lazy val meatery = wire[Meatery]


  }

  trait ResturantModule extends LivestockModule with CropModule{
    lazy val restaurant = wire[Restaurant]
  }
  val app = new CropModule with LivestockModule with ResturantModule
  app.restaurant.orderSteakWithPotatoes()

}