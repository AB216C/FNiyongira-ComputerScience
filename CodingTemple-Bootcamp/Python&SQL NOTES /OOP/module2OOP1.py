# #OBJECT ORIENTED PROGRAMMING(OOP)
# #It is based on a concept of "Object" which contain data(attributes) and method(functions)
# #4 Pillars of OOP: Encapsulation, Abstraction, Inheritance, and Polymorphism
# #Advantage of OOP: Modulability, scalabaility, reuse, and maintenance


# #Class and Objects

# #Classes: strings, dictionaries, and lists are classes with their own methods and attributes
# #Objects: Unique instances of a class, created based on a blue print

str1 = str()
list1 = list()
dictionary1= dict()

print(type(str1))
print(type(list1))
print(type(dictionary1))

#Python Naming Convention: Classes are always in a Title case

class Car:
  pass

my_car = Car()
print(type(my_car))

# # Attributes

# #Defines quality of our objects and are stored in variables with in a class
# #Two types of attributes: class atributes and instance attributes
# #Class attributes: defined directly within the class body
# #Instance attributes: Attributes that may vary between different instances and they are defined by a special method called 
# #__init__(). This is used to initialize object when created

class Car:
  #class attribute
  wheels=4
  def __init__(self,make, model):
    #instance attributes
    self.make=make
    self.model=model
#creating instances of the Car class
car1 = Car("Toyota", "Corolla")
car2 = Car("Honda","Civic")

print(car1.wheels)
print(car2.wheels)
print(car1.make)
print(car2.make)

# #syntax of the init method

def __init__(self,parameter1, parameter2):
  self.parameter1=parameter1
  self.parameter2=parameter2
#Extra application of the _init_method
class Car:
  #class attribute
  wheels=4
  def __init__(self,make, model,year):
    #instance attributes
    self.make=make
    self.model=model
    self.year=year
#creating instances of the Car class
car1 = Car("Toyota", "Corolla",2000)
car2 = Car("Honda","Civic",2018)

# print(car1.year)
# print(car2.year)
# print(car1.model)
# print(car2.model)

# #why _init_: setting the initial state of the object when created
# #Important notes:
# #1. __nit__ does not return anything. Returns None by default
# #2. Not required to have __init__ in every class. However, without it, you can't initialize instance attributes

class Car:
  #class attribute
  wheels=4
  def __init__(self,make, model,year=2020):
    #instance attributes(default value prodided year=2020)
    self.make=make
    self.model=model
    self.year=year
#creating instances of the Car class
car1 = Car("Toyota", "Corolla")
car2 = Car("Honda","Civic",2018)
print(car1.year)
print(car2.year)

# #Understanding Methods in Python classes
# #Methods: Functions defined within a class, describe action that a created object can perform
# #Methods are essential in OOP. Allows object to have functionality and interact with its own data

# # #INSTANCE Methods

class Car:
  #class attribute
  wheels=4
  def __init__(self,make, model,mileage):
    #instance attributes
    self.make=make
    self.model=model
    self.mileage=mileage
  #instance methods to display car information
  def display_info(self):
    return f"{self.make} {self.model},mileage:{self.mileage}miles"
  #instance methods to update mileages
  def drive(self,miles):
    self.mileage += miles
    return f"Drove{miles}. Total mileage is now{self.mileage} miles"

# creating instances of the Car class

my_car = Car("Toyota", "Corolla", 10000)

#calling instance methods
print(my_car.display_info())
print(my_car.drive(150))

# #More examples on creating objects from classes

class Officebuildings:
  def __init__(self, floors, offices):
    self.floors = floors
    self.offices = offices
  def open_doors(self):
    print(" Doors are open for business")
    print(f"{self.offices} offices are open for business")
    print(f"{self.floors} floors are set up for business only")
building1 = Officebuildings(10,200)
building2 = Officebuildings(20,400)

building1.open_doors()
building2.open_doors()

class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def greet(self):
      return f"Hello {self.name}! Good to see you"
    
    def birth_day(self):
      self.age +=1
      return f"Happy Birthday, your age is now {self.age}"
    
person1=Person("Jack",19)
person2=Person("Joana",20)

print(person1.greet())
print(person2.greet())
print(person1.birth_day())
print(person2.birth_day())

class BankAccount:
  def __init__(self, account_holder, balance):
    self.acount_holder = account_holder
    self.balance = balance
  def deposit(self,amount):
    if amount >0:
      self.balance +=amount
      print(f"Your deposit is {amount} new balance is {self.balance}")
    else:
      print("Your deposit should be positive")
  def withdraw(self,amount):
    if amount>self.balance:
       print("Insufficient funds. Withdraw was unsuccessful")
    else:
      self.balance -=amount
      print(f"New balance: {self.balance}")

  def get_balance(self):
    print(f"Your current balance: {self.balance}")


person1 = BankAccount("James", 25000)
person2 = BankAccount("Joseph", 50000)

person1.get_balance()
person2.get_balance()
person1.deposit(-2000)
person2.deposit(3000)
person1.withdraw(25000)
person2.withdraw(60000)

  