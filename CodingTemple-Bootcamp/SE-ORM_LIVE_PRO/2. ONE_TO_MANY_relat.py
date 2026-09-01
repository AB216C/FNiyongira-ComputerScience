#========ONE TO MANY RELATIONSHIP=============
# import requests
# def get_pokemon(pokemon):
#   response = requests.get(f'https://pokeapi.co/api/v2/pokemon/{pokemon}')

from sqlalchemy import create_engine
from sqlalchemy import String, DateTime, func, select, Date, ForeignKey, Table, Column
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column, Session,relationship
from datetime import date
from typing import List


#one to many relationships
#one instructure can be on many workshops

engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/LIVECLASS')


class Base(DeclarativeBase):
  pass

class Workshop(Base):
  __tablename__ = 'workshops'
     #this is python part       #this is sql part
  workshop_id:Mapped[int] = mapped_column(primary_key=True)
  name:Mapped[str] = mapped_column(String(50), nullable=False)
  date_:Mapped[date] = mapped_column(Date, nullable=False)
  instructor_id : Mapped[int] = mapped_column(ForeignKey('sqlalchemy_instructors.instructor_id'))  #This will set up connection
  created_at = mapped_column(DateTime, default=func.now())
  updated_at = mapped_column(DateTime,default=func.now(), onupdate=func.now())
#To full connect tables object is created. Instructors backpopulating to workshops object. Backpopulate connect relationship for both instructors and worshop.
  instructors : Mapped["SQLAlchemy_Instructors"] = relationship(back_populates="workshops")

#For one to many relationship we need more than one table
#Let's create instructor table
#To connect both tables we use "ForeignKey and relationship"
#We will then put ForeignKey in a table that is on the many side which is workshop because 
#one instructor can be on many workshops. We add instructor id in a workshop table.

class SQLAlchemy_Instructors(Base):
  __tablename__ = 'sqlalchemy_instructors'
     #this is python part       #this is sql part
  instructor_id:Mapped[int] = mapped_column(primary_key=True)
  name:Mapped[str] = mapped_column(String(100), nullable=False)
  department:Mapped[str] = mapped_column(String(100), nullable=False)
  created_at = mapped_column(DateTime, default=func.now())
  updated_at = mapped_column(DateTime,default=func.now(), onupdate=func.now())
#Another object is created in instructor table to full connect both tables
#List was used to mean to tie the instructor id on a list of workshops
  workshops : Mapped[List["Workshop"]] = relationship(back_populates = "instructors")

Base.metadata.create_all(engine)
session = Session(engine)

#From here, you can access any data from both tables at the same time using python codes without
#using join functions from sql
#Let's now add data to the tables though instanciation process

Yessica = SQLAlchemy_Instructors(name = "Yessica", department = "SSM")
Whiteboard_Wednesdays = Workshop(name = "Whiteboard", date_ = "2025-01-22")
Codewars_Saturday = Workshop(name = "Codewars", date_ = "2025-01-25")

# Yessica.workshops.append(Whiteboard_Wednesdays)
# Yessica.workshops.append(Codewars_Saturday)

# session.add(Yessica)
# session.add(Whiteboard_Wednesdays)
# session.add(Codewars_Saturday)

# session.commit()

#Let's query database data from python

query = select(SQLAlchemy_Instructors).where(SQLAlchemy_Instructors.name == "Yessica")

yessica_workshops = session.execute(query).scalars().all()

# for workshop in yessica_workshops:
#   print(workshop.name)
#   print(workshop.workshops[0].name)
#   print(workshop.workshops[1].name)


query = select(Workshop)

all_workshops = session.execute(query).scalars().all()

for workshop in all_workshops:
  # print(workshop.name)
  # print(workshop.instructors.name)
  print(workshop.name,workshop.updated_at)











