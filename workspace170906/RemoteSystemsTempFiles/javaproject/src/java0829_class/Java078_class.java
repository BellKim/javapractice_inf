package java0829_class;

/*
 * [출력결과]
 * 기업은행 42523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액:509000
 */
class CreditCard {
	String cardName;
	String cardNum;
	int pay;

	public CreditCard() {
	}

	public CreditCard(String cardName, String cardNum, int pay) {
		super();
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}

	public void prn() {
		System.out.printf("%s %s %d\n", cardName, cardNum, pay);
	}

}// end CreditCard

public class Java078_class {

	public static void main(String[] args) {
		/// [출력결과]를 참조하여 구현하시요/////////////////
		CreditCard[] user = new CreditCard[3];
		user[0]= new CreditCard("기업은행","42523-52325",100000);
		user[1]= new CreditCard("하나은행","52253-22623",153000);
		user[2]= new CreditCard("신한은행"," 16239-95235",256000);
		int sum = process(user);//예금총액계산
		
		prn(sum);//전체출력

	}// end main()
	
	public static int process(CreditCard[] user) {
		int totalsum=0;
		for(int i=0; i<user.length; i++) {
			totalsum=totalsum+user[i].pay;
//			System.out.println(user[i].pay);
			
		}
		return totalsum;
	
	}
	
	
	public static void prn(int sum) {
		System.out.printf("총납입액은 %d원 입니다.\n", sum);
	}

}// end class
