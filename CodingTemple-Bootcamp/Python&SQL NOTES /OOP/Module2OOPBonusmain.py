# Tracking All Objects Created from a Class in Python In Python, there isn't a built-in way to automatically track all instances of a class. 
# However, you can create this functionality yourself.
#  A common approach is to maintain a class-level list where you append each new instance.
# Note: Be cautious of memory usage since keeping references prevents objects from being garbage collected. 
# Consider removing objects from the list when they are no longer needed.

class Myclass:
  #class level list to track all instances
  instances = []

  def __init__(self,name):
    self.name = name
    Myclass.instances.append(self)

  @classmethod
  def get_all_instances(cls):
    return cls.instances

#Creating Multiple Instances
obj1 = Myclass("Object1")
obj2 = Myclass("Object2")
obj3 = Myclass("Object3")

#Accessing all instances
all_instances = Myclass.get_all_instances()
print("All_instances:")

for instance in all_instances:
  print(instance.name)

# 1.png OOP Bonus FOR CODES(MYclass)

# Compile-Time vs. Runtime Polymorphism
# Compile-Time Polymorphism (Static Binding): 
# This occurs when the method to be called is determined at compile time based on method signatures. 
# In languages like Python, method overloading doesn't work as expected, 
# but in Java, the method to call is selected based on the parameters at compile time.

#Example code
class Calculator:

  def add(self, a, b):
    return a + b
  
  def add(self, a, b, c):   #This method will override the previous one
    return a + b + c
  
calc = Calculator()
print(calc.add(23,45,78))

# Runtime Polymorphism (Dynamic Binding): 
# This happens when the method to be called is determined at runtime based on the object's actual type, not the reference type.
#Example codes
class Animal:
  def speak(self):
    return "Animal speak"

class Dog(Animal):
  def speak(self):
    return "Dog barks"
  
class Cat(Animal):
  def speak(self):
    return "Cat meows"
  
def make_animal_speak(animal):
  print(animal.speak())

dog = Dog()
cat = Cat()

make_animal_speak(dog)
make_animal_speak(cat)


# The Role of Dunder Methods (__init__, __str__, etc.) "Dunder" methods (short for double underscore) are special methods in Python 
# that allow you to define how your objects interact with Python's built-in operations (like +, str(), etc.). 
# They aren't meant to be called directly but define behaviors for specific actions.Analogy:
#  Think of dunder methods as the "protocols" that allow your object to interact with Python’s syntax. 
# Without them, your object wouldn't be able to respond to common operations like addition, iteration, etc.
# Further Reading: Dunder methods are a deep topic, but once you start using them, they'll make your objects feel like they naturally belong in Python.

# What makes them different: Dunder methods are hooks into Python's internals.
#  For example, __init__ is called when a new object is created, and __str__ defines how your object is represented as a string.
# How to use them: Use dunder methods when you want to customize your object's behavior with Python features. For example:

# __init__: Initialize objects.
# __repr__ and __str__: Control string representations of objects.
# __add__: Customize how the + operator works for your class.
# Analogy: Think of dunder methods as the "protocols" that allow your object to interact with Python’s syntax.
#  Without them, your object wouldn't be able to respond to common operations like addition, iteration, etc.

# Further Reading: Dunder methods are a deep topic, but once you start using them, 
# they'll make your objects feel like they naturally belong in Python.


#These are very important resources:
# 1. https://realpython.com/python-magic-methods/?utm_source=chatgpt.com

# 2. https://www.geeksforgeeks.org/dunder-magic-methods-python/?utm_source=chatgpt.com

# 3. https://www.pythonmorsels.com/every-dunder-method/?utm_source=chatgpt.com

# 4. https://www.datacamp.com/tutorial/introducing-python-magic-methods?utm_source=chatgpt.com