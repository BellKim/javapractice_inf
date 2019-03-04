package java0908_stream;
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class java166_1_extract {
		public static void main(String[] args) {
			File file = new File("sample.txt");
			FileReader fr = null;
			int data;
			
			try {
				fr = new FileReader(file);
				//read() : 파일의 끝일때 -1을 리턴한다.
				while((data=fr.read()) != -1) {
					System.out.print((char)data);
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("/////////////////");
			BufferedReader br = null;
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String line = "";
				//파일의 끝이면 readLine()는 null을 리턴한다.
				while((line=br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
					fr.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("/////////////////////////");
			Scanner sc = null;
			
			try {
				sc = new Scanner(file);
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				sc.close();
			}
		}// end main()
	}// end class
