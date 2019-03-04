package jaesik;

class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		String[] res = expression.split("\\+");
		for (int i = 0; i < res.length; i++) {
			sum = sum + Integer.parseInt(res[i]);
		}

		return sum;
	}
}

public class test1111 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		System.out.println("1+2+3 = " + sum);

	}// end main()

}// end class
