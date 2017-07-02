import static org.junit.Assert.*;
import org.junit.*;
import Instruments.*;

public class ViolinTest {

  Violin violin;

@Before 
public void before(){
  violin = new Violin(4, "Yamaha", "No", "Brown", "Wood", "Acoustic");
}

@Test 
public void getplay(){
  assertEquals("mmmnneee mmmneee", violin.getplay());
}

@Test
public void getNumberOfStrings(){
  assertEquals(4, violin.getNumberOfStrings());
}

@Test
public void getManufacturer(){
  assertEquals("Yamaha", violin.getManufacturer());
}

@Test
public void getSpareStrings(){
  assertEquals("No", violin.getSpareStrings());
}

@Test
public void getColour(){
  assertEquals("Brown", violin.getColour());
}

@Test
public void getMaterial(){
  assertEquals("Wood", violin.getMaterial());
}

@Test
public void getType(){
  assertEquals("Acoustic", violin.getType());
}
}
