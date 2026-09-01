#Common Interview questions
# Basic concepts in OOP
#class-Blueprint for creating objects
#Objects-instance of a class
#Attributes-variable that belong to a class also called class properties
#Methods: Functions that belong to a class

#Another common interview question

#Four pillars of OOP

#Encapsulation
#Inheritance
#Polymorphism
#Abstraction

# class MyClass:
#   def __init__(self, attribute1, attribute2):
#     self.attribute1 = attribute1
#     self.attribute2 = attribute2

#   def my_method(self):
#     print(f"This is our first method. Attribute 1:{self.attribute1}, attribute 2: {self.attribute2}")

# #creating the object(instance):
# obj = MyClass("Alan", "Kelly")

# print(obj.attribute1)
# print(obj.attribute2)

# obj.my_method()



#More about Encapsulations
class Employee:
  def __init__(self, name, salary):
    self.name = name
    self.salary = salary
  #getter
  def get_salary(self):
    return self.salary
  #setter
  def set_salary(self, new_salary):
    self.salary = new_salary

employee1 = Employee("Jack", 10000)
employee2 = Employee("John", 20000)


print(employee1.get_salary())
print(employee2.get_salary())

employee1.set_salary(25000)
print(employee1.get_salary())

employee2.set_salary(50000)
print(employee2.get_salary())

#With classes, we can create a bunch of objects using same class
employee3 = Employee("Jack2", 170000)
employee4 = Employee("John2", 250000)
print(employee3.get_salary())
print(employee4.get_salary())

employee3.set_salary(40000)
print(employee3.get_salary())

employee4.set_salary(60000)
print(employee4.get_salary())