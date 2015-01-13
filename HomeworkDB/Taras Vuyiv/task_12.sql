SELECT FirstName,
	   LastName,
       DATE(BirthDate) AS BirthDate
FROM Employees
WHERE MONTH(BirthDate) = MONTH(CURRENT_DATE())


