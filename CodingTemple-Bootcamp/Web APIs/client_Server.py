#Client: Browser
#Client (Browser): The user interacts with the web by typing a URL into the browser or clicking a link. The browser then sends an HTTP request to the server.

# Server: The server receives the request, processes it, and sends back an HTTP response containing the data needed to display the web page, such as HTML, CSS, or JavaScript.

# HTTP Request-Response Cycle
# Client: The browser sends an HTTP request to the server.
# Server: The server receives the request, processes it, and responds with the requested data.
# 
# Common HTTP Methods:
# GET: Used by the client to request data from the server (e.g., loading a webpage).
# POST: Used by the client to send data to the server (e.g., submitting a form).

# Example of Client-Server Interaction

# URL Request: You enter https://example.com in your browser.
# Client (Browser): Sends an HTTP GET request to the server hosting example.com.
# Server: Receives the request and responds with the HTML page for example.com.
# Client (Browser): Renders the HTML and displays the page to the user.


#client(Browser) --> GET/index.html   ---> server
# Sever    --->Response(HTML file)  --->client(Browser) 

# Real-World Example
# Every time you visit a website, your browser (the client) and the web server are engaging in this request-response cycle.
# The server delivers the resources necessary for your browser to display the site, such as HTML files, images, and scripts.

############  API(Application Programming Interface)  ######################

#API is a set of rules that allows one piece of a software interect with another. Allows different types of systems to communicate with each other
#API is also intermediaries that take your request to a system(like server) and bring back the data or functionality you need

     ####Types of APIs
#1. WEB APIs: Allow clients(browsers) to communicate with servers using HTTP requests
#2  RESTful APIs: Follow REST(Representational State Transfer): Use standards HTTP methods like GET, POST, PUT, and DELETE
#ADVANTAGE OF APIs: They allow developers to build front end applications without 


#pikachu= https://pokeapi.co/api/v2/pokemon/pikachu

#This URL return information about Pikachu in JSON format
#Code example: Using Python's request library
#SUch JSON's format is stored on somoone's DNA

#These request need to be in virtual environment to work.
# #Windows
#======= python -m venv venv =======

# #Mac
# ========python3 -m venv venv ======

# #Windows
# =======.\venv\Scripts\activate======

# #Mac
# ======source venv/bin/activate=====

#THEN INSTALL REQUESTS IN THE VIRTUAL ENVIRONMENT AFTERWARDS
#====pip install requests ===========


# pikachu= https://pokeapi.co/api/v2/pokemon/pikachu

import requests
import json
import pprint    #Help to retrive data from API

# # Make a GET request to the PokeAPI for Pikachu
# response = requests.get('https://pokeapi.co/api/v2/pokemon/pikachu')

# # Check if the request was successful
# if response.status_code == 200:
#     data = response.json()  # Parse JSON data
#     print(data['name'])  # Output the JSON response
#     print(data['height'])
# #retrieving abilitites: This is a list. List comprehension will be required here
#     for ability in data["abilities"]:
#         print(ability)
#         print(ability["ability"]["name"])
#         print(ability["ability"]["url"])
#         print(ability["is_hidden"])
#     #printing all names in abilities using list comprehesion
#     ability = [ability["ability"]["name"] for ability in data["abilities"]]
#     print(ability)

# else:
#     print(f'Error: {response.status_code}')


#Pasting the URL in browser allows you to see JSON format#'https://pokeapi.co/api/v2/pokemon/pikachu'
#This allows you to request specific information you want

#======VIRTUAL ENVIRONMENT=======
#This is isolated python environment that allows you to manage dependencies for a project without affecting 
#affecting other projects or system_wide packages
#This allow different proejects to have their own dependencies



# def get_pokemon(pokemon):
#     response = requests.get(f'https://pokeapi.co/api/v2/pokemon/{pokemon}')

#     if response.status_code == 200:
#         data = response.json()
#         pprint.pp(data)
#         print(type(data))


#     print(data["weight"])
#     print(data["name"])
#     print(data["order"])
#     # print(data["sprites"])

# #This will result in error
# get_pokemon("pikach")    #Has error
# get_pokemon("pikachu")  #error fixed

#TO FIX ERROR, ELSE WILL BE ADDED WITH ERROR HANDLING METHOD


# def get_pokemon(pokemon):
#     response = requests.get(f'https://pokeapi.co/api/v2/pokemon/{pokemon}')

#     if response.status_code == 200:
#         data = response.json()
#         pprint.pp(data)
#         # print(type(data))

#     else:
#         print(f"Error:{response.status_code}{response._content}")


#     # print(f"Pokemon Weight: {data["weight"]}")
#     # print(f"Pokemon types: {data["types"]}")
#     # print(f"Pokemon types: {data["types"][0]}")
#     # print(f"Pokemon types: {data["types"][0]["slot"]}")
#     # print(f"Pokemon types: {data["types"][0]["type"]}")
#     # print(f"Pokemon types: {data["types"][0]["type"]["name"]}")
#     #using for loops to retrieve data

#     print(f"pokemon name is: {data["name"]}")
#     print(f"pokemon name is: {data["weight"]}")

#     # poke_types = data["types"]

#     # for index,types in enumerate(poke_types):
#     #     print(f"{index + 1}---{types["type"]}")
#     #     print(f"{index + 1}---{types["type"]["name"]}")
#     # print(f"Pokemon types: {data["types"][0]["type"]["name"]}")


# #This will result in error
# # get_pokemon("pikach")
# #by get_pokem("pikachu") able all codes above to run
# get_pokemon("pikachu")  #error fixed

#LET'S TRY ANOTHER API
def get_cat():
    response = requests.get("https://api.thecatapi.com/v1/images/search?limit=10&breed_ids=beng&api_key=?api_key")
    if response.status_code == 200:
        data = response.json()
        print(data)
        pprint.pp(data)    #very important functions because it jsonify data: easy to read
        print(data[0])
        print(data["url"])
get_cat()

