import re

#Meta characters are combined with special characters to get elements from texts

#Example of famous special characters

print('''
      
      SPECIALS CHARACTERS
"\d": Matches any digit(0-9)
"\D": Matches non-digits(a-zA-Z)
"\w": Matches any word characters(a-zA-Z0-9_)
"\W":Matches any non-word character
"\s": Matches any white space character(tab, new_line, spaces)
"\S": Matches any non white space
      Metacharacaters
".": Any character except a new line
"^": Start of a string
"$": End of a string
"*": Zero or more occurance of a character
"+": one or more occurance of a character
''')


#re.search   : return only the first occurance. It doesn't care if there are other values in the text
#Searching for a number froma string
text = "The house number is 2345"
results =re.search(r"\d",text)
#combine special character (\d) and meta character (+) 
results2=re.search(r"\d+",text)
#adding .group() to isolate and print the whoe results
print(results)
print(results2)
print(results2.group())

#re.findall() : return all occurances. It doesn't focus on one occurance but all of them in the text

text2 = text = "The house number is 2345 and the zip cade is 75205 and my address starts with 0567"
#without a  meta character +, the result comes but in a string format of each digit
findings = re.findall(r"\d",text)
print(findings)
findings2 = re.findall(r"\d+",text)
print(findings2)

#re.sub() : replace a pattern with a new string

text3 = "Lebron James will always be the goat"
replace_results=re.sub("Lebron James","Michael Jordan", text3)
print(replace_results)

#re.split(): Splits a string by the occurance of the pattern
#For the example below, it splits based on a white space. After each space, it splits into a string.

split_text3 = re.split(r"\s",text3)
print(split_text3)
#However, a metacharacter (+) will be usefull in case there is more spaces in the text

text4= "Lebron   is the         best         player"

split_text4=re.split(r"\s",text4)
split_text4_Meta=re.split(r"\s+",text4)
#split_text4 will be split but will have a lot of spaces while with meta, all spaces are removed
print(split_text4)
print(split_text4_Meta)

#Grouping and capturing
#Meta character curry braces{} are used to specify the digits you are looking for

SSN_num = "My SSN is 456-45-9856"

captured = re.search(r"\d+",SSN_num)
captured1=re.findall(r"\d+",SSN_num)
captured2=re.search(r"\d{3}-\d{2}-\d{4}",SSN_num)
print(captured)
#for below, it comes as a string. findall() can't be grouped.
print(captured1)
#For belog, it comes as a precise phone number
print(captured2)
print(captured2.group())

#GROUPING 
captured2=re.search(r"(\d{3})-(\d{2})-(\d{4})",SSN_num)
print(captured2.group())
print(captured2.group(1))
print(captured2.group(2))
print(captured2.group(3))

#Creating a pattern for a FULL NAME with naming/capturing groups "Ferdinand Niyongira"
#Here we use a meta chacter [] to capture a set of characters

description = "My name is Ferdinand Niyongira and i'm a student at Coding Temple"

Full_name = re.search(r"[A-Z][a-z]+\s[A-Z][a-z]+",description)
print(Full_name)
print(Full_name.group())


description2 = "My name is Ferdinand McNiyongira and i'm a student at Coding Temple"
Full_name2 = re.search(r"([A-Z][a-z]+)\s([A-Z][a-z]+[A-Z][a-z]+)",description2)
print(Full_name2)
print(Full_name2.group())
print(Full_name2.group(1))
print(Full_name2.group(2))


#Naming groups by USING "?P<group_name>"
description2 = "My name is Ferdinand McNiyongira and i'm a student at Coding Temple"
Full_name2 = re.search(r"(?P<First_name>[A-Z][a-z]+)\s(?P<Last_name>[A-Z][a-z]+[A-Z][a-z]+)",description2)
print(Full_name2)
print(Full_name2.group())
print(Full_name2.group('First_name'))
print(Full_name2.group('Last_name'))

#creating a variable

first_name = Full_name2.group('First_name')
print(first_name)

#IN-CLASS EXERCISES: Matching a valid email address

email_string = "My email for coding temple is allana@ct.com"
email_findings =re.search(r"[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]{2,3}",email_string)
email_findings2 =re.search(r"[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+",email_string)
email_findings3 =re.search(r"[\w\d]+@\w+.\w{2,3}",email_string)
print(email_findings.group())
print(email_findings2.group())
print(email_findings3.group())

#Grouping and capturing
#Meta character curry braces{} are used to specify the digits you are looking for

SSN_num = "My SSN is 456-45-9856"

captured = re.search(r"\d+",SSN_num)
captured1=re.findall(r"\d+",SSN_num)
captured2=re.search(r"\d{3}-\d{2}-\d{4}",SSN_num)
print(captured)
#for below, it comes as a string. findall() can't be grouped.
print(captured1)
#For belog, it comes as a precise phone number
print(captured2)
print(captured2.group())

#GROUPING 
captured2=re.search(r"(\d{3})-(\d{2})-(\d{4})",SSN_num)
print(captured2.group())
print(captured2.group(1))
print(captured2.group(2))
print(captured2.group(3))

# #Creating a pattern for a FULL NAME with naming/capturing groups "Ferdinand Niyongira"
# #Here we use a meta chacter [] to capture a set of characters

description = "My name is Ferdinand Niyongira and i'm a student at Coding Temple"

Full_name = re.search(r"[A-Z][a-z]+\s[A-Z][a-z]+",description)
print(Full_name)
print(Full_name.group())


description2 = "My name is Ferdinand McNiyongira and i'm a student at Coding Temple"
Full_name2 = re.search(r"([A-Z][a-z]+)\s([A-Z][a-z]+[A-Z][a-z]+)",description2)
print(Full_name2)
print(Full_name2.group())
print(Full_name2.group(1))
print(Full_name2.group(2))


# #Naming groups by USING "?P<group_name>"
description2 = "My name is Ferdinand McNiyongira and i'm a student at Coding Temple"
Full_name2 = re.search(r"(?P<First_name>[A-Z][a-z]+)\s(?P<Last_name>[A-Z][a-z]+[A-Z][a-z]+)",description2)
print(Full_name2)
print(Full_name2.group())
print(Full_name2.group('First_name'))
print(Full_name2.group('Last_name'))

#creating a variable

first_name = Full_name2.group('First_name')
print(first_name)

# #IN-CLASS EXERCISES: Matching a valid email address

email_string = "My email for coding temple is allana@ct.com"
email_findings =re.search(r"[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]{2,3}",email_string)
email_findings2 =re.search(r"[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+",email_string)
email_findings3 =re.search(r"[\w\d]+@\w+.\w{2,3}",email_string)
print(email_findings.group())
print(email_findings2.group())
print(email_findings3.group())



