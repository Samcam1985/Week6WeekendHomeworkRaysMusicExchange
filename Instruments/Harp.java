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

  public String play(){
    return "Pling Pling";

  }


}