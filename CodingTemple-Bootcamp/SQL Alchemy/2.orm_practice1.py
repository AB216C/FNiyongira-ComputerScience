
#1. Install SQLAlchemy 2.0 Need to be installed before starting a project
# With the virtual environment active, install SQLAlchemy:

#==== run this code "pip install sqlalchemy" ==================================
# 2. Install MySQL Connector

# To connect to our MySQL Database we'll also need the MySQL Connector package:

#==========run this code pip install mysql-connector-python ====================

from sqlalchemy import create_engine,String,select,ForeignKey
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column
from sqlalchemy.orm import Session,relationship
from typing import List

engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/ORM')


class Base(DeclarativeBase):
  pass

class Market(Base):
  __tablename__ = 'buyers'

  id: Mapped[int] = mapped_column(primary_key=True)
  name : Mapped[str] = mapped_column(String(60), nullable=False)
  email: Mapped[str] = mapped_column(String(100), unique=True)


# #To connect SQL codes to Database
session = Session(engine)

# #Inserting into user name and email


new_buyer = Market(name ="John saba", email="johnsaba@gmail.com")

new_buyer= Market(name="Felix Izaac", email="felixisac@gmail.com")

new_buyer = Market(name="Ineza Jacob", email="inezajacob@gmail.com")


session.add(new_buyer)
session.commit()

query = select(Market)
buyers = session.execute(query).scalars().all()

for buyer in buyers:
  print(buyer.email)
  print(buyer.name)


# #SELECT A SPECIFIC USER USING WHERE CLAUSE

query = select(Market).where(Market.name=='Felix Izaac')
user = session.execute(query).scalars().first()
print(user.email)

# #SELECT THE SAME USER USING ID, NOT OTHER FIELD WE USE GET

query =session.get(Market,1)
print(query.name)
print(query.email)

#UPDATING RECORDS

query = session.get(Market, 2)
query.name = 'Jean Paul'

session.commit()

print(query.name)
print(query.email)

#Adding new buyer to buyers table

# new_buyer = Market(name="Ineza Jeremy", email="inezajeremy@gmail.com")

session.add(new_buyer)
session.commit()

#DELETING THE FIRST BUYER

query = session.get(Market,1)
session.delete(query)
session.commit()



