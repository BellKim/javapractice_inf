SELECT * From employees;

데이터베이스  : 모아놓은 데이터의 집합 
데이터베이스관리시스템(dbms) : 데이터를 관리하는 소프트웨어
Database Management System(oracle, mysql, mssql......)

database <---> DBMS (ORACLE) <---> sql Tool(Database Developer)
							 <---> 응용프로그램 (java)
							 
							 
member
회원번호	이름		주소				연락처				직업
001		윤아		서울시 종로구		010-123-2344		방송인
002		경아		서울시 강남구		010-123-234			예술인

CREATE TABLE memexample(
	num NUMBER(3),
	name VARCHAR2(30),
	address VARCHAR2(100),
	tel VARCHAR2(20),
	job VARCHAR2(15)

)

INSERT INTO memexample(num,name,address,tel,job)
VALUES(1,'윤아','서울시 종로구','001-234-345','방송인');



SELECT * FROM memexample;




한 라인 주석처리 --
여러라인 주석처리 /* 내용입력  */

	도메인 : 속성(컬럼)들이 가질 수 값들의 집합	(회원번호, 이름, 주소, 연락처 등등 의 항목네임)
	컬럼(속성) : 테이블에서 관리하는 구체적인 정보 항목에 해당 (세로)
	레코드(튜플) : 테이블에서 하나의 객체에 속한 구성단위 (가로)
				가로줄 하나를 객체라고 한다. 객체들이 모여서 하나의 테이블이 된다. 
	테이블(릴레이션) : 데이터베이스에서 정보를 구분하여 저장하는 기본단위
	
	--테이블에서 컬럼에 해당하는 데이터를 검색해라. 
	SELECT column1, column2, column3
	FROM table;
	
	--job_title, min_salary, max_salary 의 값만 가져오겠다
	SELECT job_title, min_salary, max_salary
	FROM jobs;

	
	--테이블의 모든 컬럼의 데이터값을 불러오겠다
	SELECT *
	FROM jobs;
	
	--한글테이블일경우 " " 을 이용해서 작성해준다. 영문일경우에는 그냥써줘도 무관
	--영문에 공백을 사용할경우 " " 을 이용해야한다.
	-- AS는 생략해도 된다.
	/*컬럼명, 테이블에 별칭을 지정할 수 있다.
	 * 별칭(alias) 으로 한긍리나 영문공백을 사용할때는 " "(따옴표) 를 지정한다.
	 */
	SELECT salary, salary*10 AS "B O N U S" 
	FROM employees;
	
	
	--컬럼명들을 하나의 문장처럼 출력할때 결합연산자 || 을 사용한다.
	SELECT last_name || '님의 연봉은 ' || salary || '입니다.' AS data
	FROM employees;
	
	--distinct은 중복제거를 한 후에 출력해 주는 명령어이다.
	SELECT first_name
	FROM employees;
	
	SELECT distinct first_name, last_name
	FROM employees;
	/*주의사항
	 * 라스트네임이 중복이 아니라면 first name 은 중복으로 나올수있다.
	 */
	

	--SELECT 입력순서
	SELECT 컬럼명, 컬럼명
	FROM 테이블명
	WHERE 컬럼명 = '값'
	GROUP BY 컬럼명
	HAVING 컬럼명 = '값'
	ORDER BY 컬럼명 desc;
	
	--SELECT 해석순서
	FROM 테이블명
	WHERE 컬럼명 = '값'
	GROUP BY 컬럼명
	HAVING 컬럼명 = '값'
	SELECT 컬럼명, 컬럼명
	ORDER BY 컬럼명 desc;
	
	--전체출력
	select *
	from employees;

	
	--employee 테이블에서 salary이 300미만일때의 
	--first_name, salary 를 출력하라
	
	SELECT firstname, salary
	WHERE salary<3000
-----------------------------------------------------

  --employees테이블에서 first_name 컬럼의 값이 'David'일때의
  --first_name, salary을 출력하시오.
  -- first_name = 'David'; : 여기 = 는 대입이 아니고 '같다'라는 의미임.
  select first_name, salary
  from employees
  where first_name = 'David';
  
  --employees테이블에서 first_name 컬럼의 값이 'David'가 아닐때의
  --first_name, salary을 출력하시오.
  --1번(!= 다르다)
  select first_name, salary
  from employees
  where first_name != 'David';
  
  --2번 (오라클에서는 다르다를 <>로 제공)
  select first_name, salary
  from employees
  where first_name <> 'David';
  
  --employees테이블에서 salary이 3000,9000,17000일때
  --first_name, hire_date ,salary을 출력하시오.
  --1번
  select first_name, hire_date ,salary
  from employees
  where salary=3000 or salary=9000 or salary=17000;
  --2번 in
  select first_name, hire_date ,salary
  from employees
  where salary in(3000,9000,17000);
	

	-----------------------------------------------------
	
  --employees 테이블에서 salary 이 3000부터 5000 까지 일때의 
  --first_name, hire_date, salary을 출력하라
  SELECT first_name, hire_date, salary
  FROM EMPLOYEES
  WHERE salary>=3000 AND salary<=5000;
  
  SELECT first_name, hire_date, salary
  FROM employees;
  WHERE salary between 3000 and 5000;
  --주의할점은 초과 미만이 아니라 이상이하로 셋팅되니 주의할것.
  
  /*	문제
   * 	employees 테이블에서 job_id가 'IT_PROG' 이 아닐때
   * 	first_name, email, job_id을 출력하라. 
   */
  SELECT first_name, email, job_id
  FROM employees
  WHERE job_id != 'IT_PROG';
  
  SELECT first_name, email, job_id
  FROM employees
  WHERE job_id <> 'IT_PROG';
  
  SELECT first_name, email, job_id
  FROM employees
  WHERE NOT (job_id = 'IT_PROG');
  
  --employees 테이블에서 salary 이 3000부터 5000 까지 아닐때의 
  --first_name, hire_date, salary을 출력하라
  SELECT first_name, hire_date, salary
  FROM EMPLOYEES
  WHERE not(salary>=3000 AND salary<=5000);
  
    SELECT first_name, hire_date, salary
  FROM EMPLOYEES
  WHERE salary not between 3000 and 5000;
  
  
  --employees 테이블에서 commission_pct이 null일때
  --first_name, salary, commission_pct을 출력하라.
  SELECT first_name, salary, commission_pct
  FROM employees
  WHERE commission_pct is null;
	
  
  --employees 테이블에서 commission_pct이 null이 !!!아닐!때!
  --first_name, salary, commission_pct을 출력하라.
  SELECT first_name, salary, commission_pct
  FROM employees
  WHERE commission_pct is not null;
	
  
	--employees 테이블에서 first_name에 'der'이 포함이된
	--first_name, salary, commission_pct을 출력하라.
  SELECT first_name, salary, email
  FROM employees
  WHERE first_name like '%der%';
  --like 'der%'; der로 시작하는
  --like '%der'; der로 끝나는
  --like '%der%'; der이 포함되는
	

  
	--employees 테이블에서 first_name의 값중 A로 시작하고
	--두번째 문자는 임의문자이며
	--exander로 끝나는 first_name, salary, email을 출력하라.
	SELECT first_name, salary, email
	FROM employees
	WHERE first_name like 'A%_exander';
	--A로 시작해서 exander 로 끝나는것 (임의의 문자 _ 를 붙혀줌)
	/*
	WHERE절에서 사용된 연산자 3가지 종류
	1. 비교연산자 : = > < >= < <= != <> ^=, not 칼럼명, =
	2. sql 연산자: BETWEEN a AND b, IN, LIKEm IS NULL
	3. 논린연산자 : AND, OR, NOT
	
	괄호순위
	1. 괄호()
	2. not연산자
	3. 비교연산자, SQL연산자
	4. AND
	5. OR
		 
	  
	   */ 
	
	--employees 테이블에서 job_id을 오름차순으로
	--first_name, email, job_id 을 출력하시오.
	SELECT first_name, email, job_id
	FROM employees
	ORDER BY job_id asc;
	

	--employees 테이블에서 department_id 를 오름차순하고
	--first_name을 내림차순으로
	--department_id, first_name, salary를 출력하시오.
	
	SELECT department_id, first_name, salary
	FROM employees
	ORDER BY department_id asc, first_name desc;
	
	
	
	
	--employees 테이블에서 가장 최근 입사 순으로
	--사원의 first_name, salary, hire_date을 출력하시오.
	SELECT department_id, first_name, salary
	FROM employees
	ORDER BY hire_date desc;
	
	--employees 테이블에서 작업(job_id)이 'FI_ACCOUNT'인 사원들의
	--연봉 (salary) 이 높은순으로 first_name, job_id, salary을 출력하시오.
	SELECT first_name, job_id, salary
	FROM employees
	WHERE job_id = 'FI_ACCOUNT'
	ORDER BY salary desc;
	
	
	employees테이블에서 사원명(first_name)이 teve앞뒤에 문자가 하나씩 있는 사원명,연봉,입사일을 출력하시오.
	SELECT first_name, salary, hire_date
	FROM employees
	WHERE first_name like '_teve_';
	-- 여기서 _ 는 한글자고, __ 는 두글짜를 나타낸다.
	
	--==============================================================================
	2017. 09. 22.
	
	집합연산자
	
	
 - 둘 이상의 query결과를 하나의 결과로 조합한다.
 - select의 인자 갯수가 같아야 한다. select가 2개이면 두번째 select 도 2개여야한다.
 - 타입이 일치해야 한다.
 
 집합연산자 종류
 union(합집합) - 중복행이 제거된 두 query
 union all(합집합) - 중복행이 포함된 두 query
 intersect(교집합) - 두 query에 공통적인 행.
 minus(차집합) - 첫번째 query에 있는 행 중 두번째 query에 없는 행표시.
 
 집합연산자 사용이유
 - 서로 다른 테이블에서 유사한 형태의 결과를 반환하기 위해서. 
 - 서로 같은 테이블에서 서로 다른 질의를 수행하여 결과를 합치기 위해서.
 
 
 --중복된거 하나만 가져온다 'union' 중복된거 여러번 가져온다 'union all'
  
 -- union(합집합)
 
 SELECT department_id, first_name, last_name
 FROM employees
 WHERE department_id=20 OR department_id=40
 	UNION all
 SELECT department_id, first_name, last_name
 FROM employees
 WHERE department_id=20 OR department_id=60;
 --20혹은 40에 있는 것들 중에서 중복되지 안흔것.
 
 -- intersect (교집합)
  SELECT department_id, first_name, last_name
 FROM employees
 WHERE department_id=20 OR department_id=40
 	INTERSECT
 SELECT department_id, first_name, last_name
 FROM employees
 WHERE department_id=20 OR department_id=60;
 
 
  -- minus(차집합)
  SELECT department_id, first_name, last_name
 FROM employees
 WHERE department_id=20 OR department_id=40
 	minus
 SELECT department_id, first_name, last_name
 FROM employees
 WHERE department_id=20 OR department_id=60;
 

 
 ==============================================================================
 SQL(Structured query language) 함수
 1. 단일행함수 : 행 하나당 하나의 결과를 출력한다.
 			(문자함수, 숫자함수, 날짜함수, 변환함수, 일반함수)
 2. 복수행함수 : 행 여러개당 하나의 결과를 출력한다.
 			(합계, 평균, 최대, 최소, 갯수)
 			
 ==============================================================================
 -- select문에서는  반드시 테이블명을 명시해야한다.
 -- 하지만 select 절에 식이나 특정함수를 이용해서 결과값을 가져올때 
 --     사용 할 수 있는 dual 이라는 테이블을 제공하고 있다. 
 
 	SELECT 3+2
 	FROM dual;
 	
 	-- sysdate : 시스템이서 제공하는 날자 값.
 	SELECT sysdate
 	FROM dual;
 	
 	--시스템에서 제공하는 가상테이블 "dual" 은 두가지 연산을 동시에 주문해도 출력이 가능하다.
 	SELECT sysdate, 3+2
 	FROM dual;
 	
 	
 	
 	--문자함수
 	--initcap();
 	--단어의 첫글자만 대문자로 변경해주는 함수이다. 
 	SELECT initcap('korea hello');
 	FROM dual;
 	
 	--전부 대문자로 바꾸기
 	SELECT upper('korea hello');
 	FROM dual;
 	
 	
 	SELECT first_name, upper(first_name), last_name, upper(last_name)
 	FROM employees;
 	
 	
 	-- 전부 소문자로 바꾸기
 	SELECT lower('korea HEllo')
 	FROM dual;
 	
  	SELECT first_name, lower(first_name), last_name, lower(last_name)
 	FROM employees;
 	
 	
 	-- employees 테이블에서 first_name 에서 대소문자 구분없이 'Ja' 가 포함이된 
 	-- first_name, salary을 출력하라.
 	
 	 SELECT first_name, salary
 	FROM employees
 	WHERE first_name like '%Ja%';
 	
 	
 	-- 문자의 길이를 리턴해주는 함수이다.

 	SELECT length('korea')
 	FROM dual;
 	
 	SELECT length('한국')
 	FROM dual;
 	
 	--문자열의 길이를 바이트로 구해서 리턴해주는 함수.
 	SELECT lengthb('한국'), lengthb('korea')
 	FROM dual;
 	-- 한글은 문자 1글짜를 출력하기위해서 3바이트가 필요하다는것을 잊지말자
 	
 	CREATE TABLE user1(
 	data varchar2(5)
 	);
 	
 	INSERT INTO user1(data)
 	VALUES('korea');
 	
 	INSERT INTO user1(data)
 	VALUES('한국');
 	--오류뜸. 한글 2글짜는 6바이트이므로 열에대한 값이 너무크다고 메시지출력됨.
 
 	SELECT * FROM user1;
 	
 	
 	--특정범위의 문자를 추출해 주는 함수이다. 
 	--substr('문자', 시작위치 , 갯수)
 	SELECT substr('oracle test', 2, 4)
 	FROM dual;
 	
 	SELECT substr('오라클 테스트', 4, 3)
 	FROM dual;
 	SELECT substrb('오라클 테스트', 4, 3)
 	FROM dual;
 	--한글은 개당 3byte이므로 4면 라에 해당함.
 	
 	--특정문자의 인덱스를 추출해주는 함수이다. 
 	SELECT instr('korea','or')
 	FROM dual;
 	
 	SELECT instr('한국자바','자')
 	FROM dual;
 	--3
 	SELECT instrb('한국자바','자')
 	FROM dual;
 	--7
 	--특정문자의 바이트 인덱스를 추출해주는 함수이다. (프로젝트할때 이거 쓰지마 그냥 있는거만 알아둬라)
 	
 	
 	--주어진 문자열에서 왼쪽으로 특정문자를 채우는 함수이다. 
 	SELECT lpad('korea',8,'*')
 	FROM dual;
 	--자리수를 정해두고 나머지 공백을 ' ' 안의 문자로 채워넣는다. 
 	
 	
 	--주어진 문자열에서 왼쪽의 특정문자를 삭제하는 함수이다. 
 	SELECT ltrim('***korea','*')
 	FROM dual;
 	
 	SELECT rtrim('korea***', '*')
 	FROM dual;
 	
 	--주어진 문자열에서 특정문자를 다른 문자로 변경해주는 함수이다. 
 	SELECT replace('oracle test', 'test', 'samle')
 	FROM dual;
 	
 	
 	------------------------------------
 	숫자함수
 	------------------------------------
 	--3.55를 소수점 1의 자리까지 구하시오(반올림해라!)
 	SELECT round(3.55, 1)
 	FROM dual;
 	
 	--2535.598을 십의 자리까지 구하시오 (일의자리에서 반올림해라!)
 	SELECT round(2535.598, -1)
 	FROM dual;
 	
 	--256.78을 무조건 올림하시오. (올림)
 	SELECT ceil(2535.598)
 	FROM dual;
 	
 	--256.78에서 소수이하는 무조건 버리시오(버림)
 	SELECT floor(2535.598)
 	FROM dual;
 	
 	--2의 3승(거듭제곱)
 	SELECT power(2,3)
 	FROM dual;
 	
 	
 	--25의 제곱근
 	SELECT sqrt(25);
 	FROM dual;
 	
 	--나머지
 	SELECT mod(10,3)
 	FROM dual;
 	
 	
 	------------------------------------
 	날짜함수
 	------------------------------------
 	--현재 시스템에서 제공해주는 오늘의날짜 구하는 함수
 	SELECT sysdate
 	FROM dual;
 	
 	--첫번째 인자의 달에 두번째 인자값을 더한 날자를 반환한다.
 	SELECT add_months(sysdate,10)
 	FROM dual;
 	
 	--두 날짜 월의 차를 반환. ㅏㅍ에있는 값이 크면 + 로 리턴하고 반대이면 -로 리턴한다.
 	SELECT months_between('2013-01-01', '2013-09-30')
 	FROM dual;
 	
 	--첫번쨰 인자를 기준으로 앞으로 다가올 날짜를 두번째에서 지정한 요일의 날짜를 구함.
 	SELECT next_day(sysdate,'일요일')
 	FROM dual;
 	
 	--현재 날짜를 기준으로 달의 마지막 일을 구함. 
 	SELECT last_day(sysdate)
 	FROM dual;
 	
 	
 	
 	
 		to_number()		to_date()
 			<-				->
 	숫자				문자				날짜		
 			->				<-		
 		to_char()		to_char()
 		
 		
 		
 ------------------------------------
 to_char()
 1 숫자->문자
 2 날짜->문자
 ------------------------------------
 
 --숫자 -> 문자
 --첫번째 인자값을 두번째 인자값의 형식으로 변환해주는 함수.
 
 SELECT to_char(2532, '999,999.99')
 FROM dual;
 
 SELECT to_char(2532, '009,999.00')
 FROM dual;
 
 SELECT to_char(2532, '$999,999.99')
 FROM dual;
 
 SELECT to_char(2532, '999,999.99')
 FROM dual;
 
 
 --각 나라의 통화를 표현해줄때 L 기호를 사용한다.
 SELECT to_char(2532, 'L999,999.99')
 FROM dual;
 
 
 --날짜 -> 문자
 SELECT to_char(sysdate, 'yyyy-mm-dd hh:mi:ss day')
 FROM dual;
 
 SELECT to_char(sysdate, 'yyyy-mm-dd hh:mi:ss dy')
 --day에서 dy로 고치면 '금요일'이 아닌 '금'만나옴
 FROM dual;
 
 SELECT to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss dy')
 --24시간단위로 출력
 FROM dual;
 
 SELECT to_char(sysdate, 'yyyy-mon-dd hh:mi:ss dy')
 FROM dual;
 --월이 9 가 아닌 9월 로 출력. 
 
 
 
 ------------------------------------------------------
 to_number()
 문자->숫자
 ------------------------------------------------------
 SELECT to_number('253')
 FROM dual;
 
 ------------------------------------------------------
 문자->날짜
 ------------------------------------------------------
 SELECT to_date('2013-10-13')
 FROM dual;
 
 --hire_date(입사일) 을 이용해서 '홍길동님은 2003년 1월 3일에 입사했습니다.'
 --	 로 출력하는 query문을 작성하시오.
 	SELECT last_name || '님은 ' ||
 	to_char(HIRE_DATE, 'yyyy') ||'년 '||
 	to_char(HIRE_DATE, 'mm') ||'월 '||
 	to_char(HIRE_DATE, 'dd') ||'일 '||
 	'에 입사했습니다.' AS data
	FROM employees;
	
	
	SELECT last_name || '님은 ' ||
 	to_char(HIRE_DATE, 'yyyy') ||'년 '||
 	ltrim(to_char(HIRE_DATE, 'mm'),'0') ||'월 '||
 	ltrim(to_char(HIRE_DATE, 'dd'),'0') ||'일 '||
 	'에 입사했습니다.' AS data
	FROM employees;
 

 
 ------------------------------------------------------
 일반함수
 nvl()
 ------------------------------------------------------
-- nvl(칼럼, 대체값) : 첫번째 인자값이 null이면 0으로 대체해서 출력한다.
-- 대체할 값이 숫자이면 두번째 인자값에 숫자를 지정한다.
-- 대체할 값이 문자라면 두번째 인자값에 문자를 지정한다.
-- 대체할 값이 날짜라면 두번째 인자값에 날짜를 지정한다.

 
 --commition_pct 칼럼의 값이 null인 경우 0으로 대체해서 출력한다.
 SELECT first_name, commission_pct, nvl(commission_pct,0)
 FROM employees;
 
 SELECT first_name, commission_pct, nvl(to_char(commission_pct),'CEO')
 FROM employees;
 
 
 --nvl2(칼럼, 대체1, 대체2) : 칼럼의 값이 null이 아니면 대체1로, null이면 대체2로 출력한다.
 SELECT commission_pct, nvl2(commission_pct, commission_pct, -1)
 FROM employees;
 
 
  ------------------------------------------------------
 일반함수
 decode()
 ------------------------------------------------------
-- decode(칼럼, 조건1, 값1, 조건2, 값2, 조건3, 값3, 그밖의값)
-- department_id값이 10이면 'AA', 20이면 'BB',
-- 30이면 'CC' 그밖의값은 'DD'
-- java의 switch~case문과 비슷.

SELECT first_name, department_id, 
decode(department_id, 10, 'AA',20,'BB',30,'CC','DD') AS code 
 FROM employees;
 
 
 
 ------------------------------------------------------
 일반함수
 case()
 ------------------------------------------------------
 case when 조건1 then 결과1
	  when 조건2 then 결과2
   	  when 조건3 then 결과3
      else 결과n
 end
 자바의 다중 if~else제어문과 비슷하단.
 
 SELECT first_name, department_id,
 case 	when department_id=10 then 'AA'
 		when department_id=20 then 'BB'
 		when department_id=30 then 'CC'
 	else 'DD'
 	end as code
 FROM employees;
 
 
 
-- 입사일에서 월이 1-3에서 '1사분기', 4-6에서 '2사분기', 7-9이면 '3사분기', 9-12면 '4사분기'
-- 로 처리를 하고 사원명(first_name), 입사일(hire_date), 분기로 출력하시오.
  SELECT first_name, department_id,
 case 	when ltrim(to_char(HIRE_DATE, 'mm'),'0')<=3 then '1사분기'
 		when ltrim(to_char(HIRE_DATE, 'mm'),'0')<=6 then '2사분기'
 		when ltrim(to_char(HIRE_DATE, 'mm'),'0')<=9 then '3사분기'
 	else '4사분기'
 	end as code
 FROM employees;
 
 
 SELECT first_name, department_id,
 case 	when ltrim(to_char(HIRE_DATE, 'mm'),'0')in (1,2,3) then '1사분기'
 		when ltrim(to_char(HIRE_DATE, 'mm'),'0')in (4,5,6) then '2사분기'
 		when ltrim(to_char(HIRE_DATE, 'mm'),'0')in (7,8,9) then '3사분기'
 	else '4사분기'
 	end as code
 FROM employees;
 
 
 ------------------------------------------------------
 	그룹함수
 ------------------------------------------------------
 
 	--max(칼럼) : 최대값
 	SELECT max(salary)
 	FROM employees;
 	
 	--min(칼럼) : 최소값
 	SELECT min(salary)
 	FROM employees;
 	
 	--count(칼럼) : 갯수
 	SELECT count(commission_pct)	
 	FROM employees;
 	
 	SELECT count(employee_id)		
 	FROM employees;		--널이없다.
 	
 	SELECT count(*)		
 	FROM employees;		--널이 있던없던 일단 가져온다.
 	
 	--카운트 부분이상함 다시봐야
 	
 	
 	--sum(칼럼) : 합계
 	SELECT sum(salary)		
 	FROM employees;
 	
 	--avg(칼럼) : 평균
 	SELECT avg(salary)		
 	FROM employees;
 	
 	--그룹함수와 단순컬럼은 함께 사용할 수 없다. (출력되는 레코드 수가 다르기 때문이다.)
 	SELECT first_name, count(*)
 	FROM employees;
 	
 	
 	--그릅함수와 단순칼럼을 사용하기 위해서는 단순칼럼을 그룹화 해야한다.(GROUP BY)
 	SELECT department_id, count(*)
 	FROM employees
 	GROUP BY department_id
 	ORDER BY department_id;
 	
 	SELECT first_name, count(*)
 	FROM employees
 	GROUP BY first_name
 	ORDER BY first_name;
 	
 	--50이하인 부서에 대해서 NULL이 아닌 부서별의 직원수를 출력하시오.
 	SELECT department_id, count(*)
 	FROM employees
 	WHERE department_id is not null
 	GROUP BY department_id
 	HAVING department_id<=50
 	ORDER BY department_id;
 	
 	--부서별 최소연봉, 최대연봉을 출력시하시오. (부서별 오름차순)
 	SELECT department_id, min(salary), max(salary)
 	FROM employees
 	GROUP BY department_id
 	ORDER BY department_id;
 	
 	--직업별(job_id) 연봉합계를 출력하시오.
 	SELECT job_id, sum(salary)
 	FROM employees
 	GROUP BY job_id
 	ORDER BY job_id;
 	
 	
 	
 	SELECT * From employees;
 	
 	


