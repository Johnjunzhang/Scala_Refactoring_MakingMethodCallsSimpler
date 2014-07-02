package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import makingMethodCallsSimpler.replaceParameterwithMethod.ReplaceParameterwithMethodExample2
import makingMethodCallsSimpler.separateQueryfromModifier.SeparateQueryfromModifier

@RunWith(classOf[JUnitRunner])
class SeparateQueryfromModifierFact extends FunSpec with Matchers {
  describe("SeparateQueryfromModifierFact") {
    it("should_get_alert_message_if_people_names_include_don") {
      val peopleNames = List("Don", "Kent")
      val separateQueryfromModifier = new SeparateQueryfromModifier();
      val alertMessage = separateQueryfromModifier.checkSecurity(peopleNames);
      alertMessage should be("AlertDon")
    }

    it("should_get_alert_message_if_people_names_include_john") {
      val peopleNames = List("John", "Kent")
      val separateQueryfromModifier = new SeparateQueryfromModifier();
      val alertMessage = separateQueryfromModifier.checkSecurity(peopleNames);
      alertMessage should be("AlertJohn")
    }

    it("should_not_get_alert_message_if_people_names_does_include_don_and_john") {
      val peopleNames = List("Martin", "Kent")
      val separateQueryfromModifier = new SeparateQueryfromModifier();
      val alertMessage = separateQueryfromModifier.checkSecurity(peopleNames);
      alertMessage should be("")
    }
  }
}
