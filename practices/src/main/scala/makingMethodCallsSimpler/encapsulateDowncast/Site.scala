package makingMethodCallsSimpler.encapsulateDowncast

class Site(readings: List[Reading]) {
  def lastReading(): Any = {
    readings.last
  }
}
