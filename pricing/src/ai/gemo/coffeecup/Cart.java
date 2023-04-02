package ai.gemo.coffeecup;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;


public class Cart {
  List<Item> items = new ArrayList<>();

  public BigDecimal getTotal() {
    out.println("Calculating price...");
    BigDecimal total = BigDecimal.ZERO;
    for (Item item : items) {
      total = total.add(item.getPrice());
    }
    // calculate tax, shipping, promotions, etc.
    return total;
  }

  public void addItem(Item item) {
    items.add(item);
  }
}
