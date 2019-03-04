package java0904_binding;

public class java112_binding {

	public static void main(String[] args) {

		LgTv2 lg = new LgTv2("LG!!!");
		process(lg);
		
		SamsungTv2 ss = new SamsungTv2("SAMSUNG!!");
		process(ss);
		
	}//end main ( )
	
	//결합도 (의존도) 가 낮아졌다. 
	public static void process(HomeTv tv) {
		tv.trunOn();
		//다운캐스팅해야함.
		if(tv instanceof LgTv2) {//다운캐스팅
			LgTv2 lg = (LgTv2)tv;
			lg.call();
			
		}else if (tv instanceof SamsungTv2) {
			SamsungTv2 ss = (SamsungTv2)tv;
			ss.loc();
		}
		
	}//end process();
	
	

}//end class
