package java0829_class.prob;



/* 출력력과처럼 총합계까지 출력이 되도록 main()메소드에 
 * 로직을 추가하세요.
 * 
 * [출력결과]
 * 연평해전 14000
 * 극비수사 22500
 * 소수의견 14000
 * 총합계: 50500
 */

class MovieShop {
	String name;
	int price;
	int person;

	public MovieShop() {
	}

	public MovieShop(String name, int price, int person) {
		this.name = name;
		this.price = price;
		this.person = person;
	}

	public int countMoney() {
		return price * person;
	}

	public void prn() {
		System.out.printf("%s %d\n", name, countMoney());
	}


}// end class

public class Prob01_class {

	public static void main(String[] args) {
		
		MovieShop[] me = new MovieShop[3];
		me[0] = new MovieShop("연평해전", 7000, 2);
		me[1] = new MovieShop("극비수사", 7500, 3);
		me[2] = new MovieShop("소수의견", 7000, 2);

		// 여기에 구현하세요/////////////////
		me[0].prn();
		me[1].prn();
		me[2].prn();
		process(me);
	
		//////////////////////////

	}// end main()
	
	
	
	public static int process(MovieShop[] is) {
		int sum = 0;
		for(MovieShop ms : is) { //변수 : 콜랙션
			sum+=ms.countMoney();
			
		
		}
		System.out.println(" 총합 " + sum);
		return sum;
			
	}//end process
	
	

}// end class

