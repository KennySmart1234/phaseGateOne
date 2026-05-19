import java.util.Scanner;

public class TaskFour{
    public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();
    
    
    for(int count = 1; count <= 20; count++){
    

        
        System.out.println(number +" X "+ count + " = "+ number * count);
    
    }
    
    
    
    }



}
