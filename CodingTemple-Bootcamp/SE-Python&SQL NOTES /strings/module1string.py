
#STRING MANUPULATION

name = 'Jackson'

uppercase_name = name.upper()
print(uppercase_name)
lowercase_name = name.lower()
print(lowercase_name)

fruit = ' Apple '
print(fruit)
removed_space=fruit.strip()
print(removed_space)

greeting='Hello World'
print(greeting)
print(greeting.replace('World','Python'))

motivational = 'You did great'
extra=motivational.replace('great','spectacular')
print(extra)

# CREATING A LIST FROM A STRING

salutation = 'Hello All. How are you doing'
print(salutation)
salutation_list=salutation.split()
print(salutation_list)

# Create a sentense from a string

words= ['Jesus', ' has', ' risen']
sentence=''.join(words)
print(sentence)

#check if a variable starts with or ends with a certain words
filename = 'secure.pdf'
print(filename.endswith('.pdf'))
print(filename.startswith('sec'))
print(filename.endswith('ch'))

#Exercises
my_string = '        My daughter is very excellent'
print(my_string)
upper_my_string=my_string.upper()
print(upper_my_string)

#removing a space
removespace_my_string=my_string.strip()
print(removespace_my_string)

#replace 'daugher' with 'son'
new_string = my_string.replace('daughter','son')
print(new_string)

my_string_list = my_string.split()
print(my_string_list)

my_string2=''.join(my_string_list)
print(my_string2)

#Immutability of a string: It can't change once created

text = "Hello"
print(text[0])

if text[0] == 'H':
  print('You are right')
else:
  print("You're wrong")

text = text + ' H'
print(text)

# string indexing

word = "Python"

print(word[0])
print(word[2])
print(word[1])

name = 'Samson'

print(name[0])
print(name[1])
print(name[2])
print(name[3])


# string concatenation

first_name = 'Ferdinand'
second_name = ' Niyongira'

print(first_name + second_name)

print('Lucky' + ' Dube')


# String repetition

exclamation = ' Wow' * 5

print(exclamation)

repetition = 'Hello!' * 3
print("-" * 40)
print(repetition)

# String length

first_name_length=len(first_name)
print(first_name_length)

#Accessing substrings

print(first_name[-1])
print(second_name[2:])
print(first_name[2:4])
print(first_name[1:])

score=int(input("What's your national exam score?\n"))

if score > 90:
  print("Excellent")
elif score >= 70 and score <=90:
  print("Good")
elif score <=70:
  print("Needs improvement")

answer1 = input("What's the weather today?\n")
answer2 = input("What's your mood? \n")

if answer1 == 'sunny' and answer2 == 'happy':
  print("Go for a hike")
elif answer1 == 'sunny' and answer2 == 'tired':
  print("Go for swim")
else:
  print("Relax inddoors")


#Nested conditions
num = -2

if num > 0:
  if num % 2 ==0:
    print("The number is positive and even")
  else:
    print("The number is positive and odd")
else:
  print("The number is negative")

# combine 1st and 2nd names rondomaly to form Full name
import random

first_name = ['James', 'Amy', 'Paul', 'Jacques']
last_name = ['Khan', 'Bruce', 'Santos', 'Isakari']

rand_first_name=random.choice(first_name)
print(rand_first_name)
rand_last_name = random.choice(last_name)
print(rand_last_name)

Full_name = (rand_first_name + " " + rand_last_name)
print(Full_name)