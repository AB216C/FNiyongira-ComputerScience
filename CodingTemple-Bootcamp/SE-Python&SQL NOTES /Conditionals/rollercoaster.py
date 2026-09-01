


# Writing rollercoaster instructions

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