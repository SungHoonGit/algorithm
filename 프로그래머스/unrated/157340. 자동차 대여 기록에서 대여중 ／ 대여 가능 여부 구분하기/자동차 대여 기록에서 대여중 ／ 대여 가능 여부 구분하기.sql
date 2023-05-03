-- 코드를 입력하세요

SELECT car_id
     , CASE WHEN SUM(availability) > 0 THEN "대여중"
            ELSE "대여 가능" END AS availability
FROM (SELECT car_id
           , CASE WHEN "2022-10-16" BETWEEN start_date AND end_date THEN 1
                  ELSE 0 END AS availability
      FROM car_rental_company_rental_history) AS temp
GROUP BY car_id
ORDER BY car_id DESC


# 가상 테이블 생성후 그 안에서 비교하기. 

# with rental_ing_car_id as (
#     select distinct car_id
#     from car_rental_company_rental_history S
#     where exists (select history_id
#                   from car_rental_company_rental_history T
#                   where T.car_id=S.car_id and
#                         T.start_date <= DATE_FORMAT("2022-10-16", '%Y-%m-%d') and
#                         DATE_FORMAT("2022-10-16", '%Y-%m-%d') <= T.end_date
#                 )
#     )

# select distinct car_id, (case when car_id in (select car_id
#                  from rental_ing_car_id) 
#                 then '대여중'
#                 else '대여 가능'
#                end ) as availability
# from car_rental_company_rental_history
# order by car_id desc