package java0830_test_access;

import java0830_static_access.Java087_access;

public class Java088_access extends Java087_access { 	//087 부모  -> 088 자식  088에서 087을 가져다 쓴다. 

	public static void main(String[] args) {
		//다른패키지 임폴트 : 패키지명 다 쓰고 ctrl + space 누름. 
		Java088_access p = new Java088_access();	//부모로부터 받았다고 선언을해야함. 87이 아니라 88로 선언. 
		
//		System.out.println("var_private = %d \n ", p.var_private);//접근ㄱ불가
//		System.out.printf("var_default = %d \n ", p.var_default_default);
		System.out.printf("var_protected = %d \n ", p.var_protected);
		System.out.printf("var_public = %d \n ", p.var_public);

		

	}//end main()

}
