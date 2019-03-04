package Java0828_class;
/*
 * 맴버변수 : 클래스에 정의되어있는변수.
 * 지역변수 : 매소드 
 * 매개변수 : 매소드
 * 블록변수 : 블록(특정역역정의) ex> for
 * 
 * class Test{
 * 	String name; //맴버변수
 * 				//매개변수
 * 	void process(int x ){
 * 		int num;	//지역변수
 *
 * }
 * 	
 * 		for(int i=0; i<5; i++){
 * 			//블록변수
 * 		}
 * 
 * }
 * 
 */

class MemberVar{
	//맴버변수는 기본값을 제공한다.(JVM) 
	
	byte var_byte;	//0
	short var_short;
	int var_int;	//0
	long var_long;	//0L
	float var_float; // 0.0F
	double var_double;	//0.0
	boolean var_boolean;//false
	char var_char;		//\u0000
	int[] num;			//null
	
	
}//end class;

public class Java069_class {

	public static void main(String[] args) {
		//지역변수는 기본값을 제공하지 않는다.
//		byte loc_byte; //지역변수
		//System.out.printf("loc_byte: %d\n"+ loc_byte);
		
		MemberVar mv = new MemberVar();
		System.out.println("var_byte : %d\n "+mv.var_byte);//기본값이 0이다.
		System.out.println("var_short : %d\n "+mv.var_short);//기본값이 0ㅇ이다.
		System.out.println("var_int : %d\n "+mv.var_int);//기본값이 0ㅇ이다.
		System.out.println("var_long : %d\n "+mv.var_long);//기본값이 0ㅇ이다.
		System.out.println("var_float : %.1f\n "+mv.var_float);//기본값이 0ㅇ이다.
		System.out.println("var_double : %d\n "+mv.var_double);//기본값이 0ㅇ이다.
		System.out.println("var_boolean : %d\n "+mv.var_boolean);//기본값이 0ㅇ이다.
		System.out.println("var_char : %d\n "+mv.var_char);//기본값이 0ㅇ이다.
		System.out.println("int[] num =%s\n : %d\n "+mv.num);//기본값이 0ㅇ이다.
	//ocjp 시험에 나온다. 기본값 정의가 잘못된것은? 
		
		
		

	}

}









