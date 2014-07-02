package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import makingMethodCallsSimpler.encapsulateDowncast.Site
import makingMethodCallsSimpler.hideMethod.HideMethod

@RunWith(classOf[JUnitRunner])
class HideMethodFact extends FunSpec with Matchers {
  describe("HideMethodFact") {
    it("should_get_last_reading_name") {
      val hideMethod = new HideMethod()
      hideMethod.getLastReadingName() should be("Clean Code")
    }
  }
}
