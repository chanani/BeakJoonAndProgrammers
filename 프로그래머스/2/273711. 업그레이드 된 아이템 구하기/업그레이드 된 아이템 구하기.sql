SELECT C.ITEM_ID AS ITEM_ID, ITEM_NAME, RARITY
FROM 
(
    SELECT B.ITEM_ID AS ITEM_ID
    FROM
    (
        SELECT ITEM_ID
        FROM ITEM_INFO
        WHERE RARITY = 'RARE'
    ) AS A
    INNER JOIN ITEM_TREE AS B ON A.ITEM_ID = B.PARENT_ITEM_ID
) AS C
INNER JOIN ITEM_INFO AS D ON D.ITEM_ID = C.ITEM_ID
ORDER BY ITEM_ID DESC
;