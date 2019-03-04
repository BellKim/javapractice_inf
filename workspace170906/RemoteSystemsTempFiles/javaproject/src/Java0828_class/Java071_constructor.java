package Java0828_class;
/*
 * this : 객체 자신을 의미한다. 
 * this.맴버변수 ;
 * this.매소드();
 * this(); 생성자
 * 
 */
class Product{
	String code;
	String pname;
	int cnt;
	
	public Product() {	}

	public Product(String code, String pname, int cnt) {	//3
		//맴버변수와 매개변수 이름이 같을 때 맴버변수에 this 키워드를 명시한다. 
		this.code = code; //4
		this.pname = pname; //5
		this.cnt = cnt; //6
	} // 마우스 오른쪽 - 소스 - 밑에서 3번째 누르면 자동완성이된다. //7
	
	public void prn() {//9
		System.out.printf("%s %s %d \n", code, pname, cnt);//10
		
	}//11
	
	public void call() {
		this.prn();
	}
	
	
	
}//end Product


public class Java071_constructor {

	public static void main(String[] args) { //1
		
		Product pt = new Product("a001", "육류", 2);//2
		pt.prn();//8

	}//end main()//12

}//end class
