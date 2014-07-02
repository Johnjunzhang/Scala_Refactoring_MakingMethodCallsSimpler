package movingFeatures.extractClass

import java.util.{GregorianCalendar, Calendar}

class AddParameter() {
  def getContact(): String = {
    val currentDate = Calendar.getInstance()
    if (currentDate.after(createCalendar(12))) "Kent" else "Martin"
  }

  def createCalendar(day: Int): Calendar = {
    val calendar = new GregorianCalendar()
    calendar.set(Calendar.YEAR, 2011)
    calendar.set(Calendar.MONTH, 11)
    calendar.set(Calendar.DAY_OF_MONTH, day)
    calendar
  }
}
