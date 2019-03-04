package java0822_statement;
/*
 * if안에 if
 * 
 * if(조건식1){
 * 		if(조건식2){
 * 			수행할 문장;	//조건식1 과 조건식2를 모두 만족할때 수행.
 * 		}else{
 * 			수행할 문장; //조건식1은 true고 조건식2는 false일떄 수행.
 * 		}
 * 	}else{
 * 	수행할문장;
 * 	}
 *
 */

public class Java019_if {

	public static void main(String[] args) {
		boolean member=true;	//member or Not Member;
		String grade="일반"; //회원등급
		//회원이면 vip 고객이면 30%적립, 회원이면 vip 고객이 아닐때 10%적립.
		
		if(member) {
			if(grade=="VIP") {
				System.out.println("30% 적립");
			}else {
				System.out.println("10%적립");
			}
		}else {
			System.out.println("비회원");
		}
		
		System.out.println("고갱님감사합니다.");

	}//end of main()

}//end of class()



