# Take an array and remove every second element from the array. 
# Always keep the first element and start removing with the next element.
# Example:
# ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
# None of the arrays will be empty, so you don't have to worry about that!

#1st methods
elements = ["Keep", "Remove", "Keep", "Remove", "Keep", "Hello", "Me"]

new_elements = elements[::2]

print(new_elements)

#Second methods: List mist manupulation methods
def remove_every_other(my_list):
    new_list = my_list[::2]
    return new_list

#Third methods: using for loop 
def remove_every_other(my_list):
    r = []
    for i in range(len(my_list)):
        if i % 2 == 0:
            r.append(my_list[i])
    return r

# Write a function to split a string and convert it into an array of words.
# Examples (Input ==> Output):
# "Robin Singh" ==> ["Robin", "Singh"]
# "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]


def string_to_array(s):
    if not s:
        return ['']
    else:
        new_string = s.split()
        return new_string
    
# Given an array of integers as strings and numbers, 
# return the sum of the array values as if all were numbers.
# Return your answer as a number.
# 9, 3, '7', '3']), 22)

list1 = [9, 3, '7', '3']

new_list = []

for num in list1:
  if isinstance(num,str):
    new_list.append(int(num))
  else:
    new_list.append(num)
print(new_list)
print(sum(new_list))
#Using function to solve the same problem
def sum_mix(arr):
    new_list = []
    
    for num in arr:
        if isinstance(num,str):
            new_list.append(int(num))
        else:
            new_list.append(num)
    return sum(new_list)


# Create a method to see whether the string is ALL CAPS.
# Examples (input -> output)
# "c" -> False
# "C" -> True
# "hello I AM DONALD" -> False
# "HELLO I AM DONALD" -> True
# "ACSKLDFJSgSKLDFJSKLDFJ" -> False
# "ACSKLDFJSGSKLDFJSKLDFJ" -> True

# text = "hello I AM DONALD", False

text = "I AM DONALD"

if text.isupper():
  print("True")
else:
  print("False")

# Write a function that removes the spaces from the string, then return the resultant string.

# Examples (Input -> Output):

# "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
# "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
# "8aaaaa dddd r     " -> "8aaaaaddddr"


string = "8 j 8   mBliB8g  imjB8B8  jl  B"

string3=string.split()
string4="".join(string3)

print(string3)
print(string4)
#Using function to fix the issue
def no_space(string):
    string3=string.split()
    string4="".join(string3)
    return string4


# Write a function that when given a URL as a string, parses out just the domain name and returns it as a string. For example:

# * url = "http://github.com/carbonfive/raygun" -> domain name = "github"
# * url = "http://www.zombie-bites.com"         -> domain name = "zombie-bites"
# * url = "https://cnet.com"                -> domain name = cnet"
# * url = "icann.org")                     ->  "icann"


import re
from urllib.parse import urlparse

#First method: This method doesn't not apply on all URL especially those without "www."
def extract_domain(url):
  parsed_url = urlparse(url)
  
  domain = parsed_url.hostname
  if "www." in domain:
#   if domain.startswith("www."):
    domain = domain[4:]


  match = re.match(r"([a-zA-Z0-9-]+)",domain)

  if match:
    return match.group(1)
  else:
    return None
  
print(extract_domain("http://github.com/carbonfive/raygun"))
print(extract_domain("http://www.zombie-bites.com"))
print(extract_domain("icann.org"))

#First method: This method apply on all URL especially those without "www."

def domain_name(url:str)->str:
    parsed_url = urlparse(url)

    domain = parsed_url.netloc if parsed_url.netloc else url

    domain = re.sub(r"^www\.","",domain)

    domain_naming = domain.split(".")[0]

    return domain_naming

print(domain_name("http://github.com/carbonfive/raygun"))
print(domain_name("http://www.zombie-bites.com"))
print(domain_name("icann.org"))


# Digital root is the recursive sum of all the digits in a number.

# Given n, take the sum of the digits of n. If that value has more than one digit, 
# continue reducing in this way until a single-digit number is produced. 
# The input will be a non-negative integer.

# Examples
#     16  -->  1 + 6 = 7
#    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
# 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
# 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2


def dig_root(n:int)->int:
  while n >=10:
    n = sum(int(digit) for digit in str(n))
  return n


def digital_root(n):
	return n%9 or n and 9 


def checkroot(n):
    return n if len(str(n)) == 1 else digital_root(n)

def digital_root2(n):
    input_list= [int(i) for i in str(n)]
    return checkroot(sum(input_list))

print(dig_root(11))
print(digital_root(11))
print(digital_root2(11))

# Ben has a very simple idea to make some profit: he buys something and sells it again. Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price. 
# Instead, he's going to buy it for the lowest possible price and sell it at the highest.
# Task
# Write a function that returns both the minimum and maximum number of the given list/array.
# Examples (Input --> Output)
# [1,2,3,4,5] --> [1,5]
# [2334454,5] --> [5,2334454]
# [1]         --> [1,1]

# number = [1,2,3,4,5] 
# number = [2334454,5]
number = [1]

new_list = []
num = sorted(number)
min = num[0]
max = num[-1]

new_list.append(min)
new_list.append(max)

print(new_list)
#Function way to work on this question
def min_max(list):

    new_list = []
    num = sorted(list)
    min = num[0]
    max = num[-1]
    new_list.append(min)
    new_list.append(max)
    return new_list

# Define a method hello that returns "Hello, Name!" to a given name, or says Hello, World! if name is not given (or passed as an empty String).

# Assuming that name is a String and it checks for user typos to return a name with a first capital letter (Xxxx).

# Examples:

# * With `name` = "john"  => return "Hello, John!"
# * With `name` = "aliCE" => return "Hello, Alice!"
# * With `name` not given 
#   or `name` = ""        => return "Hello, World!"


name = "aLICE"

capitalized = name.capitalize()

if not name:
  print("Hello,World!")

else:
  print(f"Hello,{capitalized}!")


# Implement a function to calculate the sum of the numerical values in a nested list.
#  For example :

# sum_nested([1, [2, [3, [4]]]]) -> 10

def sum_nested(lst):
    sum = 0
    
    for item in lst:
        if isinstance(item,list):
            sum += sum_nested(item)
        else:
            sum += item
    return sum


# In this kata you should simply determine, 
# whether a given year is a leap year or not. 
# In case you don't know the rules, here they are:

# Years divisible by 4 are leap years,
# but years divisible by 100 are not leap years,
# but years divisible by 400 are leap years.

# Tested years are in range 1600 ≤ year ≤ 4000

years = 2100

if years%100 ==0  and years%400==0:
  print(True)
elif years%4:
  print(True)
else:
  print(False)

# Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.
# Examples:
# 1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
# 2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
# 3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
# 4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5

def is_divisible(n,x,y):
    return True if (n%x == 0 and n%y==0) else False



# Create a function that takes 2 integers in form of a string as an input, and outputs the sum (also as a string):
# Example: (Input1, Input2 -->Output)
#  test.assert_equals(sum_str("9",""), "9", "x + empty = x")
#         test.assert_equals(sum_str("","9"), "9", "empty + x = x")
#         test.assert_equals(sum_str("","") , "0", "empty + empty = 0")

# "4",  "5" --> "9"
# "34", "5" --> "39"
# "", "" --> "0"
# "2", "" --> "2"
# "-5", "3" --> "-2"

# def sum_str(a, b):
   
a = input("What's the number?")

b = input("What's the number")


if not a and not b:
  print(0)
elif not a:
  print(b)
elif not b:
  print(a)
else:
  print(str(int(a) + int(b)))
#Function wise

def sum_str(a, b):
    if not a and not b:
        return "0"
    elif not a:
        return b
    elif not b:
        return a
    else:
        return (str(int(a) + int(b)))
    
# Given a number n, return the number of positive odd numbers below n, EASY!

# Examples (Input -> Output)
# 7  -> 3 (because odd numbers below 7 are [1, 3, 5])
# 15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])



n = input("What's the number?")

new_list = []
for odd in range(int(n)):
  if odd%2 !=0:
    new_list.append(odd)

print(new_list)


def odd_count(n):
  numbers = int(n)
  new_list = []

  for num in range(numbers):
      if num%2 !=0:
        new_list.append(num)
  return len(new_list)
    
print(odd_count(15023))

def odd_count(n):
    new_list = []
    for odd in range(int(n)):
        if odd%2 !=0:
            new_list.append(odd)
    return len(new_list)

#Encountering system issue
# https://www.codewars.com/kata/59342039eb450e39970000a6/train/python 

# Given a string, capitalize the letters that occupy even indexes and odd indexes separately, 
# and return as shown below. Index 0 will be considered even.

# For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF'].
#  See test cases for more examples.

# The input will be a lowercase string with no spaces.

# Good luck!

# If you like this Kata, please try:

letters = 'abcdef'

findings =[]
findings2=[]
result=[]

for index, letter in enumerate(letters):
  if index%2==0:
    findings.append(letter.upper())
  else:
    findings.append(letter)
  
for index, letter in enumerate(letters):
   if index%2!=0:
    findings2.append(letter.upper())
   else:
    findings2.append(letter)

# result.append(findings)
# result.append(findings2)

result1="".join(findings)
result2="".join(findings2)

result.append(result1)
result.append(result2)

print(result1)
print(result2)
print(result)
#Function methods
def capitalize(letters):
    findings =[]
    findings2=[]
    result=[]

    for index, letter in enumerate(letters):
        if index%2==0:
            findings.append(letter.upper())
        else:
            findings.append(letter)

    for index, letter in enumerate(letters):
        if index%2!=0:
            findings2.append(letter.upper())
        else:
            findings2.append(letter)

    result1="".join(findings)
    result2="".join(findings2)

    result.append(result1)
    result.append(result2)

    return result

# Given a two-dimensional array of integers, return the flattened version of the array 
# with all the integers in the sorted (ascending) order.
# Example:
# Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
# numbers = [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]]


numbers = []
result = []
for item in numbers:
  result.extend(item)
  result.sort()
print(result)

#FUNCTION METHOD

def flatten_and_sort(array):
    result = []
    for item in array:
        result.extend(item)
        result.sort()
    return result

# Given a non-negative integer b, write a function which returns an integer d such that the binary representation of b i
# s the same as the decimal representation of d.

# Examples:
# n = 1 should return 1
# n = 5 should return 101
# n = 11 should return 1011


n = 5


binary_num = bin(n)

print(binary_num[2:])
#Using functions
def to_binary(n):
    binary_num = bin(n)
    return int(binary_num[2:])

# Your boss decided to save money by purchasing some cut-rate optical character recognition software for 
# scanning in the text of old novels to your database. At first it seems to capture words okay, 
# but you quickly notice that it throws in a lot of numbers at random places in the text.

# Examples (input -> output)
# '! !'                 -> '! !'
# '123456789'           -> ''
# 'This looks5 grea8t!' -> 'This looks great!'
# Your harried co-workers are looking to you for a solution to take this garbled text and remove all of the numbers. Your program will take in a string and clean out all numeric characters, 
# and return a string with spacing and special characters ~#$%^&!@*():;"'.,? all intact.


import re
# string = '! !'
string = '123456789'  
# string = 'This looks5 grea8t!'


cleaned_num = re.sub(r"\d+","",string)
print(cleaned_num)
#Function wise
def string_clean(string):
    cleaned = re.sub(r"\d+","",string)
    return cleaned


# Make multiple functions that will return the sum, difference, modulus, product, quotient, and the exponent respectively.

# Please use the following function names:

# addition = add

# multiply = multiply

# division = divide (both integer and float divisions are accepted)

# modulus = mod

# exponential = exponent

# subtraction = subt

def add(a,b):
  return a + b 
def multiply(a,b):
  return a * b
def divide(a,b):
  return a / b
def mod(a,b):
  return a % b
def exponent(a,b):
  return a ** b
def subt(a,b):
  return a - b

add = lambda a, b: a + b
multiply = lambda a, b: a * b
divide = lambda a, b: a / b
mod = lambda a, b: a % b
exponent = lambda a, b: a ** b
subt = lambda a, b:a - b

# Write a function that takes a single non-empty string of only lowercase and uppercase ascii letters (word) as its argument, and 
# returns an ordered list containing the indices of all capital (uppercase) letters in the string.

# Example (Input --> Output)
# "CodEWaRs" --> [0,3,4,6]

string =  "CodEWaRs"

index_list = []

for index, sub_string in enumerate(string):
  if sub_string.isupper():
    index_list.append(index)

print(index_list)
#Function ways
def capitals(string):
    index_list = []

    for index, sub_string in enumerate(string):
        if sub_string.isupper():
            index_list.append(index)

    return index_list

# Given a sequence of numbers, find the largest pair sum in the sequence.

# For example

# [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
# [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)

number = [10, 14, 2, 23, 19] 

new_list=[]
number.sort(reverse=False)

new_list.append(number[-1])
new_list.append(number[-2])

sum = sum(new_list)
print(new_list)
print(sum)


def largest_pair_sum(numbers): 
    new_list=[]
    numbers.sort(reverse=False)

    new_list.append(numbers[-1])
    new_list.append(numbers[-2])

    sum1 = sum(new_list)
    return sum1


# Complete the method which accepts an array of integers, and returns one of the following:

# "yes, ascending" - if the numbers in the array are sorted in an ascending order
# "yes, descending" - if the numbers in the array are sorted in a descending order
# "no" - otherwise
# You can assume the array will always be valid, and there will always be one correct answer.

# numbers = [3,2,6,8]
# numbers = [1,2,3,4]
# numbers = [6,5,2,0]


def is_ass_or_desc(numbers):
  if all(numbers[index] <= numbers[index + 1] for index in range(len(numbers)-1)):
    return "Ascending"
  elif all(numbers[index] >= numbers[index + 1] for index in range(len(numbers)-1)):
    return "Descending"
  else:
    return "No"
  
result = is_ass_or_desc([100,3])
print(result)


# Example
# "camelCasing"  =>  "camel Casing"
# "identifier"   =>  "identifier"
# ""             =>  ""
#consecutive CApitals' should equal 'consecutive C Apitals'
import re

string =  "camelCasing"  
# string = "consecutive CApitals"
regex_method = re.sub(r"([a-z])([A-Z])",r"\1 \2",string)

print(regex_method)

# Complete the solution so that the function will break up camel casing, using a space between words.
# test.assert_equals(replace_dots(""), "")
#         test.assert_equals(replace_dots("no dots"), "no dots")
#         test.assert_equals(replace_dots("one.two.three"), "one-two-three")
#         test.assert_equals(replace_dots("........"), "--------")
import re

# string = ""
# string = "no dots"
# string = "........"
string = "one.two.three"

# patten = r"\."
if not string:
  print("")
elif (r"\.",string):
  replaced=re.sub(r"\.","-",string)
  print(replaced)
else:
  print("String has no dots")


#Functionways
def replace_dots(string):
    if not string:
        return ""
    elif (r"\.",string):
        replaced=re.sub(r"\.","-",string)
        return replaced
    else:
        return "String has no dots"
    

# Your task is simply to count the total number of lowercase letters in a string.
# Examples
# "abc" ===> 3
# "abcABC123" ===> 3
# "abcABC123!@€£#$%^&*()_-+=}{[]|\':;?/>.<,~" ===> 3
# "" ===> 0;
# "ABC123!@€£#$%^&*()_-+=}{[]|\':;?/>.<,~" ===> 0
# "abcdefghijklmnopqrstuvwxyz" ===> 26


string = "ABC"
# string = "abcdefghijklmnopqrstuvwxyz"
# string = "abcABC123!@€£#$%^&*()_-+=}{[]|\':;?/>.<,~" 
letters= re.findall("[a-z]+",string)
print(letters)
new_string = "".join(letters)
print(len(new_string))
#fUNCTION WISE
def lowercase_count(string):
    if not string:
        return 0
    else:
        letters= re.findall("[a-z]+",string)
        new_string = "".join(letters)
        return len(new_string)
    
# Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

# Example:

# "riley" --> "Hello Riley!"
# "JACK"  --> "Hello Jack!"

name = "riley" 

capitalized = name.capitalize()
print(f"Hello {capitalized}!")
#Function wise
def greet(name):
    capitalized = name.capitalize()
    return f"Hello {capitalized}!"


# We want to know the index of the vowels in a given word, for example, there are two vowels in the word super (the second and fourth letters).

# So given a string "super", we should return a list of [2, 4].

# Some examples:
# Mmmm  => []
# Super => [2,4]
# Apple => [1,5]
# YoMama -> [1,2,4,6]

name = "UNDISARMED"
vowels = "aeuoiAEUOI"
new_list=[]
for index, vowel in enumerate(name,start=1):
  if vowel in vowels:
    new_list.append(index)
print(new_list)


def vowel_indices(word):
    vowels = "aeuoiyAEUOIY"
    new_list=[]
    for index, vowel in enumerate(word,start=1):
        if vowel in vowels:
            new_list.append(index)
    return new_list


# I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.

# P.S. Each array includes only integer numbers. Output is a number too.
array1 = [1, 2, 3]
array2 = [4, 5, 6]

#  , 21)

result1 = sum(array1)
result2 = sum(array2)
result = result1 + result2
print(result)

def array_plus_array(array1,array2):
    result1 = sum(array1)
    result2 = sum(array2)
    result = result1 + result2
    return result

# Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).

# The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.

# Mind the input validation.

# Example
# { 6, 2, 1, 8, 10 } => 16
# { 1, 1, 11, 2, 3 } => 6

numbers = [1, 1, 11, 2, 3 ]
arr = [6, 2, 1, 8, 10 ]
new_arr = sorted(arr)
total = sum(new_arr[1:-1])
print(total)


def sum_array(arr):
    if None:
        return 0
    elif not arr:
        return 0
    else:
        new_arr = sorted(arr)
        total = sum(new_arr[1:-1])
        return total
    
# Kids drink toddy.
# Teens drink coke.
# Young adults drink beer.
# Adults drink whisky.
# Make a function that receive age, and return what they drink.

# Rules:

# Children under 14 old.
# Teens under 18 old.
# Young under 21 old.
# Adults have 21 or more.

age = 12

if age < 14:
  print("Kids drink today.")
elif 14<=age <18:
  print("Teens drink coke")
elif 18<=age<21:
  print("Young adults drink beer")
elif age >=21:
  print("Adults drink whisky")


def people_with_age_drink(age):
    if age < 14:
        return ("drink toddy")
    elif 14<=age <18:
        return ("drink coke")
    elif 18<=age<21:
        return ("drink beer")
    elif age >=21:
        return ("drink whisky")