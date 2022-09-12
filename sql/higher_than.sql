-- Query used to find out how many departments has an average salary higher than X
USE employeesquery;
-- SELECT COUNT(departments.department_id) FROM employees, departments
-- WHERE 

(SELECT AVG(employees.salary) FROM employees
JOIN departments ON departments.department_id = employees.employee_id
GROUP BY employees.salary)

