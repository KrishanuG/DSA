-- Last updated: 8/5/2025, 12:36:26 PM
SELECT d.Name "Department",e.Name "Employee",e.Salary "Salary"
FROM Employee as e,Department as d
WHERE e.DepartmentId=d.ID
AND 3>(SELECT COUNT(DISTINCT Salary) FROM Employee e1 WHERE e.DepartmentId=e1.DepartmentId AND e1.Salary>e.Salary);
