# functions-Learning functions

def greet(name):
    print("Hello " + name)

greet('Ferdinand')

"""
Docstring: Explainations of a function
    1. Function does
    2. Paramaters and data types
    3. Arguments
"""

#Global variables

jedi_name="Luke Skywalker"
jedi_rank="Jedi Knight"
force_power=100

def attack(target, weapon="lightsaber"):
    return f"{jedi_name} attacks {target} with a {weapon}"
print(attack("Jacob"))

#accessing global variables

#LEARNING FUNCTIONS: REUSABLE BLOCK OF CODES

def greet():
  print("Hello everyone")
greet()

#FUNCTIONS WITH PARAMETERS

def greet(name):
  print(f"Hello {name}")
greet("Alexis")

print("__" * 20)
def introducing_myself(name, fav_hobby):
  print(f"Hello {name}. Your hobby is: {fav_hobby} ")

introducing_myself("Ferdinand", "Soccer")

print("__" * 20)

def addition(a,b,c):
  return a + b + c

sum = addition(1,2,100)
print(sum)

#local and global variable

x = 10   #this is global variable

def sum():
  x = 10     # This is local variable
print(x)

#Default parameter

def greet(name= 'John'):
  print(f"I like {name} because of they way he take things not personal")

greet("James")
greet()

print("__" * 20)

# Variable argument  USING [ *args and **kwargs] to move things around

def add_numbers(*args):
  return sum(args)

result = add_numbers(1,4,200)
print(result)

def add_numbers(*args):
    return sum(args)
    
print(add_numbers(1, 2, 3, 2))  
print(add_numbers(5, 10)) 

#Converters


def kg_to_lbs(weight):
    return weight / 0.45

def lbs_to_kg(weight):
    return weight * 0.45

def F_to_C(temperature):
    return(temperature-32)*(5/9)

def C_to_F(temperature):
    return(temperature * 9/5) + 32

def find_max(list_numbers):

    max_number=list_numbers [0]

    for item in list_numbers:
        if item > max_number:
            max_number = item
    return(max_number)
