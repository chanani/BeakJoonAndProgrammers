SELECT
    board_id,
    writer_id,
    title,
    price,
    CASE status
         WHEN 'sale' THEN '판매중'
         WHEN 'reserved' THEN '예약중' 
         WHEN 'done' THEN '거래완료'
    END status
FROM
    used_goods_board
WHERE 
    CREATED_DATE REGEXP '^2022-10-05'
ORDER BY
    1 DESC;