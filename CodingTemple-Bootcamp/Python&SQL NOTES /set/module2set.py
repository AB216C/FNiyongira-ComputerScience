# #working with set
hobbies = ['Vitamin', 'Chairs', 'Chairs', 'Movies', ' Bedroom', 'Cheese', 'Cheese']
set_hobbies = set(hobbies)

print(hobbies)
print(set_hobbies)

#set are unordered. Different order anytime each is printed.

for hobby in set_hobbies:
  print(hobby)

unique_names= {'Felix','Ferdinand','Phocas'}

with open('friends_unique_names.txt','w')as file:
  for friend in unique_names:
    file.write(friend + '\n')

#checking membership. Shooul return true or false

print("Felix" in unique_names)
print('Ferdinand' in unique_names)
print('Bella' in unique_names)

if 'Ferdinand' in unique_names:
  print("Ferdinand is having a cool party")
else:
  print("Ferdinand didn't make it for today")


# adding to a set

fav_food = {'orange','Maraacuja', 'Agatogo'}
fav_food.add('Ugali')

print(fav_food)

basketball = {'Miami', 'Florida', 'Lakers', 'Bucks'}
volleyball = {'Miami', 'Huskers', 'Florida', 'Iowa', 'Lakers','Dallas'}
#Advanced features. Membership. Big part for sets
print(basketball.issubset(volleyball))
print(basketball.issuperset(volleyball))
print(volleyball.issuperset(basketball))

usa_team = basketball.union(volleyball)
print(usa_team)

mutual_team = basketball.intersection(volleyball)
print(mutual_team)

exclusive_team = basketball.difference(volleyball)
print(exclusive_team)

unique_team=basketball.symmetric_difference(volleyball)
print(unique_team)

#Exercises
email_list1 = ['bakame@gmail.com', 'jayz@yahoo.com', 'theos@gmail.com']
email_list1_copy=set(email_list1)
email_list2=['chento@gmail.com','france@hahoo.com','jayz@yahoo.com']
email_list2_copy=set(email_list2)

print(email_list1_copy)
print(email_list2_copy)
print(email_list1_copy.union(email_list2_copy))
print(email_list1_copy.intersection(email_list2_copy))
print(email_list1_copy.symmetric_difference(email_list2_copy))