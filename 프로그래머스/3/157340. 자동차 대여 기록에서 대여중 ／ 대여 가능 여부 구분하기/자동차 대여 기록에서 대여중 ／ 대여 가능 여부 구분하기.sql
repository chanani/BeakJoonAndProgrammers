select car_id, if(availability = 1, '대여중', '대여 가능') as availability
from (select car_id, sum(if('2022-10-16' between start_date and end_date, 1, 0)) as availability from CAR_RENTAL_COMPANY_RENTAL_HISTORY group by 1) x
order by 1 desc