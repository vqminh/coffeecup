package ai.gemo.coffeecup;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Product {
  BigDecimal basePrice;
  Map<String, Map<String, BigDecimal>> prices = new HashMap<>();

  public Product(BigDecimal basePrice) {
    this.basePrice = basePrice;
  }

  public BigDecimal getPrice(Map<String, String> attributes) {
    BigDecimal price = basePrice;
    for (Map.Entry<String, String> entry : attributes.entrySet()) {
      Map<String, BigDecimal> attributePrices = prices.get(entry.getKey());
      if (attributePrices != null) {
        BigDecimal attributePrice = attributePrices.get(entry.getValue());
        if (attributePrice != null) {
          price = price.add(attributePrice);
        }
      }
    }
    return price;
  }

  public void setPrice(String name, String value, BigDecimal price) {
    Map<String, BigDecimal> attributePrices = prices.computeIfAbsent(name, s -> new HashMap<>());
    attributePrices.put(value, price);
  }
}
