# #OOP Principles
# #Encapsulation, inheritance, Abstraction and polymorphism

# #Encapsulation involves using private attributes in python
# #Abstraaction: Involves simplifying system by hiding unnecessary details and expose only essential parts
# #Abstraction: User can use object without necessarily understanding its internal complexities
# #Abstraaction: A car object hids how engine works and only reveals start and drive

# #INHERITANCE
# #Allow new class to inherit(sub_class) to inherit attributes and methods from the existing class(Super_class)
# #Vehicle can be super cass while car and bike are subclass or child class inheriting its properties

# #Polymorphism
# #Allow methods to do different things based on object calling them
# #Examples: Different classes(Dog and Cat) may have same method speeak() but with differnt outputs("Woof" vs "Meow") 

# #Encapsulation
# #Public, private and protected attributes

# #Examples of public attributes

class BankAccount:
  def __init__(self,account_holder,balance):
    self.account_holder = account_holder    #These are public attributes
    self.balance=balance

#creating new_bank account

account = BankAccount("Alice",1000)
#Accessing and modifying public attributes
print(account.account_holder)
print(account.balance)
#modifying balance-public attributes
account.balance+=5000

print(account.balance)

#2nd Example
class Character:
  def __init__(self, name, health, level):
    self.name = name
    self.health=health
    self.level=level

#Creating a new character
player1 = Character("Archel", 1000, 1)

#Accessing and modifying public attributes
print(player1.name)
print(player1.health)
player1.level +=1
player1.health -=200

print(player1.level)
print(player1.health)


# #Protected attributes:_attributes
# #They are accessible from outside class but it is discouraged by convention. 

class BankAccount:
  def __init__(self,account_holder,balance):
    self.account_holder = account_holder    #This is public attributes
    self._balance=balance           #This is protected attributes
  def get_balance(self):
    return self._balance

class SavingsAccount(BankAccount):
  def add_interest(self,interest_rate):
    self._balance +=self._balance*interest_rate


#create savinggs account
savings = SavingsAccount("Bob",2000)
savings.add_interest(0.05)

print(savings.get_balance())

# _balance is protected: Allows access within bank account and subclass SavingsAccount

# Private attributes
# Strict access control
# Double underscore prefix:__attribute: 
# Name Mangling: _ClassName__attribute

class BankAccount:
  def __init__(self,account_holder,balance,password):
    self.account_holder = account_holder    #This is public attributes
    self.__balance=balance           #This is private attributes
    self.__password=password          #This is private attributes
  def get_balance(self,password):
    if password==self.__password:
      return self.__balance
    else:
      return "Access denied"
#Creating a bank account with a private balance and password
account = BankAccount("Charless", 4000, "mypassword")

#Accessing balance with a correct password
print(account.get_balance("mypassword"))

#Trying to access attribute directly will raise attribute errors

# print(account.__balance) #This will raise error

#Accessing a bank account with "Mangling" [This is not recommended]
print(account._BankAccount__balance)


# #Another example of private attribute

class SocialMediaProfile:
  def __init__(self,username, email, password ):
    self.username = username
    self.__email=email   #Private attributes
    self.__password=password   #Private attributes

  def verify_password(self,input_password):
    if input_password == self.__password:
      return "Password verified"
    else:
      return "Invalid password"
    
  def get_email(self, input_password):
    if input_password == self.__password:
      return self.__email
    else:
      return "Access denied"
    
#   #Creating  a social media profile
# profile = SocialMediaProfile("Zack23", "zac23@gmail.com", "zackpassword")

# #Access private email with correct password
# print(profile.get_email("zackpassword"))
# #Access attributes directly
# # print(profile.__email) This will raise error

# #Access private attributes via Mangling-Discouraged
# print(profile._SocialMediaProfile__email)

class SmartPhone:
  def __init__(self, model, serial_number, operating_system):
    self.model = model
    self.__serial_number = serial_number
    self._operating_system = operating_system

  def show_info(self):
    print(f"Model:{self.model}")
    print("Serial nuber: Hidden for security purpose")
    print(f"Operating system:{self._operating_system}")

my_phone = SmartPhone("Pixel 5", "123432ABC", "Android")

print(my_phone.model)
#print(my_phone.__serial_number) #Gives errors
print(my_phone._operating_system)

#Engage and apply: Midlesson exercises


#name     #Public
#Verify password #Private
#Get email   #Private
#Get user name #Private
#Verify phone phone number #Private


class FacebookLogins:
  def __init__(self, name, user_name, email, phone_number,password,food, bmi):
    self.name = name
    self.__user_name = user_name
    self.__email = email
    self._phone_number = phone_number 
    self.__password = password
    self.food = food
    self.__bmi = bmi


  def verifying_password(self,password):
    if password == self.__password:
      return "Password Verified"
    else:
      return "Invalid Password"

  def get_username(self, email,password):
    if email == self.__email  or password==self._password:
      return self.__user_name
    else:
      return "Invalid input"
  def get_phone_number(self, name, user_name):
    if name == self.name and user_name == self.__user_name:
      return self._phone_number
    
  def heathy_habits(self,food):
    if food == self.food:
      self.__bmi +=2
      return f"Since you consumed {food}, your bmi increaded to: {self.__bmi}. Now you are healthy"
    else:
      return "You need to keep eating good meals with more proteins and calories"
  

user1 = FacebookLogins("Jessica", "Jess2025","jess@gmail.com", 400300000302,"Moses2030","Chicken",18)
verify = user1.verifying_password("Moses20301")
print(verify)

username = user1.get_username("jess@gmail.com","Moses")
print(username)

phone_number = user1.get_phone_number("Jessica","Jess2025")
print(phone_number)

healthiness = user1.heathy_habits("Chicken")
print(healthiness)

print(user1.name)
print(user1._phone_number)

# print(user1.__user_name)      #This is will result in error. It is a private attribute

class FitnessTracker:
  def __init__(self,user_name):
    self._user_name = user_name
    self.__steps = 0
    self.__calories_burned = 0.0

  def add_steps(self,steps):
    if steps > 0:
      self.__steps +=steps
      print(f"You have steps {steps} and total steps now is {self.__steps}")
    else:
      print("Steps should be positive")
  def get_steps(self):
    return self.__steps

  def add_calories(self,calories):
    if calories >= 0:
      self.__calories_burned += calories
      print(f"Your calories burned are {calories} and total calories burned are {self.__calories_burned}")
  def get_calories(self):
    return self.__calories_burned
  def reset_tracker(self):
    self.__steps = 0
    self.__calories_burned = 0.0
#     print(f"Your tracker has been reset. Steps walked: {self.__steps} and total_calories burned: {self.__calories_burned}")


user = FitnessTracker("James")

user.add_steps(10)
user.add_calories(100)

print(f"Total steps: {user.get_steps()} and total calories: {user.get_calories()}")


#Inheritance and polymorphism
#Fundamental concept in OOP where one class(child or subclass) inherit attributes and methods of another(superclass)
#Key Concept
##Super class: Parent class, Subclass(Childclass), 
# Super():Building function used to call a method, 
# Method_overriding: A subclass can overide a method defined in a parent class to provide specific behavior for the subclass

#Parent class

class Character:
  def __init__(self,name, health, attack_power):
    self.name = name
    self.health = health
    self.attack_power = attack_power

  def move(self):
    print(f"{self.name} is moving")
  def attack(self):
    print(f"{self.name} attacks with {self.attack_power} power")

#subclass: Warrior
class Warrior(Character):
  def __init__(self, name, health, attack_power, armor):
    super().__init__(name, health, attack_power)   #parent class constructor
    self.armor=armor
  def use_shield(self):
    print(f"{self.name} blocks attack with shield")

#subclass: Mage
class Mage(Character):
  def __init__(self, name, health, attack_power,mana):
    super().__init__(name, health,attack_power)
    self.mana = mana

  def cast_spell(self):
    print(f"{self.name} casts a powerfull spell ")

# #creating instances

warrior = Warrior("Conon",100,100, "Iron Armor")
mage = Mage("Gandalf",80,25,100)

warrior.move()
warrior.attack()
warrior.use_shield()

mage.move()
mage.attack()
mage.cast_spell()

#Overiding in Inheritance: 

class Character:
  def __init__(self,name, health, attack_power):
    self.name = name
    self.health = health
    self.attack_power = attack_power

  def attack(self):
    print(f"{self.name} attacks with {self.attack_power} power")

class Warrior(Character):
    def attack(self):
      #Override the parent class method
      print(f"{self.name} slashes with a sword, dealing {self.attack_power} damage!")
class Mage(Character):
  def attack(self):
    #Override the parent class method
    print(f"{self.name}cast a fireball, dealing {self.attack_power} damage!")

#creating instances
warrior = Warrior("Canon",100,20)
mage = Mage("Gandalf",80,25)

warrior.attack()
mage.attack()


#Another examples
# Overriding Parent Method Video

class SmartPhone:
  def __init__(self,model):
    self.model = model

  def make_call(self,number):
    print(f"Make call to {number}")
  def send_message(self,number,message):
    print(f"Sending message to {number}:{message}")
class SmartCameraPhone(SmartPhone):

  def __init__(self,model,camera_resolution):
    super().__init__(model)  #call super class constructor
    self.camera_resolution = camera_resolution

  def take_photo(self):
    print(f"Taking a photo with{self.camera_resolution} resolution")
  def make_call(self,number):
    #Override the make call method from parent class
    print(f"Making a video call to {number} with {self.camera_resolution} resolution") 

#Example usage or creating instances
basic_phone = SmartPhone("Techno")
camera_phone = SmartCameraPhone("Iphone x pro", "1600px")

basic_phone.make_call("4563449000")
camera_phone.make_call("456344900")
