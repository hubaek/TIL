-- 코드를 입력하세요
SELECT animal_id, name
from animal_ins
where intake_condition != 'aged'
order by animal_id
;

# 같지않다 != , <> ,  where not 조건 