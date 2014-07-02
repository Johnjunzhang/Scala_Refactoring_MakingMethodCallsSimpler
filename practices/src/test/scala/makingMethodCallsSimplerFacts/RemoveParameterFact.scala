package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import makingMethodCallsSimpler.preserveWholeObject.Room
import makingMethodCallsSimpler.removeParameter.RemoveParameter
import java.util.Calendar

@RunWith(classOf[JUnitRunner])
class RemoveParameterFact extends FunSpec with Matchers {
  describe("RemoveParameterFact") {
    it("should_get_contact_name") {
      val removeParameter = new RemoveParameter();
      removeParameter.getContact(Calendar.getInstance()) should be("Kent")
    }
  }
}
