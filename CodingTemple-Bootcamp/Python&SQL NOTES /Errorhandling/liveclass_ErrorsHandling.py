# error handling
try:
    user_choice = int(input("What would you like to cube? "))
    print(user_choice ** 3)
except ValueError:
    print("Try again")

try:
    user_choice = int(input("What would you like to divide? "))
    print(user_choice / 0)
except ZeroDivisionError:
    print("Try again")

user_input = 0

while user_input != 2:
  print('''
\nMain Menu
        1. Duel an opponent
        2. Exit
        
''')


