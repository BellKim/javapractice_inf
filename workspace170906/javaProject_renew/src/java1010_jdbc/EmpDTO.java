package java1010_jdbc;

public class EmpDTO {
	private int employee_id;
	private String first_name;
	private int salary;
	private DeptDTO dept; 
	//이건 나중에 추가한후에   84라인의 edto.setDept(dept); 의 구문이 더들어가도록한다. 
	
	public EmpDTO () {
		
	}

	public DeptDTO getDept() {
		return dept;
	}
	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	//--------------------------------
	
	
	

}
