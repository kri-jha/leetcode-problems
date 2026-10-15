# Write your MySQL query statement below
select c.name
from Customer c 
-- right join Customer c2 on c2.referee_id = c.id
where c.referee_id!=2
 or c.referee_id is NULL;
