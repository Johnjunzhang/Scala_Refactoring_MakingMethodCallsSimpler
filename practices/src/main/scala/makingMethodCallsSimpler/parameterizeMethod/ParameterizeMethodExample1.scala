package makingMethodCallsSimpler.parameterizeMethod

class ParameterizeMethodExample1(salary: Double) {
  def tenPercentRaise(): Double = {
    salary * 1.1;
  }

  def fivePercentRaise(): Double = {
    salary * 1.05;
  }
}
