package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}
import makingMethodCallsSimpler.replaceParameterwithExplicitMethods._

@RunWith(classOf[JUnitRunner])
class ReplaceParameterwithExplicitMethodsFact extends FunSpec with Matchers {

  describe("ReplaceParameterwithExplicitMethodsFact") {
    it("should_get_setted_height_value") {
      val example1 = new ReplaceParameterwithExplicitMethodsExample1();
      example1.setValue("height", 100);
      example1.height should be(100)
    }

    it("should_get_setted_width_value") {
      val example1 = new ReplaceParameterwithExplicitMethodsExample1();
      example1.setValue("width", 50);
      example1.width should be(50)
    }

    it("should_create_engineer_given_type_is_engineer") {
      val employee = ReplaceParameterwithExplicitMethodsExample2.Create(0);
      employee.getClass should be(classOf[Engineer])
    }

    it("should_create_salesman_given_type_is_salesman") {
      val employee = ReplaceParameterwithExplicitMethodsExample2.Create(1);
      employee.getClass should be(classOf[Salesman])
    }

    it("should_create_manager_given_type_is_manager") {
      val employee = ReplaceParameterwithExplicitMethodsExample2.Create(2);
      employee.getClass should be(classOf[Manager])
    }
  }
}
