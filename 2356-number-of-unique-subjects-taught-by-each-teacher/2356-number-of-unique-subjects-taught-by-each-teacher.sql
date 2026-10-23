# Write your MySQL query statement below
select t.teacher_id ,
    -- COUNT(DISTINCT subject_id) AS cnt
    count(Distinct subject_id) as cnt 
from Teacher t
group by teacher_id