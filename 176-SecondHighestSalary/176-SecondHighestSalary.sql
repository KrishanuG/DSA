-- Last updated: 8/5/2025, 12:36:32 PM
# Write your MySQL query statement below
SELECT MAX(Salary) "SecondHighestSalary"
FROM Employee 
WHERE Salary<(SELECT MAX(Salary) FROM Employee)