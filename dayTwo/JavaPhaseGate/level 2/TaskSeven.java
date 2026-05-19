import java.util.Scanner;


public class TaskSeven{
    public static void main(String... args){
    
    Scanner inputCollect = new Scanner(System.in);
    
    System.out.print("Enter password: ");
    String password = inputCollect.nextLine();
        String adminPassword = "admin123" ;  
    
    if (adminPassword.equals(password)) {    
            
    System.out.println("correct password");
    }
    
    else{
            System.out.println("Not correct password");
    
    }
  
    
    }
    
    }

