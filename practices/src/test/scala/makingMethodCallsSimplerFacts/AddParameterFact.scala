package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.extractClass.AddParameter

@RunWith(classOf[JUnitRunner])
class AddParameterFact extends FunSpec with Matchers {
  describe("AddParameterFact") {
    it("should_get_contact_name") {
      val addParameter = new AddParameter();
      addParameter.getContact() should be("Kent")
    }
  }
}
