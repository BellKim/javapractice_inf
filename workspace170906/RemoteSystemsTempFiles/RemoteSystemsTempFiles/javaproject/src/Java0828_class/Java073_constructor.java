package Java0828_class;
/*
 * show() 매소드를 아래와 같이 출력이 되도록 구현하세요.
 * 
 * [실행결과]
 * 노래제목: Dansing Queen
 * 가수 :ABBA
 * 앨범: Arrival
 * 작곡가  : Benny Andersson, Bjorn Ulvaeus
 * 년도 : 1977
 * 트랙번호 : 2
 * 
 */

class Song{
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {//2
		//this("학교가자", "홍길동", "홍길동1",)
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
	
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
//		System.out.printf("%s %s %s %s %d %d \n", title, artist, album, composer, year, track);//
//		System.out.println();
//		
//		System.out.printf("title : %s\n artist : %s\n album : %s\n composer : %s\n year : %d\n track : %d \n", title, artist, album, composer, year, track);//
//		System.out.println();
		
		System.out.println("title : "+title);
		System.out.println("artist : "+artist);
		System.out.println("album : "+album);
//		System.out.println("composer : "+composer[0]+", "+composer[1]);
		
		System.out.print("composer : ");
		for(int i = 0; i<composer.length; i++) {
			System.out.print(composer[i]);
			if(i < composer.length-1) {
				System.out.print(", ");
			}else {
				System.out.println();
			}
//			String chk = i<composer.length-1 ? "," : "\n";
//			System.out.println(chk);
		} //3항 연산자로도 가능하다. 
		System.out.println("year : "+year);
		System.out.println("track : "+track);
	}//end show()	
}//end class

public class Java073_constructor {

	public static void main(String[] args) {
		
		Song s = new Song("Dansing Queen", "ABBA", "Arrival", new String[] {"Benny Andersson","Bjorn Ulvaeus"}, 1977, 2);
		s.show();


	}

}
