import java.util.Arrays;

public class TaskTwo{

    public static int[] increasingOrder(int [] number){
        
       for(int countOne =0; countOne < number.length; countOne++){
       
            for(int countTwo = countOne; countTwo < number.length; countTwo++){
            
                int temp = number[countOne];
                
                if(number[countTwo] < number[countOne]){
                    number[countOne] = number[countTwo];
                    number[countTwo] = temp;

                }

            
            }
       
       }   return number;         

    
    }
    

public static void main(String... args){

    int [] numberOne = {14,9,6,5,8,10};
    int [] numberTwo = {7,11,12,13};

System.out.println(Arrays.toString(increasingOrder(numberOne)));    

   }

} 









