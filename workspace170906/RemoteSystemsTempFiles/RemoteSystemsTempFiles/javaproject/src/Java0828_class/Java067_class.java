package Java0828_class;
/*
 * 가로	세로	넓이구함	둘레구함
 *  5	 3		15     16
 *  7	 4		28	   22
 *  
 *  [객체모델링과정]
 *  객체의 특징 : 가로, 세로
 *  객체의 기능 : 넓이를 구한다. 둘레를 구한다. 
 * 
 *  
 *  [출력괄과]
 *  가로 5, 세로4, 사각형
 *  넓이 : 15 
 *  둘레 : 16
 *  +
 *  
 */



class Rect{
	int width;	//가로
	int height; //세로
	
	int area() { //넓이를 구하는 매소드
		return width*height;		
	}//end of area
	
	int grith() {//둘레를 구하는 매소드
		return (width*height)/2;
	}
	void prn() {
		System.out.printf("[가로 %d, 세로 %d의 사각형] \n", width, height);
		System.out.printf("넓이  : " + area());
		System.out.printf("둘레  : " + grith());
	}//end prn;
		
	
}//end rect


public class Java067_class {

	public static void main(String[] args) {
		Rect t1 = new Rect();
		t1.width = 5;
		t1.height = 3;
		System.out.println();
		t1.prn();
		System.out.println("===========================");
		
		Rect t2 = new Rect();
		t2.width = 5;
		t2.height = 3;
		System.out.println();
		t2.prn();
		
		System.out.println("===========================");
		
		
		
		


	}// end main

}//end class














