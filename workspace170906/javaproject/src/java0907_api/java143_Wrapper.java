package java0907_api;

public class java143_Wrapper {

	public static void main(String[] args) {
		int x=10;
		double y=5.8;
		char[] data = {'a', 'b', 'c'};
		
		//기본데이터 -> string
		String a = String.valueOf(x);
		String b = String.valueOf(y);
		String c= String.valueOf(data);
		System.out.printf("%s %s %s\n", a,b,c);
		
		//String -> 기본데이터
		String input = "1234";
		int k = Integer.parseInt(input);
		double m = Double.parseDouble(input);
		float n = Float.parseFloat(input);
		System.out.printf("%d %.1f %.1f \n", k,m,n);
		
		
		
		
		

	}

}
