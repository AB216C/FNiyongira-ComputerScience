# string indexing

word = "Python"

print(word[0])
print(word[2])
print(word[1])

name = 'Samson'

print(name[0])
print(name[1])
print(name[2])
print(name[3])


# string concatenation

first_name = 'Ferdinand'

second_name = ' Niyongira'

print(first_name + second_name)

print('Lucky' + ' Dube')


# String repetition

exclamation = ' Wow' * 5

print(exclamation)

repetition = 'Hello!' * 3
print(repetition)

# String length

first_name_length=len(first_name)
print(first_name_length)

#Accessing substrings
print(first_name[-1])
print(second_name[2:])
print(first_name[2:4])
print(first_name[1:])

#STRING MULTIPLE LINES

multiple_lines = """Thi is a string
It has multiple lines
Hello all
Hello World"""
print(multiple_lines)

# Finding a substring and counting occurances

long_text = " Python is powerful. Python is versatile. Python is everywhere"

print(long_text.find("Python"))
print(long_text.find("is"))
print(long_text.count('y'))
print(long_text.count('i'))

#string slicing and  immutability demonstrations


original_string = "Jython"
fixed_string = "P" + original_string[1:] 
print(fixed_string)


# capatalize and title

sentence = "hello dad"

print(sentence.title())
print(sentence.capitalize())

#isdigit vs isinstance-check if a string contain digit only using 

message = "434"
print(type(message))
print(isinstance(message,bool))
print(isinstance(message,int))
print(isinstance(message,float))
print(isinstance(message,str))

print(message.isdigit())
print(message.isupper())
print(message.isnumeric())




