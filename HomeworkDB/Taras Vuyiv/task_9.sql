SELECT FirstName,
	   LastName,
       MAX(Age)
FROM 
(SELECT FirstName,
	    LastName,
	    TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS Age 
FROM Employees
GROUP BY FirstName) AS Ages


