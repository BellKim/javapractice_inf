package java0904_binding;
//before 파일들 이랑 연결된것이다. 

public class java111_binding {

	public static void main(String[] args) {
		display(4.5, 6.3);
		display(10,20);//일시적 형변환이 일어나서 데이터를 넘겨줄수 있음. 
		LgTv_before lg = new LgTv_before("LG!!!");
		processLg(lg);
		
		SamsungTv_before ss = new SamsungTv_before("SAMSUNG!!");
		processSamsung(ss);
		
	}//end main ( )
	
	
	//결합성(의존성)이 높다 -> 유지보수와 확장성이 약하다. 
	public static void processLg(LgTv_before lg) {
		lg.trunOn();
	}//end processLg()
	
	public static void processSamsung(SamsungTv_before ss) {
		ss.trunOn();
	}//end processLg()
	
	
	public static void display(double x, double y) {
		System.out.println(x + y);
		
	}//end display

}//end class
