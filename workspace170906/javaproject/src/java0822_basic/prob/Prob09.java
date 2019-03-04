package java0822_basic.prob;
/*
 * 동전교환프로그램
 * 1. 가장 적은 동전으로 교환할 수 있는 프로그램 을 작성하시오.
 * 2. [출력결과]
 * 		500원 : 15개
 * 		100원 : 2개
 * 		50원 : 1개
 * 		10원 : 2개
 * 		1원 : 7개 
 */
public class Prob09 {

	public static void main(String[] args) {
/*
		int money = 7777;
		
		int m500 = money/500;
		int l500 = money%500;
		
		int m100 = l500/100;
		int l100 = l500%100;
		
		int m50 = l100/50;
		int l50 = l100%50;
		
		int m10 = l50/10;
		int l10 = l50%10;
		
		int m1 = l10;
		int l1 = l10;
		
		System.out.printf("%s \n",m500);
		System.out.printf("%s \n",m100);
		System.out.printf("%s \n",m10);
		System.out.printf("%s \n",m1);
*/
		
		int money = 7777;
		int mok = money/500;//15
		System.out.printf("500원 = %d", mok);
		
		money = money%500;//277
		
		
		mok=money/100;//2
		
		
		money=money%100;//77
		
		money=money/50;//1
		
		money=money%50;//27
		mok = money/10;//1
		
		money=money%10;//7
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
