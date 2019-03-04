package java0821_basic;

public class Java012_operator {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int c=5;
		
		//&&연산자의 좌변이 false 이면 우변은 실행하지 않는다. 
		boolean res = (++a > b) && (++b < c); //좌변이 false 가 되면 우변은( && 뒤의것들) 은 실행조차 안한다. 
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("res=" + res);// false
		
		
		int x=4;
		int y=8;
		int z=10;
		
		//|| 연산자의 좌변이 true 이면 우변은 실행하지 않는다.
		
		res = (z > ++y) || (++x > y ); //
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("res=" + res);// false
		

	}//end of main()

}//end of class()
