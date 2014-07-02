package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import java.util.{GregorianCalendar, Calendar}
import makingMethodCallsSimpler.introduceParameterObject.{Entry, Account}
import makingMethodCallsSimpler.parameterizeMethod.{ParameterizeMethodExample2, ParameterizeMethodExample1}

@RunWith(classOf[JUnitRunner])
class ParameterizeMethodFact extends FunSpec with Matchers {
  describe("ParameterizeMethodFact") {
    it("should_get_ten_percent_raise_of_salary") {
      val employee = new ParameterizeMethodExample1(100);
      employee.tenPercentRaise() should be(100*1.1)
    }

    it("should_get_five_percent_raise_of_salary") {
      val employee = new ParameterizeMethodExample1(100);
      employee.fivePercentRaise should be(105)
    }

    it("should_charge_three_percentage_given_last_usage_is_less_than_100_according_to_level_one_rule") {
      val employee = new ParameterizeMethodExample2(100);
      employee.baseCharge() should be(3)
    }

    it("should_charge_five_percentage_of_last_usage_minus_100_more_than_level1_rule_given_last_usage_is_between_100_and_200_according_to_level_two_rule") {
      val employee = new ParameterizeMethodExample2(150);
      employee.baseCharge() should be(5.5)
    }

    it("should_charge_seven_percentage_of_last_usage_minus_200_more_than_level2_given_last_usage_is_greater_than_200_according_to_level_three_rule") {
      val employee = new ParameterizeMethodExample2(250);
      employee.baseCharge() should be(11.5)
    }
  }
}
