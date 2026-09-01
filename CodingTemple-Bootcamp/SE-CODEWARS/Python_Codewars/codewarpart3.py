#codewards on classes
#You are given a method called main, make it print the line Hello World!, 
# (yes, that includes a new line character at the end) and don't return anything
# Note that for some languages, the function main is the entry point of the program.
# Here's how it will be tested:
#Solution.main("parameter1", "parameter2","parametern")
# Hints:
# Check your references
# Think about the scope of your method
# If you still don't get it probably you can define main as an attribute of the Solution class 
# that accepts a single argument, and that only prints "Hello World!" without any return.  
# class Solution:
class Solution:
    def __init__(self,parameter1):
        self.parameter1 = parameter1
    def main(self):
        print("Hello World!")
result1 = Solution("greeting")
result1.main()

# The following code was thought to be working properly, 
# however when the code tries to access the age of the person instance it fails.

# person = Person('Yukihiro', 'Matsumoto', 47)
# print(person.full_name)
# print(person.age)
# For this exercise you need to fix the code so that it works correctly.

# Note: the order of the person's full name is first name and last name.


class Person():

    def __init__(self, first_name, last_name, age):
        self.first_name = first_name
        self.last_name = last_name
        self.age = age
    def full_name(self):
        name= "".join(self.first_name + " "+ self.last_name)
        return name
    

# person = Person("Ferdinand", "Niyongira", 29)
person = Person('Yukihiro', 'Matsumoto', 47)

print(person.age)
print(person.full_name())
print(person.first_name)

# Your job is to write a function, which takes three integers a, b, and c as arguments, and returns True if exactly two of the three integers are positive numbers (greater than zero), and False - otherwise.

# Examples:
# two_are_positive(2, 4, -3) == True
# two_are_positive(-4, 6, 8) == True
# two_are_positive(4, -6, 9) == True
# two_are_positive(-4, 6, 0) == False
# two_are_positive(4, 6, 10) == False
# two_are_positive(-14, -3, -4) == False


def two_are_positive(a, b, c):
    if a >0 and b>0 and c<0:
        return True
    elif a>0 and b<0 and c>0:
        return True
    elif a<0 and b>0 and c>0:
        return True
    elif a >0 and b>0 and c==0:
        return True
    elif a>0 and b==0 and c>0:
        return True
    elif a==0 and b>0 and c>0:
        return True
    else:
        return False
    

#Implement a function that returns the minimal and the maximal value of a list (in this order).

seq = [1]
new_list = []
# min_num = min(seq)
# max_num= max(seq)
# new_list.append(min_num)
# new_list.append(max_num)
# print(new_list)
seq.sort(reverse=False)
new_list.append(seq[0])
new_list.append((seq[-1]))

print(tuple(new_list))

def get_min_max(seq):
    new_list = []
    seq.sort(reverse=False)
    new_list.append(seq[0])
    new_list.append((seq[-1]))
    return tuple(new_list)

# numbers = 345612998

# new_num=[]

# for x in str(numbers):
#     new_num.append(x)
#     new_num.sort(reverse=True)
# result=int(''.join(map(str,new_num)))
# print(result)


input = [34,1,4,10,20]

input.sort(reverse=False)

sum_num = sum(input[1:-1])

print(input[1:-1])
print(sum_num)

def sum_array(array):
    array.sort(reverse=False)
    sum_num = sum(array[1:-1])
    return sum_num
    
print(sum_array([1,10,2,5]))

#Create a function that takes a list of numbers as an argument, 
# squares each number, and 
# returns a new list with the squared values.

# WITHOUT A FUNCTION

list  = [5,10]
result_list=[]

for item in list:
  squared_num = item**2
  result_list.append(squared_num)
print(result_list)

#WITH A FUNCTION
my_list  = [5,10]

def squared_numbers(num_list):
  result_list=[]
  for num in num_list:
    squared_num = num**2
    result_list.append(squared_num)
  return result_list
print(squared_numbers(my_list))

#If you can't sleep, just count sheeps!!
#Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". 
# Input will always be valid, i.e. no negative integers.
#1
def count_sheep(n):
  return "".join(f"{i} sheep..." for i in range(1, n+1))

result = count_sheep(9)
print(result)
#Method 1 will print sheep.. perfectly on a straight line

#2
n=int(input("How many sheeps?"))
for i in range(1, n+1):
  print( "".join(f"{i} sheep..."))
#Method 2 will print sheeps but won't be on a straight line(Horizontally-not a desired mehod)

result = []
for i in range(1, n+1):
  result.append(f"{i} sheep...")
print("".join(result))

#Method 3 will print provide the right results(1 sheep...2 sheep...straightline)

# What if we need the length of the words separated by a 
# space to be added at the end of that same word and have it returned as an array?
# Example(Input --> Output)
# "apple ban" --> ["apple 5", "ban 3"]
# "you will win" -->["you 3", "will 4", "win 3"]
# Your task is to write a function that takes a String and returns an
#  Array/list with the length of each word added to each element .
# Note: String will have at least one element; words will always be separated by a space.

# words = "apple ban" 
words = "you will win"
new=words.split()

result = []

for word in new:
  result.append(f"{word} {len(word)}")
print(result)
#Using function methods
def add_length(words):
    new=words.split()
    result = []

    for word in new:
        result.append(f"{word} {len(word)}")
    return result

# Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array 
# consisting of one or more values that should be 
# joined together with one space between each, and the length of the name array in test cases will vary.
# Example:
# ['John', 'Smith'], 'Phoenix', 'Arizona'
# This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!

name = input("What's your name")

city = input("What's your city")

state = input("What's your state")

joined_name = " ".join(name)
print(joined_name)

# Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature, 
# Help Timmy with his string template so it works as he expects!
# ('Cheese','Milk','Chocolate'), 'I like Cheese, Milk, Chocolate!', 'Return the correct String')
def build_string(*args):
    joined=", ".join(args)
    return f"I like {joined}!"


# The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

# max_sequence([-2, 1, -3, 4, -1, 2, 1, -5, 4])
# # should be 6: [4, -1, 2, 1]
# Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

# Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.


def max_sequence(arr):
    if not arr:
        return 0
    maximum_sum = 0
    original_sum = 0
    
    for number in arr:
        original_sum = max(number, original_sum + number)
        maximum_sum = max(maximum_sum,original_sum)
    return maximum_sum

def maxSequence(arr):
	# ... 
    cur_sum, max_sum = 0, 0
    for item in arr:
        cur_sum = max(item, cur_sum+item)
        max_sum = max(max_sum, cur_sum)
    return max_sum



# ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
# If the function is passed a valid PIN string, return true, else return false.
# Examples (Input --> Output)
# "1234"   -->  true
# "12345"  -->  false
# "a234"   -->  false

# pin ="1234"
# pin="a234"
# pin = "-1a2345" 


def validate_pin(pin):
    return True if len(pin) in [4,6] and pin.isdigit() else False


def validate_pin(pin):
    if pin.isnumeric() and len(pin) in [4,6]:
        return True
    return False

# Given an array of ones and zeroes, convert the equivalent binary value to an integer.

# Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

# Examples:

# Testing: [0, 0, 0, 1] ==> 1
# Testing: [0, 0, 1, 0] ==> 2
# Testing: [0, 1, 0, 1] ==> 5
# Testing: [1, 0, 0, 1] ==> 9
# Testing: [0, 0, 1, 0] ==> 2
# Testing: [0, 1, 1, 0] ==> 6
# Testing: [1, 1, 1, 1] ==> 15
# Testing: [1, 0, 1, 1] ==> 11

# numbers = [1, 0, 0, 1] 
numbers =[1, 1, 1, 1] 

binary_string = map(str,numbers)
result =''.join(binary_string)
result2 = int(result,2)
print(result2)

def binary_array_to_number(arr):
    binary_string = map(str,arr)
    result =''.join(binary_string)
    result2 = int(result,2)
    return result2


# test.it("better_than_average([2, 3], 5) should return True")
# test.assert_equals(better_than_average([2, 3], 5), True)

# test.it("better_than_average([100, 40, 34, 57, 29, 72, 57, 88], 75) should return True")
# test.assert_equals(better_than_average([100, 40, 34, 57, 29, 72, 57, 88], 75), True)

class_points = [2,3]
your_points = 5

if sum(class_points)/len(class_points) > your_points:
  print(False)
else:
  print(True)

def better_than_average(class_points, your_points):
    return False if sum(class_points)/len(class_points) > your_points else True

# Complete the function which converts hex number (given as a string) to a decimal number.

# test.assert_equals(hex_to_dec("1"), 1)
#         test.assert_equals(hex_to_dec("a"), 10)
#         test.assert_equals(hex_to_dec("10"), 16)

#====Notes=====

# A "hex number" refers to a hexadecimal number, which is a number written in base 16, 
# using the digits 0-9 and letters A-F to represent values from 0 to 15;
# it's commonly used in computer science to represent binary data more compactly,
number = "10"

hex_to_dec = int(number,16)

print(hex_to_dec)

def hex_to_dec(s):
    hex_to_dec = int(s,16)
    return hex_to_dec

# Your task is to write function factorial.

n = 5

#n! = n * (n-1)(n-2)(n-3)
#n! = n*(n-1)!


result = 1

for i in range(1 , n + 1):
  result = result * i

print(result)


def factorial(n):
    result = 1
    for i in range(1 , n + 1):
        result = result * i
    return result

# Timmy & Sarah think they are in love, but around where they live, 
# they will only know once they pick a flower each. 
# If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
# Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
# You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched their heads and tails around!
# Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). 
# It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).
# Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics
# Simples!

def fix_the_meerkat(arr):
    arr.reverse()
    return arr


#=========ORD() FUNCTION =======

# the ord() method takes a single character as an input and return an integer
#representing a unicode character

a = ord("a")
A = ord("A")
print(a)
print(A)

b = ord("b")
B = ord("B")
print(b)
print(B)

# c = ord("c")
# print(c)

# z = ord("z")
# print(z)

import string


alphabets = string.ascii_lowercase
alphabets2 = string.ascii_uppercase

print(alphabets)
print(alphabets2)

result = {letter:ord(letter) for letter in alphabets}
print(result)
print("x###########"*5)
result2 = {ch:ord(ch) for ch in alphabets2}
print(result2)

#def sum_word_character(sentence):

sentence = "hello"

# result = {letter:ord(letter)-96 for letter in alphabets}

# result2 = [result[letter] for letter in sentence]

total = sum(result2)
print(result2)
print(total)

unicode_point = 97

# print(chr(unicode_point))

# Your task is to add up letters to one letter.
# The function will be given a variable amount of arguments, 
# each one being a letter to add.
# Notes:

# Letters will always be lowercase.
# Letters can overflow (see second to last example of the description)
# If no letters are given, the function should return 'z'
# Examples:
# add_letters('a', 'b', 'c') = 'f'
# add_letters('a', 'b') = 'c'
# add_letters('z') = 'z'
# add_letters('z', 'a') = 'a'
# add_letters('y', 'c', 'b') = 'd' # notice the letters overflowing
# add_letters() = 'z'


result = [ord(letter)-ord("a") + 1 for letter in sentence]
print(result)

# Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

# [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

import math
list = [1,2,3,4]

product = math.prod(list)
print(product)

import math

def grow(arr):
    product = math.prod(arr)
    return product


# Create a function that finds the integral of the expression passed.
# In order to find the integral all you need to do is add one to the exponent 
# (the second argument), 
# and divide the coefficient (the first argument) by that new number.
# For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, 
# and divided the coefficient by that new number).

# Notes:

# The output should be a string.
# The coefficient and exponent is always a positive integer.
# Examples
#  3, 2  -->  "1x^3"
# 12, 5  -->  "2x^6"
# 20, 1  -->  "10x^2"
# 40, 3  -->  "10x^4"
# 90, 2  -->  "30x^3"

quoeficient = 3
exponent = 2

integrated_exponent = exponent + 1
integrated_quoefficient = quoeficient//integrated_exponent

integral = f"{integrated_quoefficient} * ^{integrated_exponent}"
print(integral)

def integrate(coefficient, exponent):
    integrated_exponent = exponent + 1
    integrated_quoefficient = coefficient//integrated_exponent
    integral = f"{integrated_quoefficient}x^{integrated_exponent}"
    return integral



# Write a function
# triple_double(num1, num2)
# which takes numbers num1 and num2 and returns 1 if there is a straight triple of a digit at any place in num1 and also a straight double of the same digit in num2.
# If this isn't the case, return 0
# triple_double(451999277, 41177722899) == 1
# # num1 has straight triple 999s and num2 has straight double 99s
# triple_double(1222345, 12345) == 0
# # num1 has straight triple 2s but num2 has only a single 2
# triple_double(12345, 12345) == 0
# triple_double(666789, 12345667) == 1


num1 = 451999277
num2 = 41177722899

string_num1= str(num1)
string_num2 = str(num2)

string_all_digits = "0123456789"

for num in string_all_digits:
  if num * 3 in string_num1:
    if num * 2 in string_num2:
      print(1)
else:
    print(0)

def triple_double(num1, num2):
    string_num1= str(num1)
    string_num2 = str(num2)
    string_all_digits = "0123456789"
    for num in string_all_digits:
        if num * 3 in string_num1:
            if num * 2 in string_num2:
                return 1
    return 0


def triple_double(num1, num2):
    for x in range(10):
        if str(x) * 3 in str(num1):
            if str(x) * 2 in str(num2):
                return 1
    return 0





# #Removing duplicates fronm a list

my_list = [1,2,2,3,4,5,6,7,7,7,7,8]
new_list=[]

for item in my_list:
  if item not in new_list:
    new_list.append(item)

print(new_list)

# Implement the function unique_in_order which takes as argument a sequence and returns a list of items without any elements with the same value next to each other and preserving the original order of elements.

# For example:
# unique_in_order('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
# unique_in_order('ABBCcAD')         == ['A', 'B', 'C', 'c', 'A', 'D']
# unique_in_order([1, 2, 2, 3, 3])   == [1, 2, 3]
# unique_in_order((1, 2, 2, 3, 3))   == [1, 2, 3]


my_list = 'AAAABBBCCDAABBB'

new_list = list(my_list)
print(new_list)

second_list = []
for item in my_list:
  if item not in second_list:
    second_list.append(item)
print(second_list)    #this method only remove duplicates


my_list = 'AAAABBBCCDAABBB'
new_list = []

for i in range(len(my_list)):
  if i == 0 or my_list[i] != my_list[i-1]:   #i == 0 focuses on the first element in a list
    new_list.append(my_list[i])

print(new_list)       #this method shows unique characters 

def unique_in_order(my_list):

    new_list = []
    for i in range(len(my_list)):
        if i == 0 or my_list[i] != my_list[i-1]:
            new_list.append(my_list[i])
    return new_list