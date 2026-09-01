#=========ONE TO MANY RELATIONSHIP=======================================


#To create a relationship, we need foreign key: 
#Foreign key is a primary key from another table

#Since one buyer can buy so many pets, this will be one to many relatinship

from sqlalchemy import create_engine,String,select,ForeignKey
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column
from sqlalchemy.orm import Session,relationship
from typing import List

engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/RELATIONSHIP')

class Base(DeclarativeBase):
  pass

class User(Base):
  __tablename__ = 'users'

  id: Mapped[int] = mapped_column(primary_key=True)
  name : Mapped[str] = mapped_column(String(100), nullable=False)
  email: Mapped[str] = mapped_column(String(100), unique=True)

# #one to Many
  pets: Mapped[List['Pet']] = relationship(back_populates="owner")



class Pet(Base):
  __tablename__ = 'pets'

  id: Mapped[int] = mapped_column(primary_key=True)
  name : Mapped[str] = mapped_column(String(60), nullable=False)
  animal: Mapped[str] = mapped_column(String(100), unique=True)
  user_id: Mapped[int] = mapped_column(ForeignKey("users.id"))
  
  owner: Mapped['User'] = relationship(back_populates='pets')

Base.metadata.create_all(engine)


#Inserting into user name and email
#ATTENTION!: user_id(foreign key of another table is manually assigned)
session = Session(engine)


new_buyer = User(name ="John saba", email="johnsaba@gmail.com")

new_buyer= User(name="Felix Izaac", email="felixisac@gmail.com")

new_buyer = User(name="Ineza Jacob", email="inezajacob@gmail.com")

session.add(new_buyer)
session.commit()


new_pet = Pet(name = "Rhiannon", animal = "dog", user_id=1)

new_pet = Pet(name = "Max", animal = "Monkey", user_id=2)

new_pet = Pet(name = "Jacky", animal = "cat", user_id=3)

session.add(new_pet)
session.commit()

pet = session.get(Pet,3)
print(pet.name)
print(pet.owner.name)

pet = session.get(Pet,5)

print(pet.name)
print(pet.animal)
print(pet.owner.email)
print(pet.owner.name)