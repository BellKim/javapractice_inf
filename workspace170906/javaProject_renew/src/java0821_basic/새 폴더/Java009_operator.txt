package java0821_basic;

public class Java009_operator {

	public static void main(String[] args) {
		
		int i=5;
		int j=0;
		
		
		//전위형 : 값이 창조되기전에 증가시킨다.
		//i 변수의 값을 1증가시키고 j 변수에 대입한다.
		//j=++i;
		
		
		//후위형 : 값이 창조된 후에 증가시킨다. 
		//i변수의 값을 j 변수에 대입한 후에 i 변수를 1증가시킨다. 
		j=i++;
		
		
		
		System.out.println("j = "+j);
		System.out.println("i= "+i);
		
		
		

	}//end of main()

}//end of class()
