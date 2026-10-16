# Write your MySQL query statement below
select e2.unique_id  , e1.name
from Employees e1 
left join EmployeeUNI e2 
on  e1.id = e2.id;
-- where 

-- SELECT e2.unique_id, e1.name
-- FROM Employees e1
-- LEFT JOIN EmployeeUNI e2
-- ON e1.id = e2.id;