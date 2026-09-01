

# Error Handling with "Try" and " Except"

try:
 x=10/1
 print(x)
except ZeroDivisionError:
  print("Invalid imput")


try:
  input=int(234)
  print(input)
except ValueError:
  print("Value error")


# try:
#   first_num = int(input("first_number: "))
#   second_num = int(input("second_number: "))

#   print(first_num/second_num)

except ValueError:
  print("invalid literal. Enter integer number")

except ZeroDivisionError:
  print("Invalid input")

# Catch multiple exception in one block

try:
  x=int(input("Enter number:"))
  result = x/5
  print(result)
except (ValueError,ZeroDivisionError) as e:
  print(f"An error occurred {e}")

# CATCH ANY EXCEPTION IN ONE BLOCK

try:

  x=int(input("Enter number:"))
  result = 5/x
  print(result)
except:
  print("Error occurred. Please try again")

# ELSE AND FINALLY clauses
try:
    x=int(input("Enter number:"))
    result=20/x
except(ValueError,ZeroDivisionError) as e:
    print(f"Error occured. {e}")

else:
    print(f"Final answer is: {result}")
finally:
    print("Execusion complete")


#guessing a secret number between 1 and 10
#Given secret number is not constant

import random

secret_num = random.randint(1,10)

user_guess = int(input("What is your guess? \n"))

if user_guess == secret_num:
  print("Congratulations. You guessed the secret number")
elif user_guess > secret_num:
  print("Too high")
else:
  print("Too low")

print(f"Secret number was: {secret_num}")

# Create a program that simulates an ATM withdrawal process. The program should:
# Steps:

# Allow the user to input an amount to withdraw.
# Raise an exception if the input is invalid (non-numeric or negative).
# Ensure that the withdrawal doesn’t exceed the account balance, raising an appropriate exception.
# Always display the remaining balance, even if an error occurs.

try:
  account_balance=1000
  
  withdrawal = int(input("How much to withdraw today: "))
  account_balance = account_balance - withdrawal

  if withdrawal > account_balance:
    print("Insufficient funds")
  else:
    print(f"Remaining balance: {account_balance}")

except (ValueError,NameError) as e :
  print(f"Error occured {e}. Please put a valid number")
  
finally:
  print(f"The remaining balance: {account_balance}")