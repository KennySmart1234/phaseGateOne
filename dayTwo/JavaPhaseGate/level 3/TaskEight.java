import java.util.Scanner;

public class TaskEight{
    public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    
           System.out.print("Enter a number: ");
            int number = inputCollector.nextInt();
    
        int sum = 0;
        while(number != 0){
            System.out.print("Enter a number: ");
             number = inputCollector.nextInt();
                sum = sum + number;
        }
    
            System.out.println(sum);
    
    }

}
