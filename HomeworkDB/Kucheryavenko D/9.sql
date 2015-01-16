SELECT 
    AVG((YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate)))) AS AvarageAge,
    city
FROM
    employees
GROUP BY city
HAVING AVG((YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate)))) > 60;
