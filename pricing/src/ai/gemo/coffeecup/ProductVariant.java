package ai.gemo.coffeecup;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class ProductVariant {
  Product product;
  Map<String, String> attributes = new HashMap<>();

  public ProductVariant(Product product) {
    this.product = product;
  }

  public BigDecimal getPrice() {
    return product.getPrice(attributes);
  }

  public ProductVariant setAttribute(String name, String value) {
    attributes.put(name, value);
    return this;
  }
}
