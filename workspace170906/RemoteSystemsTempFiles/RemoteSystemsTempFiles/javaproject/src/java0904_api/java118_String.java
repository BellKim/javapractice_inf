package java0904_api;
//117번예제 참고해서 풀어라.
/*
출력결과 : 
	ip : 127.0.0.1
	port : 8080
*/
public class java118_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		String[] arr=sn.split(":");	//split리턴타입은 배열이다.
		
		System.out.printf("ip = %s \n port = %s \n",arr[0],arr[1]);
	
		int index = sn.indexOf(":");
		System.out.println("ip" + sn.substring(0, index));
		System.out.println("port" + sn.substring(index+1));
		
		
		

	}//end main()

}//end class
