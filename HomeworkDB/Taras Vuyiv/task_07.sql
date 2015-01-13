SELECT City,
	   MAX(Age) AS TheGreatestAge,
	   MIN(Age) AS TheSmallestAge,
       FLOOR(AVG(Age)) AS AverageAge
FROM 
(SELECT TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS Age, City
FROM Employees) AS Ages
GROUP BY City

