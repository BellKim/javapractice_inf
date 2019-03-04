------------------------------
문제
------------------------------
1) 모든사원에게는 상관(Manager_id)이 있다. 하지만 employees테이블에 유일하게 상관이
   없는 로우가 있는데 그 사원(CEO)의 Manager_id컬럼값이 NULL이다. 상관이 없는 사원을
   출력하되 Manager_id 컬럼값 NULL 대신 CEO로 출력하시오.

   SELECT first_name, manager_id, nvl(to_char(manager_id),'CEO') AS change
   FROM employees;
 
    
2) 가장최근에 입사한 사원의 입사일과 가장오래된 사원의 입사일을 구하시오.
	SELECT min(hire_date) || '은 가장 회사에 오래 지낸사람이며,'||
	max(hire_date) || '는 제일 최근에 입사한 사람입니다.'
	FROM employees;
	
3) 부서별로 커미션을 받는 사원의 수를 구하시오.
	SELECT count(COMMISSION_PCT)
	FROM employees;
   
4) 부서별 최대연봉이 10000이상인 부서만 출력하시오.
	SELECT job_id, salary
	FROM employees
	WHERE salary>=10000;
	--금액도 확인해보고싶다면 SELECT에 salary도 추가할것.   

5) employees 테이블에서 직종이 'IT_PROG'인 사원들의 연봉평균을 구하는 SELECT문장을 기술하시오	
	SELECT job_id, avg(salary)
	FROM employees
	WHERE job_id like 'IT_PROG'
	GROUP BY job_id;

6) employees 테이블에서 직종이 'FI_ACCOUNT' 또는 'AC_ACCOUNT' 인 사원들 중 
		최대연봉을  구하는    SELECT문장을 기술하시오
	SELECT job_id, MAX(salary)
	FROM employees
	WHERE job_id like 'FI_ACCOUNT' or job_id like 'AC_ACCOUNT'
	GROUP BY job_id;
	--두 직종중에 최대 연봉이 더큰쪽만 출력하려고 하려면 어떻게 해야하는가요

7) employees 테이블에서 50부서의 최소연봉를 출력하는 SELECT문장을 기술하시오
	SELECT job_id, MIN(SALARY)
	FROM employees
	WHERE department_id=50
	GROUP BY JOB_ID;
    
    
8) employees 테이블에서 아래의 결과처럼 입사인원을 출력하는 SELECT문장을 작성하여라
   <출력:  1987		1989		1990
   	  	   2         1           1   >
   	  	   
   	SELECT to_char(hire_date,'yyyy'), count(to_char(hire_date,'yyyy'))
	FROM employees
	GROUP BY to_char(hire_date,'yyyy')
	HAVING to_char(hire_date,'yyyy') in(1987, 1989, 1990);
	--==========================================================
	SELECT 
	decode(to_char(hire_date,'yyyy'),2,count(to_char(hire_date,'yyyy')))to_char(hire_date,'yyyy')
	
	FROM employees
	GROUP BY to_char(hire_date,'yyyy')
	HAVING to_char(hire_date,'yyyy') in(1987, 1989, 1990);
	
	
	--==========================================================
	SELECT to_char(hire_date,'yyyy'), count(to_char(hire_date,'yyyy'))
	FROM employees
	WHERE to_char(hire_date,'yyyy') in(1987, 1989, 1990)
	GROUP BY hire_date;
   	--==========================================================  	   
   	
    
9) employees 테이블에서 각 부서별 인원이 10명 이상인 부서의 부서코드,
  인원수,연봉의 합을 구하는  SELECT문장을 작성하여라
  
  	SELECT department_id, count(department_id), sum(salary)
	FROM employees
	WHERE department_id >=10
	GROUP BY department_id
	HAVING count(department_id)>=10;
	
	
    
	
  
  
  
  
  
  
  
  
  
  
  
  
     
   