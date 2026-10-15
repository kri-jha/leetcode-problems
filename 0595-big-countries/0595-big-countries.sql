# Write your MySQL query statement below
-- select w.name , w.continent , w.area
-- from World w 
-- where w.population >= 25000000 or w.area >= 3000000;

-- '' this is use to store the string and text value 
SELECT w.name, w.population, w.area
FROM World w
WHERE w.population >= 25000000
   OR w.area >= 3000000;
