package java0905_api;
/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오. 
 * 
 * ex> 0.5689.... 	=>5.7
 */

public class java136_Math {

	public static void main(String[] args) {
		double nan = Math.random();
		System.out.println(Math.round(nan));
		
		nan = nan * 100;
		System.out.println(nan);
		long data = Math.round(nan);
		System.out.println(data);
		double num = data/10.0;
		System.out.println(num);
		
		System.out.println("//////////////////////////");
				double res = Math.random();
				System.out.println((double)Math.round(res*100)/10);
				System.out.println(Math.round(res*10)/10.0);
		
		
		

	}

}
