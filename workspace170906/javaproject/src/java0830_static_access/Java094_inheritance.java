package java0830_static_access;

class SuperConst{
	int x;
	int y;
	
	public SuperConst(int x, int y) {//5
		this.x = x;//6
		this.y = y;//7
	}//8
	
}//end SuperConst

class SubConst extends SuperConst{//기본생성자가 안떠서 그렇다. (7라인)
	SubConst(){//3
		//SuperConst 클래스에 1개의 생성자가 정의되어 있으므로
		//JVM에서 기본생성자를 제공하지 않으므로 super(); 로 호출할수 없다. 
		//super(); 그러므로 인자값을 넣어줌으로 해서 해결한다. 이게 매우 중요하다. 중요중요
		super(10,40);//superconst를 불러와서 인자값을 넣어줌. //4
	}//9
	
}

public class Java094_inheritance {

	public static void main(String[] args) {//1
		SubConst sc = new SubConst();//2
		System.out.printf("x = %d y = %d \n", sc.x, sc.y);//10
		

	}//end main() //11

}//end class //12
