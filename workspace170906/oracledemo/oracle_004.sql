뷰(view) :
	1) 물리적인 테이블을 근거한 논리적인 가상 테이블을 의미한다. 
	2) 기본테이블에서 파생된객체로서 기본테이블에 대한 하나의 쿼리문이다. 
	3) 사용자에게 주여진 뷰를 통해서 기본 테이블을 제한적으로 사용하게 한다.
	4) 뷰를 생성하기 위햇 실질적으로 데이터를 저장하고 있는 물리적인 테이블이 존재해야 하는데 이를 기본 테이블이라한다. 
	--다양한 여러가지 명령문을 실행할수 있도록 저장해두는것. (이걸사용안하면 메모장에 적어두던가 외워야것지)
view 에 권한 부여
--hr계정에 뷰를 생성할수 있는 권한을 부여하고 
--hr계정에 접근 해야한다.

sql> conn system/a1234  --관리자로 접근하는 방법
		--연결되었습니다.
sql> grant create view to hr;  --관리자로 권한부여
		--권한이 부여되었습니다. 
sql> conn hr/a1234	--hr에 접근.
		--연결되었습니다.
		
SELECT * FROM employees
WHERE employee_id=100;

/*
위의 경우와 같이 데잍를 검색하기 위해서 select 문을 계속 
사용하는데 이를 작업의 번거로움을 초래한다.
이런 경우의 문제를 해결하기 위해서 나온 개념이 뷰이다.
*/

--자주 사용하는 select 쿼리를 뷰로생성한다. 
CREATE VIEW emp_view
AS 
SELECT * FROM employees
WHERE employee_id=100;

--결국 셀렉트 쿼리문을 실행하라는 명령어이다...
SELECT * FROM emp_view; 

--생성된 emp_view 뷰의 구조를 확인한다. (이건 콘솔창에서 확인)
DESC emp_view;


--user_view 데이터 딕셔너리에서 테이블 이름(뷰) 와 텍스트(뷰를 생성할때 사용한 쿼리문) 출력
SELECT view_name, text FROM user_views;

/*	SELECT * FROM emp_view으로 질의를 하면 오라클은 user_views 
 * 데이터 딕셔너리에서 emp_view 인 뷰 이름을 찾아서 이를 정의 할때
 * 기술한 서브쿼리문이 저장된 text값(문자열값) 을 실행한다. - 직접노출이 되지 않으므로 보안에 좋다!  
 * */


CREATE TABLE emp_copy
AS SELECT * FROM employees;

DROP VIEW emp_view100; 

--뷰를 저장할 곳을 생성한다. 
CREATE VIEW emp_view100
AS
SELECT * FROM emp_copy
WHERE employee_id = 100;


--emp_view100에 레코드 삽입.  --생성한 뷰에 값을 인서트한다.
INSERT INTO emp_view100(employee_id, first_name, last_name, email,hire_date, job_id)
VALUES(10, 'John', 'Tom', 'john@daum.net', sysdate, 'AD_VP');

SELECT * FROM emp_copy
WHERE employee_id=10; 
--update 확인해보기 
UPDATE emp_view100
SET first_name = 'Park'
WHERE employee_id=10;
--값이 안바뀐다. 그러나 값은 바뀌었다고 뜬다. 
SELECT * FROM emp_copy
WHERE employee_id=10; 


DELETE FROM emp_view100
WHERE employee_id=10;
--삭제도 안된다.
SELECT * FROM emp_copy
WHERE employee_id=10;

--그래서 뷰를 사용하는이유
	1)복잡하고 긴 쿼리문을 뷰로 정의하면 접근을 단순화 시킬수 있다. 
	2) 보안에 유리하다. 
	--/////////////////////////////////////////////////////////////////////////////////////////////////여기까지.
--뷰의 종류
	: 뷰를 정의하기위해서 사용된 기본 테이블의 갯수에 따라 단순뷰(simple view) 와 복합뷰로 구분한다. 
	
	-- 단순뷰
		: 뷰를 정의하기 위해서 기본테이블이 하나가 사용됨.
		
--결과 출력시 실제 컬럼명을 출력하지 않고 여기서 정의한 컬럼명을 출력한다. 
CREATE VIEW emp_view10(사원번호, 이름, 부서번호)
AS SELECT employee_id, first_name, department_id
FROM emp_copy
WHERE department_id=10;

SELECT * FROM emp_view10
WHERE 사원번호=200;

SELECT * FROM emp_view10
WHERE employee_id = 200; --동작안함. 컬럼명이 불일치.


	-- 복합뷰
		: 뷰 생성시 두개이상의 기본테이블로 생성.
		
CREATE TABLE dept_copy
as 
SELECT * FROM departments;

--두개의 기본테이블로 emp_dept_join 뷰생성
CREATE VIEW emp_dept_join
AS
SELECT e.employee_id, e.first_name,
		d.department_name
FROM emp_copy e, dept_copy d
WHERE e.department_id = d.department_id;

--emp_dept_join 뷰 조회
SELECT * FROM emp_dept_join;

--뷰 디셔너리 검색
SELECT view_name, text FROM user_views;

--뷰 제거
DROP VIEW emp_view;


--create or replace 구분으로 뷰 재생성 
--과거로 돌아가는것인데 추가로생성된 데이터도 날아갈수 있으니 유의해서 사용해야한다.
--덮어쓰기 기능과 같다.
CREATE OR replace view emp_dept_join
	AS
	SELECT e.employee_id, e.first_name,
			d.department_name
	FROM emp_copy e, dept_copy d
	WHERE e.department_id=d.department_id;

	
	
뷰를 생성할때 지정하는 FROCE / NOFORCE옵션
	: 기본적으로 뷰를 생성할때에는 기본테이블이 있다는 전재하에
	쿼리문을 작성한다. 하지만 기본 테이블이 존재하지 않는
	경우에도 뷰를 생성할 수가 있다. 이 때에는 FORCE 옵션이 지정되어 있어야 한다. 
	특별한 설정이 없으면 NOFORCE옵션이 지정되어 있는 상태로 간주된다. 
	
--ORA-00942: 테이블 또는 뷰가 존재하지 않습니다      라고 오류가 뜬다. 
SELECT * FROM emp;
	
--emp 테이블이 존재하지 않으므로 오류발생. 
CREATE OR replace VIEW emp_view2
AS
SELECT * FROM emp;

--성공이라는 메시지가 뜬다. ( FORCE 옵션 사용.) 
/*실제 존재하지 않는 emp 기본테이블로 emp_view2
 * 뷰를 생성한다. 결과는 정생실행한다. 기본테이블이 없다면 
 * 반드시 뷰생성시 FORCE  옵션을 설정해야한다. 
 */
CREATE OR replace FORCE VIEW emp_view2
AS 
SELECT * FROM emp;


CREATE TABLE emp
AS
SELECT employee_id, first_name, salary
FROM employees;


SELECT * FROM emp_view2;


인덱스
1. SQL 명령문의 처리속도를 향상시키기 위해서 컬럼에 대해서 생성하는 객체
2. 오라클에서 인덱스 내부 구조는 B* 트리구조 형식이다. 
3. 만약에 14번 위치에 있는 데이터 값을 검색하고 싶다면
	일반적인 방법으로는 14번을 검색해야 한다.
	그러나, 인덱스 방법을 사용하게 되면 root 에 1-10:A,
	11-20:B 정보를 가지고 있다, branch에는 A에 있는 1번부터 10번 
	까지의 위치번호와 rowid의 정보를 가지고 있다. 
	leaf에는 위치번호와 rowid값을 가지고 있다.
	
	
	트리구조 
	
	root
	
	branch
	
	leaf
	
	--트리구조에 대해서 네이버에서 찾아보라신다. 
	트리구조
	
	
	
	
	--서브쿼리를 이용해서 e2 테이블을 생성. 
	CREATE TABLE e2
	AS 
	SELECT * FROM employees;
	
	--검색속도의 차이를 느끼려면 많은ㄷ 데이터가 있어야 하기 때문에
	--e2 테이블에 데이터를 추가한다. 
	INSERT INTO e2 SELECT * FROM e2;
	
	SELECT * FROM e2
	WHERE first_name='Steven';
	
	
	--Elapsed TIME : 0hr, 0min, 0sec, 0ms.
	SELECT * FROM e2
	WHERE first_name = 'Steven';
	
	
	--idex_e2_ename의 index 생성
	CREATE INDEX idx_e2_ename
	ON e2(first_name);
	--idx_e2_ename 도 데이터딕셔너리에서 관리한다. 
	
	--Elapsed TIME : 0hr, 0min, 0sec, 0ms.
	SELECT * FROM e2
	WHERE first_name = 'Steven';
	
	--idex_e2_ename의 index 생성
	CREATE INDEX idx_e2_ename
	on e2(first_name);
	
--	데이터 딕셔너리user_indexes 테이블에 저장된 내용 검색
	SELECT index_name, table_name
	FROM user_indexes
	WHERE table_name='E2';
	
--d2 테이블 생성
	CREATE TABLE d2
	AS SELECT * FROM departments;
--데이터추가
	INSERT INTO d2(department_id, department_name)
	VALUES(1, '인사과');
	INSERT INTO d2(department_id, department_name)
	VALUES(2, '총무과');
	INSERT INTO d2(department_id, department_name)
	VALUES(3, '재무과');
	
	SELECT * FROM d2;
	
	SELECT문 검색결과를 보면 department_id 인덱스로 지정하는 경우에
	부서번호가 중복되어 저장되어 있지 않고 유일한 값만 갖고 있으므로 고유
	인덱스로 지정할 수 있다. location_id 컬럼은 인덱스로 지정하는 경우에 지역명이 
	중복되어 저장되어 있으므로 비 고유 인덱스로 지정해야 한다. 
	
--d2 테이블의 department_id 칼럼에 idx_02_deptno 고유 인덱스 설정. 
	--오류없음. 성공. 
	CREATE UNIQUE INDEX idx_02_deptno
	on d2(department_id);
	
	--오류가 발생.    ORA-00955: 기존의 객체가 이름을 사용하고 있습니다.
	CREATE UNIQUE INDEX idx_02_deptno
	on d2(location_id);
	
	--정상실행됨. (location_id 중복된 값을 가지고 있기 때문에 비 고유 인덱스를 설정한다.
	CREATE INDEX idx_02_loc
	on d2(location_id);
	
	--idx_02_loc 인덱스 삭제 
	DROP index idx_02_loc;
	
	
	/*
	 * department_id, department_name 컬럼 2개로 
	 * idx_02_com 결합 인덱스 설정한다.
	 * 인덱스 설정시 컬럼2개 이상이 사용되면 이를 결합인덱스라하고 
	 * 컬럼 1개 일때는 단일 인덱스라 한다. 
	 */
	CREATE INDEX idx_02_com
	on d2(department_id, department_name);
	
/* 데이터 디셔너라인 user_ind_colums 테이블에서 idx_d2_com 인덱스의 내용 확인*/
	SELECT index_name, column_name
	FROM user_ind_columns
	WHERE table_name='D2';
	
	--쿼리 향상을위해서 index 를 사용하지만 어떨때는 향상이 되지 않는데 어떨때 사용해야할지 분간해보자.
	[인덱스를 사용해야 하는경우]
	1. 테이블의 행의 수가 많을떄
	2. where 문에 해당 컬럼이 많을때
	3. 검색 결과가 전체 데이터의 2%~4%일때
	4. join에 자주 사용되는 컬럼이나 NULL을 포함하는 컬럼이 많은 경우.
	
	[인덱스를 사용하지 말아야 하는경우]
	1. 테이블에 행의 수가 적을때
	2. where 문에 해당 컬럼이 자주 사용되지 않을때
	3. 검색 결과각 전체 데이터의 10%~15% 이상일떄
	4. 테이블에 DML 작업이 많은 경우.
	
	
--e3 테이블 생성. 
	CREATE TABLE e3
	AS SELECT * FROM employees;

--salary 컬럼에 인덱스가 설정되어 있으면 인덱스를 사용해서 데이터 검색을 해줌.
	SELECT * FROM e3
	WHERE salary = 4800;
	
	
--salary 컬럼에 수식이 사용되고 있을때는 인덱스를 이용하지 않음. 
	SELECT * FROM e3
	WHERE salary*2=9600;
	
/*	함수나 수식이 사용된 컬럼에 인덱스를 이용해서 데이터를 검색하기 위해서는 
 * 함수기반 인덱스를 설정해야 한다. 
 * */

--함수 기반의 dex_e3_annsal 인덱스 설정 
	CREATE INDEX dex_e3_annsal
	ON e3(salary*2);
	
--데이터디셔너리 인 user_ind_columns 테이블의 내용확인.
	SELECT index_name, column_name
	FROM user_ind_columns
	WHERE table_name='E3';
	
--인덱스는 한번 튜닝을 해보고 성능을 지켜봐야 한다. 사용하다보면 사용량에 따라서 속도가 달라질수 있다. 
--제일 큰 목적은 처리속도 향상이지만 데이터가 많아지면 그렇지 못한 경우도 있기 때문이다. 튜닝은 실무에서 많이 하게된다.


	사용자관리
/* 사용자계정 user01, 비밀번호tiger 을 가진 사용자계정을 생성하나 오류발생, 
 * 사용자계정은 시스템관리에게만 권한이 있다. 
 */ 
--	ORA-01031: 권한이 불충분합니다
	CREATE USER user01 identified by tiger;
	
--	콘솔에서 사용자 권한을 접근.
--	sql> conn system/a1234
		연결되었습니다.
		
	--현재 시스템 곤리자 상태이기 때문에 다른 사용자계정 생성 가능하므로 정상실행가능.
	sql> CREATE USER user01 identified by tiger;
	
	--현재 사용자 계정 검색(sys,ststem일때만 사용자 계정 생성할 수 있음)
	sql> show user;
		USER은 "SYSTEM"입니다.
		
		
 데이터베이스 관리자가 가지는 시스템권한
 1) create user : 새롭게 사용자를 생성하는 권한
 2) drop user : 사용자를 삭제하는 권한
 3) drop any table : 임의의 테이블을 삭제할 수 있는 권한
 4) query rewrite : 질의재작성을 할 수 있는 권한
 5) backup any table : 임의의 테이블을 백업할 수 있는 권한

 일반 사용자가 데이터베이스를 관리하는 권한
 1) create session : 데이터베이스에 접속할수 있는 권한
 2) create table : 사용자 스키마에게 테이블을 생성할 수 있는 권한
 3) create view : 사용자 스키마에게 뷰를 생성할 수 있는 권한
 4) create sequence : 사용자 스키마에게 시퀀스를 생성할 수 있는 권한
 5) creae procedure : 사용자 스키마에게 프로시저(함수)를 생성할수 있는 권한
 
 사용자에게 권한 부여하기 위한 grant 명령어
 sql> grant system_privilege to user_name;
 
 --user01 사용자에게 데이터베이스 접근권한 부여.
 sql> grant create session to user01;
 
 --사용자 계정 변경
 sql> conn user01/tiger
-- 연결되었습니다.
 
 sql> SELECT * FROM employees;
 --테이블 또는 뷰가 존재하지 않습니다. 
 남의것을 내가 사용할수있도록 권한을 받았지만 employees 에 점근할수있는 권한이 아니다.????
 
 sql>
 CREATE TABLE tdata(
 id number
 );
 	권한이 불충분합니다. 
 
 --테이블을 실행할수 있는 권한이 없기때문에 시스템으로 다시 연결
 sql>conn system/a1234
 		연결되었습니다.
 sql>create user user02 identified by tiger;
 		사용자가 생성되었습니다.
 		
 		/*user02 계정에 데이터베이스 접근권한 부여서 WITH ADMIN OPRION옵션을 지정하게 되면 
 		 * 현재 사용자가 계정으로 다른 사용자에게 권한을 부여할 수 있다. */
 sql> GRANT CREATE SESSION TO user02
 		WITH ADMIN OPTION;
		
 		권한이 부여되었습니다.    -- user02 에  사용권한을 넘겨주는것이다.
 		
 sql> show user
 	
 sql> conn user02/tiger
 
 sql> show user
 		user02
 /*user02 계정에서 user01 계정에게 데이터베이스 접근 권한부여
  * (user02계정생성시 WITH ADMIN OPTION옵션을 지정했기 때문에 
  * USER02계정으로 USER01계정에 권한부여가 가능하다.)
  */
 sql> grant CREATE SESSION TO user01;
 		권한이 부여되었습니다. 
 
 		
 		
 객체권한부여
 	: 객체 권한은 테이블, 뷰, 시퀀스, 함수 등과 같은 
 	객체별로 DML문(SELECT, INSERT, DELETE) 을 사용할 수 있는
 	권한을 설정하는것이다.
 	
 sql> grant object_privilege
		ON object to user_name;
		권한이 부적합합니다. (user02)
		

 sql> SELECT * FROM emp;
 		테이블 또는 뷰가 존재하지 않습니다. 
 
 --hr계정과 a1234 비밀번호로 접속
 sql> conn hr/a1234
 
 /*hr 계정이 가지고 있는 emp 객체를 user01 계정에게 
  * SELECT 문을 실행시킬수 있는 권한을 부여한다.*/  
-- user01 에 emp 테이블을 셀랙트 할수 있는 권한을 줘락.
 slq> GRANT SELECT ON emp TO user01;
 		권한이 부여되었습니다.
 
 --user01 계정과 tiger 비밀번호로 접속.
 sql> conn user01/tiger 
 		연결되었습니다.
 -- 권한을 부여했음에도 불구하고 오류가 생성됨 .
 emp라는 테이블은 hr 에서 생성한거지 urser01에서는 생성된것이아니다.
 접근을 하려면 테이블앞에 유저명을 작성해줘야한다.
 sql> SELECT * FROM emp;
 		테이블 또는 뷰가 존재하지 않습니다. 
 -- 이렇게 
 sql> SELECT * FROM hr.emp;
 		107개의 행이 선택되었습니다. 
 
 사용자에게 부여된 권한 조회
 1. USER_TAB_PRIVS_MADE 데이터 디셔너리 : 현재 사용자가 다른 사용자에게 부여된 권한 정보를 알려줌. 
 2. USER_TAB_PRIVS_RECD 데이터 디셔너리 : 자신에게 부여된 권한 정보를 알려줌. 
 
 sql> conn hr/a1234 
 		연결되엉습니다.
 
--hr 계정에 다른 소유자에게 부여한 권한 정보 조회 <아래 조회내용과 정반대>
 sql> SELECT * FROM user_tab_privs_made;
 		데이터가 스르륵나옴. 
 	이클립스에서도 조회가 됨 SELECT * FROM user_tab_privs_made;

 	 sql> conn user01/tiger
 		연결되엉습니다.
 	
--user01 계정에 부여된 권한 정보 조회 <바로 위 내용과 정반대>
 sql> SELECT * FROM user_tab_privs_recd;
 
 사용자에게 권한을 뻇기 위한 REVOKE 명령어
 	: 사용자에게 부여한 권한을 데이터베이스 관리자나 객체 소유자로부터 철회하기 위해서 사용.
 --권한을 grant 로 부여하고 revoke 를 이용해서 권한을 뺏어온다. 
 
 	
 sql> REVOKE object_privilege
 		ON object FROM user_name;
 sql> conn hr/a1234
 
 		/*user01 계정에 부여한 emp 객체를 조회할수 있는 SELECT 명령문 철회*/
 sql> REVOKE SELECT ON emp FROM user01;
 		권한이 취소되었ㅅ브니다. 
 sql> SELECT * FROM user_tab_privs_made;
 		선택된 레코드가 없ㅅ븝닌다.
 sql> conn user01/tiger
 		연결되었ㅅ븐.ㄷ
 sql> SELECT * FROM hr.emp;
 		테이블 또는 뷰가 존재하지 않습니다. 
 		
 /*
 		다양한 권한들을 설정해둔 것을 룰이라고하는데 이걸 이용하면 일일히 권한을 부여할 필요가 없다.
 		데이터베이스 롤(role) 의 권한제어.
 		롤 : 사용자에게 보다 효율적으로 권한을 부여할 수 있도록 여러개의 권한을 묶어 놓은것. 
 		롤의 종류: 데이터베이스를 설치하면 기본적으로 제공되는 "사전 정의된 롤" 과 "사용자가 정의한 롤" 로 구분
 */ 
 		
 		 사전 정의된 롤의 종류(db설치시 제공)
   1) CONNECT 롤 : 사용자가 데이터베이스에 접속 가능하도록
         하기 위해서 가장 기본적인 시스템권한 8가지를 정의
      -ALTER SESSION, CREATE CLUSTER, CREATE DATABASE LINK,
       CREATE SEQUENCE, CREATE SESSION, CREATE SYNONYM,
       CREATE TABLE, CREATE VIEW

   2)RESOURCE 롤 : 사용자가 객체(테이블, 뷰, 인덱스)를 생성할
      수 있도록 하기 위해서 시스템 권한을 묶어 정의
      - CREATE CLUSTER, CREATE PROCEDURE, CREATE SEQUENCE,
        CREATE TABLE, CREATE TRIGER
        
   3)DBA 롤 : 사용자들이 소유한 데이터베이스 객체를 관리하고
       사용자들을 작성하고 변경하고 제거할 수 있도록하는
        모든 권한
        
        
 sql> conn system/a1234
 
 --새로운 계정을 생성하자.
 sql> CREATE USER user04 identified BY tiger;
 		사용자가생성되었습니다. 
 
-- 	userdb 에 데이터베이스 접근권한을 부여한다. 
 sql> GRANT CREATE SESSION TO user04;
 권한이 부여됬ㅅ브니다. 
 --user04 계정에 CONNECT, RESOURCE 롤 권한 부여
 sql> GRANT CONNECT, RESOURCE TO user04;
 		 권한이 부여됬ㅅ브니다. 
 		 
 sql> conn user04/tiger
 
 sql> CREATE table mytable(
 		id number, 
 		name VARCHAR2(50)
 		);
-- 		테이블이 생성되었습니다. 
sql> INSERT INTO mytable VALUES(10,'min');

 		
 sql> SELECT * FROM mytable;
 
 -- 데이터 디셔너리인 dict 테이블에서 role 을 검색.
 sql>  SELECT * FROM dict where table_name like '%ROLE%';
-- 		데이터에서 role 이 포함되어있는것만 검색해서 가져온다. 

 사용자 롤 정의 
 	: 사용자가 직접 정의한 롤
 	
 사용자 롤 정의 순서
 1. 롤을 생성한다. (데이터베이스 관리자)
 	sql> CREATE role role_name;
 2. 롤에 권한 ㅇ부여한다.(특정 사용자)
 	sql> GRANT object_priv to role_name;
 3. 사용자에게 롤을 부여한다.(데이터베이스 관리자)
 	sql> grant_name to user_name;
 	
 --롤을 생성하기 위해 system계정으로 접속 	
 sql> conn system/a1234
 --mrole 생성
 sql> CREATE role mrole;
 		롤이 생성되었습니다.
 --특정사용자 hr계정으로 롤에 권한 ㅇ부여한다.
 sql> conn hr/a1234
 --mrole 롤에emp객체 조회할수 있는 SELECT 문 권한 설정. 
 sql> GRANT select on emp to mrole;
 		권한이 부여되었습니다. 
 		
 sql> grant mrole to user04;
 		mrole 이 존재하지 않습니다. 
 sql> conn system/a1234 

 sql> grant mrole to user04;
 		권한이 부여되었습니다.
 sql> SELECT * FROM hr.emp;
 
 
 
 	[user05 사용자 계정을 생성 및 롤을 이용한 권한부여]
 sql> CREATE TABLE mem2(
 	id VARCHAR2(10),
 	name VARCHAR2(50)
 );
 	테이블이 생성되었습니다.
 	
 sql> INSERT INTO mem2 VALUES('a001', '홍길동');
 		1개의 행이 만들어졌습니다.
 sql> SELECT * FROM mem2;
 
 
 sql> conn system/a1234 
 sql> create user user05 identified by tiger;
 sql> grant user user05 identified by tiger;
 sql> grant connect, resource to user05;
 sql> conn user05/tiger;
 sql> create table mem2(
	 	id VARCHAR2(10),
	 	name VARCHAR2(50)
	 );
 sql> INSERT INTO mem2 VALUES('a001', '홍길동');
 sql> SELECT * FROM mem2;
 sql> 
 sql> 
 sql> 
 sql> 
 sql> 
 sql> 
 
 

 
