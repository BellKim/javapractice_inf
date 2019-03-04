package Java0825_method;

public class Java055_method {

	public static void main(String[] args) {
		int a = 4, b = 2, c = 5;
		int[] num = new int[] { 2, 3 };
		int[] data = new int[] { 1, 5, 8, 9 };
		System.out.println(process(a,b,c));
		int hap = process(a, b, c);
		
		System.out.println(hap/3.0);
		System.out.println(plus(num));
		System.out.println(plus(data));
	}// end main()

	public static int process(int x, int y, int z) { //기본적으로 바로 넘겨줌.
		return x + y + z;
	}// end process

	public static int plus(int[] arr) {//배열을 참조하여라.(주소가 저장되어있어서 주소를 참조하라라는뜻)
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}// end plus

}// end class
