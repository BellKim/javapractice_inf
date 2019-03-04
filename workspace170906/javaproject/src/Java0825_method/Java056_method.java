package Java0825_method;

public class Java056_method {

	public static void main(String[] args) {
		//stack 영역에 값이 저장 - 기본 데이터 타입. 
		
		
		int a=10, b=20;
		
		int c=a, d=b;// 값 복사(call by value)
//a->b로 저장 b->a 로 저장 하기위해서는 어디다가  둘중에 하나를 넣어둔 상태에서 b->a를 실행후 가상공간의 값을 가져온다. 
		int temp=c;
		c=d;
		d=temp;
		System.out.printf("a=%d b=%d\n", a,b);
		System.out.printf("c=%d d=%d ", c,d);
		
		//stack 영역에 주소저장 - 참조 데이터 타입.
		int[] num=new int[] {10,20};
		int[] arr=num;
		
		int imsi=arr[0];
		arr[0]=arr[1];
		arr[1]=imsi;
		
		System.out.printf("arr 0 = %d arr 1 = %d\n", num[0],num[1]);
		System.out.printf("arr 0 = %d arr 1 = %d\n", arr[0],arr[1]);
		
		
		

	}

}
