Elre Database README

Scripts
------------------------------------------------------------------------------
This subfolder will store command files that'll execute specific
database actions.

Migrations
------------------------------------------------------------------------------
This subfolder will hold each tables' version-controlled instructions
that this database will experience overtime; Similar to GitHub commits.

Seeds
------------------------------------------------------------------------------
This subfolder will hold the tables' data initialization files. These
files essentially contains default or sample data.

initdb
------------------------------------------------------------------------------
This subfolder will hold every sql files in the overall database structure. 
This will allow Docker to properly execute and generate tables and their data.

Tests
------------------------------------------------------------------------------
This subfolder will hold files that'll test the database's functionality; from 
the migrations, scripts, and seeds.

Docs 
------------------------------------------------------------------------------
This subfolder will store documentations pretaining to the database's design 
and structure.

Config
------------------------------------------------------------------------------
This subfolder will store enviroment-specific database configuration and 
connection settings.