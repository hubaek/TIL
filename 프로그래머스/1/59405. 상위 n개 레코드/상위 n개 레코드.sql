-- 코드를 입력하세요
# 서브쿼리를 where에 하는게 아니라 from으로 해서 결과가 나온 값을 where절로 조건을 해야함
# 서브쿼리에서 rank값만 얻을려고 rank를 넣는게 아닌 name을 조회하기 위해선 name필드도 넣어야 함 
SELECT name
from (
    select name, rank() over (order by datetime) AS ranking
     from animal_ins
     ) as ranked_animals
     where ranking = 1
;

# 아래 코드도 가능 (대신 동순위가 없을 경우)
select name
from animal_ins
order by datetime
limit 1;