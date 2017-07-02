import static org.junit.Assert.*;
import org.junit.*;
import Instruments.*;
import Sellables.*;

public class ShopTest {

  Shop shop;

  @Before
  public void before(){
    shop = new Shop();
  }

  @Test

  public void addStock(){ 
    Violin violin = new Violin(4, "Yamaha", "No", "Black", "Wood", "Acoustic");
  Product item = new Product("Viva la Violin", violin, 500, 1000);
  shop.addStock(item);

    assertEquals(5, shop.stock.size());
  }

  @Test

  public void removeStock(){ 
      Violin violin = new Violin(4, "Yamaha", "No", "Black", "Wood", "Acoustic");
    Product item = new Product("Viva la Violin", violin, 500, 1000);
    shop.addStock(item);
    shop.removeStock(item);

      assertEquals(4, shop.stock.size());

}
}