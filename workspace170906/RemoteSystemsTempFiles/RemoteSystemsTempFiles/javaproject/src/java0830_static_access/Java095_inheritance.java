package java0830_static_access;

class Parent{//5
	String name;
	int age;
	
	public Parent() {
	}

	public Parent(String name, int age) {//5
		this.name = name;//6
		this.age = age;//7
	}//8
	
}//end Parent


class Sun extends Parent{
	String dept;
	public Sun() {
	}

	
	public Sun(String name, int age, String dept) {//3
		super(name, age);//4
		this.dept=dept;//9
	}//10
	
	public void prn() {//12
		System.out.printf("%s %d %s \n", name, age, dept);//13
	}//14
			
			
}//end sun




public class Java095_inheritance {	

	public static void main(String[] args) {//1
		Sun ss = new Sun("홍길동", 50, "기획부");//2
		ss.prn();//11

	}//end main()//15

}//end class
