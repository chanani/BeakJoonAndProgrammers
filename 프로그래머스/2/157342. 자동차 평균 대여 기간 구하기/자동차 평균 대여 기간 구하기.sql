SELECT
    car_id,
    ROUND(AVG(DATEDIFF(end_date, start_date)+1),1) average_duration
FROM 
    car_rental_company_rental_history
GROUP BY
    1
HAVING
    average_duration >= 7
ORDER BY
    2 DESC,
    1 DESC;