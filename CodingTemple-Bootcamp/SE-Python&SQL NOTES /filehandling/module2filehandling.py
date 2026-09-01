#FILE  HANDLING

#OPEN A FILE IN A MODE TO WRITE DATA

file = open('new_file', 'w')

file.write('Writing a file in Python \n')
file.close()

print(file)


#Appending data to the file without overwriting

file = open('new_file','a')
file.write("Adding new information to the file\n")
file.close()

#Testing the overwritting using "w"
# using w delete previous data of the created file

# file = open('new_file','w')
# file.write('Hello Guys. I see you tomorrow\n')
# file.close()

file = open('new_file','a')
file.write('Hello Guys. I see you tomorrow\n')
file.write('Planning to attend churches very soon. But which church?\n')
file.close()


file=open('new_file','r')
content = file.read()
print(content)

#CREATING NEW FILES AND ADDING INFORMATION USING "WITH OPEN AS"

with open ("musician_file","w") as musicians:
  musicians.write("Rwandan musicians include Ben, Bruce, Meddy, and Chris\n")

with open('musician_file','a') as musicians:
  musicians.write("Burundian musicians include Kepepe, Cindy, and Jean Paul")

with open("musician_file","r") as musicians:
  content2 = musicians.read()

  print(content2)

with open("fav_song_file","w") as favorite_songs:
  favorite_songs.write("Burundi: Inseko yawe by SatB\n")
  favorite_songs.write("Burundi: Inseko yawe by Kidumu\n")
  favorite_songs.write("Burundi: Inseko yawe by Kidumu\n")
  favorite_songs.write("Rwanda: Yantumye by King James \n")

with open("fav_song_file","r") as favorite_songs:
  play_list = favorite_songs.read()
print(play_list)

with open("fav_song_file","a") as favorite_songs:
  favorite_songs.write("Uganda: Fever by Sheba")

with open("fav_song_file","r") as favorite_songs:
  play_list = favorite_songs.read()
print(play_list)



# Task: Create a simple Python program that:

# Allows the user to add favorite foods to a list.
# Stores the data in a file.
# Lets the user view or remove items from the list.

# Storing and Extracating data from list and Dictionaries

#STORING A LIST

flowers = ["Wysteria ", "Sunflowers ", " Orchids", " Marigolds "]

with open("garden.txt","w") as file:
  for flower in flowers:
    file.write(flower+ '\n')
with open("garden.txt","r") as file:
  content = file.read()
print(content)

#EXTRACTING A LIST

flowers2 =[]

with open("garden.txt","r") as file:
  for item in file:
    flowers2.append(item.strip())
print(flowers2)

#STORING AND EXTRACTING LIST AND DICTIONARIES

# 1 STORING A LIST IN A FILE
flowers =  ["Wysteria", "Sunflowers", "Orchids", "Marigolds"]

with open("Christmass","w") as file:
  for flower in flowers:
    file.write(flower + "\n")


with open("Christmass","r") as file:
  content=file.read()
  print(content)

#Extracating A LIST

my_flowers = []

with open("Christmass","r") as file:
  for line in file:
    my_flowers.append(line.strip())
print(my_flowers)

#1.B STORING A DICTIONARY IN A FILE

clubs = {
    'Driver': 'Cobra',
    'Irons': 'Sirixion',
    'Hybrid': 'Callaway',
    'Putter': 'Ping'
}


with open("Christmass2","w") as file:
  for club, name in clubs.items():
    file.write(f"{club}:{name}\n")


with open("Christmass2","r") as file:
  content=file.read()
print(content)

#2.B EXTRACTING A DICTIONARY

golf_club = {}

with open("Christmass2","r") as file:
  for line in file:
    club,name = line.strip().split(":")
    golf_club[club]=name
print(golf_club)

# NB: split(":") separate a each line in the file into key_value pair

