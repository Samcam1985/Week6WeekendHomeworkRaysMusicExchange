import static org.junit.Assert.*;
import org.junit.*;
import Instruments.*;

public class HarpTest {

  Harp harp;

@Before 
public void before(){
  harp = new Harp(47, "Pilgrim", "Yes", "Gold", "Metal", "Lyre");
}

@Test 
public void play(){
  assertEquals("Pling Pling", harp.play());
}

@Test
public void getNumberOfStrings(){
  assertEquals(47, harp.getNumberOfStrings());
}

@Test
public void getManufacturer(){
  assertEquals("Pilgrim", harp.getManufacturer());
}

@Test
public void getSpareStrings(){
  assertEquals("Yes", harp.getSpareStrings());
}

@Test
public void getColour(){
  assertEquals("Gold", harp.getColour());
}

@Test
public void getMaterial(){
  assertEquals("Metal", harp.getMaterial());
}

@Test
public void getType(){
  assertEquals("Lyre", harp.getType());
}
}
