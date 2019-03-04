package java0905_api;
/*
 * num 배열에 1부터 10까지의  난수 값을 저장하는 프로그램으 구현하라
 * 
 */

public class java137_Math {

	public static void main(String[] args) {
		int [] num = new int[5];
		
		for(int i=0; i<num.length;i++) {
			num[i] = (int)(Math.floor(Math.random()*10)+1);
			//중복체크
		for(int j=0; j<i; j++) {
			if(num[i]==num[j]) {
				i--;
				break;
			}
		}//빠져나오면 i++로 이동. 
			
			
			
		}
//		double res = Math.random();
//		System.out.println((double)Math.round(res*100)/10);
//		System.out.println(Math.round(res*10)/10.0);
		

	}

}
