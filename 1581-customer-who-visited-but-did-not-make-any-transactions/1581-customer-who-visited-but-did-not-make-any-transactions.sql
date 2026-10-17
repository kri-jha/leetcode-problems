# Write your MySQL query statement below
-- select v1.customer_id , 
-- from Visits v1 
-- join Transactions t1 on v1.visit_id = t1.visit_id
-- where v1.visit_id != t1.visit_id


SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;