-- 코드를 입력하세요
SELECT c.CAR_ID, c.CAR_TYPE, c.DAILY_FEE, c.OPTIONS
FROM CAR_RENTAL_COMPANY_CAR c
WHERE OPTIONS LIKE '%네비게이션%'
ORDER BY CAR_ID DESC;