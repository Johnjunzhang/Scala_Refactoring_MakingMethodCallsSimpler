package makingMethodCallsSimpler.introduceParameterObject

import java.util.Calendar

class Account(entries: List[Entry]) {
  def getFlowBetween(start:Calendar, end:Calendar):Int =
  {
    val entriesWithinStartAndEnd = entries.filter(entry => entry.chargeDate.after(start) && entry.chargeDate.before(end))
    entriesWithinStartAndEnd.map(entry => entry.value).sum
  }
}
