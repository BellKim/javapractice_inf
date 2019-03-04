package java0829_class;

/*
김병조/외과/39
이상만/내과/50
박상기/피부과/20
오상수/내과/25
윤달수/피부과/30
*/

/*
 * [출력결과]
 * 의사명  진료과목  대기환자수
 * 박상기  피부과  20
 * 윤달수  피부과  30
 */
class Doctor{		
	 String name; //의사명
	 String medical; //진료과목
	 int patient; //대기환자수
	
	public Doctor(String name, String medical, int patient) {		
		this.name = name;			//이름
		this.medical = medical;		//진료과목
		this.patient = patient;		//환자수(대기환자수)
	}

  public void prn(){
	   System.out.printf("%s %s %d\n", name, medical, patient);
  }
 
}//end Doctor


public class Java075_class {

	public static void main(String[] args) {
		
		   Doctor[] dt=new Doctor[5];
		   //여기를 구현하세요//////////
		  dt[0] = new Doctor("김병조", "외과", 39);
		  dt[1] = new Doctor("이상만", "내과", 50);
		  dt[2] = new Doctor("박상기", "피부과", 20);
		  dt[3] = new Doctor("오달수", "내과", 25);
		  dt[4] = new Doctor("윤달수", "피부과", 30);
		  
//		  for(int i=0; i<dt.length; i++) {
//			  dt[i].prn();
//		  }
		   

             
		   
		   //////////////////////
		   search(dt,"피부과");
		}//end main()

		public static void search( Doctor[] dt,  String medical){
	       //여기를 구현하세요/////////////
			for(int i=0; i<dt.length; i++) {//prn 출력방식3
				
//				if(dt[i].medical!=medical) {
//					continue;					
//				}
//				dt[i].prn();
				
				if(dt[i].medical==medical) {
					dt[i].prn();					
				}
			
			}
			
		   /////////////////////////
	    }
}//end class
