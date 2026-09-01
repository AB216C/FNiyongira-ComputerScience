from sqlalchemy import create_engine
from sqlalchemy import String, DateTime, func, select, Date
from sqlalchemy.orm import DeclarativeBase, Mapped, mapped_column, Session
from datetime import date



engine = create_engine('mysql+mysqlconnector://root:Mahirane231995@localhost/LIVECLASS')

class Base(DeclarativeBase):
  pass  #main goal  this class is to save the metadata namely tables and columns

class Workshop(Base):
  __tablename__ ="workshops"   #This is a table name
  #creating and designing columns

     #Python side              #SQL SIDE
  workshop_id: Mapped[int] = mapped_column(primary_key = True)
  name: Mapped[str] = mapped_column(String(30), nullable=False)
  date_: Mapped[date] = mapped_column(Date, nullable=False)
  created_at= mapped_column(DateTime,default=func.now())
  updated_at = mapped_column(DateTime, default = func.now(), onupdate=func.now())    #The func.now() work as current_time stamp

#All these define our table

Base.metadata.create_all(engine)    #connecting base class to the sql bench



