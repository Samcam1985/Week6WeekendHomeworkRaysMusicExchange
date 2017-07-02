package Strategy_pattern;
import behaviours.*;

public class Guitar implements Playable{

  int numberOfStrings;
  String type;


  public Guitar(int numberOfStrings, String type) {
    this.numberOfStrings = numberOfStrings;
    this.type = type;
  }
}