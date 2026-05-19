import java.util.Arrays;

public class leveFive{

    public static int [] negativeNumber(int [] number){
    
    for(int count = 1; count < number.length -1;  count++){
    
            if(number[count + 1] < 0){
              number[count + 1] = 0;  
            
            }
            
    } return number;
    
    
    
    
    
    } 


public static void main(String... args){

    int [] number = {5,-9,3,-6,2,-1};

System.out.print(Arrays.toString(negativeNumber(number)));


    }

}
