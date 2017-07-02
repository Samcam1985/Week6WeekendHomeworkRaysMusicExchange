package Strategy_pattern;
import behaviours.*;

public class Violin extends Instrument{

  int numberOfStrings;
  String manufacturer;
  String spareStrings;


  public Violin(int numberOfStrings, String manufacturer, String spareStrings, String colour, String material, String type) {
    super(colour, material, type);
    this.numberOfStrings = numberOfStrings;
    this.manufacturer = manufacturer;
    this.spareStrings = spareStrings;
  }

  public String play(){
    return "mmmnneee mmmneee";

  }
}