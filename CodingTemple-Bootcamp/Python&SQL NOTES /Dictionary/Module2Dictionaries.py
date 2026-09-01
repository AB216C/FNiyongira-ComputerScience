#working with Dictionaries: KEYS AND VALUE PAIRS
my_dict = {"name":"Alice",
           "age":20,
           "profession":"Engineer"
           }
print(my_dict["name"])
#.get() is used to minimize key error
print(my_dict.get("name"))
print(my_dict.get("club"))
# updating excisting dictionary. As long as it has a key. it can be updated

my_dict ["name"] = "Joseph"

print(my_dict) 

# my_dict.add("Hobby":"Volleyball")

del my_dict["age"]
my_dict.pop("profession")
print(my_dict)

my_dict["hobby"]="Basketball"
my_dict["fav_color"]="Black"

print(my_dict)

#Using for loop to display KEYs only

user_profile = {"name":"John","age":35, "email":"johnsmith@yahoo.com" }
#this loop gives key only
for key in user_profile.keys():
  print(key)

for item in user_profile:
  print(item)
print(user_profile)
#BEST WAY TO USE FOR LOOP FOR DICTIONARIES TO RETURN ALL VALUES IS TO USE i,j and .items()

for i,j in user_profile.items():
  print(f"{i}:{j}")

#Another Examples

book_rating = {"sky":4.5, "Darkness":3.7, "Millions time":4.8}

for book, rating in book_rating.items():
  print(f"{book} has a rating of {rating}")
#This gives you rating only:Values only
for item in book_rating.values():
  print(item)

# Nested Dicionaries

organization  = {
  "Team":"team",
  "Departments":{
    "HR":"Human Resources",
    "SE":"Software Engineering",
    "CS":"Cyber Security" 
  },
  "Students":["Ferdinand", "Smith", "Claude", "Claudia"]
}


print(organization["Departments"])
print(organization["Departments"]["HR"])
print(organization["Students"][2])

#UPDATING THE DICTIONARY 

organization["Departments"]["CS"]="Computer Science"


#ADDING A NEW DEPARTMENT
organization["Departments"]["BE"]="Back End"



#UPDATING WITH INPUT

input_dep =input("Which department would you like to update?  ")
input_update = input("what to update? ")

organization["Departments"][input_dep]=input_update
print(organization["Departments"])

#LIST OF DICTIONARIES

Departments =[
  {"Name":"Engineering", "Head":"Alice", "Focus":"Product Development"},
  {"Name":"Marketing", "Head":"Jayz", "Focus":"Customer Relations"},
  {"Name":"Operations", "Head":"Charlie", "Focus":"Process Optimization"}
]
#Accessing Alice

print(Departments[0]["Head"])

#appending on dictionaries
#Appending an empty dictionary involves adding a Key-Value Pairs.
#How it works:

#Initialization: Empty dictionary is created using {} or dict()
#Adding Key-value pairs: New Key-Value pairs are added using assignment operator [ ]
           #Syntax = dictionary[Key]=Value. If Key doesn't exist, it's added along its value.
                                            #It Key already exist, it's updated


#Example

my_dict = {}


my_dict[1] = "a"
my_dict["b"] = 2
my_dict["c"] = 3
my_dict[4] = "d"

print(my_dict)



