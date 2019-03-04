SELECT * FROM EMPLOYEES;

  	select e.department_id, 
  		   e.first_name,
  		   e.job_id, 
  		   j.job_title
  	from employees e, 
  		 jobs j
  	where e.job_id = j.job_id;
  	
  	select e.department_id, 
  		   e.first_name,
  		   e.job_id, 
  		   j.job_title
  	from employees e INNER JOIN jobs j
  	on e.job_id = j.job_id;
  	
  	
   	--employees 와 departments 테이블에서 사원번호(employee_id), 
  	--부서번호(department_id), 부서명(department_id)을 검색하시오.
  	
  	SELECT e.employee_id, e.department_id, d.department_id 
  	FROM employees e, departments d
  	WHERE e.department_id = d.department_id;
  	
   	SELECT e.employee_id, e.department_id, d.department_id 
  	FROM employees e INNER JOIN departments d
  	ON e.department_id = d.department_id;
  	
  	
  	--employees와 jobs 테이블에서 사원번호(employee_id), 
  	--직업번호(job_id), 직업명(job_title)을 검색하시오.
  	
  	SELECT e.employee_id, e.job_id, j.job_title 
  	FROM employees e, jobs j
  	WHERE e.job_id = j.job_id;
  	
  	SELECT e.employee_id, e.job_id, j.job_title 
  	FROM employees e INNER JOIN jobs j
  	ON e.job_id = j.job_id;
  	
  	
  	--job_id가 'FI_MGR' 인 사원이 속한 
  	--연봉(salary) 의 최소값(min_salary),
  	--최대값(max_salary)을 출력하시오. (결과1명)
  	
  	
  	SELECT e.first_name, e.job_id, j.min_salary, j.max_salary 
  	FROM employees e, jobs j	
  	WHERE e.job_id=j.job_id
  	AND e.job_id='FI_MGR';
  	
  	SELECT e.first_name, j.job_id, j.min_salary, j.max_salary
  	FROM employees e, jobs j
  	WHERE e.job_id='FI_MGR'
  	AND j.job_id='FI_MGR';
  	
  	
  	
  	--부서가 'Seattle' 에 있는 부서에서 근무하는
  	--직원들의 first_name, hire_date, department_name, city
  	--출력하는 SELECT 문장을 작성하여라(결과 18행)
  	
  	SELECT e.first_name, e.hire_date, d.department_name, l.city
  	FROM employees e, departments d, locations l
  	WHERE l.location_id=d.location_id
  	AND d.department_id = e.department_id
  	AND l.city='Seattle';
  	
	--20번 부서의 이름과 그 부서에 근무하는 사원의 이름을 출력하시오(결과2행)
	--(department_id=20 인 부서명(department_id)과 이름(frist_name))
	SELECT department_id, first_name
	FROM dpeartments
	WHERE department_id=20;

  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	