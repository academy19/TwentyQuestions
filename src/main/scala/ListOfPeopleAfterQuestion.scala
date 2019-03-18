case class ListOfPeopleAfterQuestion(listOfPeople: List[Person]) {

  override def toString: String = {

    listOfPeople match {
      case Nil => "Nobody matches this description"
      case _              => s"$listOfPeople"
    }

  }

    def isPersonMaleQuestion(isPersonMale3: Boolean): ListOfPeopleAfterQuestion = {

      new ListOfPeopleAfterQuestion(listOfPeople.filter(person => person.isPersonMale == isPersonMale3))
    }

    def isAgeGreaterThan50(isAgeGreaterThan50x: Boolean): ListOfPeopleAfterQuestion = {

      new ListOfPeopleAfterQuestion(listOfPeople.filter(person => person.isAgeGreaterThan50 == isAgeGreaterThan50x))
    }

    def isDecentPerson(isDecentPersonx: Boolean): ListOfPeopleAfterQuestion = {

      new ListOfPeopleAfterQuestion(listOfPeople.filter(person => person.isDecentPerson == isDecentPersonx))
    }



}
