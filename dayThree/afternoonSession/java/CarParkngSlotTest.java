import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarParkingSlotTest{


 @Test
 public void testAllSpaceAreIsFree(){
 
 int totalIndex = 20;
 
 int expect =  CarParkingSlot.parkingSpace(indexOne);
 
 boolean actual = true; 
 
 assertEquals(expect, actual);
 
 
 
 }

 @Test
 public void testThatIndexNumberOneSlotIsFree(){
 
 int indexOne = 0;
 
 int expect =  CarParkingSlot.simpleParking(indexOne);
 
 String actual = "Slot free"; 
 
 assertEquals(expect, actual);
 
 
 
 }
 
 @Test
 public void testThatIndexTwoSlotIsNotFree(){
 
 int indexOne = 1;
 
 int expect =  CarParkingSlot.simpleParking(indexOne);
 
 String actual = "Slot not free"; 
 
 assertEquals(expect, actual);
 
 
 
 } 


    }
