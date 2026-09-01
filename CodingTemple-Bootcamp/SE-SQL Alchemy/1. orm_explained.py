#ORM: Object-Relational-Mapper

#    This object allows developers to interact with Databases using using OOP(Object Oriented Programming)
#    ALLOWS Developers to work with data in a familiar way without the need of writing "SQL querries"

#WHY USE an ORM?
# Ease of Use: Manipulate Python objects instead of writing SQL queries.
# Portability: Write database-agnostic code, making it easier to switch between database systems (e.g., MySQL, PostgreSQL, SQLite).
# Security: Built-in protections against SQL injection attacks.
# Productivity: Spend less time writing boilerplate code for database interaction.

#BASIC CONCEPTS OF ORM'S

#Model: Represents a table in your database. Model attributes corresponds to Table columns
#Instance: An instance of a model represents a row/record in a table
#Query: Retrieve, filter, and manupulate Data using ORM'S query builder


###         SQL ALCHEMY 2.0: PYTHON MOST POPULAR ORM    ######
# SQLAlchemy is a powerful and flexible ORM for database operations in Python. 
# Version 2.0 introduces a more modern and expressive syntax, improved type hinting, and asynchronous support.

#VIRTUAL ENVIRONMENT: A SEPARATE FOLDER FOR YOUR PROJECT WHERE ALL TOOLS AND LIBRARIES IT NEEDS ARE KEPT IN ONE PLACE
#THIS IS THE SAME AS GIVING YOUR PROJECT A TOOLBOX THAT WON'T MIXED UP WITH TOOLS FROM OTHER PROJECTS

#This Environment is very important because when working on projects with ORM(This a Tool that connect Python to Databases) or 
#APIs(Ways for different program to talk to each other).

#ADVANTAGE OF VIRTUAL ENVIRONMENT:
# Keeps Things Organized: Each project gets its own set of tools, so they don’t accidentally share or mess up each other’s stuff.
# Makes Sharing Easier: If you want to share your project with someone else, they can set up the exact same tools by following a simple list.
# Prevents Problems: If one project needs a newer tool and another needs an older one, virtual environments keep them from clashing


# Setting up a Virtual Environment

# Open VS Code to your project folder, and in the terminal run the following commands
# #Windows
#=== python -m venv venv===

# #Macbook
#===python3 -m venv venv===
# Once this is complete you should see a venv folder appear in your VS Code explorer.
# Activate the virtual environment 
# #Windows
#=== .\venv\Scripts\activate===

# #Macbook
# ===source venv/bin/activate===
# You should now see (venv) in your terminal, indicating the virtual environment is active.


# 🚨 WINDOWS Potential Error: "Running Scripts is Disabled on this System"

# When you try to activate a virtual environment in PowerShell using the command:

# ===.\venv\Scripts\activate===
# You might encounter the following error:

# File C:\path\to\venv\Scripts\Activate.ps1 cannot be loaded because running scripts is disabled on this system.

# Why does this happen?
# PowerShell has an Execution Policy that controls whether scripts can run on your system. By default, it is set to Restricted, which prevents any scripts (even local ones) from running. 


# Solution:

# To allow the script to run, we can update the execution policy to RemoteSigned, which allows locally created scripts (like activate.ps1) to run, but still requires scripts downloaded from the internet to be signed.

# Run the following command in PowerShell 
# Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
# RemoteSigned: Allows local scripts but restricts unsigned remote scripts.
# Scope CurrentUser: Ensures this change only affects your user account, not the entire system.
# Activate the virtual environment again:
# ===.\venv\Scripts\activate===
# This should now work without errors.



#===================== Install SQLAlchemy 2.0=====================
# With the virtual environment active, install SQLAlchemy:

# ===pip install sqlalchemy===
# Install MySQL Connector
# To connect to our MySQL Database we'll also need the MySQL Connector package:

# ===pip install mysql-connector-python===
# Connecting to a Database
# The first step in using SQLAlchemy is establishing a connection to your database. SQLAlchemy supports various database systems, including SQLite, PostgreSQL, MySQL, and more.



# Here's an example of setting up a MySQL connection using MySQL Connector:

#===from sqlalchemy import create_engine===

# # Create an engine for SQLite
# ===engine = create_engine('mysql+mysqlconnector://root:<YOUR MYSQL WORKBENCH PASSWORD>@localhost/<DATABASE NAME>')===

# Note: Before you can connect to your database you will need to create the database in MySQL Workbench

#The first step of using SQL Alchemy is establishing connection to your database. SQL Alchemy support various databases including 
#SQL Lite, postgreeSQL, MySQL and more
#  

