#showing which quarter of the month 1 to 12 belong
def quarter_of(month):
    if 1<=month<=3:
        return 1
    elif 4<=month<=6:
        return 2
    elif 7<=month<=9:
        return 3
    else:
        return 4
    
print(quarter_of(5))


#create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) # => returns "(123) 456-7890"


def phone_number(n):
    return f"({n[0]}{n[1]}{n[2]}) {n[3]}{n[4]}{n[5]}-{n[6]}{n[7]}{n[8]}{n[0]}"

n=[1,2,3,4,5,6,7,8,9,0]
New_phone_num=phone_number(n)
print(New_phone_num)

user_input =input("What's your fav word: ") 

#Reversing the string-Hello to olleh
words = list(user_input)
for index,word in enumerate(reversed(words)):
    if not words:
        print("")
    elif len(word)==1:
        print(word)
    else:
        print(word)
# 100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
# 90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
# 75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
# 0, in other cases


def final_grade(exam, projects):
    if exam > 90 or projects >10:
        return 100
    elif exam > 75 and 5<=projects<=10:
        return 90
    elif exam > 50 and 2<=projects<10:
        return 75
    else:
        return 0
    
print(final_grade(95,0))

#squaring a positive numbers from a list

def square_sum(numbers):
    if len(numbers)==0:
        return 0
    else:
        return sum(num**2 for num in numbers)
#completed coldwars

def calculate(numbers):
    new_array=[]
    for num in numbers:
        if num>=0:
            new_array.append(num)
            summation=sum(new_array)
            return summation
        elif num<0:
            return 0
        else:
            return 0
    
print(calculate([2,-1,0,10]))

#finding permiter or area of a square

def area_or_perimeter(l,w):
    if l == w:
     return l*w
    else:
     return 2 * (l + w)
    
# # def square_digits(num):
# For example, if we run 9119 through the function, 811181 will come out, 
# because 92 is 81 and 12 is 1. (81-1-1-81)

def square_digits(num):
    squared_digits=[int(digit)**2 for digit in str(num)]
    joined_digits_string = "".join(map(str,squared_digits))
    joined_digits = int(joined_digits_string)
    return joined_digits

def square_digits(num):
    squares = ''
    for x in str(num):
        squares += str(int(x) ** 2)
    return int(squares)

def square_digits(num):
    list = str(num)
    l = ''
    for i in list:
        l += str(int(i)*int(i))
    return int(l)

# You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

# Examples
# [7, 1]  =>  [1, 7]
# [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
# [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

#STEOPS
numbers = [5,8,6,3,4]

#Extration of even numbers using list comprehesion method
even_nums = [item for item in numbers if item%2==0]

#2nd Step: Sort even numbers
even_nums.sort(reverse=False)

# 3rd Step: Use iter() method to make sure even numbers remain in their original position.
iter_even_nums = iter(even_nums)

print([next(iter_even_nums) if item%2==0 else item for item in numbers])

#The same process for the odd numbers

odd_nums = [item for item in numbers if item%2!=0]

odd_nums.sort(reverse=False)

iter_odd_nums = iter(odd_nums)

print([next(iter_odd_nums) if item%2!=0 else item for item in numbers])

#Same method using function
def sort_array(source_array):
    odd_array = [item for item in source_array if item%2!=0]
    odd_array.sort(reverse=False)
    iter_array = iter(odd_array)
    return [next(iter_array) if item%2!=0 else item for item in source_array]

#Wring a function that joins words

def words_to_sentence(words):
    return "".join(words)

changed = words_to_sentence(["hello", "Jean",".", "How are you", "doing?"])
print(changed)

def words_to_sentences(word):
    return " ".join(word)
changed2 = words_to_sentences(["Hello", "Jean",".", "How are you", "doing there?"])
print(changed2)


# #You probably know the "like" system from Facebook and other pages. 
# People can "like" blog posts, pictures or other items. 
# We want to create the text that should be displayed next to such an item.
# #Implement the function which takes an array containing the names of people that like an item. 
# It must return the display text as shown in the examples:

# []                                -->  "no one likes this"
# ["Peter"]                         -->  "Peter likes this"
# ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
# ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
# ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"



def facebook_likes(names):
    if not names:
        return "no one likes this"
    elif len(names) == 1:
        return f"{names[0]} likes this"
    elif len(names) == 2:
        return f"{names[0]} and {names[1]} like this"
    elif len(names)== 3:
        return f"{names[0]}, {names[1]} and {names[2]} like this"
    else:
        return f"{names[0]}, {names[1]} and {len(names)-2} others like this"
  
feedback = facebook_likes(["Jean", "Ferdinand", "Ishimwe", "January", "Cedrick"])
print(feedback)
  

  # Given an array of integers your solution should find the smallest integer.

# For example:

# Given [34, 15, 88, 2] your solution will return 2
# Given [34, -345, -1, 100] your solution will return -345
# You can assume, for the purpose of this kata, that the supplied array will not be empty.


numbers = [34, 15,-100, 88, 2, -34]

numbers.sort(reverse=False)
print(numbers[0])

def find_smallest_int(arr):
    arr.sort(reverse=False)
    return arr[0]

def find_smallest_int(arr):
  return sorted(arr)[0]

# In this little assignment you are given a string of space separated numbers,
#  and have to return the highest and lowest number.

# Examples
# high_and_low("1 2 3 4 5") # return "5 1"
# high_and_low("1 2 -3 4 5") # return "5 -3"
# high_and_low("1 9 3 4 -5") # return "9 -5"

numbers ="1 9 3 4 -5"
#STOPPED HERE IN REVIEW ##################################################################
#Method 1
numbers ="1 9 3 4 -5"
new_num1= list(map(int,numbers.split()))
new_num1.sort(reverse=True)
print(f"{new_num1[0]} {new_num1[-1]}")
#Method2
new_num=list(map(int,numbers.split()))

max_num = max(new_num)
min_num = min(new_num)

print(f"{max_num} {min_num}")
#Method3-Function
def high_and_low(numbers):
    new_num=list(map(int,numbers.split()))
    max_num = max(new_num)
    min_num = min(new_num)
    return f"{max_num} {min_num}"

# make odd numbers to even numbers

def make_even(num):
  if num%2!=0:
    return num + 1
  else:
    return num

x = [1,3,5,7,9, 10]

y = []

for num in x:
  y.append(make_even(num))
print(y)

#The for loop can be replaced by map() function
#map(function,iterable)

z = list(map(make_even,x))
print(z)

# This can also be used by embracing list comprehension
solution = [make_even(num) for num in x]
print(solution)


#Perfect square. Check if a number is a squareroot of itself.

def is_square(n):  
    square_num = n**0.5
    if n == square_num **2:
        return True
    elif n<0:
        return False
    else:
        return False
    
print(is_square(64))


#  If the string's length is odd, return the middle character.
# If the string's length is even, return the middle 2 characters.
  

string = "H"

l = len(string)

if l%2 !=0:
  print(string[1//2])
else:
  print(string[l//2-1:l//2+1])



# The question is asking to return the length of the shortest word in the string

#solving the problem without def function
string = "i want to travel the world writing code one day"


list_words  = list(map(str, string.split()))

words =[]

for word in list_words:
  len(word)
  words.append(len(word))
  words.sort(reverse=False)
print(words[0])


#solving the problem with def function
def find_short(string):
    list_words  = list(map(str, string.split()))

    words =[]

    for word in list_words:
        len(word)
        words.append(len(word))
        words.sort(reverse=False)
    return words[0]

# The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

# Task
# Given a year, return the century it is in.

import math
def century(year):
    return math.ceil((year)/100)

# The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age,  oldest age].

# The order of the numbers passed in could be any order. The array will always include at least 2 items. If there are two or more oldest age, then return both of them in array format.

# For example (Input --> Output):

# [1, 2, 10, 8] --> [8, 10]
# [1, 5, 87, 45, 8, 8] --> [45, 87]
# [1, 3, 10, 0]) --> [3, 10]


numbers = [1,2,10,8]

chosen=[]

numbers.sort(reverse=False)
chosen.append(numbers[-2])
chosen.append(numbers[-1])

print(chosen)


def two_oldest_ages(ages):
    chosen=[]
    ages.sort(reverse=False)
    chosen.append(ages[-2])
    chosen.append(ages[-1])
    return chosen

variable = two_oldest_ages([34,1,2,100])
print(variable)

# Given a list of integers values, your job is to return the sum of the values; however, if the same integer value appears multiple times in the list, you can only count it once in your sum.

# For example:
# [ 1, 2, 3] ==> 6

# [ 1, 3, 8, 1, 8] ==> 12

# [ -1, -1, 5, 2, -7] ==> -1

# [] ==> None


list_num = []

set_num = set(list_num)

total = sum(set_num)
print(total)

def unique_sum(lst):
    if not lst:
        return None
    else:
        set_num = set(lst)
        total = sum(set_num)
        return total

# Make a program that takes a value (x) and returns "Bang" if the number is divisible by 3, 
# "Boom" if it is divisible by 5, "BangBoom" if it divisible by 3 and 5, 
# and "Miss" if it isn't divisible by any of them. Note: Your program should only return one value

# Ex: Input: 105 --> Output: "BangBoom" Ex: Input: 9 --> Output: "Bang" Ex:Input: 25 --> Output: "Boom"

numbers = 25

new_list = []
list_num = list(str(numbers))

for num in list_num:
  new_list.append(int(num))


if sum(new_list)%3==0 and (new_list[-1]==0 or new_list[-1]==5):
   print("BangBoom")
elif sum(new_list)%3==0:
   print("Bang")
elif new_list[-1]==0 or new_list[-1]==5:
    print("Boom")
else:
   print("Miss")

def multiple(x):
    
    new_list = []
    list_num = list(str(x))

    for num in list_num:
        new_list.append(int(num))
    
    if sum(new_list)%3==0 and (new_list[-1]==0 or new_list[-1]==5):
        return "BangBoom"
    elif sum(new_list)%3==0:
        return "Bang"
    elif new_list[-1]==0 or new_list[-1]==5:
        return "Boom"
    else:
        return "Miss"
    
# In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

# Example
# filter_list([1,2,'a','b']) == [1,2]
# filter_list([1,'a','b',0,15]) == [1,0,15]
# filter_list([1,2,'aasf','1','123',123]) == [1,2,123]

# list = [1,2,'a','b']
list= [1,2,'aasf','1','123',123]

new_list =[]

for item in list:
  if isinstance(item,int):
    new_list.append(item)
print(new_list)
#Solve with Function
def filter_list(list):
    new_list =[]
    for item in list:
        if isinstance(item,int):
            new_list.append(item)
    return new_list

#Second method
def filter_list(list):
    new_list =[]
    for x in list:
        if type(x) != str:
            new_list.append(x)
    return new_list


# Make a program that filters a list of strings and returns a list with only your friends name in it.

# If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! 
# Otherwise, you can be sure he's not...

# Input = ["Ryan", "Kieran", "Jason", "Yous"]
# Output = ["Ryan", "Yous"]

# Input = ["Peter", "Stephen", "Joe"]
# Output = []

# x=["Jimm", "Cari", "aret", "truehdnviegkwgvke", "sixtyiscooooool"]

x=["Ryan", "Kieran", "Jason", "Yous"]

def friend(x):
    result = []
    for name in x:
        if len(name)==4:
            result.append(name)
    return result


# USING a list comprehension
def friend(x):
    return [name for name in x if len(name)==4]

#Finding the sum of the minum numbers in the nested list: Example as shown below:

numbers = [ [ 1, 2, 3, 4, 5 ]        #  minimum value of row is 1
, [ 5, 6, 7, 8, 9 ]        #  minimum value of row is 5
, [ 20, 21, 34, 56, 100 ]  #  minimum value of row is 20
]
#Both 1st and second methods are applicable to any nested list with integer numbers. 
sum_num = sum([min(sublist) for sublist in numbers])

print(sum_num)

#Using functions

def sum_of_minimums(numbers):
    sum_num = sum([min(sublist) for sublist in numbers])
    return sum_num
#This method is not applicable to any nested list.

for sublist in numbers:
  sublist.sort(reverse=False)
  min1 = numbers[0][0]
  min2 = numbers[1][0]
  min3 = numbers[2][0]
print(min1 + min2 + min3)


# Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

# Example(Input => Output):
# 35231 => [1,3,2,5,3]
# 0 => [0]
numbers = 35231

new_num =str(numbers)
new_num2=list(new_num)
new_num2.reverse()

new_list = []
for num in new_num2:
  new_list.append(int(num))
print(new_list)
#using function method
def digitize(numbers):
    new_num =str(numbers)
    new_num2=list(new_num)
    new_num2.reverse()

    new_list = []
    for num in new_num2:
        new_list.append(int(num))
    return new_list

# Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

# [1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]
# [1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]
# [] --> []

def invert(lst):
    new_list=[]
    for num in lst:
        new_list.append((-1)*int(num))

    return new_list

print(invert([-1,2]))


# Write a function that takes an array of numbers and returns the sum of the numbers.
# The numbers can be negative or non-integer. 
# If the array does not contain any numbers then you should return 0.
# Input: [1, 5.2, 4, 0, -1]
# Output: 9.2


list =  [1, 5.2, 4, 0, -1]

sum_list = sum(list)
print(sum_list)

def sum_array(a):
    if not a:
        return 0
    else:
        return sum(a)
    
# Take 2 strings s1 and s2 including only letters from a to z. 
# Return a new sorted string (alphabetical ascending), the longest possible, 
# containing distinct letters - each taken only once - coming from s1 or s2.
#
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"

# longest(a, b) -> "abcdefklmopqwxy"

# a = "abcdefghijklmnopqrstuvwxyz"
# longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

string = a + b
new_string ="".join(sorted(set(string)))
print(new_string)
#using function method
def longest(a, b):
    
    string = a + b
    new_string ="".join(sorted(set(string)))
    return new_string


 # Complete the function that accepts a string parameter, and reverses each word in the string. 
# All spaces in the string should be retained.
# Examples
# "This is an example!" ==> "sihT si na !elpmaxe"
# "double  spaces"      ==> "elbuod  secaps"

# # string = "This is an example!" 
# string = "double  spaces" 

string ="'  double  spaced  words  '"

result = []
new_string = string.split()

for substring in new_string:
   result.append("".join(reversed(list(substring))))
result2="  ".join(result)
# print(result)
print(result2)

def reverse_words(text):
    result = [ ]
    new_string = text.split()

    for substring in new_string:
        result.append("".join(reversed(list(substring))))
    result2=" ".join(result )
    return result2



# Your task is to remove all duplicate words from a string, leaving only single (first) words entries.

# # Input:

# 'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

# Output:

# 'alpha beta gamma delta'

string = 'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

string1 =(string.split())

duplicated = set()
new_string = []

for word in string1:
  if word not in duplicated:
    new_string.append(word)
    duplicated.add(word)
print(" ".join(new_string))
print(duplicated)


def remove_duplicate_words(s):
    string1 =s.split()

    duplicated = set()
    new_string = []

    for word in string1:
        if word not in duplicated:
            new_string.append(word)
            duplicated.add(word)
    return " ".join(new_string)

# Create a function that returns the average of an array of numbers ("scores"), rounded to the nearest whole number. 
# You are not allowed to use any loops (including for, for/in, while, and do/while loops).

numbers =[5, 78, 52, 900, 1]

av_num = round(sum(numbers)/len(numbers))

print(av_num)
def average(scores):
    av_num = round(sum(scores)/len(scores))
    return av_num
# This kata is about multiplying a given number by 
# eight if it is an even number and by nine otherwise.


number = int(input("WHAT'S THE NUMBER? "))


if number %2==0:
    print(number * 8)
else:
    print(number * 9)



# At the annual family gathering, the family likes to find the oldest living family member’s age 
# and the youngest family member’s age and calculate the difference between them.

# You will be given an array of all the family members' ages, in any order. 
# The ages will be given in whole numbers, so a baby of 5 months, will have an ascribed ‘age’ of 0. Return a new array (a tuple in Python) with [youngest age, oldest age, difference between the youngest and oldest age].

#[16, 22, 31, 44, 3, 38, 27, 41, 88]), (3, 88, 85))

array = [16, 22, 31, 44, 3, 38, 27, 41, 88]
new_array = []
sorted_array=sorted(array)

youngest = sorted_array[0]
oldest = sorted_array[-1]
difference = oldest-youngest
print(youngest)
print(oldest)
print(difference)
print(sorted_array)
new_array.append(youngest)
new_array.append(oldest)
new_array.append(difference)
print(new_array)


def difference_in_ages(array):
    new_array = []
    sorted_array=sorted(array)
    youngest = sorted_array[0]
    oldest = sorted_array[-1]
    difference = oldest-youngest

    new_array.append(youngest)
    new_array.append(oldest)
    new_array.append(difference)
    return tuple(new_array)

result = difference_in_ages([16, 22, 31, 44, 3, 38, 27, 41, 88])
print(result)

# In this little assignment you are given a string of space separated numbers,
#  and have to return the highest and lowest number.

# Examples
# high_and_low("1 2 3 4 5") # return "5 1"
# high_and_low("1 2 -3 4 5") # return "5 -3"
# high_and_low("1 9 3 4 -5") # return "9 -5"

numbers ="1 9 3 4 -5"

new_num1= list(map(int,numbers.split()))
new_num1.sort(reverse=True)
print(f"{new_num1[0]} {new_num1[-1]}")


def high_and_low(numbers):
    new_num=list(map(int,numbers.split()))
    max_num = max(new_num)
    min_num = min(new_num)
    return f"{max_num} {min_num}"

solution = high_and_low("1 9 3 4 -5")
print(solution)


# Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters 
# then it should replace the missing second character of the final pair with an underscore ('_').
# Examples:

# * 'abc' =>  ['ab', 'c_']
# * 'abcdef' => ['ab', 'cd', 'ef']

string = "abc"

if len(string)%2 !=0:
  string += "_"

pairs = [string[i:i+2] for i in range(0,len(string),2)]

print(pairs)  

#functionwise

def solution(string):
    if len(string)%2 !=0:
        string += "_"
    string_pairs = [string[i:i+2] for i in range(0,len(string),2)]
    return string_pairs

def solution(s):
    result = []
    if len(s) % 2:
        s += '_'
    for i in range(0, len(s), 2):
        result.append(s[i:i+2])
    return result

def solution(s):
    if len(s) == 0:
        return []
    elif len(s) == 1:
        return [s + "_"]
    else:
        return [s[:2]] + solution(s[2:])
    
# Write a function which calculates the average of the numbers in a given array.
# [1, 2, 3]), 2,
# if empty string return zero
# [],0

def find_average(numbers):
    if not numbers:
        return 0
    else:
        average = sum(numbers)/len(numbers)
        return average



for item in list:
    print(item)

my_list = []

item = 0 

while item < 10:
    my_list.append(item)
    item +=1
print(my_list)
item=0
while True:
    print(item)
    item +=1
    if item == 20:
        break
    

def calculate(arr):
    new_array=[]
    for num in arr:
        if num>=0:
            new_array.append(num)
            summation=sum(new_array)
            return summation
        elif num<0:
            return 0
        elif not num:
            return 0
    
print(calculate([]))