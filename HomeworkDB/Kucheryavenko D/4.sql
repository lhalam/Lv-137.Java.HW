SELECT 
    firstname,
    lastname,
    (YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate))) AS Age
FROM
    employees
WHERE
    (YEAR(CURRENT_DATE) - YEAR(birthdate) - (MONTH(CURRENT_DATE) < MONTH(birthdate))) > 55
    ORDER BY LastName;