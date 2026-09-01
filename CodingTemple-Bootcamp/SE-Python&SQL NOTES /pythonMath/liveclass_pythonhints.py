#floating vs INT using isinstance()
print("-"*50)
num_int=42
num_float=42.42

print(isinstance(num_int,float))
print(isinstance(num_int,int))
print(isinstance(num_float,int))
print(isinstance(num_float,float))

print(isinstance(num_int,float))
print(isinstance(num_int,int))
print(isinstance(num_float,int))
print(isinstance(num_float,float))

print("-"*50)
#Modulus or remainder and how it is used
num = 21

if num%2 == 0:
  print("The number is Even")

else:
  print("This number is odd")

print("-"*50)
#using modulus to check hours on clock
hour_on_clock = 21%12
print(hour_on_clock)

hour_on_clock = 15%12
print(hour_on_clock)

hour_on_clock = 13%12
print(hour_on_clock)

print("-"*50)
#using modulus to check money left after a big purchase

wallet = 100
money_spent = 45.5

money_left = wallet%money_spent
print(money_left)
print("-"*50)

print("-"*50)
#using pow() to do big math

big_math = pow(2,3,4)
big_math2 = 2 **3%4

print(big_math)
print(big_math2)

big_math3 = pow(5,3,4)
big_math4 = 5 **3%4

print(big_math3)
print(big_math4)

print("-"*50)
#absolute Value

temp_Musanze = 34
temp_Rubavu = 23

change_in_temp = abs(temp_Rubavu-temp_Musanze)
print(change_in_temp)

print("-"*50)
#floor division and round the answer
people = 5
slice_of_pizza = 12
slice_per_person = 12//5
print(slice_per_person)
print(slice_of_pizza/people)
print(round(slice_per_person))

#Another hint/challenge

a = int(input("What's your favorite number \n"))
b =int(input("What's your second fav number?\n"))

c = a + b
d = a/b
e = a-b
h = a * b

print(c)
print(d)
print(e)
print(h)

