package java0829_class;


class Employee{
	String name;
	int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void prn() {
		System.out.printf("%s %d \n",name, salary);
	}
	
}
public class Java082_for {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Employee("John",5000);
		emp[1] = new Employee("Steven",8000);
		for(Employee ep : emp ) {
			ep.prn();
			
		}
		


	}// end of main

}// end class
