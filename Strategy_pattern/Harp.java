package Strategy_pattern;
import behaviours.*;

public class Harp implements Playable{

  int numberOfStrings;
  String type;
  String spareStrings;


  public Harp(int numberOfStrings, String type, String spareStrings) {
    this.numberOfStrings = numberOfStrings;
    this.type = type;
    this.spareStrings = spareStrings;
  }
}