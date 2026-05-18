import java.util.Random;
import java.util.Scanner;


public class RandonNumber{
    public static void main(String... args){

        Random randomNuber = new Random();
        Scanner inputCollector = new Scanner(System.in); 

        int correctNumbers = 0;
        for(int count =1; count<=5; count++){
        System.out.print("Enter a number a number between 1 to 100: ");
        int userNumber = inputCollector.nextInt();
    
        int randomNumber = randomNuber.nextInt(100);

        if(userNumber < randomNumber){
            System.out.println("Guess is low");}
            
        if(userNumber > randomNumber){
            System.out.println("Guess is high");}            
        
        if(userNumber == randomNumber){
            correctNumbers = correctNumbers + 1;
        
        } 
      
    
        }
        if(correctNumbers == 1){
            System.out.println("Legendary");}
            
         else if(correctNumbers == 2){
            System.out.println("Excellent");}   
            
         else if(correctNumbers == 3 || correctNumbers == 4){
            System.out.println("Excellent");}      
            
            
         System.out.println("Your count "+ correctNumbers);




    }
}
