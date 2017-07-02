package Instruments;
import behaviours.*;

public class Harp extends Instrument{

  int numberOfStrings;
  String manufacturer;
  String spareStrings;


  public Harp(int numberOfStrings, String manufacturer, String spareStrings, String colour, String material, String type) {
    super(colour, material, type);
    this.numberOfStrings = numberOfStrings;
    this.manufacturer = manufacturer;
    this.spareStrings = spareStrings;
  }

 @Override
  public String play(){
    return "Pling Pling";

  }
  public int getNumberOfStrings(){
    return this.numberOfStrings;
  }

  public String getManufacturer(){
    return this.manufacturer;

  }

  public String getSpareStrings(){
    return this.spareStrings;

  }
  
}