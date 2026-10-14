-- # Write your MySQL query statement below
-- select e1.name as Employee
-- from Employee e1
-- join Employee e2 on e1.managerId = e1.id 
-- where e1.salary > e2.salary;


SELECT e2.name AS Employee
FROM Employee e1
JOIN Employee e2 ON e1.id = e2.managerId
WHERE e2.salary > e1.salary;