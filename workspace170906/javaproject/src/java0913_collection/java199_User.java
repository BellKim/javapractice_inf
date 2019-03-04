package java0913_collection;


//hash에서 클래스 정의하기
	class Box<T>{//<T>에서는 클래스 타입을 설정해줘야한다. 
		private T data;

		public Box() {
			
		}
		
		public Box(T data) { //T의 클래스 타입을 써주는곳.
			this.data=data;
			
		}
		
		public void setData(T data) {
			this.data = data;
		}						//setd 에서 컨트롤 스페이스
		
		public T getData() {
			return data;
		}						//getd 에서 컨트롤 스페이스
		
	}//end class
	
public class java199_User {
	
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setData(new Integer(10));
		
		
		System.out.println(box.getData());
		
		
		Box<String> box2 = new Box<String>("java");
		System.out.println(box2.getData());
		
		
		
		

	}//end main()

}//end class
