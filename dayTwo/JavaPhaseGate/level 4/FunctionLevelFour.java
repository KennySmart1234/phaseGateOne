

public class LevelFour{

    public static int adds(int number){
    
      return number + number;

    
    } 
    
    public static void even(int number){
        if(number % 2 == 0){
            System.out.println("even number");}
        
        else{
           System.out.println("old number");
        
        }
        
      }  
        
    public static int square(int number){
    
      return number * number;

    
    }   
    
    public static double celsius(int number){
    
        double fahrenheit = (number * 1.8) + 32;
    
      return fahrenheit;

    
    }  
    
    
     public static int primeNumber(int number){
       
           if (number == 1);
                return false;
          for(int count = 1; count<= (number/2) count++){
                int counter = 0;
              for(int divisor = 1; divisor<=count;  divisor++){
              
            if(number % count){
                return false;
              
              } 
                
          
                }      
             if (counter == 2){
                    return true;
             
             }
            
            }

    
    }  


     public static int largest(int numberOne, int numberTwo, int numberThree){
    
        int largest = numberOne;
            if(numberTwo > largest){
                largest = numberTwo ;
            }
            
            if(numberThree > largest){
                largest = numberThree ;
            
            }            
      return largest;

    }  
    
    
     public static double simpleInterest(int timeRate, int time){
    
                   
      return ((timeRate/100) * time) / 100;

    }  
     
    
    
                        
        
    
      
    
    
     public static void main(String... args){
      
    System.out.println(adds(2));
    even(2);
    System.out.println(square(5));
    System.out.println(celsius(5));
    System.out.println(largest(5,6,1));
    System.out.println(simpleInterest(15,60));
    System.out.println(primeNumber(15));


    }

}
