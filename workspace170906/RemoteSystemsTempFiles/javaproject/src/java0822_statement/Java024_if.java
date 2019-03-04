package java0822_statement;
/*
 * 출력결과
 * station = "KBS", channel = 7 => 닥터포스터
 * station = "KBS", channel = 9 => 국수의신(국신)
 * station = "MBC" => 몬스터
 * station = "EBS" => 한국기행
 */

public class Java024_if {

	public static void main(String[] args) {
		int channel = 9;
		String station = "KBS";
		
		if(station == "KBS") {
			if(channel == 7) {
				System.out.printf("%s","닥터포스터");
			}else if( channel == 9) {
				System.out.printf("%s","국수의신");
			}
		}else if(station == "MBC"){
			System.out.printf("%s","몬스터");
		}else if(station == "EBS"){
			System.out.printf("%s","한국기행");
		}
		
		
	}

}
