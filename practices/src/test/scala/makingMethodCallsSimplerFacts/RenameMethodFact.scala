package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import makingMethodCallsSimpler.renameMethod.RenameMethod

@RunWith(classOf[JUnitRunner])
class RenameMethodFact extends FunSpec with Matchers {
  describe("RenameMethodFact") {
    it("should_get_office_telephone_number_for_customer") {
      val customer = new RenameMethod("CA", "0011");
      customer.getTelephoneNumber() should be("(CA) 0011")
    }
  }
}
