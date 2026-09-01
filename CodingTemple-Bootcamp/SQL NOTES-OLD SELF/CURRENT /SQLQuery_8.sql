#REMOVING DUPLICATES


SELECT [Restaurant], [Ranking],[Description], COUNT(*) AS [ROW COUNT] FROM [Duplicate Dataset]
Group BY [Restaurant], [Ranking], [Description]
HAVING COUNT(*)> 1