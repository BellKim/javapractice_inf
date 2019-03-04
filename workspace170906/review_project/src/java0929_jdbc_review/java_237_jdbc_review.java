package java0929_jdbc_review;

import java.util.List;
import java.util.Scanner;

public class java_237_jdbc_review {

	public static void main(String[] args) {
		/*
		 * 콘솔창에서 입력한 이름이 first_name컬럼에 포함되여 있으면
		 * 대소문자 구분없이 해당되는 레코드를 검색한다.
		 * 이름을 입력하세요?alex
			103 Alexander 9000 1990-01-03
			115 Alexander 3100 1995-05-18
			185 Alexis 4100 1997-02-20
			
			즉, Alex 이란 단어가 있으면 모두 출력하도록 해라 라는 문제.
				SELECT *
				FROM employees
				WHERE lower(first_name) like lower('%alex%');
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요????");
		String word = sc.nextLine();
		
		EmpDAO dao = EmpDAO.getInstance();//db접속
		List<EmpDTO> aList = dao.searchMethod(word);
		for (EmpDTO dto : aList) {
			System.out.printf("%d %s %d %s\n", 
					dto.getEmployee_id(),
					dto.getFirst_name(), 
					dto.getSalary(),
					dto.getHire_date());
		}

	}//end main( )

}//end class
