package java0830_static_access.prob;

// -(private)    + (public)    #(protected)     X : default
/* 
 * -name:String                    
 * -dept:String 
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:double):void
 * 
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * +setEmployee(name:String, dept:String, pay:int, score:double)
 * +toString():String 
 */
public class Employee {
	public String name;
	public String dept;
	public int pay;
	public double score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public String toString() {
	//	name dept score
	
		
		return "이름은"+this.name+"이고 "+this.dept+"에 근무하며 급여는 "+this.pay+"원, 입사성적은 "+this.score+"입니다.";
	}
	
	public void setEmployee(String name, String dept, int pay, double score) {
		this.name = name;
		this.dept=dept;
		this.pay = pay;
		this.score = score;
		
		System.out.printf("\n사원이름 : %s\n 근무부서 : %s\n 받는급여 : %d\n 입사점수 : %.2f",name,dept,pay,score);
		
	}
	
	
	
	
	
	
}
















