import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestTaskTwoTest{
    
    @Test
    public void testThatIncreasingOrderOfArrayIsCorrect(){
    
    
    int [] number = {14,9,6,5,8,10};

    
    int expected = TaskTwo.increasingOrder(number);
    
    int [] actual = {5,6,8,9,10,14};
    
    assertEquals(expected, actual);
    
    
    
    }


}
