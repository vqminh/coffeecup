package ai.gemo.coffeecup;

import java.math.BigDecimal;

import static java.lang.System.*;


public class PriceCalculator {
  public static void main(String[] args) {
    out.println("Calculate price");
    Cart cart = new Cart();
    Product product = new Product(BigDecimal.valueOf(3));
    product.setPrice("size", "XL", BigDecimal.valueOf(2));
    product.setPrice("size", "L", BigDecimal.valueOf(1));
    ProductVariant variant1 = new ProductVariant(product).setAttribute("size", "XL");
    Item item1 = new Item(variant1, 2);
    cart.addItem(item1);
    ProductVariant variant2 = new ProductVariant(product).setAttribute("size", "L");
    cart.addItem(new Item(variant2, 1));
    out.println("Total: " + cart.getTotal());
  }
}
