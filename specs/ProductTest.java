import static org.junit.Assert.*;
import org.junit.*;
import Instruments.*;
import Sellables.*;

public class ProductTest {

  Product product;

  @Before
  public void before(){
    Harp harp = new Harp(47, "Pilgrim", "Yes", "Gold", "Metal", "Lyre");
    product = new Product( "HarpTest",harp, 500, 1500);
  }

  @Test

  public void calculateMarkUp(){ 
    assertEquals(1000, product.calculateMarkup(500, 1500));


}
}