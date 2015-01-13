SELECT City,
       FLOOR(AVG(Age)) AS AverageAge
FROM 
(SELECT TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS Age, City
FROM Employees) AS Ages
GROUP BY City
HAVING AverageAge > 60


