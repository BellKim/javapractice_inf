--DROP 테이블

DROP TABLE company;
DROP TABLE food_list;
DROP TABLE cashier;
DROP TABLE autoincrement;
DROP TABLE payment;
DROP TABLE member;

DROP TABLE company CASCADE CONSTRAINTS;
DROP TABLE food_list CASCADE CONSTRAINTS;
DROP TABLE cashier CASCADE CONSTRAINTS;



--drop SEQUENCE 
DROP SEQUENCE company_num_seq;
DROP SEQUENCE food_list_num_seq;
DROP SEQUENCE payment_num_seq;
DROP SEQUENCE cashier_num_seq;
DROP SEQUENCE autoincrement_num_seq;


--===============================================================================
CREATE TABLE autoincrement(
	member_increment   NUMBER DEFAULT 0
);

	CREATE SEQUENCE autoincrement_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE autoincrement_num_seq;

--	  최초에 데이터를 한번만 생성함.
	  INSERT INTO autoincrement VALUES(autoincrement_num_seq.nextval);

--	이후에는 업카운트로 사용자를 체크함. 카운트를 줄때 쓰는 구문. 결제버튼을 누르면 UPDATE를 하게한다.
--	UPDATE autoincrement set member_increment = autoincrement_num_seq.nextval;
	
	
--	  SELECT* FROM autoincrement;


--===============================================================================


--업체정보

CREATE TABLE company(
	company_no   NUMBER, 
	company_name VARCHAR2(30), 
	address	     VARCHAR2(30), 
	phone_number NUMBER(20), 
--	company_pw   VARCHAR2(15),
	PRIMARY KEY(company_no)
	);
	
	CREATE SEQUENCE company_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE company_num_seq;

INSERT INTO company VALUES(company_num_seq.nextval, '음료수만파는그룹','경기도', 01044443333);
INSERT INTO company VALUES(company_num_seq.nextval, '일븐그룹','경기도 수원시', 01012312323);
INSERT INTO company VALUES(company_num_seq.nextval, '서울상사','서울특별시 구로구', 0212347895);
INSERT INTO company VALUES(company_num_seq.nextval, 'GS25','서울특별시 양천구', 0244448888);
INSERT INTO company VALUES(company_num_seq.nextval, '만리장성','서울시 강남구',0234567895);
INSERT INTO company VALUES(company_num_seq.nextval, '전주식당','서울시 강남구',025657895);
INSERT INTO company VALUES(company_num_seq.nextval, '춘천고향','서울시 강남구',029999895);
INSERT INTO company VALUES(company_num_seq.nextval, '스시하나','서울시 강남구',028999895);


--		company 전체조회구문

--		SELECT * FROM company;	

--================================================================================
	



--음식정보	
	
CREATE TABLE food_list (
	food_id		NUMBER,
	food_name	VARCHAR2(25),
	food_price	number(10),
	company_no  NUMBER(12),
	PRIMARY KEY (food_id),
	FOREIGN KEY(company_no) REFERENCES company(company_no)
	);
	
	--시퀀스 생성.
CREATE SEQUENCE food_list_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
	  
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE food_list_num_seq;
	  
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '야채김밥', 1500, 2);	
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '참치김밥', 4500, 2);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '소고기김밥', 1500, 2);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '치즈김밥', 4500, 2);

INSERT INTO food_list VALUES(food_list_num_seq.nextval, '김치찌개', 5000, 3);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '짜장면', 6000, 3);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '닭갈비', 5000, 3);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '우동세트',7000, 3);

INSERT INTO food_list VALUES(food_list_num_seq.nextval, '우유', 1500, 1);	
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '오란씨', 900, 1);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '콜라', 1000, 1);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '오란씨', 1200, 1);

INSERT INTO food_list VALUES(food_list_num_seq.nextval, '참치찌개', 5000, 4);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '닭발면', 6000, 4);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '파전', 5000, 4);
INSERT INTO food_list VALUES(food_list_num_seq.nextval, '초계국수',7000, 4);


--	 SELECT * FROM food_list;
	  
	  

	
	
	
--================================================================================
--회원가입 정보	
	
CREATE TABLE member (
	member_phone_num 	VARCHAR2(15),
	member_name		VARCHAR2(15),
	member_saved_money	NUMBER(6),
	PRIMARY KEY(member_phone_num)
	);
	
	
	INSERT INTO member VALUES('01041415151','홍길동',15000);
	INSERT INTO member VALUES('01035457890','이영희',200);
	INSERT INTO member VALUES('01012345678','김철수',3000);
	INSERT INTO member VALUES('01023456789','김철수',6000);
	INSERT INTO member VALUES('01034567890','김철수',21000);

--	 SELECT * FROM member;	
	
	
	
--================================================================================
--CASHIER 정보	
CREATE TABLE cashier(
	cashier_no     NUMBER(20),
	cashier_name   VARCHAR2(20),
	cashier_phone_number  VARCHAR2(12),
	cashier_id     VARCHAR2(20),
	cashier_pw     VARCHAR2(20),
	PRIMARY KEY(cashier_no)
);


CREATE SEQUENCE cashier_num_seq
  START WITH 1
  INCREMENT by 1
  nocache
  nocycle;
  
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE cashier_num_seq;
 
  
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '홍길동','01055557777','C555','abcd7777');
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '이영희','01033338888','D333','efgh9999');
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '김철수','01044443333','F222','wqrt1212');
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '박다은','01022229999','H0909','vbcn2094');
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '김찰스','01041960137', 'kk44jf', 'aa22df3');
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '김이쁨','01012333333', 'kk33jf', 'aa11df3');
 INSERT INTO Cashier VALUES(Cashier_num_seq.nextval, '김몬생김','01033434334', 'kffkjf', 'aa55df3');
 
 
--  SELECT * FROM Cashier;
  
  


--================================================================================
--    DROP TABLE payment;
--결재정보	
	
CREATE TABLE payment (
	order_no		NUMBER,
	order_date 		DATE,
	food_id			NUMBER(12),
	food_count		NUMBER(4),
	food_sum		NUMBER(20),
	pay_way			NUMBER(2) DEFAULT 0,
	food_status		NUMBER(2) DEFAULT 0,
	order_status	NUMBER(2) DEFAULT 0,
	member_phone_num VARCHAR2(15),
	cashier_no		NUMBER(20),
--	PRIMARY KEY (order_no),
	FOREIGN KEY(food_id) REFERENCES food_list(food_id),
	FOREIGN KEY(member_phone_num) REFERENCES member(member_phone_num),
	FOREIGN KEY(cashier_no) REFERENCES cashier(cashier_no)
	);
	
	
	CREATE SEQUENCE payment_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE payment_num_seq;

	  
	
	INSERT INTO payment VALUES(payment_num_seq.nextval, '2016-05-01', 5, 2, 10000, 1, 1, 1, '01035457890', 1);	  
	INSERT INTO payment VALUES(payment_num_seq.nextval, sysdate, 1, 2, 3000, 1, 1, 1, '01035457890', 1);
	INSERT INTO payment VALUES(payment_num_seq.nextval, sysdate, 2, 2, 9000, 1, 1, 1, '01035457890', 1);
	INSERT INTO payment VALUES(payment_num_seq.nextval, sysdate, 8, 8, 56000, 1, 1, 1, '01035457890', 1);
	
	

	
--	SELECT * FROM payment;

	
	
--================================================================================

	
	
--SELECT 정보
SELECT * FROM autoincrement;
SELECT * FROM company;	
SELECT * FROM food_list;
SELECT * FROM member;
SELECT * FROM cashier;
SELECT * FROM payment;







