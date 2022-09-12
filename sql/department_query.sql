-- Query used to find out how many employees are per department

USE employeesquery;
SELECT COUNT(employees.employee_id) AS number_of_employees, departments.department_name FROM employees
JOIN departments ON employees.department_id = departments.department_id
GROUP BY departments.department_name
ORDER BY COUNT(employees.employee_id) ASC;
