package java0912_collection;

import java.util.ArrayList;
import java.util.Comparator;

class Person implements Comparator<Person> {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	@Override
	public int compare(Person o1, Person o2) {
		
//		//이름 오름차순
//		return o1.name.compareTo(o2.name);
		
//		//이름 내림차순
//		return o2.name.compareTo(o1.name);
		
		//나이 오름차순
//		return o1.age.compareTo(o2.age);		
		//Cannot invoke compareTo(int) on the primitive type int
		/*
		if(o1.age>o2.age)
			return 1;
		else if(o1.age<o2.age)
			return -1;
		else
			return 0;*/
		
		
		//나이 내림차순
		/*
		if(o2.age>o1.age)
			return 1;
		else if(o2.age<o1.age)
			return -1;
		else
			return 0;
		*/
		
		//이름 오름차순, 나이 내림차순
		if(!(o1.name.equals(o2.name)))
			return o1.name.compareTo(o2.name);
		else if(o1.age>o2.age)
			return -1;
		else if(o1.age<o2.age)
			return 1;
		else
			return 0;
		
		
//		return 0;
	}
}

public class Java189_Sort {

	public static void main(String[] args) {
		ArrayList<Person> ts = new ArrayList<Person>();
		ts.add(new Person("홍길동", 40));
		ts.add(new Person("가비", 30));
		ts.add(new Person("가비", 20));
		ts.add(new Person("나비", 15));
		ts.sort(new Person());
		System.out.println(ts);
	}// end main()

}// end class
