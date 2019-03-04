package java0829_class;


	/*
	 * 아래를 참조하여 main() 매소드를 추가하는 로직을 구현하세요 .
	 * 
	 * [실행결과]
	 * 상품				가격			상품제고		팔린수량
	 * Nikon			400000			30		50
	 * sony				450000			20		35
	 * FujiFilm			350000			10		25
	 * 
	 */
	
	class Goods{
		String name;	//상품명
		int price;		//상품가격
		int numberOfStock;	//상품제고
		int sold;		//팔린수량
		
		
		public Goods(String name, int price, int numberOfStock, int sold) {
			
			this.name = name;
			this.price = price;
			this.numberOfStock = numberOfStock;
			this.sold = sold;
		}

		public void prn() {
			System.out.printf("%-14s %8d %5d %5d \n", name, price, numberOfStock, sold);
		}
		
	}

public class Java074_constructor {
	public static void main(String[] args) {
		
//		Goods number1 = new Goods("Nikon", 400000,30,50);
//		Goods number2 = new Goods("Sony", 450000,20,35);
//		Goods number3 = new Goods("Nikon", 350000,10,25);
//		System.out.printf("%-14s %8s %5s %5s \n","이름","가격","재고","팔림");
//		number1.prn();
//		number2.prn();
//		number3.prn();	//prn 출력방식1
		
		Goods[] goodArray=new Goods[3];//메모리에 3개의 배열이 생성됨. 
		goodArray[0] = new Goods("Nikon", 400000, 30, 50);
		goodArray[1] = new Goods("Sony", 450000, 20, 35);
		goodArray[2] = new Goods("FujiFilm", 300000, 10, 25);
		
//		for(int i = 0; i<goodArray.length; i++) {
//			goodArray[i].prn();
//		}//prn 출력방식2
		display(goodArray); //prn 출력방식3
		
		

	}//end of main()
	
	
	public static void display(Goods[] goodArray) {
		for(int i=0; i<goodArray.length; i++) {//prn 출력방식3
			goodArray[i].prn();
		}
	}//end display()
	
	

}// end class
