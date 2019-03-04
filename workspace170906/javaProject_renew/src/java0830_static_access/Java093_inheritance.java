package java0830_static_access;



class MyGrand {
	public MyGrand() {//7
		System.out.println("MyGrand");//8
	}//9
}//end MyGrand

class MyFather extends MyGrand{
	public MyFather() {//5
		super();//6
		System.out.println("MyFather");//10
	}//11
}//end MyFather

class MyChild extends MyFather{
	public MyChild() {//3 //자식클레스에있는 생성자는 부모클레스생성자를 불러온다. 
		//자손(자식)생성자에서는 반드시 부모생성자를 호출해야 한다. 
		//부모생성자 호출이 생략되어 있으면 JVM 에서 super(); 로 호출한다.
		super();//4 여기서 MyFather 호출
		System.out.println("MyChild");//12
	}//13
}//end MyFather() 



public class Java093_inheritance {

	public static void main(String[] args) {//1
		
		MyChild m = new MyChild();//2

	}//end main		//14

}//end class
