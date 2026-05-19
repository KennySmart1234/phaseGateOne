import java.util.Scanner;


public class TaskSix{
    public static void main(String... args){
    
    Scanner inputCollect = new Scanner(System.in);
    
    System.out.print("Enter year: ");
    int year = inputCollect.nextInt();
       
    
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {    
            
    System.out.println("leap year");
    }
    
    else{
            System.out.println("Not leap year");
    
    }
  
    
    
    
    }




}
