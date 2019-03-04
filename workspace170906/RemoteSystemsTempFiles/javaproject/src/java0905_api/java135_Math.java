package java0905_api;
import static java.lang.Math.*;

public class java135_Math {

	public static void main(String[] args) {
		double ran=random();
		System.out.println(ran);
		
		ran=ran*10;
		//소수점을 버리는 함수 floor();
		int num = (int)floor(ran);
		System.out.println(num);
		
		
		System.out.println((int)-7.8);
		System.out.println(floor(-7.8));
		
		System.out.println((int)7.8);
		System.out.println(floor(7.8));
		
		

		

	}

}
