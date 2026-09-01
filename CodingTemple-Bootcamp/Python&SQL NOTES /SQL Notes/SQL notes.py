#Database Fundamentals
#Databases are the essential systems for storing managing, and retrieving large amount of data super
#  efficiently.

#They are foundation in many applications from e-commerce and banking to social media and data analytics
#Databases, types of data bases, and how to handle data in organized and structured manner

#Database: Collection of data, stored, and accessed electronically that allows efficient management, retrieval and manupulation of information
#Databases: Designed to handle large volume of data in a structured format, making it easy to store, retrieve, update, and delete information


#KEY CONCEPTS:
#1. Structured Data Storage: Involves tables where data are store in rows and columns
#2. Table: A collection of related data entries strctured in rows and columns
#rows: Each row in a table represent a single entry in a table or a record
#column: Each column represent attributes of data
#Data Base Management System(DBMS): Softwares that allow users to interect with data bases
#Those softwares include MySQL, PostgresQL, Mango DB, Oracle
# 3. Data Integrity and Security: Databases ensure Data Integrity by enforcing rules on types of data that can be entered
# Data bases provide various level of data security by ensuring that unauthorized users can access or alter the data
#Types of Data Bases:
#a. Relational databases: Store data in structured tables with rows and columns. The relationship between data is 
#maintained using primary keys and foreign keys. Common Examples MySQL and PostgreSQL
#b. Non-relational Databases(NoSQL): Store data in flexible, unstructured way, such as documents, key-value pairs, or graphs.
#Common examples include MangoDB and Redis


#4. Common Database Operation
#a. create-add new record
#b. Read - Retrieve data from database
#c. Update - Modify existing data
#e. Delete - Remove data(outdated record)

#Realworld examples of Data Bases
#1. E-commerce platforms: Uses a large database to store product information, useraccounts, orders, and inventory
#2. Banking Systems: Use databases to manage customer accounts, transactions, loans, and financial data, ensuring security and integrity
#3. Social media: Facebook or Instagrams Use data bases to store user profiles, posts, comments and friendlists


#RATIONAL DATABASES(SQL DATABASES)

#Tables connected with each other through a relationships defined by primary key and foreign keys
#1. Data Model:Data stored in tables
#2. Query Language: They use structured query language to interact with database
#3. Acid compliance: Follow ACID propertis: Atomicity, Consistency, Isolation, and Durability: These ensure reliable and consistent transaction
#4. Use Case: Suitable or applications requring structured and complex querries(Banking system, e-commerce, ERP)
#NON-RATIONAL DATABASES(NoSQL DATABASES)
#1. Data Model: Do not require fixed schema. Data are often more flexible like JASON documents,key value pairs, or graphs
#2. Query language: Language varies depending on NoSQL Databases. For example, MangoDB allows for querries using JSON
#Whike keyvalue pairs may use specific API-based querries
#3. BASE model: NoSQL databases often follow the BASE model-Basically availble, soft state
#4. Use Case: Ideal for applications dealing with large volume of unstructured or semi-structured data, real-time application, and big data
#Examples: IoT applications, Social media applications, real time analytics

#Types of Non-relational databases:
# Document based data bases(ManagoDB)
#Key_value pairs(Redis)
#COlumn-family stores:Stores columns instead of rows(optimized for reading and writing large datasets) eg Cassandra
#Graph Data bases:Store data as nodes. Suitable for application where relationship between entities is important. EG NeO4

# SQL VS NoSQL

#Feature    Relational Databases (SQL)  Non-Relational Databases (NoSQL)
# 1. Data Model 
# Tables with rows and columns (relational)

# Varies: documents, key-value, column-family, or graphs (non-relational)

# 2. Schema 
# Fixed schema, predefined tables and columns

# Flexible schema, dynamic data structures

# 3. Query Language 
# Structured Query Language (SQL)

# Varies by type (e.g., JSON for document stores, API for key-value)

# 4.ACID Compliance 
# Full ACID compliance (strict consistency)

# BASE model (eventual consistency, high availability)

# 5.Scalability 
# Vertical scalability (scaling up by increasing server resources)

# Horizontal scalability (scaling out by adding more servers)

# 6.Use Cases   
# Structured data, complex queries, transactional systems

# Unstructured or semi-structured data, real-time applications, large-scale data handling

# Examples  
# MySQL, PostgreSQL, Oracle

# MongoDB, Cassandra, Redis, Neo4j


# ENTITY RELATIONSHIP DIAGRAMS FOR RELATIONAL DATABASAES[ERDs]

#ERD: Entity Relationship Diagram
#Components of ERD

# 1. Entities
# An entity represents a database table. Each entity contains attributes (columns) that store specific information about the data in that table.

# Example: In an e-commerce system, you might have entities like:
# Customer: Stores customer information such as name, email, and address.
# Order: Stores information about a customer’s order, such as order date and total amount.
# In an ERD, entities are usually represented as rectangles.

# 2. Attributes
# Attributes are the properties or details of an entity. They represent the columns in a database table, each describing a specific characteristic of the entity. Attributes are usually listed within the entity box in an ERD as rows.

# Example: For the Customer entity, typical attributes might include:
# CustomerID (Primary Key)
# Name
# Email
# PhoneNumber
# Each attribute has a data type, which specifies the kind of data that can be stored in that column. Data types are crucial because they define what kind of values are allowed in the column, and they optimize how data is stored and retrieved. Here are some common data types:

# Integer (INT): Stores whole numbers. For example, CustomerID or OrderID.
# VARCHAR(n): Variable-length string of up to n characters. Used for storing text, like Name or Email.
# CHAR(n): Fixed-length string of n characters. Ideal for values like PhoneNumber or PostalCode.
# FLOAT or DECIMAL: Stores decimal numbers. Used for attributes like TotalAmount in an order.
# DATE or DATETIME: Stores date and time information. Used for attributes like OrderDate or Birthdate.
# Example with Data Types:

# Customer Entity:
# CustomerID (INT)
# Name (VARCHAR(50))
# Email (VARCHAR(100))
# PhoneNumber (C

# 3. Relationships
# Relationships depict how two entities are related to each other. These relationships are key to understanding how data is linked across tables.

# Relationships are represented by lines between entities, and they include cardinality and Ordinality (which describes the nature of the relationship, such as one-to-one or one-to-many).
#Keys in ERDs. 

#Primary Key(PK): A Unique identifier of each record in a table. Ensures each row in table is unique and can be referenced easily
       #Example: Customer Table: Customer ID

#Foreign Key(PK): This a field in a table that references the primary key from another table. This is how relationship between tables is established
      #Example: Order table: Customer ID, a foreign key that links a specific orrder to a customer in customer table

#Cardinaliy and Ordinality

   # Both Cardinality and Ordinality play a major role in defining how entities(tables) relate to one another
#while designing databases using ERDs

#CARDINALITY:Maximum number of relationships:
    #Types of Cardinality: One to ONE, One To Many, and Many to Many relationships

#ORDINALITY: Minimum number of relationships:
    #Ordinality Types: #Mandatory: A relationship must exist(Minimum of 1 relationship is required) Eg: Oder must be tied to a customer
                      #Optional: THe relationship is not required(minimum of 0 relationship): Eg: A customer can exist without placing any order


