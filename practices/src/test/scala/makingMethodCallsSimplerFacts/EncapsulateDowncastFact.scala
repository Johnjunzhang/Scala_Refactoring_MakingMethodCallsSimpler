package makingMethodCallsSimplerFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.extractClass.AddParameter
import makingMethodCallsSimpler.encapsulateDowncast.{Site, Reading}

@RunWith(classOf[JUnitRunner])
class EncapsulateDowncastFact extends FunSpec with Matchers {
  describe("EncapsulateDowncastFact") {
    it("should_get_last_reading_name") {
      val readings = List[Reading](new Reading("Refactoring"), new Reading("Clean Code"));
      val site = new Site(readings);
      val readingName = site.lastReading().asInstanceOf[Reading].name;
      readingName should be("Clean Code")
    }
  }
}
