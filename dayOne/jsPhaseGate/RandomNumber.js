let prompt = require("promt-sync")();
let input = promt("Enter a number a number between 1 to 100: ")



let RandonNumber{

        Random randomNuber = new Random();
     int correctNumbers = 0;
        for(int count =1; count<=5; count++){
        console.log("Enter a number a number between 1 to 100: ");

    
        int randomNumber = randomNuber.nextInt(100);
        let input = promt("Enter a number a number between 1 to 100: ")
        if(userNumber < randomNumber){
            console.log("Guess is low");}
            
        if(userNumber > randomNumber){
            console.log("Guess is high");}            
        
        if(userNumber == randomNumber){
            correctNumbers = correctNumbers + 1;
        
        } 
      
