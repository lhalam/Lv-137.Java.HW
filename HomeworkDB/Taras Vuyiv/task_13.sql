SELECT FirstName,
	   LastName
FROM employees
WHERE EmployeeID IN
	(
     SELECT EmployeeID
	 FROM orders
     WHERE ShipCity LIKE 'Madrid'
	)


