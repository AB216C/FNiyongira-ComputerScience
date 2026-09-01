#The map() function in Python can handle negative values 

#Applying absolute values on negative numbers
#changing a string of with negative digits into list with integer with negative numbers

numbers = [-2,-1,0,1,2,3]

abs_values = list(map(abs,numbers))
print(abs_values)

string_numbers = "2 -1 3 6 7"

list_numbers = list(map(int,string_numbers.split()))
print(list_numbers)

#filtering numbers using lambda:

positive_numbers = list(filter(lambda x: x>0,numbers))
print(positive_numbers)


#TIP CALCULATOR

print("Welcome to the tip calculator")
print("What was your total bill? $")
total_bill = int(input())

print("How much tip would you like to give? %")
tip_percentage = int(input())

print("How many people to split the bill")
num_people_split_bill = int(input())

bill_after_tip = total_bill + (total_bill * float((tip_percentage/100)))

tip_per_each =round((bill_after_tip / num_people_split_bill),2)
final_tip_each = "{:.2f}".format(tip_per_each)

print(f"Each Person should pay:$ {final_tip_each}")


# Project: Choosing a random party person to pay a bill

import random
list = input("what's your names?\n")
my_list = list.split(",")
num_list = len(my_list)

rand_choice= random.randint(0, num_list-1)

print(my_list[rand_choice])



#Matching up 2 basketball teams ranked to the top in preliminary competition: Paris Olympics, teams ready for Quarter final: First knockout session
#MEN
import random
print("Men's basketball teams: Quarter final shuffle")
print("\n")

teams = ["Canada", "Serbia", "France", "Australia", "Greece", "Germany","Brazil", "United States"]
random.shuffle(teams)

pairs = [(teams[i], teams[i+1]) for i in range(0, len(teams),2)]
for pair in pairs:
    print(f"{pair[0]} vs {pair[1]}")

#WOMEN
print("\n")
print("Woman Basketball Teams: Quarter Final shuffle\n")

teams2 = ["United States","Nigeria","Spain","Serbia","France","Australia","Germany","Belgium"]
random.shuffle(teams2)
pairs = [(teams2[i],teams2[i+1]) for i in range(0,len(teams2),2)]

for pair in pairs:
    print(f"{pair[0]} vs {pair[1]}")


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

num1= 451999277 

num2=41177722899

string_number = str(num1)

# tripple_digits = re.findall(r"(\d{3})\1",string_number)
# double_digits = re.findall(r"(\d{2})\1", string_number)
# print(tripple_digits)
# print(double_digits)


counts = {}

for digit in string_number:
  counts[digit] = counts.get(digit,0)+1


if any(count >=3 for count in counts.values()):
  print("Triplicates")
elif any(count == 2 for count in counts.values()):
  print("Duplicates")
else:
  print("something else")

def triple_double(num1, num2):
  counts = {}

  string_num1=str(num1)
  string_num2 = str(num2)

  for digit in string_num1:
    counts[digit] = counts.get(digit,0) + 1

    if any(count >=0 for count in counts.values()):
      return 1
    
    
  for digit in string_num2:
    counts[digit] = counts.get(digit,0) + 1
    if any(count == 2 for count in counts.values()):
      return 0