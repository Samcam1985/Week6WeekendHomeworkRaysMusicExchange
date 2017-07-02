package Sellables;
import Instruments.*;
import behaviours.*;

public class Product implements Sellable{

  String name;
  Instrument type;
  int buyingPrice;
  int sellingPrice;
  


  public Product(String name, Instrument type, int buyingPrice, int sellingPrice) {
    this.name = name;
    this.type = type;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
}

  public int calculateMarkup(int buyingPrice, int sellingPrice){
    return buyingPrice - sellingPrice;

  }
  
}

