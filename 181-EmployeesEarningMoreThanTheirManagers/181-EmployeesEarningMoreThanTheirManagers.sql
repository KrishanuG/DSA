-- Last updated: 8/5/2025, 12:36:29 PM
# Write your MySQL query statement below
SELECT e.Name as Employee 
FROM Employee as e,Employee as e1
WHERE e.ManagerId=e1.id
AND e.Salary>e1.Salary;