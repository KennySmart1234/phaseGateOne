



def add(number):

    return number + number
    
def even(number):
    if(number % 2 == 0):
        print("Even number")   
    else:
    
        print("old number")
        

def square(number):

    return number * number
    
        
        
def celsius(number):
    
    fahrenheit = (number * 1.8) + 32;
    
    return fahrenheit; 
          


def largest(number_one, number_two, number_three):
    largest = number_one
    if(number_two > largest):
        largest = number_two 
    if(number_three > largest):
        largest = number_three        
   
    return largest  
    
    
def simple_interest(timeRate, time):
    
                   
    return ((timeRate / 100) * time) / 100;

  
           
        
print(add(2)) 
even(2) 
print(square(2))
print(celsius(5))
print(largest(2,5,7))
print(simple_interest(5,20))

   
