SELECT TOP (1000) [Shop_ID]
      ,[Shop_Name]
      ,[No_of_Employees]
      ,[Shop_Size_Square_Ft]
  FROM [master].[dbo].[4 - Joins - 1 Key - Table 2 - Inner_]

  
SELECT * FROM [4 - Joins - 1 Key - Table 1_];

SELECT * FROM [4 - Joins - 1 Key - Table 2 - Inner_];

SELECT * FROM [4 - Joins - 1 Key - Table 2 - Left_];

SELECT A.[Shop_ID], A.[Shop_Name],A.[Shop_Region],A.[Revenue], A.[Revenue], A.[Profit], B.[No_of_Employees],B.[Shop_Size_Square_Ft] 
FROM [4 - Joins - 1 Key - Table 1_] AS A 
INNER JOIN [4 - Joins - 1 Key - Table 2 - Inner_] AS B ON A.[Shop_ID] = B.[Shop_ID]

SELECT A.[Shop_ID], A.[Shop_Name],A.[Shop_Region],A.[Revenue], A.[Revenue], A.[Profit], B.[No_of_Employees],B.[Shop_Size_Square_Ft] 
FROM [4 - Joins - 1 Key - Table 1_] AS A 
LEFT JOIN [4 - Joins - 1 Key - Table 2 - Inner_] AS B ON A.[Shop_ID] = B.[Shop_ID]

SELECT A.[Shop_ID], A.[Shop_Name],A.[Shop_Region],A.[Revenue], A.[Revenue], A.[Profit], B.[No_of_Employees],B.[Shop_Size_Square_Ft] 
FROM [4 - Joins - 1 Key - Table 1_] AS A 
RIGHT JOIN [4 - Joins - 1 Key - Table 2 - Inner_] AS B ON A.[Shop_ID] = B.[Shop_ID]

SELECT A.[Shop_ID], A.[Shop_Name],A.[Shop_Region],A.[Revenue], A.[Revenue], A.[Profit], B.[No_of_Employees],B.[Shop_Size_Square_Ft] 
FROM [4 - Joins - 1 Key - Table 1_] AS A 
FULL OUTER JOIN [4 - Joins - 1 Key - Table 2 - Inner_] AS B ON A.[Shop_ID] = B.[Shop_ID]

SELECT A.[Shop_ID], A.[Shop_Name],A.[Shop_Region],A.[Revenue], A.[Revenue], A.[Profit], B.[No_of_Employees],B.[Shop_Size_Square_Ft] 
FROM [4 - Joins - 1 Key - Table 1_] AS A 
FULL OUTER JOIN [4 - Joins - 1 Key - Table 2 - Inner_] AS B ON A.[Shop_ID] = B.[Shop_ID]
WHERE B.[Shop_ID] IS NULL OR A.[Shop_ID] IS NULL