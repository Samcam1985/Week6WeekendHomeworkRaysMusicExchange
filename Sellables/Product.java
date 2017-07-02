package Sellabales;
import Instruments.*;
import behaviours.*;

public class Product implements Sellable{

  Instrument type;
  int buyingPrice;
  int sellingPrice;
  


  public Product(Instrument type, int buyingPrice, int sellingPrice) {
    this.type = type;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
}

  public int calculateMarkup(int buyingPrice, int sellingPrice){
    return buyingPrice - sellingPrice;

  }
  
}

