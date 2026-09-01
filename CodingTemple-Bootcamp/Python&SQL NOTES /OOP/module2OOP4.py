#Advanced OOP
#Special methods: Magic or dunger methods
#Class method:@classmethod
#Static method:@Staticmethod

#SPECIAL METHOD: __repr__ and __str__

#Sepcial methods allow your objects to interact seamlessly with Python's buildin functios and operators
#Very important in making your classes work well with debugging, printing, and other operations

#__repr__:Return a precise string representation meant for developers, typically used for debugging
#__str__: Return a readable string meant for end users, oftern used when printing objects
# Example
#E-Commerce Product class
# Let's use __repr__: To to display useful debugging informaiton
# Let's use _str__: To give users clean output

class Product:
  def __init__(self, name, price, quantity):
    self.name = name
    self.price = price
    self.quantity = quantity
  
  def __repr__(self):
    return f"Product(name={self.name}, Price={self.price}, Quantity={self.quantity})"
  def __str__(self):
    return f"{self.name}:${self.price}(Quantity:{self.quantity})"
  
#Developer view(using__repr__)

p = Product("Laptop", 999.99,5 )
print(repr(p))

#User view(using __str__)
print(p)


#CLASS METHODS
#Managing Class-Level Behavior
#Designed to work at the class level rather than instance level
#These methods can modify class attributes, create alternative constructor, Manage shared data that applies to all instances
#Consider a Car class where the company wants to track the total number of cars produced and also offer alternative ways to create cars, such as importing car data from a CSV file. We’ll use class methods to manage these operations.
class Car:
    total_cars = 0  # Class attribute to track the number of cars
    
    def __init__(self, model, year):
        self.model = model
        self.year = year
        Car.total_cars += 1  # Increment class-level counter when a car is created
    
    @classmethod
    def from_csv(cls, csv_data):
        # Alternative constructor to create cars from CSV-like data
        model, year = csv_data.split(',')
        return cls(model, int(year))
    
    @classmethod
    def total_produced(cls):
        return cls.total_cars
    
# Creating instances the regular way:
car1 = Car("Toyota Corolla", 2020)

# Creating an instance using class method:
car2 = Car.from_csv("Honda Accord,2018")

print(Car.total_produced())  # Output: 2

#STATIC METHODS

#Suppose we have a WeatherStation class that tracks temperatures. A static method can be used to convert between Fahrenheit and Celsius, which is useful across different parts of the system but doesn't depend on the WeatherStation itself.

class WeatherStation:
    
    def __init__(self, location, temperature_f):
        self.location = location
        self.temperature_f = temperature_f
    
    def __repr__(self):
        return f"WeatherStation(location={self.location}, temperature_f={self.temperature_f})"
    
    @staticmethod
    def fahrenheit_to_celsius(f_temp):
        return (f_temp - 32) * 5.0/9.0
    
    @staticmethod
    def celsius_to_fahrenheit(c_temp):
        return (c_temp * 9.0/5.0) + 32

# Usage of static methods:
temp_f = 77
temp_c = WeatherStation.fahrenheit_to_celsius(temp_f)
print(f"{temp_f}F is {temp_c:.2f}C")  # Output: 77F is 25.00C

temp_back_f = WeatherStation.celsius_to_fahrenheit(temp_c)
print(f"{temp_c:.2f}C is {temp_back_f:.2f}F")  # Output: 25.00C is 77.00F

