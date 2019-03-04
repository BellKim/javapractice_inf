INSERT INTO Company VALUES(Company_num_seq.nextval, '음료수만파는그룹','경기도', 01044443333, 1234);
INSERT INTO Company VALUES(Company_num_seq.nextval, '일븐그룹','경기도 수원시', 01012312323, 4321);
INSERT INTO Company VALUES(Company_num_seq.nextval, '서울상사','서울특별시 구로구', 0212347895, 36477);
INSERT INTO Company VALUES(Company_num_seq.nextval, 'GS25','서울특별시 양천구', 0244448888, 48585);
INSERT INTO Company VALUES(Company_num_seq.nextval, '만리장성','서울시 강남구',0234567895,'a1234');
INSERT INTO Company VALUES(Company_num_seq.nextval, '전주식당','서울시 강남구',025657895,'q3344');
INSERT INTO Company VALUES(Company_num_seq.nextval, '춘천고향','서울시 강남구',029999895,'c5234');
INSERT INTO Company VALUES(Company_num_seq.nextval, '스시하나','서울시 강남구',028999895,'d4234');



INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '야채김밥', 1500, 2);	
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '참치김밥', 4500, 2);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '소고기김밥', 1500, 2);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '치즈김밥', 4500, 2);

INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '김치찌개', 5000, 3);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '짜장면', 6000, 3);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '닭갈비', 5000, 3);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '우동세트',7000, 3);

INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '우유', 1500, 1);	
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '오란씨', 900, 1);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '콜라', 1000, 1);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '오란씨', 1200, 1);

INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '참치찌개', 5000, 4);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '닭발면', 6000, 4);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '파전', 5000, 4);
INSERT INTO Food_list VALUES(Food_list_num_seq.nextval, '초계국수',7000, 4);



INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 1, 2, 1);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 1, 1, 1);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 1, 3, 1);

INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 2, 4, 1);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 2, 5, 2);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 2, 2, 2);

INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 3, 4, 3);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, '2017-10-17', 3, 5, 3);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, sysdate, 3, 2, 3);

INSERT INTO Orders VALUES(Orders_num_seq.nextval, '2017-9-10', 3, 4, 4);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, '2017-9-10', 3, 5, 4);
INSERT INTO Orders VALUES(Orders_num_seq.nextval, '2017-9-10', 3, 2, 4);


INSERT INTO Member VALUES('01041415151','홍길동',15000);
INSERT INTO Member VALUES('01035457890','이영희',200);
INSERT INTO Member VALUES('01012345678','김철수',3000);
INSERT INTO Member VALUES('01023456789','김철수',6000);
INSERT INTO Member VALUES('01034567890','김철수',21000);


INSERT INTO Casher VALUES(Casher_num_seq.nextval, '홍길동','01055557777','C555','abcd7777');
INSERT INTO Casher VALUES(Casher_num_seq.nextval, '이영희','01033338888','D333','efgh9999');
INSERT INTO Casher VALUES(Casher_num_seq.nextval, '김철수','01044443333','F222','wqrt1212');
INSERT INTO Casher VALUES(Casher_num_seq.nextval, '박다은','01022229999','H0909','vbcn2094');
INSERT INTO Casher VALUES(Casher_num_seq.nextval, '김찰스','01041960137', 'kk44jf', 'aa22df3');
INSERT INTO Casher VALUES(Casher_num_seq.nextval, '김이쁨','01012333333', 'kk33jf', 'aa11df3');
INSERT INTO Casher VALUES(Casher_num_seq.nextval, '김몬생김','01033434334', 'kffkjf', 'aa55df3');
 


INSERT INTO Payment VALUES(1, 1, 0, 3000, '01012345678', 2, 'card' );
INSERT INTO Payment VALUES(2, 2, 0, 4500, '01035457890', 2, 'cash' );
INSERT INTO Payment VALUES(4, 2, 0, 18000, '01035457890', 3, 'card' );


 
	
SELECT * FROM Company;	
SELECT * FROM Orders;
SELECT * FROM Food_list;
SELECT * FROM Member;
SELECT * FROM Casher;
SELECT * FROM Payment;






