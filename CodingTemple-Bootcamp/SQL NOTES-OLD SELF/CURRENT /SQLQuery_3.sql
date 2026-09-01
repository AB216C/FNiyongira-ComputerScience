-- #CHANGING DATA TYPE AND UPDATING TABLES

SELECT TOP (1000) [Restaurant_Name]
      ,[Meal_Release_Date]
      ,[Meal]
      ,[Meal_Description]
      ,[Meal_Sides]
      ,[Cost]
      ,[Quantity]
      ,[Additional_Details_1]
      ,[Additional_Details_2]
      ,[Additional_Details_3]
  FROM [master].[dbo].[Restaurant - Master]

UPDATE [Restaurant - Master]
SET [Meal_Sides] = 'NULL'
WHERE [Meal_Sides] = 'N/A';

UPDATE [Restaurant - Master]
SET [Additional_Details_1] = 'NULL'
WHERE [Additional_Details_1]  = 'N/A';

UPDATE [Restaurant - Master]
SET [Additional_Details_2] = 'NULL'
WHERE [Additional_Details_2] = 'N/A';

UPDATE [Restaurant - Master]
SET [Additional_Details_3] = 'NULL'
WHERE [Additional_Details_3] = 'N/A';

SELECT * FROM [Restaurant - Master]
SELECT [Meal_Release_Date]
      ,[Meal]
      ,[Meal_Description]
      ,[Meal_Sides]
      ,[Cost]
      ,[Quantity]
      ,[Additional_Details_1]
      ,[Additional_Details_2]
      ,[Additional_Details_3],
      COALESCE([Additional_Details_1],[Additional_Details_2], [Additional_Details_3],'No Comment') as [Meal_Comment]
  FROM [master].[dbo].[Restaurant - Master]

SELECT [Restaurant_Name],
CONVERT(date,[Meal_Release_Date],103) AS [Meal_Release_Date]
      ,[Meal]
      ,[Meal_Description]
      ,[Meal_Sides]
      ,CAST([Cost] AS DECIMAL (18,4)) AS [COST]
      ,CAST([Quantity] AS INT) AS [Quantity]
      ,[Additional_Details_1]
      ,[Additional_Details_2]
      ,[Additional_Details_3]
      INTO [Restaurant_New_Master]
  FROM [master].[dbo].[Restaurant - Master]
 
  SELECT * FROM [Restaurant - Master]