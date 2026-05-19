import java.util.Scanner;


public class TaskThree{
    public static void main(String... args){
    
    Scanner inputCollect = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int numberOne = inputCollect.nextInt();
    
    System.out.print("Enter a number: ");
    int numberTwo = inputCollect.nextInt();
    
    System.out.print("Enter a number: ");
    int numberThree = inputCollect.nextInt();    
    
    int largest = numberOne;
 
    if (numberTwo > largest){
        largest = numberTwo;
        }
     if (numberThree > largest){
        largest = numberThree; }      
            
    System.out.println(largest);
    
  
    
    
    
    }




}
