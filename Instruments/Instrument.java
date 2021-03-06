package Instruments;
import behaviours.*;

public abstract class Instrument implements Playable{

  String colour;
  String material;
  String type;

  public Instrument(String colour, String material, String type) {
    this.colour = colour;
    this.material = material;
    this.type = type;
  }

  public String play(){
    return "";
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
