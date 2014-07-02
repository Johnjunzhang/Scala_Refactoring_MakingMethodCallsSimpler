package makingMethodCallsSimpler.replaceParameterwithExplicitMethods

object ReplaceParameterwithExplicitMethodsExample2 {
  val Engineer = 0;
  val Salesman = 1;
  val Manager = 2;

  def Create(employeeType: Int): Employee = {
    employeeType match {
      case Engineer =>
        return new Engineer();
      case Salesman =>
        return new Salesman();
      case Manager =>
        return new Manager();
      case _ =>
        throw new Exception("Incorrect type code value");
    }
  }
}
