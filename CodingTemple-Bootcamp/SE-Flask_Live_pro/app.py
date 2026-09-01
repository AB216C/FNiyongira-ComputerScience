
'''
Everthing that run on internet involves API
Big corporation use API so you can get certain information, update the database
API communicate by sending JSON

#Websites that gives you api to work on: thecatapi.com/thanks
#pokeapi.co
#ACTIVATE VIRTUAL ENVIRONMENT
#==source venv/bin/activate====
#INSTALL REQUIRED TOOLS
#===pip3 install Flask Flask-SQLAlchemy Flask-Marshmallow mysql-connector-python marshmallow-sqlalchemy python-dotenv
#Python is not limited to just flask. DJANGO   #ANOTHER TOOL FOR PYTHON THAT WORKS LIKE FLASK
#CRUD => { get = READ, post = CREATE, put = UPDATE, delete = DELETE  }
=========endpoints => users:
           #POST
           #PUT
           #GET
           #DELETE
STATUS CODES => 200, 201, 401, 404, 500
RUN pip freeze > requirements.txt
'''
from flask import Flask, request, jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow
from sqlalchemy.orm import DeclarativeBase,Mapped, mapped_column, relationship
from sqlalchemy import Table, Column, ForeignKey, String
from marshmallow_sqlalchemy import SQLAlchemyAutoSchema
from marshmallow import fields, ValidationError
from typing import List, Optional
from dotenv import load_dotenv
import os

app = Flask(__name__)
load_dotenv()

app.config['SQLALCHEMY_DATABASE_URI'] = os.getenv('SQLALCHEMY_DATABASE_URI')
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = os.getenv('SQLALCHEMY_TRACK_MODIFICATIONS')

'''
Next step is to instanciate SQLAlchemy class and Marshmallow class
Next initialize database
Next configure the above app to run successfully
CREATE env file
Connect =="env file"== to the== "app.py file" == by importing os and load_dotenv
Next step is creating association table between Pokemon and trainer. Since many trainer can have many pokemon
and many pokemon can have many trainer, many to many relationship will be applied here two foreign keys will be
 created in the association table
Create both trainer and pokemon table
create both schema for both tables
Next is to instanciate schemas

'''

class Base(DeclarativeBase):
  pass

db = SQLAlchemy(model_class=Base)
db.init_app(app)
ma = Marshmallow(app)

'''
Flask application has been created and by hitting "flask run", the Flask application starts running
TODO: Create a connection between flask application and mysql server
TODO: Develop my Pokemon class/Table
TODO: Develop my Trainer class/Table
TODO: CREATE the association table because of many to many relationship
TODO: Develop schema for Pokemon Class
TODO: Develop schema for Trainer Class
TODO: Develop CRUD operations for Trainer
     - POST
     - GET 
     - UPDATE
     - DELETE
TODO: Develop CRUD operations for Pokemon
     - POST
     - GET 
     - UPDATE
     - DELETE

'''


# trainer_pokemon = Table(
#   "trainer_pokemon",
#   Base.metadata,
#   Column("trainer_id", ForeignKey("trainers.trainer_id")),
#   Column("pokemon_id", ForeignKey("pokemon.pokemon_id"))
# )

# class Trainer(Base):
#   __tablename__ = "trainers"

#   trainer_id : Mapped[int] = mapped_column(primary_key=True)
#   name : Mapped[str] = mapped_column(String(60))
#   email : Mapped[str] = mapped_column(String(200))

#   pokemon : Mapped[List["Pokemon"]] = relationship(secondary = trainer_pokemon, back_populates="trainers")

  
# class Pokemon(Base):
#   __table__ = "pokemon"

#   pokemon_id : Mapped[int] = mapped_column(primary_key=True)
#   name : Mapped[str] = mapped_column(String(60))
#   type : Mapped[str] = mapped_column(String(200))

#   trainer : Mapped[List["Trainer"]] = relationship(secondary = trainer_pokemon, back_populates="pokemon")


# Association Table
user_pet = Table(
    "user_pet",
    Base.metadata,
    Column("user_id", ForeignKey("users.id"), primary_key=True),
    Column("pet_id", ForeignKey("pets.id"), primary_key=True)
)

# Models
class User(Base):
    __tablename__ = "users"
    id: Mapped[int] = mapped_column(primary_key=True)
    name: Mapped[str] = mapped_column(String(30), nullable=False)
    email: Mapped[Optional[str]] = mapped_column(String(200))
    #One-to-Many relationship from this User to a List of Pet Objects
    pets: Mapped[List["Pet"]] = relationship("Pet", secondary=user_pet, back_populates="owners")

class Pet(Base):
    __tablename__ = "pets"
    id: Mapped[int] = mapped_column(primary_key=True)
    name: Mapped[str] = mapped_column(String(200), nullable=False)
    animal: Mapped[str] = mapped_column(String(200), nullable=False)
    
    # One-to-Many relationship, One pet can be related to a List of Users
    owners: Mapped[List["User"]] = relationship("User", secondary=user_pet, back_populates="pets")


app.py

# User Schema
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

#Creating user
@app.route('/users', methods=['POST'])
def create_user():
    try:
        user_data = user_schema.load(request.json)
    except ValidationError as e:
        return jsonify(e.messages), 400
    
    new_user = User(name=user_data['James Bond'], email=user_data['jamesbond@gmail.com'])
    db.session.add(new_user)
    db.session.commit()

    return user_schema.jsonify(new_user), 201


# class PokemonSchema(SQLAlchemyAutoSchema):
#   class Meta:
#     model = Pokemon
#     include_fk = True
#     include_relationships = True
#     load_instance = True
# #     '''
# #     Incase "SQLALCHEMYAUTOSCHEMA" DOESN'T WORK, YOU CAN USE, "SCHEMA)
# #     pokemon_id = fields.Int()
# #     name = fields.Str()
# #     type = fields.str()

# #     class Meta:
# #          fields = ("pokemon_id", "name", "type")
# #     '''

# class TrainerSchema(SQLAlchemyAutoSchema):
#   class Meta:
#     model = Trainer
#     include_fk = True
#     include_relationships = True
#     load_instance = True


# trainer_schema = TrainerSchema()
# trainer_schema = TrainerSchema(many = True)

# pokemon_schema = PokemonSchema()
# pokemon_schema = PokemonSchema(many = True)


@app.route('/')

def home():
  return "Hello World"

if __name__ == "__main__":
    with app.app_context():
        db.create_all()
    
    app.run(debug=True)

    

