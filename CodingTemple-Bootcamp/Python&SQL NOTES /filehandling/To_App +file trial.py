# Task: Create a simple Python program that:

# Allows the user to add favorite foods to a list.
# Stores the data in a file.
# Lets the user view or remove items from the list.

#defining functions

def write_foods(foods):
   with open("food.txt","w") as file:
      for food in foods:
         file.write(food + "\n")

def read_foods():
  foods_list = []
  with open ("food.txt","r") as file:
     for line in file:
        foods_list.append(line.strip())
  return foods_list   

def main():
   foods = read_foods()
   while True:
      action = input("1-Add food, 2-View foods, 3-Remove food, 4-Quit\n")

      if action == "1":
         new_food = input("Enter the name of the foood")
         foods.append(new_food)
         write_foods(foods)
         
      elif action == "2":
         print("Your favorite foods:")
         for food in foods:
            print(food)
      elif action == "3":
         index = int(input("Which index would you like to remove?"))
         food.pop(index-1)
         write_foods(foods)
      elif action == "4":
         break
main()

#ADDING TV SHOWS TO YOUR LIST
