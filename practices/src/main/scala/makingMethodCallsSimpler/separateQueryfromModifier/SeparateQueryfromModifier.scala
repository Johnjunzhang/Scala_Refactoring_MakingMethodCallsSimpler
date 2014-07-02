package makingMethodCallsSimpler.separateQueryfromModifier

class SeparateQueryfromModifier() {
  var alertedMessage: String = "";

  def checkSecurity(people: List[String]): String = {
    val found = foundMiscreant(people);
    someLaterCode(found);
  }

  def someLaterCode(found: String): String = {
    alertedMessage + found;
  }

  def foundMiscreant(peopleNames: List[String]): String = {
    for (name <- peopleNames) {
      if (name.equals("Don")) {
        sendAlert();
        return "Don";
      }
      if (name.equals("John")) {
        sendAlert();
        return "John";
      }
    }
    return "";
  }

  def sendAlert(): Unit = {
    alertedMessage = "Alert";
  }
}
