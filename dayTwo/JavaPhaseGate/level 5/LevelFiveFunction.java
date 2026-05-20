import java.util.Arrays;

public class leveFive{

    public static int [] negativeNumber(int [] number){
    
    for(int count = 0; count < number.length -1;  count++){
    
            if(number[count] < 0){
              number[count] = 0;  
            
            }
            
    } return number;
    
    
    
    
    
    } 


public static void main(String... args){

    int [] number = {5,-9,3,-6,2,-1};

System.out.print(Arrays.toString(negativeNumber(number)));


    }

}
