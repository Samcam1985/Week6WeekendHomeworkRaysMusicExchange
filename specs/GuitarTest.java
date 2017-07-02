import static org.junit.Assert.*;
import org.junit.*;
import Instruments.*;

public class GuitarTest {

  Guitar guitar;

@Before 
public void before(){
  guitar = new Guitar(6, "Gibson", "Black", "Wood", "Acoustic");
}

@Test 
public void getplay(){
  assertEquals("Twang", guitar.getplay());
}

@Test
public void getNumberOfStrings(){
  assertEquals(6, guitar.getNumberOfStrings());
}

@Test
public void getManufacturer(){
  assertEquals("Gibson", guitar.getManufacturer());
}

@Test
public void getColour(){
  assertEquals("Black", guitar.getColour());
}

@Test
public void getMaterial(){
  assertEquals("Wood", guitar.getMaterial());
}

@Test
public void getType(){
  assertEquals("Acoustic", guitar.getType());
}
}
