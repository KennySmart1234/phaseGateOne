import random



for number in range(1, 6):

    inputCollector = int(input("Enter a number: "))
    

    
    randon_number = random.randint(1, 101)

    if randon_number > inputCollector:
        print("Guess is lower")
    if randon_number < inputCollector:
        print("Guess is high")    
    
    
    if(randon_number == inputCollector):
        print(f"Congratulation {inputCollector} is correct")














