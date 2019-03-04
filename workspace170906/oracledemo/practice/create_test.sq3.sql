--DROP 테이블

DROP TABLE Company;
DROP TABLE Orders;
DROP TABLE Food_list;
DROP TABLE Payment;
DROP TABLE Member;
DROP TABLE Casher;

--===============================================================================

CREATE TABLE Company(
	company_no   NUMBER, 
	company_name VARCHAR2(30), 
	address	     VARCHAR2(30), 
	phone_number NUMBER(20), 
	company_pw   VARCHAR2(15),
	PRIMARY KEY(company_no)
	);
	
	CREATE SEQUENCE Company_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE Company_num_seq;


--		SELECT * FROM Company;	

--================================================================================
		  
	  
--음식정보	
	
CREATE TABLE Food_list (
	food_id		NUMBER,
	food_name	VARCHAR2(25),
	food_price	number(10),
	company_no  NUMBER(12),
	PRIMARY KEY (food_id),
	FOREIGN KEY(company_no) REFERENCES Company(company_no)
	);
	
	--시퀀스 생성.
CREATE SEQUENCE Food_list_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
	  
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE Food_list_num_seq;
	  
	  
 
--	 SELECT * FROM Food_list;
	  
	  
--================================================================================

--주문서(Order는 sql명령어 6g이므로 Order's' 사용)	
	
CREATE TABLE Orders (
	order_no	NUMBER,
	order_date  DATE,
	user_no		NUMBER(5),
	amount		NUMBER(10),
	company_no  NUMBER(12),
	PRIMARY KEY(order_no),
	FOREIGN KEY(company_no) REFERENCES Company(company_no)
	);
	
		--시퀀스 생성.
CREATE SEQUENCE Orders_num_seq
	  START WITH 1
	  INCREMENT by 1
	  nocache
	  nocycle;
	  
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE Orders_num_seq;

	  
	  
	  
--	 SELECT * FROM Orders;


	
	
	
--================================================================================
--회원가입 정보	  

CREATE TABLE Member (
	member_phone_num 	VARCHAR2(15),
	member_name		VARCHAR2(15),
	member_saved_money	NUMBER(6),
	PRIMARY KEY(member_phone_num)
	);
	

--	 SELECT * FROM Member;	

	
--================================================================================
--CASHER 정보	
CREATE TABLE Casher(
	casher_no     NUMBER(20),
	casher_name   VARCHAR2(20),
	casher_phone_number  VARCHAR2(12),
	casher_id     VARCHAR2(20),
	casher_pw     VARCHAR2(20),
	PRIMARY KEY(casher_no)
);


CREATE SEQUENCE Casher_num_seq
  START WITH 1
  INCREMENT by 1
  nocache
  nocycle;
  
--		시퀀스를 초기화 하고 싶을때 주석을 삭제하고 이 구문을 실행하세요.  
--	  DROP SEQUENCE Casher_num_seq;
  



--  SELECT * FROM Casher;
  
  


--================================================================================

--결재정보	
	
CREATE TABLE Payment (
	order_no	NUMBER(10),
	food_id     NUMBER(12),
	food_status number(2) DEFAULT '0',
	pay_sum		NUMBER(10),
	member_phone_num    VARCHAR2(15),
	casher_no   NUMBER(20),
	pay_way		VARCHAR2(20),
	FOREIGN KEY(order_no) REFERENCES Orders(order_no),
	FOREIGN KEY(food_id) REFERENCES Food_list(food_id),
	FOREIGN KEY(member_phone_num) REFERENCES Member(member_phone_num),
	FOREIGN KEY(casher_no) REFERENCES Casher(casher_no)
	);
	  
	  
	  
--	SELECT * FROM Payment;

	
--================================================================================
--SELECT 정보
	
	SELECT * FROM Company;	
	SELECT * FROM Orders;
	SELECT * FROM Food_list;
	SELECT * FROM Member;
	SELECT * FROM Casher;
	SELECT * FROM Payment;
  
	  
	  
	  
