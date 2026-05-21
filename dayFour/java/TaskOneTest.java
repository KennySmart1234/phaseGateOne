import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TaskOneTest{
    
    @Test
    public void testThatSumOfTwoElementInAnArrayIs8minu2(){
    
    
    int [] numberOfArray = {8,6,12,4,-2};
    int number = 6;
    
    int expected = TaskOne.checkElement(numberOfArray, number);
    
    int [] actual = {8, -2};
    
    assertEquals(expected, actual);
    
    
    
    }


}
