package makingMethodCallsSimpler.replaceParameterwithMethod

class ReplaceParameterwithMethodExample1(name: String) {
  def getPrice(quantity: Int, itemPrice: Double): Double = {
    val basePrice = quantity * itemPrice;
    val discountLevel = getDiscountLevel();
    getDiscountedPrice(basePrice, discountLevel);
  }

  private def getDiscountedPrice(basePrice: Double, discountLevel: Double): Double = {
    if (discountLevel == 2) basePrice * 0.9 else basePrice;
  }

  private def getDiscountLevel(): Int = {
    if (name.equals("Kent")) 2 else 1
  }
}
