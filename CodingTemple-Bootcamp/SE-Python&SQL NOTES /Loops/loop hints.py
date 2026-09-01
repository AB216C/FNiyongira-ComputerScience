#while loop. It works pretty much as if function. However, lines of code after while condition are  able to be repeated.
name = input("What's is your name?")

while name == "":
    print("Your name is not valid")
    name = input("Try again, What's is your name?")
print(f"Hello {name}! Good to see you.")


age = int(input("what's your age? \n"))

while age < 18:
    print("You are still young")
    age = int(input("Next. what's your age?\n"))

print(f"Your are {age} years old. Please enter inside")

#using logical operator not in while loop

brand = input("what's your car brand?\n")

while not brand == "suzuki":
    print("You got a new car")
    brand = input("Try again. what's your car brand?\n")
print("You got an old car")

#while loop. It works pretty much as if function. However, lines of code after while condition are  able to be repeated.
name = input("What's is your name?")

while name == "":
    print("Your name is not valid")
    name = input("Try again, What's is your name?")
print(f"Hello {name}! Good to see you.")


age = int(input("what's your age? \n"))

while age < 18:
    print("You are still young")
    age = int(input("Next. what's your age?\n"))

print(f"Your are {age} years old. Please enter inside")

#using logical operator not in while loop

brand = input("what's your car brand?\n")

while not brand == "suzuki":
    print("You got a new car")
    brand = input("Try again. what's your car brand?\n")
print("You got an old car")

# Building car game part 1 using while loops
command = ""
while command != "quit":
    command = input("> ").lower()
    if command == "start":
        print("cart started")
    elif command == "stop":
        print("car stopped")
    elif command == "help":
        print("""
    start - to start the car
    stop - to stop the car
    quit - to quit
        """)
    elif command == "quit":
        break
    else:
        print("sorry, i don't understand that")
#adding boolean to the program part 2
command = ""
while True:
    command = input("> ").lower()
    if command == "start":
        print("cart started")
    elif command == "stop":
        print("car stopped")
    elif command == "help":
        print("""
    start - to start the car
    stop - to stop the car
    quit - to quit
        """)
    elif command == "quit":
        break
    else:
        print("sorry, i don't understand that")

#adding extra information to the program: storing extra information in the memory part 3: Complete and ready to run
command = ""
started = False
while True:
    command = input("> ").lower()
    if command == "start":
        if started:
            print("Car is already started")
        else:
            started = True
            print("cart started")
    elif command == "stop":
        if not started:
            print("car already stopped")
        else:
            started = False
            print("car stopped")
    elif command == "help":
        print("""
    start - to start the car
    stop - to stop the car
    quit - to quit
        """)
    elif command == "quit":
        break
    else:
        print("sorry, i don't understand that")