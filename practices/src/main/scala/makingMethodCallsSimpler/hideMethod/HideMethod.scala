package makingMethodCallsSimpler.hideMethod

class HideMethod() {
  def getLastReadingName(): String = {
    val readings = List("Refactoring", "Clean Code")
    getLast(readings);
  }

  def getLast(readings:List[String]):String = {
    readings.last
  }
}
