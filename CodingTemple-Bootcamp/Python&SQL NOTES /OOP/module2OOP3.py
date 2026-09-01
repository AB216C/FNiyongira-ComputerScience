#Polymorphism

#Key Concepts:
#Same interface and different behavior: Same method name accross multiple class but with differnt implementations
#Flexibility: More flexible and reusable code by treating objects of different type the same way
# Dynamic Typing: Make polymorphism powerful since objects are more identified by their behaviors or m
# ethods rather than specific class


#ABC: Abstract Base Class. Blue print for other classes. It is used to enforce that certain methods should be implemented in subclasses.
#ABC can not be constrained directly
#ABC ensures any subclass provides specific method by marking them as @abstractmethod

from abc import ABC, abstractmethod

class Character:
  @abstractmethod
  def attack(self):
    print("This method should be overridden by subclasses")
class Warrior(Character):
  def attack(self):
    print("Warriro should attack with sword")
class Mage(Character):
  def attack(self):
    print("Mage attack fireball")
class Archel(Character):
  def attack(self):
    print("Archer shot with an arrow")

# #using a polymorphism in  a function
def perform_attack(Character):
  Character.attack()  #Calls the correct method based on the object's class
#can not instantiate character directly
character = Character()  #This raises type error
#Creating instances of different character type
warrior = Warrior()
mage = Mage()
archel= Archel()

#Using polymorphism 
perform_attack(warrior)
perform_attack(mage)
perform_attack(archel)

# def perform_attack(Character): Comes in to treat all attack() functions from each class the same

# #Another example

class User:
  def post_content(self):
    print("Posting generic content")

class RegularUser(User):
  def post_content(self):
    print("Post a photo as a regular user")
class Influencer(User):
  def post_content(self):
    print("Post a sponsored video as an influencer")
class Brand(User):
  def post_content(self):
    print("Post an add as a brand")
#Polymorphic behavior

def publish_post(user):
  user.post_content()

# #creating instances
default_user = User()
user1 = RegularUser()
user2 = Influencer()
user3 = Brand()

publish_post(default_user)
publish_post(user1)
publish_post(user2)
publish_post(user3)


# #Exercises
class Smartphone:
  def download_app(self,app_name):
    print(f"Downloading {app_name} in a generic way")
class Androidphone(Smartphone):
  def download_app(self,app_name):
    print(f"Downloading {app_name} from Google Play Store")
class Iphone(Smartphone):
  def download_app(self,app_name):
    print(f"Downloading {app_name} from Apple Store")
def download_app_on_phone(phone, app_name):
  phone.download_app(app_name)


generic_phone = Smartphone()
android_phone = Androidphone()
iphone = Iphone()

download_app_on_phone(generic_phone,"Watsap")
download_app_on_phone(android_phone,"Twitter")
download_app_on_phone(iphone,"Music_app")

#Multiple inheritance
#Pyhthon allows to classes to inherit from more than one class which is known as multiple inheritance
# #Examples

class Flyer:
  def fly(self):
    print("Flying high")
class Swimmer:
  def swim(self):
    print("Diving deep")
class Duck(Flyer,Swimmer):
  def quack(self):
    print("Quacked and all birds run away")

# #CREATING INSTANCES OF DUCK

duck = Duck()
duck.fly()
duck.swim()
duck.quack()

#In this example, Duck class inherit fly method from flyer class, and swim method from swimmer class: Multiple inheritance

#Avoid Diamond problem: In OOP, this is defined as an ambiguity that arises with multiple inheritance . A-> B & C -> D
# With A is a base class, B and C inherit from A, and D inherits from B and C
# Ambiguity arises when D tries to access a method or attributes from A. Since B & C inherit from A, it is unclear which path D should follow
#to access A's methods

#MRO(Method Resolution Order): Is a method used to fix such ambiguity. MRO determine order in which python looks for methods and attributes in
#hierarchy
#It uses " C3 LINEALIZATION ALGORITHM"
#1. A class is searched before base classes
#2. left to right order of base classes in inheritance is respected
#__mro__ attribute or mro() method
# #Examples

class A:
  def greet(self):
    print("Hello from A")
class B(A):
  def greet(self):
    print("Hello from B")
class C(A):
  def greet(self):
    print("Hello from C")
class D(B,C):
  pass
d = D()
d.greet()
print(D.mro())

#D inherit from  B and c
# the MRO ensures B's method is called first because B appears before C in the MRO.

