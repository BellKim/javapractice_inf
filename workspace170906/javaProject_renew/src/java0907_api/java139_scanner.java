package java0907_api;

import java.util.Scanner;

public class java139_scanner {

	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결.
		
		Scanner sc = new Scanner(System.in);//여기까지 입력하면 콘솔창에서 입력이 가능하다.
		System.out.println("이름 : ");
		String name = sc.nextLine(); //콘솔창에 입력이도면 enxtline() 이 입력받는다.


		
//		String name = sc.nextLine();
		System.out.println(name);
		


	}

}
