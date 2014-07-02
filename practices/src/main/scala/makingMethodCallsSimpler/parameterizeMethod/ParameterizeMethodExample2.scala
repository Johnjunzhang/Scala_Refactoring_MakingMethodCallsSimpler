package makingMethodCallsSimpler.parameterizeMethod

class ParameterizeMethodExample2(lastUsage: Double) {
  def baseCharge(): Double = {
    var result = Math.min(lastUsage, 100) * 0.03;
    if (lastUsage > 100) {
      result += (Math.min(lastUsage, 200) - 100) * 0.05;
    }
    if (lastUsage > 200) {
      result += (lastUsage - 200) * 0.07;
    }
    return result;
  }
}
