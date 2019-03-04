package java0912_collection.prob;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*
 * [문제]
 * phone.txt파일에 저장된 값들을  phoneProduct()메서드에서
 * SmartPhone에 저장한 후 ArrayList에 추가한후 리턴하고,
 * phoneList()메소드에서 프로그램 실행결과처럼 출력하는 프로그램을
 * 구현하시오.
 * 
 * [프로그램 실행결과]
 * << 1 번째 상품 >>
	제품 아이디 : PROD-00001
	제품명 : 아이폰5
	가격 : 940000
	수량 : 4
	제조사 : 애플
   << 2 번째 상품 >>
	제품 아이디 : PROD-00002
	제품명 : 갤럭시S
	가격 : 860000
	수량 : 3
	제조사 : 삼성전자

 */
public class Prob003_ArrayList {

	public static void main(String[] args) {
		String pathFile=".\\src\\java0912_collection\\prob\\phone.txt";

		ArrayList<SmartPhone> phoneList = phoneProduct(pathFile);

		prnDisplay(phoneList);
	
		
	}//end main()
	
	private static ArrayList<SmartPhone> phoneProduct(String pathFile) {
		// phone.txt파일의 데이터를 ArrayList에 저장한후 리턴하는 프로그램을 구현하시오.
		File file = new File(pathFile);
		BufferedReader br = null;
		FileReader fr = null;
		ArrayList<SmartPhone> aList = new ArrayList<SmartPhone>();
		
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			String[] arr;
			while((line=br.readLine())!=null) {//1,2,3 .... 진행
				arr = line.split(":");
				
				for(int i=0; i<arr.length; i++) {//arr0-4 // 0-4
					System.out.println(i+"="+arr[i]);
				}//주석처리할것. 
				
				SmartPhone a = new SmartPhone();
				a.setProductId(arr[0]);
				a.setMaker(arr[4]);
				a.setName(arr[1]);
				a.setAmount(Integer.parseInt(arr[3]));
				a.setPrice(Integer.parseInt(arr[2]));
				aList.add(a);

				
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		//string으로 값을 받아서 배열로 저장후 
		//ArrayList로 결과값을 출력해야 한다.
	

		return aList;
	}//end phoneProduct( )
	
	private static void prnDisplay(ArrayList<SmartPhone> phoneList){
		//phoneList매개변수의 저장된 값을 출력하는 프로그램을 구현하시오.
		for( int i = 0; i < phoneList.size(); i ++)
			System.out.println(phoneList.get(i).toString());

	}//end prnDisplay( )

}//end class











