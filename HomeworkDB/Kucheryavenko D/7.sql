SELECT 
    MAX((YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate)))) AS MaxAge,
    MIN((YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate)))) AS MinAge,
    AVG((YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate)))) AS AvarageAge,
    city
FROM
    employees
GROUP BY city;
