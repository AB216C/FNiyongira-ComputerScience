#===========MANY TO MANY RELATIONSHIP========================

from sqlalchemy import create_engine
from sqlalchemy import String, DateTime, func, select, Date, ForeignKey, Table, Column
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column, Session,relationship
from datetime import date
from typing import List

#For many TO MANY RELATIONSHIP, 3rd table need to come in place called students
#Because many students can attend many workshops and many workshops can be attanded by many students
#Joint table has to be created
#Connections between workshops and students table will need to be created as were created for one to many relationship
engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/LIVECLASS')

class Base(DeclarativeBase):
  pass

class Workshop(Base):
  __tablename__ = 'workshops'
  workshop_id:Mapped[int] = mapped_column(primary_key=True)
  name:Mapped[str] = mapped_column(String(50), nullable=False)
  date_:Mapped[date] = mapped_column(Date, nullable=False)
  instructor_id : Mapped[int] = mapped_column(ForeignKey('sqlalchemy_instructors.instructor_id'))  #This will set up connection
  created_at = mapped_column(DateTime, default=func.now())
  updated_at = mapped_column(DateTime,default=func.now(), onupdate=func.now())
  instructors : Mapped["SQLAlchemy_Instructors"] = relationship(back_populates="workshops")
#Connecting workshops table to students table:Many to many relationship
  students: Mapped[List["SQLAlchemy_Students"]] =relationship(back_populates="workshops", secondary="student_workshops")
class SQLAlchemy_Instructors(Base):
  __tablename__ = 'sqlalchemy_instructors'
  instructor_id:Mapped[int] = mapped_column(primary_key=True)
  name:Mapped[str] = mapped_column(String(100), nullable=False)
  department:Mapped[str] = mapped_column(String(100), nullable=False)
  created_at = mapped_column(DateTime, default=func.now())
  updated_at = mapped_column(DateTime,default=func.now(), onupdate=func.now())
  workshops : Mapped[List["Workshop"]] = relationship(back_populates = "instructors")

class SQLAlchemy_Students(Base):
  __tablename__ = 'sqlalchemy_students'
  student_id : Mapped[int] = mapped_column(primary_key = True)
  name : Mapped[str] = mapped_column(String(100), nullable=False)
  enrollment_date : Mapped[date] = mapped_column(Date)
  created_at = mapped_column(DateTime,default=func.now())
  updated_at = mapped_column(DateTime, default=func.now(),onupdate = func.now())
#Connecting workshops table to students table:Many to many relationship
  workshops: Mapped[List["Workshop"]] = relationship(back_populates = "students", secondary="student_workshops")

student_workshops = Table(
  "student_workshops",
  Base.metadata,
  Column("workshop_id",ForeignKey('workshops.workshop_id')),
  Column("student_id", ForeignKey('sqlalchemy_students.student_id'))
)

Base.metadata.create_all(engine)
session = Session(engine)


#From here, you can access any data from both tables at the same time using python codes without
#using join functions from sql
#Let's now add data to the tables student, instructors, and workshop though instanciation process


#Adding instructor to instructors table
Yessica = SQLAlchemy_Instructors(name = "Yessica", department = "SSM")
#Adding workshops to workshop table
Whiteboard_Wednesdays = Workshop(name = "Whiteboard", date_ = "2025-01-22")
Codewars_Saturday = Workshop(name = "Codewars", date_ = "2025-01-25")
#Adding students to students table
Bill = SQLAlchemy_Students(name = "Bill", enrollment_date = "2025-01-24")
Ted = SQLAlchemy_Students(name = "Ted", enrollment_date = "2025-01-24")

#creating connection between workshops and instructor
Yessica.workshops.append(Whiteboard_Wednesdays)
Yessica.workshops.append(Codewars_Saturday)

#creating connection between workshops and students: Adding works shopps to students
Bill.workshops.append(Whiteboard_Wednesdays)
Bill.workshops.append(Codewars_Saturday)
Ted.workshops.append(Whiteboard_Wednesdays)

##creating connection between workshops and students: Adding students to the workshops
Whiteboard_Wednesdays.students.append(Bill)
Whiteboard_Wednesdays.students.append(Ted)
Codewars_Saturday.students.append(Bill)

# #Finalizing the adding session
# session.add(Yessica)
# session.add(Whiteboard_Wednesdays)
# session.add(Codewars_Saturday)

# session.add(Bill)
# session.add(Ted)
# session.add(Whiteboard_Wednesdays)
# session.add(Codewars_Saturday)

# session.commit()
# session.close()


query = select(student_workshops)

#this is any variable

# workshops = session.execute(query).scalars().all()
# print(workshops)

for workshop in Bill.workshops:
  # print(workshop.name, workshop.date_, workshop.instructors.name)
  print(workshop.name, workshop.date_, workshop.instructors.workshops)

