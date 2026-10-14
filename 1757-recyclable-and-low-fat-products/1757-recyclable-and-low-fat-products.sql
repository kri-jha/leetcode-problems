# Write your MySQL query statement below
select p.product_id
from Products p 
-- join Poducts p2 on p2.low_fats = p.recyclable
where p.low_fats ='Y'
and  p.recyclable ='Y';
