import java.util.Arrays;
import java.util.Scanner;
public class FacebookLikeSystem{

    public static void name(String names){
     
    
    }



public static void main(String... args){

Scanner inputCollector = new Scanner(System.in);

     String [] names = new String [10];
     int count = 0;

    for(; count < names.length; count++){ 
         if(count == 0){
            System.out.println("no one likes this");
         
         }
    System.out.print("Enter your name: ");
     names[count] = inputCollector.nextLine();
     
     System.out.println(Arrays.toString(names) + " likes this"); 
    
    }
    
   
   

    }

}









