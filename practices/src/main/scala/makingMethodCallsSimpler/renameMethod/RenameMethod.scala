package makingMethodCallsSimpler.renameMethod

class RenameMethod(officeAreaCode: String, officeNumber: String) {
  def getTelephoneNumber(): String = {
    ("(" + officeAreaCode + ") " + officeNumber);
  }
}
