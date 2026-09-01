# tuples
# Immutable
# Better than a list when it comes to storing data because it can't be easily changed
# they are ordered

#EXAMPLE OF ENTWINED TUPLE
enchanted_libray = ("Magic Tome", ["Ancient Scrolls", ("spell","Curse"),"Wizard's Guide"])
print(enchanted_libray[0])
print(enchanted_libray[0][0])
print(enchanted_libray[0][1])
print(enchanted_libray[0][0][0])
print(enchanted_libray[1])
print(enchanted_libray[1][1])
print(enchanted_libray[1][1][1])
print(enchanted_libray[1][1][0])

#Creating Tuples and ACCESSING TUPLES

my_tuple = ()
my_tuple=1,"hey", 5, 6,100

print(my_tuple[1])

mythical_collection = ("Greek Myths", [("Zeus","Hera"), ["Mount Olympus", ("Lightning", "Thunder")] ], " Norse Myths")
print(mythical_collection[1][1][1][1])

#SLICING TUPLE
print(my_tuple[2:])

#looping tuple

for item in my_tuple:
  print(item)


list = [10,20,30]

tuple = (10,20,30)

list[0] = 40
tuple[0]=40  #This gives error automatically

print(list)
print(tuple)

# TUPLE PACKING AND UNPACKING

personal_info=('Alice', 30, 'Developer')

#unpack
#TO UNPACK EFFECTIVELY, THE AMOUNT OF VARIABLES SHOULD BE EQUAL TO THE AMOUNT OF COMPONENTS

name, age, profession=personal_info

print(name)
print(age)
print(profession)

Books = ("Samuel", "James", " Mathew")

book1, book2, book3 = Books

print(book1)
print(book2)
print(book3)

#Extended UNPACKING USING *OPERATOR,

numbers = (2,4,6,1,10)

start,*rest = numbers
print(start)
print(rest)

first,*last = numbers
print(first)
print(last)

animals = ('Gorilla', 'Monkeys', 'Sheep', 'cows')

beginning, *middle, end = animals
print(beginning)
print(middle)
print(end)

# Ignoring some components using Underscore _

person_info = ("Alice", 20, "Butare", "Rwanda", "Basketball")

name,_, school,_,hobby = person_info
print(name)
print(school)
print(hobby)

# UNPACKING WITH FUNCTIONS
# Function without parameters

def get_user_info():
  return 'Bob', 29, 'Web_developer'

name, age, profession= get_user_info()
print(name)
print(age)
print(profession)

#function with parameters
def display_info(name, age, profession):
  print(f"{name} is {age} years old and work as {profession}")

info_tuple = ("Alice", 20, "Engineer")

display_info(*info_tuple)

# count and index with tuple
numbers = (2,3,4,2,3,4,2)

print(numbers.count(2))
print(numbers.index(4))

