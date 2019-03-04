package java0908_stream;

import java.io.IOException;
import java.io.InputStream;

public class java160_stream {
	//엔터를치면 커서를 제일 앞으로 페이지리턴, 다음줄로 바꿔주는 라인피드 두가지 기능이있다.
	/*carriage return : 줄의 처음으로 이동(13)
	 * line feed : 다음 줄로 이동(10) 
	 */
	public static void main(String[] args) {
		System.out.println("데이터입력");
		InputStream is = System.in;
		int data;//아마 오류발생(값이 선언되지 않았기때문에 )
		
		//abc
		try {
			//1. isread() 호출후 문자를 읽어옴.
			//2. read()ㅇㅔ서 리턴해주는 문자(값)을 --data변수에 저장.
			//3. data변수의 값과 13을 비교
			// java.io.InputStream 은 해당바이트의 다음 바이트를 읽어오는 역할을 한다. 
			
			System.out.println("is = "+is.read());
			while((data=is.read()) !=13 ) {  //1. read()로 data에 값넣어줌  2. 
			//while(is.read()!=13) {//오류구분	

			System.out.println((char)data);//b = 98저장.	
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}//end main

}//end class

//inputstream은 모든 문자열을 아스키코드로 인식한다. 
//실제로 abc를 넣으면 abc에 해당하는 아스키코드와 엔터에 해당하는 아스키코드숫자 13이 입력이된다. 
//inputStream은 하나한 차곡차곡 쌓인다고 생각하면 되겠다. 
//abc 를 입력하고 a 를 뽑아내면 bc 만 출력이되며 뽑아내지않으면 영원히 남아버린다. 
//.read() 함수는 inputstreamread 내에 저장되어있는 바이트의 다음 바이트를 순차적으로 읽는 역할을한다.

