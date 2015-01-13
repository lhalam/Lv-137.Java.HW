SELECT MAX(Age) AS LondonEmployeesGreatestAge,
	   MIN(Age) AS LondonEmployeesSmallestAge,
       FLOOR(AVG(Age)) AS LondonEmployeesAverageAge
FROM 
(SELECT TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS Age
FROM Employees
WHERE City LIKE 'London') AS LondonAges

