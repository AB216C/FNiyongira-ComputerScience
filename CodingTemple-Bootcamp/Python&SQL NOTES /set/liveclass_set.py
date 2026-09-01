#Working with set. Removing items using discard(). Discard give errors for list, tuples and dictionary
team = {"Eve", "Bob", "Crazy", "John"}

team.discard("Eve")
print(team)

#working with frozen set: This a set  type where you should not change or add anything after it is created. Otherwise it will result in erros

tools = frozenset(["Hammer", "Wrench", "Screwdriver"])

print(tools)
# tools.add("Drill")     #printing tools will result in attribute errors. 
#frozen set is a constant variable-It can't be manupulated

print(tools[0])  #result in error

