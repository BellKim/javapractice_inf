package java0911_stream;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java172_stream {

	public static void main(String[] args) {
		DataOutputStream ds = null;
		FileOutputStream fs = null;
		DataInputStream di = null;
		FileInputStream is = null;
		
		try {
			fs = new FileOutputStream("src/java0911_stream/sample.txt");
			ds = new DataOutputStream(fs);
			ds.writeInt(65);		//유니코드값을 넣는다. 65는 대문자 A 이다.
			ds.write(65);
			ds.writeDouble(10.5);
			ds.writeChar('a');
			ds.writeUTF("java");
			ds.flush();//초기화.
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ds.close();
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("===================================");
		
		try {
			is = new FileInputStream("src/java0911_stream/sample.txt");
			di = new DataInputStream(is);
			
			System.out.println(di.readInt());
			System.out.println(di.read());
			System.out.println(di.readDouble());
			System.out.println(di.readChar());
			System.out.println(di.readUTF());
			
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				di.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		

	}//end main()

}// end class














