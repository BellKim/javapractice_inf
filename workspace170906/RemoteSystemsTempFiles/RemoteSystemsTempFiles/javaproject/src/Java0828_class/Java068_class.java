package Java0828_class;
/*
 * 메뉴명 	가격 		갯수
 * 떡볶이		2000	3
 * 김말이		500		2
 * 오뎅		300		4
 * 
 */

/*
 * [c출력결과 ]
 * 메뉴명 ;
 * 가격:
 * 갯수:
 * 메뉴금액:
 * 
 * 메뉴명
 * 가격
 * 갯수
 * 메뉴금액:
 * 
 * 메뉴명
 * 가격
 * 갯수
 * 메뉴금액:
 * 
 * ====================
 * 총금액 : 8200
 * 
 */
class MenuShop{
	String menu;
	int price;
	int cnt;
	int total_all = 0;
	
	//주문메뉴 계산
	int count() {
		return price * cnt;
	}
	void total_all() {
		
		
	}
	
	void prn() {
		System.out.println("메  뉴 명 : " + menu);
		System.out.println("가      격 : " + price);
		System.out.println("갯      수 : " + cnt);
		System.out.println("메뉴금액 : " + count());
	}
	

	
}//end MenuShop///////////////


public class Java068_class {
	

	public static void main(String[] args) {
		MenuShop m1 = new MenuShop();
		m1.menu="떡볶이";
		m1.price = 2000;
		m1.cnt = 3;
		System.out.println();
		m1.prn();
		System.out.println("===========================");
		
		MenuShop m2 = new MenuShop();
		m2.menu="김말이";
		m2.price = 500;
		m2.cnt = 2;
		System.out.println();
		m2.prn();
		System.out.println("===========================");
		
		
		MenuShop m3 = new MenuShop();
		m3.menu="오뎅";
		m3.price = 300;
		m3.cnt = 4;
		System.out.println();
		m3.prn();
		System.out.println("===========================");
		int addall= m1.count()+m2.count()+m3.count();
		System.out.println("총 합 : " +  addall);
		
		
		
		
		
		
		

	}

}









