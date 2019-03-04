package java0913_collection.prob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;



/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 * 
 * 
 * arraylist 183-186
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */
		String pathFile="src/java0913_collection/prob/booklist.txt";
		File file = new File(pathFile);
		BufferedReader br = null;
		FileReader fr = null;
		String line;
		String[] arr;
		
		
		try {
//			LinkedList<String> booklist = new LinkedList<String>();
			LinkedList<String> nQueue = new LinkedList<String>();
			
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			int count = 0;
			int countall=0;
			System.out.printf("%20s %20s %20s %20s\n","title","publisher","writer","price");
			while((line=br.readLine())!=null){
				arr = line.split("/");
				for(int i=0; i<arr.length; i++) {
					nQueue.offer(new String(arr[i]));
				}	
			}//end while
			
			while(!nQueue.isEmpty()) {
				if(count==4) {
					System.out.println(" ");
					count=0;
				}
				System.out.printf("%20s",nQueue.poll());
				count+=1;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	
	}//end main()

}//end class











