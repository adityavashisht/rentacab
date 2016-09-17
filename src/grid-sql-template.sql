WITH AllGridItems AS  (

    -- Business logic goes here

      select * from users







      ) ,




    ItemCount AS (SELECT *, ROW_NUMBER() OVER (

    -- Ordering direction and column go here
    order by username desc



    ) AS RowNumber FROM AllGridItems )

SELECT *, (SELECT COUNT(*) FROM AllGridItems) AS total
FROM ItemCount

WHERE RowNumber > 0 AND RowNumber <=20

ORDER BY RowNumber