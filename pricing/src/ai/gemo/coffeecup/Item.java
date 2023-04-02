package ai.gemo.coffeecup;

import java.math.BigDecimal;


public class Item {
  ProductVariant variant;
  int quantity;

  public Item(ProductVariant variant, int quantity) {
    this.variant = variant;
    this.quantity = quantity;
  }

  public BigDecimal getPrice() {
    return variant.getPrice().multiply(new BigDecimal(quantity));
  }
}
