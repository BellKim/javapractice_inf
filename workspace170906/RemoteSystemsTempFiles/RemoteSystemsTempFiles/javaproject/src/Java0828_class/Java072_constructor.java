package Java0828_class;

class Employees{
	String name;
	String dept;
	int salary;
	
	public Employees() { //2
		this("홍길동","보류", 3000); //3
	}//9
	
	public Employees(String name, String dept, int salary) {//4
	
		this.name = name;
		this.dept = dept;
		this.salary = salary;//5~7
	}//8 생성자끝. 
	
	public void prn() {//11
		System.out.printf("%s %s %d \n", name, dept, salary);//12
		
	}//13
	
}//14

public class Java072_constructor {

	public static void main(String[] args) {
		Employees emp = new Employees("용팔이", "기획", 500);
		emp.prn();
		
		Employees emp2 = new Employees();//1
		emp2.prn();//10
		

	}//end main()			//15

}//end class
