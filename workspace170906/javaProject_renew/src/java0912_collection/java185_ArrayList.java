package java0912_collection;

import java.util.Arrays;
import java.util.List;
//java.aws.array 아니다 

public class java185_ArrayList {

	public static void main(String[] args) {
		String[] arr = {"oracle", "mysql", "mssql"};
		
		//배열 -> 컬렉션(LIST)
		List<String> list = Arrays.asList(arr);
		for(String sn : list) {
			System.out.println(sn);
		}
		


	}//end main()

}//end class
