-- 코드를 작성해주세요

select ROUND(avg(ifnull(length,10)),2) as average_length
from fish_info
;