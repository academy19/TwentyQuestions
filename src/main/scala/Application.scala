import scala.io.StdIn

object Application {

  val jimmyFloydHasselbaink = new Person("jimmyFloydHasselbaink",true, false,true)
  val nyronNosworthy = new Person("nyronNosworthy",true, false, true)
  val ericDjembaDjemba = new Person("ericDjembaDjemba",true, true, false)
  val KrisKardashian = new Person("KrisKardashian",false, true, false)
  val KimKardashian = new Person("KimKardashian",false, false, true)


  val listOfPeople = new ListOfPeopleAfterQuestion(List(jimmyFloydHasselbaink, nyronNosworthy, ericDjembaDjemba, KrisKardashian, KimKardashian))
  val listOfPeoplex = List(jimmyFloydHasselbaink, nyronNosworthy, ericDjembaDjemba, KrisKardashian, KimKardashian)


  def userAnswer(questionYouWantToAsk : String) : Boolean = {

    val userInput = StdIn.readLine(s"$questionYouWantToAsk").toUpperCase()

    userInput match {
      case "YES" => true
      case "NO"  => false
      case _      => userAnswer(questionYouWantToAsk)
    }

  }

  def main(args: Array[String]): Unit = {

    println (listOfPeople.isPersonMaleQuestion(userAnswer("Is person male?\n"))
                         .isAgeGreaterThan50(userAnswer("Is person older than 50 years old?\n"))
                         .isDecentPerson(userAnswer("Are they a decent person?\n")) )






  }

}
