package java0822_statement;
/*
 * 	switch(식){ //식은 여러 다양한 자료형 값들이 존재할수있다.
 * 		case 값1 : 문장1; break;
 * 		case 값2 : 문장2; break;
 * 		case 값3 : 문장3; break;
 * 		case 값4 : 문장4; break;
 * 		default : 문장5;
 * 	}
 * 
 * 	식의 결과 타입 : byte, short, char, int, enum(jdk7 ver), String(jdk7 ver)
 * 	
 * 	swithc ~ case 에서 break을 만나면 현재 수행중인 조검눈을 완전히 빠져나와 다음 문장을 수행한다.
 * 	
 * 
 */

public class Java025_switch {

	public static void main(String[] args) {
		int jumsu = 95;
		char res = 'f';
		
		switch(jumsu/10) {
		case 10: res='A'; break;
		case 9: res='A'; break;
		case 8: res='B'; break;
		case 7: res='C'; break;
		case 6: res='D'; break;
		default : res='F';
		}
		
		
		System.out.printf("%d 점수는 %c 학점입니다. \n", jumsu, res);
		
			

	}

}
