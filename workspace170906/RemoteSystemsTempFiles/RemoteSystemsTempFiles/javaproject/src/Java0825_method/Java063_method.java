package Java0825_method;

public class Java063_method {

	public static void main(String[] args) {
		char[] arr = {'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't'};
		
		System.out.println(reverse(arr));
		System.out.println(arr);
		
	}//end main()
	
	public static char[] reverse(char[] data){
		//data 요소 앞뒤를 바꿔서 리턴하는 프로그램을 구현하세요 .
		char [] arr=new char[data.length];
		
		
		
	/*
	 * arr[0] = arr[8]
	 * arr[1] = arr[7]
	 * 
	 * 
	 * arr[7] = arr[1]
	 * arr[8] = arr[0] 
	 * 
	 * 
	 * 
	 * arr[0] = data[data.length-1-0];
	 *arr[1] = data[data.length-1-1];
	 *
	 *
	 *arr[0] = data[data.length-1-7];
	 *arr[0] = data[data.length-1-8];
	 * 
	 */
		
		
		
		for(int i=0; i<data.length; i++) {//방법1.
			arr[i]=data[data.length-1-i];
		}
		/*
		for(int i=data.length-1; i>=0; i--) {//방법2. 마지막 인덱스는 배열의 크기보다 1작다. 0부터 시작하기때문에.
			arr[i]=data[data.length-1-i];
		}*/
		
		
		
		return arr;
		
	}//end recerse()

}//end class
