package Java0825_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
		System.out.println("<< 100 까지의 소수 >>");
		primeNumber(100);
		
		
		
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		
		for(int i=2; i<num; i++) { 	//해당 숫자까지 소수를 구하고자 한다(num)
			int upcount=0;	
			//System.out.println(i+"를보자");
			for(int j=2; j<=i-1; j++) {//나머지를 체크하고자한다. 
				//1과 자기자신을 제외하고 전부다 나머지를 체크해보자
				//1과 자기자신을 제외하고 다른숫자들의 나머지값이 0이 나온다면 그숫자는 소수가 아니다. 
				if(i%j>0) {	//나머지가 0 초과 일경우에 upcount를 해주고
					upcount+=1;
					//System.out.println("나머지 "+ (i%j));
				}
			}
			if(upcount==i-2) { //업카운트된 숫자가 num-2 와 같으면 소수가 디고
				System.out.print(i+" ");
			}else if(upcount!=i-2) {  //업카운트된 숫자가 num-2 와 같지 않으면 소수가 아니다.
				//System.out.println(i+" ");
			} 
			upcount=0;	//한 숫자에 대해서 소수 여부를 판별하기위한 upcount 를 초기화해준다.
		}
		System.out.println("\n");

	}// end primeNumber( )
}//end class