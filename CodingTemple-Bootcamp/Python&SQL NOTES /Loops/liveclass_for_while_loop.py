#LOOPS
import time 
characters = ["Jack", "Yoda", "Han solo", "Chewbaka", "Leia Orga"]

for character in characters:
  print(character)

print("--" * 25)

#HAVING ACCESS TO THE INDEX WHERE i = index

for i in range(0,len(characters)):
  print(i)
  print(characters[i])

print("--" * 25)


for i in range(0,len(characters)):
  print( f"{i} - {characters[i]}")

print("--" * 25) 


for i in range(0,len(characters)):
  print( f"{i + 1} - {characters[i]}")

print("--" * 25) 

for i in range(0,len(characters)):
  print( f"{i + 1} - {character}")

print("--" * 25) 

for i in range(0,len(characters)):
  print( f"{i + 1} - {characters}")

# ENUMERATES: SEPARATE INDEX FROM VALUES
print("--" * 25) 
for index, character in enumerate(characters):
  print(index)
  print(character)
print("--" * 25) 

print("Preparing for a light speed jump")

for second in range(5,0,-1):
  print(second)
  print(f"{second} ....")
  time.sleep(0.5)    #sleeping for 0.5 seconds
print("Light speed activated")

print("Hello All")

print("--" * 25) 

for number in range(22,10,-1):
  print(number)


print("Who will bring the balance to the force")

for character in characters:
  if character == "Jack":
    print(f"{character} brought balance to the force but at great cost")

  elif character == "Yoda":
    print(f"{character} is an evil. He can't bring the balance to the force")

  else:
    print(f"{character} will probably do something much better than others")

#ZIPPING TWO LIST WITH LOOPS zip()

weapons = ["Blaster", "lightsaaber", "force choke", "force push"]

for character,weapon in zip(characters, weapons):
  print(f"{weapon} proteect {character}")

for i in range(5):
  print(i)

print("---" * 25 )

fruits = ["Banana", " Pineapple", "Apple", "Cherries"]

for item in fruits:
  print(item)

print("---" * 25 )


#while loop

count = 0
while count < 10:
  count = count + 2
  print(count)
print("---"* 25)

count = 0
while count < 100:
  count = count + 5
  print(count)


# printing even numbers between 1 and 20 using python loop

even_numbers = range(1,2)

for item in even_numbers:
  if item%2 == 0:
   print(item)

numbers = range(1,30)

for item in numbers:
  print(item)


print("Hello world")

print("__" * 20)

# Print all numbers from 1 to 30.
# Skip the numbers that are divisible by 3 using the continue statement.
# Stop the loop if the number is greater than 25 using the break statement.
numbers = range(1,30)

for number in numbers:
  if number % 3==0:
    continue
  if number > 25:
    break
  print(number)


#use while loop when trying to get some outpout over and over and not sure where to stop
while True:
  print("Hello")

  break

tracking = True

while tracking:
  print("Wake up")
  
  tracking = False

counter = 0

while counter < 5:
  print(f"Hell there {counter}")
  counter +=1

training_level =0
training_level_target = 10

print("Jeda Training sessions..........")
while True:
  print(f"Training level:{training_level} training intensifies sessions")
  training_level +=1
  
  if training_level == 3:
    print("You can now engage in a fight")
    continue
  if training_level==7:
    print("Time to attend competion")
    continue
  elif training_level==training_level_target:
    print("Training session complete")
    break



