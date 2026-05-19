import java.util.Scanner;

public class TaskFive{
    public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();
    
        int factorial = 0;
    for(int count = number; count >= number; count--){
    
           factorial =  number * count;
        System.out.println(count);
            
    
    }
    
            System.out.println(factorial);
    
    }



}
