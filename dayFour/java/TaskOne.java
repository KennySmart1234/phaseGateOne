import java.util.Arrays;
public class TaskOne{

    public static int[] checkElement(int [] numberOfArray, int number){
        
            
            
            
          int [] twoElement = new int [2];
        for(int countOne = 0; countOne < numberOfArray.length-1; countOne++){
        
            for(int countTwo = countOne; countTwo < numberOfArray.length-1; countTwo++){  
            
                 if(numberOfArray[countOne] + numberOfArray[countTwo] == number){
            

                         twoElement[countOne] = numberOfArray[countOne]; 
                         twoElement[countTwo] = numberOfArray[countTwo];
            
                }
 

            }

           } 
           return twoElement;
    
    }

public static void main(String... args){

    int [] numberOfArray = {8,6,12,4,-2};
    int number = 6;
    
System.out.println(Arrays.toString(checkElement(numberOfArray, number)));    

   }

} 









