package Strategy_pattern;
import behaviours.*;

public class Violin implements Playable{

  int numberOfStrings;
  String manufacturer;
  String spareStrings;


  public Violin(int numberOfStrings, String manufacturer, String spareStrings) {
    this.numberOfStrings = numberOfStrings;
    this.manufacturer = manufacturer;
    this.spareStrings = spareStrings;
  }
}