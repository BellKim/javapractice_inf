package java0911_collection;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 * 
 */
class Person{
	String name;
	
	int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+" "+age;
	}
	
	
	
}//end class

public class java178_Vector {

	public static void main(String[] args) {
		/*Person arr[] = new Person[2];
		arr[0] = new Person("홍길동",ㅏㅑㅡ개30);
		arr[1] = new Person("이영희",25);
		
		for(Person ps : arr)
			System.out.printf("%s \n", ps.toString());*/
		
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동", 30));
		vt.add(new Person("이영희", 25));
		
		for(Person ps : vt)
			System.out.printf("%s \n", ps.toString());
		
		
		
		
		
		
		

	}//end main()

}//end class














