package java0913_collection;

class Average <T extends Number>{
	private T[] list;
	public Average() {
		
	}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum = sum+data.doubleValue();
		return sum/list.length;
		
	}
	
}//end class


public class java200_User {

	public static void main(String[] args) {
		Integer it[] = new Integer[] {1,5,3,2};
		Average<Integer> av = new Average<Integer>(it);
		System.out.println(av.findAverage());
		
		Double de[] = new Double[] {4.2,10.3,2.8};
		Average<Double> ag = new Average<Double>(de);
		System.out.println(ag.findAverage());
		
		//Average<String> ae = null;//The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Average<T>
		
		Number nb[] = new Number[] {2, 5.3, 4.5};
		Average<Number> aa = new Average<Number>(nb);
		System.out.println(aa.findAverage());
		

	}//end main()

}//end class
