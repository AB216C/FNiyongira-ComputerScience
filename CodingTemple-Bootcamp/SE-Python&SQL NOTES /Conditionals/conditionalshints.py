#Using % sign(Modulo) to tell if numbers are even or odd

print(4%2)
print(5%4)
print(8%2)
print(8%3)

number = int(input())

if number%2 == 0:
 print("This is even number")
else:
 print("This is odd number")

 # Writing rollercoaster instructions

 print("Welcome all to the most famous Rollercoaster in North West of South Carolina")

 print("what is your height?cm")

 print("what is your age")

 height = int(input())
 age = int(input())

 if height >= 120:
  print("You can board now")
 elif age < 16:
  print("Pay $5")
 elif 16 <= age <= 20:
  print("Pay $10")
 elif age > 20:
  print("Pay $20")
 else:
  print("Sorry you can not board today, wait till you get taller")


# BMI CALCULATOR BMI = WEIGHT/HEIGHT**2
print("what is your height?cm")
height = float(input())
print("what is your weight?kg")
weight = int(input())

bmi = int(weight/(height * height))

if bmi <= 18:
 print (f"Your bmi is {bmi}, You are underweight.")
elif 18 <= bmi <= 22:
 print(f"Your bmi is {bmi}, you have a normal weight")
elif 22 <= bmi <= 28.5:
 print(f"Your bmi is {bmi}, You are slightly overweight")
elif 28.5 <= bmi <= 32.56:
 print(f"Your bmi is {bmi}, You are obese")
else:
 print(f"Your bmi is {bmi}, You are clinically obese")

#Leap Year Calculator.NESTED CONDITIONS.
print("Welcome to the Leap Year calculator")

print("Enter the Year you are interested in")
year = int(input())

if year % 4 == 0:
 if year % 100 ==0:
   if year % 400 == 0:
       print("Leap year")
   else:
     print("Not Leap year")
 else:
   print("Leap Year")
else:
  print("Not Leap year")

  # Continuation: Roller Coaster project: ADDING EXTRA CONDITIONS

print("Welcome all to the most famous Rollercoaster in North West of South Carolina")

height = int(input("What's your height? cm "))
bill = 0
if height >= 120:
 print("You can board now")
 age = int(input("what's your age? "))
 if age < 12:
  print("Child tickets are $5 ")
  bill = 5
 elif age <= 20:
  print("Youth tickets are $10")
  bill = 10
 else:
  print("Adult tickets are $20")
  bill = 20
 photo = input("Do you want photo taken Y or NO ")
 if photo == "Y":
  bill = bill + 3
  print(f"Total bill will be {bill}")
else:
 print("Sorry you can not board today, wait till you get taller")

 # Python Pizza project
 print("Thank you for choosing Python Pizza deliveries!")
 size = input("What size of pizza do you want  S, M, or L?\n")
 add_pepperoni = input("Do you want pepperoni, Y or N?\n")
 add_extra_cheese = input("Do you want extra cheese, Y or N?\n")
 bill = 0
 if size == "S":
  print("Small pizza cost $15")
  bill = 15
  if add_pepperoni == "Y":
   bill = bill + 2
   if add_pepperoni == "N":
    bill = bill + 0
    if add_extra_cheese == "Y":
     bill = bill + 1
 elif size == "M":
  print("Medium pizza cost $20")
  bill = 20
  if add_pepperoni == "Y":
   bill = bill + 3
   if add_pepperoni == "N":
    bill = bill + 0
    if add_extra_cheese == "Y":
     bill = bill + 1
 elif size == "L":
  print("Large pizza cost $25")
  bill = 25
  if add_pepperoni == "Y":
   bill = bill + 3
   if add_pepperoni == "N":
    bill = bill + 0
    if add_extra_cheese == "Y":
     bill = bill + 1
 else:
  print("Please double check the menu for more info")
 print(f"Your final bill for today  will be ${bill}")
#WORKING ON ROLLERCOSTER PROJECT-ADDING OPERATOR
 print("Welcome all to the most famous Rollercoaster in North West of South Carolina")

 height = int(input("What's your height? cm "))
 bill = 0
 if height >= 120:
  print("You can ride rollercoaster")
  age = int(input("what's your age? "))
  if age < 12:
   print("Child tickets are $5 ")
   bill = 5
  elif age <= 20:
   print("Youth tickets are $10")
   bill = 10
  elif age >= 45 and age <= 55:
   print("Your got a free ticket")
   bill = 0
  else:
   print("Adult tickets are $20")
   bill = 20
  photo = input("Do you want photo taken Y or NO ")
  if photo == "Y":
   bill = bill + 3
   print(f"Total bill will be:$ {bill}")
 else:
  print("Sorry you can not board today, wait till you get taller")

# Roller coaster project continued with operators added. Extra condion and, or and not
print("Welcome all to the most famous Rollercoaster in North West of South Carolina")

height = int(input("What's your height? cm "))
bill = 0
if height >= 120:
 print("You can ride rollercoaster")
 age = int(input("what's your age? "))
 if age < 12:
  print("Child tickets are $5 ")
  bill = 5
 elif age <= 20:
  print("Youth tickets are $10")
  bill = 10
 elif age >=45 and age <= 55:
  print("Your got a free ticket")
  bill = 0
 else:
  print("Adult tickets are $20")
  bill = 20
 photo = input("Do you want photo taken Y or NO ")
 if photo == "Y":
  bill = bill + 3
  print(f"Total bill will be:$ {bill}")
else:
 print("Sorry you can not board today, wait till you get taller")

#Exciting project-LOVE CALCULATOR
print("Love calculator is calculating your score.....")

name1 = input("what is your name?\n")
name2 = input("What is your name?\n")

combined_names = name1 + name2

lower_names = combined_names.lower()

t = lower_names.count("t")
r = lower_names.count("r")
u = lower_names.count("u")
e = lower_names.count("e")

first_digit = t + r + u + e

l = lower_names.count("l")
o = lower_names.count("o")
v = lower_names.count("v")
e = lower_names.count("e")

second_digit = l + o + v + e

score = int(str(first_digit) + str(second_digit))

if score < 10 and score > 90:
    print(f" Your score is {score}, you go together like coke and mentos")
elif score > 40 and score <50:
    print(f"Your score is {score}, you are alright together")
else:
    print(f"Your score is {score}")



# Randomization and python list

import random

random_integer = random.randint(1, 4)
print(random_integer)

random_float = random.random()
print(random_float)

random_float = random.uniform(10, 90)
print(random_float)

random_float1 = random.random() * 5
# print(random_float1)

love_score = random.randint(1, 100)
print(love_score)

#Creating toss coin random game:

toss_coin = random.randint(0, 1)
if toss_coin == 1:
 print("Heads")
else:
 print("Tails")