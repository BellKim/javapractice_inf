오라클에서 제공되는 명령어
1 DQL(Data Query Language) : 데이터를 검색해서 추출할때 사용된다.(select)
  
2 DML(Data Manipulation Language) : 데이터는 추가, 수정, 삭제,병합해주는 명령어들이다.  (insert, update, delete,merge)
  
3 DDL(Data Definition Language ) : 테이블의 구조를 정의, 변경해주는 명령어들이다.(create, drop, alter, truncate)

4 DCL(Data Control Language) : 사용자의 권한을 부여,제거해주는 명령어들이다.(grant ,revoke)

5 TCL(Transaction Control Language) : 트랜잭션 설정,취소을 처리해주는 명령어들이다 (commit, rollback, savepoint

--------------------------------

	DROP TABLE emp01;
	
	CREATE TABLE emp01
	AS
	SELECT first_name, salary
	FROM employees
	WHERE 0=1;
	--테이블 생성. 
	
	INSERT INTO EMP01(first_name, salary)
	VALUES('kim11','5000');
	
	
	INSERT INTO EMP01
	VALUES('bellkim','5000');
	
	INSERT INTO emp01
	VALUES('Paran', null);
  
  

	UPDATE emp01
	SET salary=8000+8000
	WHERE first_name='Paran';


	DELETE FROM EMP01
	WHERE first_name='kim11';

 

	
	
	
	
	
	
	
	
	
	CREATE TABLE student(
		name varchar2(20), 	--바이트
		age number(3),		--자릿수
		avg number(5,2), 	--5는 전체자리수, 2는 소수점자릿수
		hire date
	);
	
	INSERT INTO student(name, age, avg, hire)
	VALUES('콩길동',40,99.01,sysdate);
	
	ALTER TABLE student
	ADD loc varchar2(50);

	UPDATE student
	SET loc='seoul'
	WHERE name='콩길동';
	
	
	DELETE FROM student
	WHERE loc = 'seoul';
	
	
	
	

SELECT * FROM student;


		INSERT INto emp06(id, name, age, gen)
	VALUES('100','park',25,'m');
	
	SELECT * FROM emp06;
	DROP TABLE emp06;
	
  CREATE TABLE emp06(
  	id varchar2(10) constraint emp06_id_pk primary key, 
  						  -- 테이블명_컬럼명_제약조건
  	name varchar2(20) constraint emp06_name_nk not null,
  	age number(3) constraint emp06_age_uk check(age BETWEEN 20 and 50),
  	gen char(2) constraint emp06_gen_uk check(gen in('m','w'))	
  	
  );
  
  ALTER TABLE emp08
	modify first_name constraint emp08_name_uk unique;
	
		CREATE TABLE emp07(
	id varchar2(10),
	name varchar(20) constraint emp07_name_nk not null,
	age number(3),
	gen char(2),
	constraint emp07_id_pk primary key(id),
	constraint emp07_age_uk check(age between 20 and 50),
	constraint emp07_gen_uk check(age in('m','w')));
	
  
	
	SELECT * FROM emp07;

		
	INSERT INTO emp07(, name, age, gen)
	VALUES( 'PARK', 15, 'm');
	
	
	
		CREATE TABLE emp08
 	as
 	SELECT employee_id, first_name, salary
 	FROM employees
 	WHERE 0=1;

	SELECT * FROM emp08;
	
	ALTER TABLE emp08
	ADD CONSTRAINT emp08_employee_id_pk
					primary key(employee_id);
					
	INSERT INTO EMP08
	VALUES(100,'steven',4000);
	
	INSERT INTO EMP08(employee_id,  salary)
	VALUES(200, 4000);
	
	SELECT * FROM user_constraints
	WHERE constraint_name like '%EMP%';
	
	SELECT * FROM user_constraints
	WHERE table_name='EMP07';

	SELECT * FROM user_tables;
	
	SELECT * FROM user_sequences;

	ALTER TABLE emp08
	modify first_name constraint emp08_name_uk unique;
	
		ALTER TABLE emp08
	drop column_name constraint constraint_name
					constraint_type;

	
	SELECT * FROM emp08;
	drop constraint emp_name_uk;
	
	INSERT INTO emp08
	VALUES(200, 'STEVEN',6000);
	
	SELECT * FROM emp08;
	
	
	    CREATE TABLE dept01(
    deptno number(2)
    		constraint dept01_deptno_pk primary key,
    dname varchar2(20)
    );
	
	SELECT * FROM dept01;
	
	SELECT * FROM jobs ORDER BY job_id;
	
	
	
	
	
	
	
	


