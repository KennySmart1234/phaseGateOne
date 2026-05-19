import java.util.Scanner;


public class TaskThree{
    public static void main(String... args){
    
    Scanner inputCollect = new Scanner(System.in);
    
    System.out.print("Enter your score: ");
    int score = inputCollect.nextInt();
    
    if (score >= 50){
    
    System.out.println("pass");
    
    }
    
    else{
     System.out.println("Fail");   
    }
    
    
    
    }




}
