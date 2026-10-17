# Write your MySQL query statement below
-- select w.id
-- from Weather w
-- where w.id =2 or id =4;
-- -- ORDER BY w.temperature ASC;
-- select w.id
-- from Weather w1
-- join Weather w2 --self join 

SELECT w1.id 
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;