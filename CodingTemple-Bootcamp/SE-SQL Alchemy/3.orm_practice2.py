from sqlalchemy import create_engine,String,select
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column
from sqlalchemy.orm import Session

engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/intro_orm')


class Base(DeclarativeBase):
  pass

class User(Base):
  __tablename__ = 'vendors'

  id: Mapped[int] = mapped_column(primary_key=True)
  name : Mapped[str] = mapped_column(String(60), nullable=False)
  email: Mapped[str] = mapped_column(String(100), unique=True)


Base.metadata.create_all(engine)

#INSERTING DATA:from sqlalchemy.orm import Session

session = Session(engine)

new_vendor = User(name = 'Ferdinand T', email='ferdt@yahoo.com')
session.add(new_vendor)
session.commit()

new_vendor = User(name = 'James Bond', email='jamesB@yahoo.fr')
session.add(new_vendor)
session.commit()

new_vendor = User(name = 'Jacky Chan', email='jackyc@gmail.com')
session.add(new_vendor)
session.commit()

new_vendor = User(name = 'John Sam', email='johns@gmail.com')
session.add(new_vendor)
session.commit()

# SELECTING DATA: from sqlalchemy import select

query = select(User)
vendors = session.execute(query).scalars().all()

for vendor in vendors:
  print(f" The full name will be: {vendor.name}, while the email will be: {vendor.email}")

#Filter Data(SQL Wheere):

query = select(User).where(User.name=='James Bond')
vendor = session.execute(query).scalars().first()
print(vendor.name)

#Filter with complex query filter()-code not working

vendors = session.query(User).filter(User.name.like('A%')).all()
for vendor in vendors:
  print(vendor)

#UPDATE DATA  (SQL UPDATE)

query = select(User).where(User.id==1)
user = session.execute(query).scalars().first()

user.name = 'Alicia Josh'
user.email = 'alijosh@gmail.com'

session.commit()

#Delete Data(SQL DELETE)

query = select(User).where(User.id==3)

vendor = session.execute(query).scalars().first()

session.delete(vendor)
session.commit()

query = select(User)
vendors = session.execute(query).scalars().all()

for vendor in vendors:
  print(f" The full name will be: {vendor.name}, while the email will be: {vendor.email}")

#Another way to select all and retrieve data[SPECIFIC SELECTION]

vendor = session.get(User,1)
print(vendor.name)
print(vendor.email)

# #DELETING 
vendor = session.get(User,1)
session.delete(vendor)
session.commit()

# #UPDATING

vendor = session.get(User,1)
vendor.name = 'Joseph Matata'
session.commit()

#CREATING RELATIONSHIP WITH ORM



