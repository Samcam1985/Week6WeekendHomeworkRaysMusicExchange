import static org.junit.Assert.*;
import org.junit.*;
import Instruments.*;

public class KeyboardTest {

  Keyboard keyboard;

@Before 
public void before(){
  keyboard = new Keyboard("Korg", "Black", "Metal", "Electric");
}

@Test 
public void getplay(){
  assertEquals("Do di do di do di do di", keyboard.getplay());
}

@Test
public void getManufacturer(){
  assertEquals("Korg", keyboard.getManufacturer());
}


@Test
public void getColour(){
  assertEquals("Black", keyboard.getColour());
}

@Test
public void getMaterial(){
  assertEquals("Metal", keyboard.getMaterial());
}

@Test
public void getType(){
  assertEquals("Electric", keyboard.getType());
}
}


