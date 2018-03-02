// An object is a singleton.
// One object, that's it.
// This object is a replacement of static in Java,
// and is called upon much in the same way:

object Greeting {
  def english = "Hi"

  def espanol = "Hola"

}
Greeting.english
Greeting.espanol

//Here is a proof that an object is a singleton, and not a static method in a class:

val x = Greeting
val y = x

x eq y //Reminder: eq checks for reference

val z = Greeting

x eq z

//An object that has the same name as a class is called a companion object of the class, and it is often used to contain factory methods for the class that it complements:
class Movie(val name: String, val year: Short)

object Movie {
  def academyAwardBestMoviesForYear(x: Short) = {
    //This is a match statement, more powerful than a Java switch statement!
    x match {
      case 1930 ⇒ Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 ⇒ Some(new Movie("Cimarron", 1931))
      case 1932 ⇒ Some(new Movie("Grand Hotel", 1932))
      case _ ⇒ None
    }
  }
}

Movie.academyAwardBestMoviesForYear(1932).get.name


//A companion object can also see private values and variables of the corresponding classes' instantiated objects:

class Person(val name: String, private val superheroName: String) //The superhero name is private!

object Person {
  def showMeInnerSecret(x: Person) = x.superheroName
}

val clark = new Person("Clark Kent", "Superman")
val peter = new Person("Peter Parker", "Spiderman")

Person.showMeInnerSecret(clark) //should be("Superman")
Person.showMeInnerSecret(peter) //should be("Spiderman")