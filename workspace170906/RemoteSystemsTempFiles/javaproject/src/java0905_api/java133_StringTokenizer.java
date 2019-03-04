package java0905_api;

import java.util.StringTokenizer;
//중요  : 
//3개로 값이 나오는것과 4개로 나오는 이유를 알아야한다. 

public class java133_StringTokenizer {

	public static void main(String[] args) {
		//구분자가 연속적으로 입력되어 있으면 두번째 구분자부터는 무시를한다.
		StringTokenizer st = new StringTokenizer("java,, jsp/spring", ",/");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		System.out.println("///////////////////////////////");
		String[] data = "java,,jsp/spring".split("[,/]");
		System.out.println(data.length);
		for(String ss : data)
			System.out.println(ss);
		

	}//end main()

}//end class
