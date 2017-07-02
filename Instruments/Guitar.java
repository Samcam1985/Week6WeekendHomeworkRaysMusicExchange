package Instruments;
import behaviours.*;

public class Guitar extends Instrument{

  int numberOfStrings;
  String manufacturer;


  public Guitar(int numberOfStrings, String manufacturer, String colour, String material, String type ) {
    super(colour, material, type);
    this.numberOfStrings = numberOfStrings;
    this.manufacturer = manufacturer;
  

  }

  public String getplay(){
    return "Twang";

  }

public int getNumberOfStrings(){
  return this.numberOfStrings;
}

public String getManufacturer(){
  return this.manufacturer;

}

public String getColour(){
  return this.colour;

}

public String getMaterial(){
  return this.material;

}

public String getType(){
  return this.type;

}
}