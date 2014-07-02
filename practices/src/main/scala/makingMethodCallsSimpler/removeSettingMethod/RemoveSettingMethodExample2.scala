package makingMethodCallsSimpler.removeSettingMethod

class RemoveSettingMethodExample2(var id: String) {
  def SetId(arg: String): Unit = {
    id = "ZZ" + arg;
  }
}
