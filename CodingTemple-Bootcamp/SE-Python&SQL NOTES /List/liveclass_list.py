# All negative values are falsey values which include zero. Include all  empty tuple,string, list, none, or zero are negatives. Thus falsey values 

temp = []

if temp:
  print("temp defined")

else:
  print(" temp Undefined")

#since 10 is not a falsey value, the answer should be "TEMP DEFINED"
temp = 10

if temp:
  print("temp defined")

else:
  print(" temp Undefined")

print("hello")
print("hello")
print("hello")
print("hello")
print("hello")
print("hello")

#Nested conditions

username = 'Niyongira334'

first_name = 'Niyongira'

password = 'Golden'

if first_name == 'Niyongira' and username == 'Niyongira334':
  decision = input("Are you a student?Yes or No \n")
  if decision == 'Yes':
    password_attempt = input("What'yourpassword \n")
    if password_attempt == 'Golden':
       print(f"Access granted. Hello + {first_name} ")
    else:
      print("Sorry, try again")
  else:
    print('Hello Teacher')
else:
  print("Hello teacher")

list = ["Jane", "Jack", "Samuel", "Gloria", "Giselle", "Ferdinand"]

print(list[:3])
print(list[::3])


print(list[1:])
print(list[1::])


print(list[1:3])
print(list[1::3])

print(list[3:])
print(list[3::])

list.pop(0)
print(list)

# .pop()is considered as a method due to dot at the pront)
# Methods id part of the class

# print() is considered as a funtion. It has no dot at the front
#function is created on its own

#append(add item at the end) vs insert(add item in a specific position)

list = ["bakeme",3, True, "Jenesis"]

list.append("Jane")
print(list)

list.insert(0,"China")
print(list)

#delete or pop(Both removes item specified with the index) vs remove(it removes the matching item)

# delete use = [index] and is reversed. del list[1]
# pop use = (index)


fruits = ["Mango", "Apple", "Avocado"]

fruits.remove("Mango")
print(fruits)

fruits.pop(0)
print(fruits)

del fruits[-1]
print(fruits)

# Built in list. len(), .min or .max(), .sort(), .reverse(), .extend(). 

numbers = [23,1,3,5,67,100]

max_number = max(numbers)
print(max_number)

len_num = len(numbers)
print(len_num)


numbers.sort()
print(numbers)

numbers.reverse()
print(numbers)

Vegetables = ["dodo", "capucino"]

numbers.extend(Vegetables)
numbers.clear()

print(numbers)

#Membership checks with IN OR NOT IN

languages = ["JAVA", "JAVASCRIPT", "Python", "C++"]

if "JAVA" in languages:
  print("This langauge belongs to our curriculum")
else:
  print("The language is not part of the curriculum")


if "JAVA" not in languages:
  print("This langauge doesn't belongs to our curriculum")
else:
  print("The language is part of the curriculum")

 
user_favbook = []

first = input("what's your first fav book:")
second = input("What's your second fav book:")
third = input("What's your third fav book:")

user_favbook.append(first)
user_favbook.append(second)
user_favbook.append(third)

user_favbook.sort()

print(user_favbook)


#Challenge-Exercise
fruits =['Strawberries','Nectarines','Apples','Grapes','Peaches','Cherries','Pears']
vegetables = ['Spinach','Kale','Tomatoes','Celery','Potatoes']

dirty_dozen = [fruits, vegetables]
print(dirty_dozen)
print(dirty_dozen[0])
print(dirty_dozen[1])
print(dirty_dozen[1][1])
print(dirty_dozen[1][2])
print(dirty_dozen[0][1])


# Refreshing list exercises
fruits = ["Mango", "Apple", "Banana", "Grapes", "Banana"]
print("Mango" in fruits)
print(fruits[1:4])
print(fruits)
fruits.insert(1, 'Peach')
print(fruits)

# list & list methods

fruits = ["apple", "banana", "pineapple", "Peach" ]
fruits.append("strawberry")
fruits.insert(0,"maji")
fruits.remove("apple")
fruits.insert(1,"Apple")

print( "Apple" in fruits)
print(fruits)
print("Mango" in fruits)
print("Embe" in fruits)
print(1 in fruits)
print(fruits[3])
print(fruits[0:2])
print(fruits[1:4])
