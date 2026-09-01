#======MANY TO MANY=========

#TO create a many to many relatinship ship, a junction table will need to be created

from sqlalchemy import create_engine,String,select,ForeignKey,Table,Column
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column
from sqlalchemy.orm import Session,relationship
from typing import List

engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/MANY_TO_MANY')

class Base(DeclarativeBase):
  pass

#===1. CREATING JOIN TABLE
user_pet = Table(
  "user_pet",
  Base.metadata,
  Column("user_id", ForeignKey("users.id")),
  Column("pet_id", ForeignKey("pets.id")))


class User(Base):
  __tablename__ = 'users'

  id: Mapped[int] = mapped_column(primary_key=True)
  name : Mapped[str] = mapped_column(String(100), nullable=False)
  email: Mapped[str] = mapped_column(String(100), unique=True)

#===2.#one to Many: Changing owner to owners
#===3. Adding secondary table of "user_pet" to connect user to pet table
  pets: Mapped[List['Pet']] = relationship(secondary=user_pet, back_populates="owners")


#===4. Delete Pet's foreign Key from ONE TO MAY
class Pet(Base):
  __tablename__ = 'pets'

  id: Mapped[int] = mapped_column(primary_key=True)
  name : Mapped[str] = mapped_column(String(60), nullable=False)
  animal: Mapped[str] = mapped_column(String(100), unique=True)
 
  # user_id: Mapped[int] = mapped_column(ForeignKey("users.id"))

  owners: Mapped[List['User']] = relationship(secondary=user_pet, back_populates='pets')


Base.metadata.create_all(engine)


session = Session(engine)

#INSERTING DATA INTO TABLES

dylan = User(name = "Dylan", email= "dkatina@email.com")
grace = User(name= "Grace", email="gkat@email.com")

rhia = Pet(name="Rhiannon", animal="dog")
leafy = Pet(name="Leafy", animal="Chia Pet")

session.add(dylan)
session.add(grace)
session.add(rhia)
session.add(leafy)
session.commit()

#CREATING MANY TO MANY RELATIONSHIP BY
#ADDING IDs options to the JUNCTION TABLE user_pet TABLE AS SHOWN IN THE SCREENSHOT TABLE

dylan = session.get(User,1)
grace = session.get(User,2)

rhia = session.get(Pet,1)
leafy = session.get(Pet,2)


# Junctions were created with a list. Have ability to keep many pets objects
# Thus append is used to keep created objects
# 
dylan.pets.append(rhia)
grace.pets.append(leafy)

# NB: After appending anything to the list. Calling specific item will require to use index[n] only

# session.commit()

print(dylan.pets[0].name)
print(rhia.owners.email)
print(leafy.owners.name)
print(rhia.owners.name)
print(dylan.pets[0].name)
print(grace.pets[0].name)


#Adding rhia to grace list as well

rhia.owners.append(grace)
session.commit()

#Adding leafy to dylan list as well

leafy.owners.append(dylan)
session.commit()


print(dylan.pets[0].name)
print(dylan.pets[1].name)
print(rhia.owners[0].name)
print(rhia.owners[1].name)
print(leafy.owners[0].name)
print(leafy.owners[1].name)
print(grace.pets[0].name)
print(grace.pets[1].name)