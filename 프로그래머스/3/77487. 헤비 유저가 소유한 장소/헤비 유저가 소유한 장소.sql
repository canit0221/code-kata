SELECT
    p.ID,
    p.NAME,
    p.HOST_ID
FROM
    PLACES p
JOIN (
    SELECT
        HOST_ID
    FROM
        PLACES
    GROUP BY
        HOST_ID
    HAVING
        COUNT(*) >= 2
)a 
ON p.HOST_ID = a.HOST_ID
ORDER BY
    1