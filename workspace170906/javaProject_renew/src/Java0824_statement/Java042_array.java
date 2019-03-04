package Java0824_statement;

public class Java042_array {

	public static void main(String[] args) {
		int[] jumsu=new int[] {90,80,40};
		
//		System.out.println("jumsu[0]");
//		System.out.println("jumsu[1]");
//		System.out.println("jumsu[2]");
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		System.out.println("=====================");
		
		for(int i=2; i>=0; i--) {		//for(int i=2; i=jumsu.lenth-1; i--) 로도 표현가능하다.
			System.out.println(jumsu[i]);
		}
		
		
		

	}

}
