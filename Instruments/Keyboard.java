package Instruments;
import behaviours.*;

public class Keyboard extends Instrument{

  String manufacturer;
  


  public Keyboard(String manufacturer, String colour, String material, String type) {
    super(colour, material, type);
    this.manufacturer = manufacturer;

    
  }

  public String getplay(){
    return "Do di do di do di do di";  //keyboard cat

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
