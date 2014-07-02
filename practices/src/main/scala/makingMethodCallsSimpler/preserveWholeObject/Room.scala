package makingMethodCallsSimpler.preserveWholeObject

class Room(range:TempRange) {
  def withinPlan(plan: HeatingPlan): Boolean = {
    val low = range.low
    val high = range.high
    plan.withinRange(low, high);
  }
}
