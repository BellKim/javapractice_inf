SELECT *
FROM employees;

1) employees테이블에서 연봉이 17000이하인 사원의 사원번호, 사원명(first_name), 연봉를 출력하시오.
	SELECT employee_id, first_name, salary
	FROM employees
	WHERE salary<=17000;

2) employees테이블에서 1992년 1월 1일 이후에 입사한 사원을 출력하시오. (hire_date)
	SELECT employee_id, last_name, hire_date
	FROM employees
	WHERE HIRE_DATE >= '1992-01-01';
	


3) employees테이블에서 연봉이 5000이상이고 직업(job_id)이 'IT_PROG'이 사원의 사원명(first_name), 연봉, 직업을 출력하시오.
	SELECT first_name, job_id, salary, job_id
	FROM employees
	WHERE salary >= 5000 and salary>=5000;


4) employees테이블에서 부서번호가 10, 40, 50 인 사원의 사원명(first_name), 부서번호, 이메일(email)을
출력하시오. (department_id)
	SELECT first_name, department_id, email
	FROM employees
	--WHERE department_id=10 or department_id=40 or department_id=50
	WHERE department_id in(10,40,50)
	ORDER BY department_id asc;
	--오름차순

5) employees테이블에서 사원명(first_name)이 even이 포함된 사원명,연봉,입사일을 출력하시오.
	SELECT first_name, salary, hire_date
	FROM employees
	WHERE first_name like '%even%';

6) employees테이블에서 사원명(first_name)이 teve앞뒤에 문자가 하나씩 있는 사원명,연봉,입사일을 출력하시오.
	SELECT first_name, salary, hire_date
	FROM employees
	WHERE first_name like '_teve_';
	-- 여기서 _ 는 한글자고, __ 는 두글짜를 나타낸다.

7) employees테이블에서 연봉이 17000이하이고 커미션이 null이 아닐때의 사원명(first_name), 연봉, 
  커미션을 출력하시오.
	SELECT first_name, salary, hire_date
	FROM employees
	WHERE salary<=17000 and commission_pct IS NOT null; 
	
8) 1998년도에 입사한 사원의 사원명(first_name),입사일을 출력하시오.
	SELECT employee_id, last_name, hire_date
	FROM employees
	--WHERE HIRE_DATE BETWEEN '1998-01-01' and '1998-12-31';
	WHERE to_char(hire_date,'yyyy')='1998';
	


92) 커미션 지급 대상인 사원의 사원명(first_name), 커미션을 출력하시오. (commission_pct)
	SELECT last_name, hire_date, commission_pct
	FROM employees
	WHERE commission_pct IS NOT null;


10) 사번이 206인 사원의 이름(first_name)과 연봉을 출력하시오.
	SELECT employee_id, first_name, salary
	FROM employees
	WHERE employee_id = 206;


11) 연봉이 3000 이 넘는 직업,연봉을 출력하시오.
	SELECT job_id, salary
	FROM employees
	WHERE salary>3000;


12) 'ST_MAN'직업을 제외한 사원들의 사원명(first_name)과 직업(job_id)을 출력하시오.
	SELECT first_name, job_id
	FROM employees
	--WHERE job_id != 'ST_MAN';
	WHERE job_id <> 'ST_MAN';

13) 직업이 'PU_CLERK' 인 사원 중에서 연봉이 10000 이상인 사원명(first_name),직업,연봉을 출력하시오.
	SELECT first_name, job_id, salary
	FROM employees
	WHERE job_id ='PU_CLERK' and salary>=10000;


14) commission을 받는 사원명을 출력하시오.
	SELECT last_name, commission_pct
	FROM employees
	WHERE commission_pct IS NOT null;



15) 20번 부서와 30번 부서에 속한 사원의 사원명(fist_name), 부서를 출력하시오.
	SELECT first_name, department_id, email
	FROM employees
	--WHERE department_id = 20 or department_id = 30
	WHERE department_id in(20,30)
	ORDER BY department_id asc;

16) 연봉이 많은 사원부터 출력하되 연봉이 같은 경우 사원명(first_name) 순서대로 출력하시오.
	SELECT first_name, salary, hire_date
	FROM employees
	ORDER BY salary desc, first_name asc;


17) 직업이 'MAN' 끝나는 사원의 사원명(first_name), 연봉, 직업을 출력하시오.

  SELECT first_name, salary, job_id
  FROM employees
  WHERE job_id like'%MAN'
  ORDER BY first_name asc;







