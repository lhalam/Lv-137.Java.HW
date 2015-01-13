select distinct firstName,lastName from employees as e join orders as o on e.EmployeeID=o.EmployeeID where ShipCity='Madrid';
