package java0823_statement;
/*
 * 10 + 5 = 15
 * 10 - 5 = 5
 * 10 * 5 = 50
 * 10 / 5 = 2
 * 
 */

public class Java027_switch {

	public static void main(String[] args) {
		char ope = '/';
		int numX = 10;
		int numY = 5;
		int res = 0;
		
		
		switch(ope){
		case '+': res = numX+numY; break;
		case '-': res = numX-numY; break;
		case '*': res = numX*numY; break;
		case '/': res = numX/numY; break;
		
		
		}
		
		System.out.printf("%d %c %d = %d 입니다. \n",numX,ope,numY,res );
		
		
		

	}// end of main()

}	//end of class()
