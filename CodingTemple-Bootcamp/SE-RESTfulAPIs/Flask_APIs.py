#=====BUILDING API WITH FLASK=========

#======== Introduction to Flask =============
'''
Flask is a lightweight web framework for Python, known for its simplicity and flexibility. It’s used to build web applications, including APIs, and offers tools that help developers easily manage HTTP requests, routing, and database interactions.

In this lesson, we will:

Create a simple API using Flask to interact with a MySQL database.
Use SQLAlchemy, an Object Relational Mapper (ORM), to interact with the database using Python objects.
Leverage Flask Marshmallow to serialize (convert Python objects to JSON) and deserialize (convert JSON to Python objects) data and validate incoming requests.

====== Project Setup ==========
Step 1: Install Necessary Dependencies
We need the following Python packages for this project:

Flask to create the web framework.
SQLAlchemy for database operations.
Flask-Marshmallow for data serialization and validation.
mysql-connector-python to interact with MySQL.


===Definition: A bridge between our front-end users such as UI(User Interface) and back-end(storind data, retriving and manupulating data,).
#API allows us to send requests to the API 
#API have ability to manage those requests by reaching into the data base to grab whatever data requested

====== after setting up virtual environment, these packages will be installed

# Flask to create the web framework.
# SQLAlchemy for database operations.
# Flask-Marshmallow for data serialization and validation.
# mysql-connector-python to interact with MySQL.


#==pip install Flask Flask-SQLAlchemy Flask-Marshmallow mysql-connector-python marshmallow-sqlalchemy=====
#==use== pip lst: TO VERIFY IF THOSE PACKAGES WERE INSTALLED


Setting Up the Flask App and MySQL Connection
Start by configuring the Flask app and connecting it to MySQL:
'''


from flask import Flask,request,jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow
from marshmallow import ValidationError
from sqlalchemy.orm import DeclarativeBase,Mapped, mapped_column, relationship
from sqlalchemy import ForeignKey, Table, String, Column,select
from typing import List


#initializing flask app

app = Flask(__name__)

# MySQL database configuration

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+mysqlconnector://root:Mahirane231995@localhost/FLASK_API'

app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

# SQLAlchemy is initialized with the app to manage database connections.
# Marshmallow is initialized for serialization, deserialization, and validation.

# CREATE BASE CLASS

class Base(DeclarativeBase):
  pass

#initialize extensions
db = SQLAlchemy(model_class=Base)
db.init_app(app)
ma = Marshmallow(app)


#============Models=============

#Association Table or Junction table
user_pet = Table(
  "user_pet",Base.metadata,
  Column("user_id", ForeignKey("users.id")),
  Column("pet_id", ForeignKey("pets.id"))
)

class User(Base):
  __tablename__ = "users"

  id: Mapped[int] = mapped_column(primary_key=True)
  name: Mapped[str] = mapped_column(String(50))
  email: Mapped[str] = mapped_column(String(200))

#CREATING ONE TO MANY RELATIONSHIP
#ONE USER CAN HAVE SO MANY PETS
pets: Mapped[List["Pet"]] = relationship(secondary=user_pet, back_populates="owners")

class Pet(Base):
  __tablename__ = "pets"
  id: Mapped[int] = mapped_column(primary_key=True)
  name: Mapped[str] = mapped_column(String(50))
  animal: Mapped[str] = mapped_column(String(100))

#CREATING ANOTHER ONE TO MANY RELATIONSHIP
#CONNECTING ONE PET CANHAVE MANY USERS

owners: Mapped[List["User"]] = relationship(secondary=user_pet, back_populates="pets")



#==================SETTING UP SCHEMAS====================

'''
app.py
Defining Marshmallow Schemas
We use Marshmallow schemas to define how to serialize and deserialize our models into JSON, as well as to validate incoming data.
# Serialization: Converting our python objects into JSON
# Deserialization: Converting JSON into python dictionaries
# Validation: Ensuring the JSON included in the request has valid data, required to make our Model Objects User Schema
'''


class UserSchema(ma.SQLAlchemyAutoSchema):
    class Meta:
        model = User
        
# Pet Schema
class PetSchema(ma.SQLAlchemyAutoSchema):
    class Meta:
        model = Pet
       
       
# Initialize Schemas
user_schema = UserSchema()
users_schema = UserSchema(many=True) #Can serialize many User objects (a list of them)
pet_schema = PetSchema()
pets_schema = PetSchema(many=True)


#==============CREATING ROUTES===============
# Creating API Endpoints
# Now, we will define the CRUD operations for User and create endpoints for associating Pet with User while testing our endpoints with Postman.

#=====CREATE A USER ======
@app.route('/users', methods=['POST'])

def create_user():
    try:
        user_data = user_schema.load(request.json)
    except ValidationError as e:
        return jsonify(e.messages), 400
    
    new_user = User(name=user_data['name'], email=user_data['email'])
    db.session.add(new_user)
    db.session.commit()
    
    return user_schema.jsonify(new_user),201


#===READ users =========



@app.route('/users', methods=['GET'])
def get_users():
    query = select(User)
    users = db.session.execute(query).scalars().all()

    return users_schema.jsonify(users), 200
   

'''
Explanation:
# @app.route('/users', methods=['GET']): Defines a GET route at the /users endpoint to retrieve all users.
# select(User): Constructs a SQL query to select all records from the User table.
# db.session.execute(query).scalars().all(): Executes the query and retrieves all user records from the database as a list.
# users_schema.jsonify(users): Serializes the list of users into JSON format.
# Returns the list of users with a 200 status code indicating success.
'''


#=====READ individual user =========


@app.route('/users/<int:id>', methods = ['GET'])

def get_user(id):
   user = db.session.get(User,id)
   return user_schema.jsonify(user),200

'''
# @app.route('/users/<int:id>', methods=['GET']): Defines a GET route at /users/<id> to fetch a user by their unique ID.
# db.session.get(User, id): Queries the database to retrieve the user object based on the provided id.
# The user data is serialized using user_schema.jsonify(user) to return the user object in JSON format.
# The route responds with a 200 status code indicating a successful operation.
'''

#======UPDATE Individual user information ==========


@app.route('/users/<int:id>', methods = ['PUT'])

def update_user(id):
   user = db.session.get(User,id)

   if not user:
      return jsonify({"message":"Invalid user id"}),400
   try:
      user_data = user_schema.load(request.json)
   except ValidationError as e:
      return jsonify(e.messages),400
   
   user.name = user_data['name']
   user.email = user_data['email']

   db.session.commit()
   return user_schema.jsonify(user),200


'''
 Explanation:
# @app.route('/users/<int:id>', methods=['PUT']): Defines a PUT route at /users/<id> to update a user by ID.
# db.session.get(User, id): Retrieves the user with the specified id from the database.
# If no user is found, returns a 400 status with an error message.
# Attempts to load updated data from the request (user_schema.load(request.json)), handles validation errors.
# Updates the user's name and email fields, commits changes, and returns the updated user in JSON format with a 200 status code.
'''

#=====DELETING A USER ==========

@app.route('/users/<int:id>', methods = ['DELETE'])

def delete_user(id):
   user = db.session.get(User,id)

   if not user:
      return jsonify({"message":"Invalid user id"})
   
   db.session.delete(user)
   db.session.commit()
   return jsonify({"message":f"Successfully deleted user {id}"}),200


'''
# Explanation:

# @app.route('/users/<int:id>', methods=['DELETE']): Defines a DELETE route at /users/<id> to remove a user by their unique ID.
# db.session.get(User, id): Fetches the user from the database by their ID.
# Checks if the user exists. If not, it returns a 400 response with an error message.
# If the user exists, the user is deleted using db.session.delete(user) and changes are committed to the database.
# Returns a success message and a 200 status code.
'''



#================ADDING pet information to the DATABASE===========

@app.route('/pets', methods = ['POST'])

def create_pet():
   try:
      pet_data = pet_schema.load(request.json)
   except ValidationError as e:
      return jsonify(e.messages),400
   new_pet = Pet(name=pet_data["name"], animal=pet_data["animal"])
   db.session.add(new_pet)
   db.session.commit()

   return pet_schema.jsonify(new_pet),201


#===READ pets =========

@app.route('/pets', methods=['GET'])
def get_pets():
    query = select(Pet)
    pets = db.session.execute(query).scalars().all()

    return users_schema.jsonify(pets), 200

#=====READ individual pet =========

@app.route('/pets/<int:id>', methods = ['GET'])

def get_pet(id):
   pet = db.session.get(Pet,id)
   return user_schema.jsonify(pet),200


#==========Add pet to user============


@app.route('/users/<int:user_id>/add_pet/<int:pet_id>', methods=['GET'])
def adopt_pet(user_id, pet_id):
    user = db.session.get(User, user_id)
    pet = db.session.get(Pet, pet_id)

    user.pets.append(pet)
    db.session.commit()
    return jsonify({"message": f"{user.name} adopted the {pet.animal}, {pet.name}!"}), 200


"""
Explanation:

# @app.route('/users/<int:user_id>/add_pet/<int:pet_id>', methods=['GET']): Defines a GET route where a user can adopt a pet, identified by their respective IDs.
# db.session.get(User, user_id) and db.session.get(Pet, pet_id): Retrieves the user and pet from the database based on their IDs.
# user.pets.append(pet): Adds the pet to the user's list of pets.
# Commits the change to the database.
# Returns a success message, including the users and pets names, with a 200 status code.
"""


#Associate multiple pets with a user

@app.route('/users/<int:user_id>/add_pets', methods=['POST'])
def add_pets(user_id):
    user = db.session.get(User, user_id)
    pet_data = request.json

    for id in pet_data['pet_ids']:
        pet = db.session.get(Pet, id)
        user.pets.append(pet)
        db.session.commit()

    return jsonify({"message": "All pets added!"}), 200

"""
Explanation:
# @app.route('/users/<int:user_id>/add_pets', methods=['POST']): Defines a POST route where a user can adopt multiple pets.
# db.session.get(User, user_id): Retrieves the user from the database based on their ID.
# pet_data = request.json: Extracts the pet IDs from the incoming JSON request.
# Iterates over the pet_ids, retrieves each pet, and adds it to the user's pets.
# Commits the changes after each pet is added.
# Returns a success message with a 200 status code.
#show user pets
"""

@app.route('/users/my-pets/<int:user_id>/add_pets', methods=['GET'])

def my_pets(user_id):
   user = db.session.get(User.user_id)
   return pets_schema.jsonify(user.pets),200

"""
Explanation:
# @app.route('/users', methods=['POST']): This defines a POST route at the /users endpoint to create a new user.
# request.json: Retrieves the JSON data from the incoming request.
# user_schema.load(request.json): Uses Marshmallow to validate and deserialize the incoming JSON into a user object.
# ValidationError: Catches validation errors and returns a 400 status with error messages if invalid data is provided.
# User(): Creates a new User object with the validated data.
# db.session.add(new_user), db.session.commit(): Adds and saves the new user to the database.
# user_schema.jsonify(new_user): Returns the newly created user in JSON format with a 201 status.
"""

#NEXT, Postman NOW can be used to test this API created


if __name__ == "__main__":

  with app.app_context():
      # db.drop_all()
      db.create_all()

  app.run(debug=True)

