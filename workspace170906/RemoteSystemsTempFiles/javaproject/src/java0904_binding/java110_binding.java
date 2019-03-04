package java0904_binding;

class BindTest extends Object{
	String stn;
	public BindTest() {
		
	}
	
	public BindTest(String stn) {
		this.stn=stn;
	}
	
	@Override
	public String toString() {
		return stn;
	}
	
	
	
}//end Bind Test///////////////////////////

public class java110_binding {

	public static void main(String[] args) {
		BindTest bt = new BindTest("test");//메모리범위(뒤)와 참조범위(앞)가 같을떄
		
		//정적바인딩
		System.out.println(bt.toString());
		process(bt);
		//Object obj=bt;//업캐스팅
//		System.out.println(obj.toString());// 동적바인딩 발생. 

	}//end main 
	
	//is ~ a (상속) -> (up-casting)업캐스팅 -> dynamic binding(동적바인딩)
								//업캐스팅
	public static void process(BindTest obj) { 	//bindTest bt -> 정적바인드
		//이 부분이없ㅇ느면 process(bt); 가 오류난다.
		System.out.println(obj.toString());//동적바인딩
		
	}//end process

}//end class 
