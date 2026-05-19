import java.util.Scanner;


public class TaskFive{
    public static void main(String... args){
    
    Scanner inputCollect = new Scanner(System.in);
    
    System.out.print("Enter temperature: ");
    int celsius = inputCollect.nextInt();
    
    int Fahrenheit = (celsius * 9/5) + 32;
    
    System.out.print(Fahrenheit);
    
    
    }
    
    
    }
