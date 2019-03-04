package Java0828_class;
/*
 * 홍길동 30 M
 * 갑동이 25 F
 */

	class Person{
		//맴버변수
		String name;
		int age;
		char gen;
	
	
	//메소드
	void eat() {
		System.out.println("eat");
		
	}
	void run() {
		System.out.println("run");
	}
}//end person ////////////////////////////
	
	
	public class Java065_class {
		
	public static void main(String[] args) {
		Person ps;//객체 참조변수 선언.
		ps = new Person( );
		
		//person ps = new Person();
		
		//객체참조변수. 맴버변수;
		ps.name = "홍길동";
		ps.age = 30;
		ps.gen = '남'; //a맴버변수에 값 저장함.
		
		System.out.printf(" %s %d %c \n", ps.name, ps.age, ps.gen);
		//객체참조변수. 매소드(); //2
		
		ps.eat();
		ps.run();
		// System.out.println(ps.eat()); //사용불가.
		
		////////////////////////////////////////////////////////
		
		Person pn=new Person();
		pn.name="이영희";
		pn.age=25;
		pn.gen='여';
		System.out.printf(" %s %d %c \n", pn.name, pn.age, pn.gen);
		pn.eat( );
		pn.run( );
		
		
	
		
		

	}//end of mai()

}//end class
