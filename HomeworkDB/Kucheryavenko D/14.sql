SELECT 
    firstname, lastname, COUNT(*)
FROM
    employees,
    orders
WHERE
    YEAR(orderdate) = 1997
        AND orders.employeeID = employees.employeeID
GROUP BY employees.employeeID;