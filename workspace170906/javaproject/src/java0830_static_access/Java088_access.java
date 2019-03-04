package java0830_static_access;
//087의 자원을 088 에서 사용하려고한다.
/*
*	1. private : 같은 클래스에서만 접근이 가능하다. 
*	2. default : 같은 패키지에서만 접근이 가능하다. 
*	3. protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다. 
*	4. public : 접근제한이 없다.*/

public class Java088_access {

	public static void main(String[] args) {
		Java087_access p = new Java087_access();
//		System.out.println("var_private = %d \n ", p.var_private);//접근ㄱ불가
		System.out.printf("var_default = %d \n ", p.var_default);//동일 패키지에서 접근가능. 
		System.out.printf("var_protected = %d \n ", p.var_protected);	//동일패키지, 다른패키지의 자손클래스접근.
		System.out.printf("var_public = %d \n ", p.var_public);


	}//end main()

}//end class
