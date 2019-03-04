package java0912_collection;

public class java188_Sort {

	public static void main(String[] args) {
		String a = "ABCqwer";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";
		
		System.out.println(b.compareTo(d)); //0
		System.out.println(d.compareTo(e)); //  -32
		//다르면 앞에서 뒤를 뺌 'A' - 'a' => 65-79 = -32
		
		System.out.println(a.compareTo(b));
		// ABC가 같으므로 상쇄되고(앞에서 뒤뺌) qwer이 남음 4출력됨.
		
		
		

	}//end main()

}//end class
