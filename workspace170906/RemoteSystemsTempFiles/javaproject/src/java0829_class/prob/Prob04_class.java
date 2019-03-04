package java0829_class.prob;


/* 1 display()메소드에서 code별 가격합계를 구현하는 프로그램을 구현하시오.
 * 
 * 2 출력결과
 *   컴퓨터 75000
 *   소설   25000
 * 
 */
class BookShop {
	//멤버변수
	String title;
	String code;
	int price;

	BookShop(String title, String code, int price) {
		this.title = title;
		this.code = code;
		this.price = price;
	}
}

public class Prob04_class {

	public static void main(String[] args) {
		BookShop[] shop=new BookShop[5];
		shop[0]=new BookShop("Java의 정석","컴퓨터",20000);
		shop[1]=new BookShop("나그네","소설",10000);
		shop[2]=new BookShop("실무에 바로쓰는 엑셀","컴퓨터",25000);
		shop[3]=new BookShop("초인","소설",15000);
		shop[4]=new BookShop("웹구현 JSP","컴퓨터",30000);
		display(shop);
		
		}//end main()	
		
		public static void display(BookShop[] shop){
	      //code별 가격 합계를 구하는 프로그램을 구현하시오.
			int computer=0;
			int novel = 0;
			for(BookShop bs : shop) {
				if(bs.code=="컴퓨터") {
				computer+=bs.price;
				}else if(bs.code=="소설"){
				novel+=bs.price;
				}else {
					System.out.println("error!!");
				}
			}
			System.out.println("컴퓨터 : "+computer + "\n소  설 : " + novel);
			
			
			
		}//end display()

}//end class
