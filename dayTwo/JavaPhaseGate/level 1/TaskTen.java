import java.util.Scanner;


public class TaskTen{
    public static void main(String... args){
    
    Scanner inputCollect = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int numberOne = inputCollect.nextInt();

    System.out.print("Enter a number: ");
    int numberTwo = inputCollect.nextInt();
    
    System.out.print("Enter a number: ");
    int numberThree = inputCollect.nextInt();        
    
    int average = numberOne + numberTwo + numberThree / 3;
    
    System.out.println(average);
    
    
    }
    
    
    }
