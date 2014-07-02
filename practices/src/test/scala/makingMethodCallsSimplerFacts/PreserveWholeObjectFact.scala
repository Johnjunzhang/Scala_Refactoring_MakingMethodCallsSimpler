package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import java.util.Calendar
import makingMethodCallsSimpler.introduceParameterObject.Account
import makingMethodCallsSimpler.parameterizeMethod.ParameterizeMethodExample2
import makingMethodCallsSimpler.preserveWholeObject.{HeatingPlan, Room, TempRange}

@RunWith(classOf[JUnitRunner])
class PreserveWholeObjectFact extends FunSpec with Matchers {
  describe("PreserveWholeObjectFact") {
    it("should_get_room_within_plan_given_room_low_temp_is_not_lower_than_plan_low_temp_and_high_temp_is_not_higher_than_plan_high_temp") {
      val room = new Room(new TempRange(10, 20))
      val heatingPlan = new HeatingPlan(new TempRange(5, 25));
      room.withinPlan(heatingPlan) should be(true)
    }

    it("should_get_room_not_within_plan_given_room_low_temp_is_higher_than_plan_low_temp") {
      val room = new Room(new TempRange(10, 20))
      val heatingPlan = new HeatingPlan(new TempRange(15, 25));
      room.withinPlan(heatingPlan) should be(false)
    }

    it("should_get_room_not_within_plan_given_room_high_temp_is_lower_than_plan_high_temp") {
      val room = new Room(new TempRange(10, 20))
      val heatingPlan = new HeatingPlan(new TempRange(5, 15));
      room.withinPlan(heatingPlan) should be(false)
    }
  }
}
