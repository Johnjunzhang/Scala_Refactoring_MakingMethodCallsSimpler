package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import java.util.{GregorianCalendar, Calendar}
import makingMethodCallsSimpler.introduceParameterObject.{Entry, Account}

@RunWith(classOf[JUnitRunner])
class IntroduceParameterObjectFact extends FunSpec with Matchers {
  describe("IntroduceParameterObjectFact") {
    it("should_get_flow_between_start_time_and_end_time") {
      val entries = List[Entry](new Entry(10, createCalendar(2012, 4, 1)), new Entry(20, createCalendar(2012, 6, 1)));
      val account = new Account(entries);
      val flows = account.getFlowBetween(createCalendar(2012, 3, 1), createCalendar(2012, 4, 2));
      flows should be(10)
    }

    def createCalendar(year: Int, month: Int, day: Int): Calendar = {
      val calendar = new GregorianCalendar()
      calendar.set(Calendar.YEAR, year)
      calendar.set(Calendar.MONTH, month)
      calendar.set(Calendar.DAY_OF_MONTH, day)
      calendar
    }
  }
}
