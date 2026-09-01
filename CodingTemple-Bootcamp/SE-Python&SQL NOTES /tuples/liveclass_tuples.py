#working with tuples
#Packing an dunpacking

names = ("Allan", "Robbie", "Mitchel", "Mathew", "Kelly", "Ferdinand")

first_name, second_name, *rest_name, last_name = names

print(first_name)
print(second_name)
print(rest_name)
print(last_name)

#unpacking tuple with function

def introduce(name, role, location):
  print(f"{name}, the {role} is from {location}")

member1 = "Alice", "Software Engineer", "Uganda"
member2 = "Alex", "Developer","Rwanda"
introduce(member1[0],member1[1],member1[2] )
introduce(*member1)

def introduce_pro(*members):
  print(members)
  for name, role,_ in members: 
   print(f"{name} is {role}")

introduce_pro(member1,member2)

