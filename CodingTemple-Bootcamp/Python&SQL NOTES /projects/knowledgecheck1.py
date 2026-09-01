#Create a function that takes an integer as an argument 
# and returns "Even" for even numbers or "Odd" for odd numbers. Passed test

def even_or_odd(number):
    
    if number % 2==0:
        return("Even")
    else:
        return("Odd")
    

#Convert a Number to a String!  Passed test

def number_to_string(num):
    return str(num)

#Vowel Count

def get_count(sentence):

    vowels = 'aeiou'
    sum = 0
    for vowel in sentence:
        if vowel in vowels:
            sum = sum + 1
    return sum

