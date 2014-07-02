package makingMethodCallsSimpler.preserveWholeObject

class HeatingPlan(range:TempRange) {
  def withinRange(low: Int, high: Int): Boolean = {
    low >= range.low && high <= range.high;
  }
}
