package java0914_thread.prob;



class KoreanThread implements Runnable{	
	char[] arr = new char[26];
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (char ch = 'ㄱ'; ch<='ㅎ'; ch++) {
			if(ch=='ㄲ'|ch=='ㄳ'|ch=='ㄵ'|ch=='ㄶ'|ch=='ㄶ'|
					ch=='ㄺ'|ch=='ㄻ'|ch=='ㄼ'|ch=='ㄽ'|
					ch=='ㄾ'|ch=='ㄿ'|ch=='ㅀ'|ch=='ㅃ'|
					ch=='ㅄ'|ch=='ㅆ'|ch=='ㅉ')
				continue;

//			System.out.println("\t 한글 : "+ ch);
			System.out.print(" "+ ch);
		}
		System.out.println(" ");
	}
	
}//end koreadThread
	

class EnglishLowerThread implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (char ch = 'a'; ch<='z'; ch++) {

//			System.out.println("\t 소문자 : "+ ch);
			System.out.print(" "+ ch);
		}
		System.out.println(" ");
	}
}
	

class EnglishUpperThread implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (char ch = 'A'; ch<='Z'; ch++) {

//			System.out.println("\t 대문자 : "+ ch);
			System.out.print(" "+ ch);
		}
		System.out.println(" ");
	}
	
}

public class Prob002_thread {

	public static void main(String[] args) {
		
		Runnable t1=new EnglishLowerThread();
		Runnable t2=new EnglishUpperThread();
		Runnable t3=new KoreanThread();
	
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
//		
		th1.start();
		th2.start();
		th3.start();

	}//end main()

}//end class
