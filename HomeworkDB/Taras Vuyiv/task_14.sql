SELECT FirstName,
	   LastName,
       COUNT(OrderDate) OrdersIn1997
FROM employees e JOIN orders o
ON e.EmployeeID = o.EmployeeID
WHERE YEAR(OrderDate) = 1997
GROUP BY LastName



	

