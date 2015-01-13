select FirstName,LastName,floor(((datediff(curdate(),birthdate))/365.242))as age from employees group by FirstName,LastName having age>55 order by LastName asc;
