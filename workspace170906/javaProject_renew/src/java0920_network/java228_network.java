package java0920_network;
/*
 * 네트워크 : 두대이상의 컴퓨터를 케이블로 연결하여 구성하는 기능이다. 
 * 클라이언트/서버: 컴퓨터간의 관계를 역할로 구분하는개념이다.
 * 서버 : 서비스를 제공하는 컴퓨터이다.
 * 클라이언트 : 서비스를 사용하는 컴퓨터이다.
 * 서비스 : 서버가 클라이언트로부터 요청받은 작업을 처리하여 그 결과를 제공하는 개념이다. 
 * 
 * 네트워크에 관련된 정보 : java.net.*;
 * InetAddres : ip주소를 다루기 위한 클레스이다. 
 * 
 * 
 * 
 * 아파치, chrome맞춰서 개발. 
 * 
 */

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class java228_network {

	public static void main(String[] args) {
//		InetAddress ip = InetAddress.getByName("daum.net"); 입력 -> 오류가 발생함 -> 예외처리
		
		try {
			InetAddress ip = InetAddress.getByName("daum.net");
			//host domain name 리턴
			System.out.printf("getHostName() : %s\n",ip.getHostName());
			//host ip리턴
			System.out.printf("getHostAdress() : %s\n",ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
