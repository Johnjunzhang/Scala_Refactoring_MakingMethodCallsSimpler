package makingMethodCallsSimpler.replaceParameterwithExplicitMethods

class ReplaceParameterwithExplicitMethodsExample1() {
  var width: Int = 0;
  var height: Int = 0;
  def setValue(name: String, value: Int): Unit = {
    if (name.equals("height"))
      height = value;
    if (name.equals("width"))
      width = value;
  }
}
