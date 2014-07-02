package makingMethodCallsSimpler.replaceParameterwithMethod

class ReplaceParameterwithMethodExample2() {
  def getPrice(quantity: Int, itemPrice: Double): Double = {
    val basePrice = quantity * itemPrice;
    var discountLevel = 0;
    if (quantity > 100) discountLevel = 2;
    else discountLevel = 1;
    getDiscountedPrice(basePrice, discountLevel);
  }

  private def getDiscountedPrice(basePrice: Double, discountLevel: Double): Double = {
    if (discountLevel == 2) basePrice * 0.9 else basePrice;
  }
}
