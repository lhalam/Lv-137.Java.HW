SELECT FirstName,
	    LastName,
	    TIMESTAMPDIFF(YEAR, BirthDate, CURDATE()) AS Age 
FROM Employees
ORDER BY Age DESC
LIMIT 3


