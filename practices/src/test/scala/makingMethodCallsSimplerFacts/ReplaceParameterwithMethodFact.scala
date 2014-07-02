package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import makingMethodCallsSimpler.replaceParameterwithMethod.{ReplaceParameterwithMethodExample2, ReplaceParameterwithMethodExample1}

@RunWith(classOf[JUnitRunner])
class ReplaceParameterwithMethodFact extends FunSpec with Matchers {
  describe("ReplaceParameterwithMethodFact") {
    it("should_get_ninty_percentage_discount_given_name_is_kent") {
      val example1 = new ReplaceParameterwithMethodExample1("Kent");
      val price = example1.getPrice(10, 10);
      price should be(90)
    }

    it("should_not_get_discount_given_name_is_martin") {
      val example1 = new ReplaceParameterwithMethodExample1("Martin");
      val price = example1.getPrice(10, 10);
      price should be(100)
    }

    it("should_get_ninty_percentage_discount_given_quantity_is_over_100") {
      val example2 = new ReplaceParameterwithMethodExample2();
      val price = example2.getPrice(200, 10);
      price should be(1800)
    }

    it("should_not_get_discount_given_quantity_is_less_than_100") {
      val example2 = new ReplaceParameterwithMethodExample2();
      val price = example2.getPrice(80, 10);
      price should be(800)
    }
  }
}
