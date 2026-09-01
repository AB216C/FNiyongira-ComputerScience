#Regular expression or REGEX

# These are "Meta Characters":
#  . : Match any character except a new line
# ^ : Mtach the start of a string
# $: Match the end of a string
# []: Matches characters inside a brackets
#These are "Special Characters":
# \d : Matches any digit[0-9]
#\w : Matches any word character [a-zA-Z0-9_]

# ADVANTAGES OF REGEX METHOD(FUNCTION) PARAMETERS:
  # It allows you to search, split, match and substitute words based on a pattern

  #The two essential parameters are required
  #    1. Pattern:  r"pattern": Patter in s regular expression the defines a text pattern you want to manipulate
  #    2. text:    a string where you want Regex engine to apply

# Here are 4 regex Function: re."findall", re."match", re."split" and re."sub"

# re."findall"
import re 

text = "Hi my name is Travis, and i like to go, and do things and stuffs"

ands = re.findall(r"and",text)
print(ands)
print(len(ands))

post = "I LOVE # learning #python_is_a_lifestyle and #Regex, This is so fun!#Code"

hashtag = re.findall(r"#\w+",post)
print(hashtag)
print(len(hashtag))

#Extracting email address 

text2 = "contact us at support@example.com or sales@example.com"

# emails = re.findall("@",text2)
email_extracts = re.findall(r"[A-Za-z0-9._%+-]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,}",text2 )


# print(emails)
print(email_extracts)

#EXTRACTING HASHTAGS

tweets = [
    "Loving the #sunset! So peaceful #nature #blessed",
    "Had a great day! #happy #friends #goodvibes",
    "Can't wait for the #weekend! #fun #relax"
]

hashtags = re.findall(r"[#\w+]", tweets)
print(hashtags)


# #2. re.search(pattern,text)

# email = "kareem33-34-28@gmail.com"
# found = re.search(r"[\w.-]+@[\w+]+\.[a-z]{2,}",email)
# print("Email found found:", found.group())


# text = "You can contact me at t.p@gmail.com or travis-p2@codingtemple.com, traviscpeck@email.com"

# emails = re.findall(r"[\w.-]+@[\w-]+\.[a-z]{2,}",text)
# print(emails)

# message = "Contact us at 123-456-7890."
# found_phone_num= re.search(r"\d{3}-\d{3}-\d{4}",message)

# print("Phone number found:", found_phone_num.group())



#re.match  : FOCUS ON THE MATCHING THE BEGINNING OF A STRING
url = "https://something.com"

secure = re.match(r"https",url)
if secure:
  print(secure)
  print("The link goes to a secure website!")
  print("Security key found:", secure.group())

# re.split()-same as python bulding function str.split()

text = 'Python,Regex;Splitting-Example. Fun, right?'

created_list =re.split(r"[,.;\s-]+",text)
print(created_list)


csv_data = "Name, Age and; Occupation."

filtered = re.split(r"[,;.\s]+",csv_data)
print(filtered)

#re.sub(pattern, replacer, text)
#Formating phone number

number = "(770) 888-1180"

formatted_number = re.sub(r"\D","", number)

print(formatted_number)

#Anonymizing a user_name
chat = '''
@Yve-bee123 : "I think I love Regex"
@Travis : "Aren't you married?"
@Yve_bee123 : "It's just not the same"
@Travis : "They better not see this!"
'''

anonymous = re.sub(r"@[\w-]+ ", "user-anon",chat)
print(anonymous)

# Grouping with REGEX:
# The goal is to capture a specific group of a match for a later use
# group matched are released using index group(0), group(1), or group(2) and more

# formula  or syntax:
# syntax= re.search(pattern, text).group(n) 

text = "123-456"

pattern = r"(\d+)-(\d+)"

thematch = re.search(pattern,text)

print(thematch.group(1))
print(thematch.group(2))


#You are tasked with creating a simple email validation script that accepts a list of emails and checks if they are valid based on a regex pattern.
emails = [
    "correct.email@example.com",
    "incorrect-email-at-example.com",
    "another.correct.email@example.org"

]