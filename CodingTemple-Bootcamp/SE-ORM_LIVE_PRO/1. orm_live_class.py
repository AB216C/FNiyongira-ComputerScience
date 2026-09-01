from sqlalchemy import create_engine
from sqlalchemy import String, DateTime, func, select, Date
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column, Session
from datetime import date


engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/LIVECLASS')


class Base(DeclarativeBase):
  pass

class Workshop(Base):
  __tablename__ = 'workshops'
     #this is python part       #this is sql part
  workshop_id:Mapped[int] = mapped_column(primary_key=True)
  name:Mapped[str] = mapped_column(String(50), nullable=False)
  date_:Mapped[date] = mapped_column(Date, nullable=False)
  created_at = mapped_column(DateTime, default=func.now())
  updated_at = mapped_column(DateTime,default=func.now(), onupdate=func.now())


Base.metadata.create_all(engine)

#Using session to communcate between python and sql
#Using session is like git. helps to add, delete, and commit changes to the database
#This is also like opening cart on online shop session. 
# You can add, remove, and after session is done, you proceed with purchase and session is ended

session = Session(engine)

#Let's add the first row on the table called whiteboard

# Whiteboard = Workshop(name="Whiteboard", date_="2025-01-22")
# Codewars = Workshop(name = "Codewars", date_="2025-01-22")
# session.add(Codewars)
# session.commit()

#using a query to retrieve database
#This is the main query
query = select(Workshop)

#SELECTING ALL WORKSHOPS
all_workshops = session.execute(query).scalars().all()
#Now all workshops information is selected
#we can use a for loop to access individual information in python
# for workshop in all_workshops:
  # print(workshop.name)
  # print(workshop.workshop_id,workshop.name)
  # print(workshop.date_, workshop.name)
  # print(workshop.created_at,workshop.name,workshop.updated_at)

#what is only whiteboard information are needed?

# whiteboard_only = session.query(Workshop).filter(Workshop.name.like('%white%')).all()

# for workshop in whiteboard_only:
#   print(workshop.name, workshop.date_, workshop.workshop_id,workshop.created_at)

#using where

# query = select(Workshop).where(Workshop.workshop_id == 2)

# specific_workshop = session.execute(query).scalars().first()
# specific_workshop.name = "Problem Solving"
# session.commit()

#
# Python = Workshop(name = "Python", date_="2025-01-22")
# session.add(Python)
# session.commit()

# for workshop in all_workshops:
#   # print(workshop.date_, workshop.name)
#   print(workshop.name, workshop.date_, workshop.workshop_id,workshop.created_at)

#deleting a row in the table/deleting added workshop information
# query = select(Workshop).where(Workshop.workshop_id==3)
# specific_workshop =session.execute(query).scalars().first()

# session.delete(specific_workshop)
# session.commit()


for workshop in all_workshops:
  print(workshop.name, workshop.date_, workshop.workshop_id,workshop.created_at)

session.close()


