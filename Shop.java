import Instruments.*;
import Sellables.*;
import behaviours.*;
import java.util.*;

public class Shop{

 public ArrayList<Product> stock;

 public Shop(){
  Guitar guitar = new Guitar(6, "Gibson", "Black", "Wood", "Acoustic");
  Harp harp = new Harp(47, "Pilgrim", "Yes", "Gold", "Metal", "Lyre");
  Keyboard keyboard = new Keyboard("Korg", "Black", "Metal", "Electric");
  Violin violin = new Violin(4, "Yamaha", "No", "Brown", "Wood", "Acoustic");
  Product item1 = new Product("Guitar 30000", guitar, 300, 850);
  Product item2 = new Product("Harp 434", harp, 350, 1075);
  Product item3 = new Product("Keyboard cat", keyboard, 50, 2068);
  Product item4 = new Product("Viva la Violin", violin, 100, 1000);
  this.stock = new ArrayList<Product>();
  this.stock.add(item1);
  this.stock.add(item2);
  this.stock.add(item3);
  this.stock.add(item4);
 }




  public void addStock(Product item){
    this.stock.add(item);

  }

  public void removeStock(Product item){
    this.stock.remove(item);
  }




}