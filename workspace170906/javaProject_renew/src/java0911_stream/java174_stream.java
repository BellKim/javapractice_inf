package java0911_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 직렬화(serializable)
 * 1. 객체를 연속적인 데이터로 변환하는 것이다. 
 * 		반대로는 역직렬화다.
 * 2. 객체의 맴버변수들의 ㄱ밧을 일렬로 나열하는 것이다. 
 * 3. 객체를 저장하기 위해서는 객체를 직려로하해야한다.
 * 4. 객체를 저장하는 것은 객체의 맴버변수의 값을 저장한다는 것이다. 
 * 5. 객체를 직렬화하여 입출력할 수 있는 스트림.
 * 		ObjectInputStream, ObjectOutputStream
 */
class Phone implements Serializable{		// implements Serializable{ 추가함(직렬화)
	String name;
	//직렬화에서 제외할 맴버변수에 transient 을 명시한다. 
	transient int price;
	
	
	


	public Phone(){
	}
	public Phone(java.lang.String name, int price) {
		super();
		this.name = name;
		this.price = price;
	
	}
	
	public String toString() {
		return name+"\t"+price;
		
	}
	
}//end class


public class java174_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/phone.dat");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi = null;
		ObjectInput oi = null;
		
		try {
			fs = new FileOutputStream(file);//직접적으로 object로  연결하려면  fileoutputstream 으로 연결할수있다. 
			os = new ObjectOutputStream(fs);
			Phone p = new Phone("android",5000);
			os.writeObject(p);
			os.writeObject(new String("java"));
			os.flush();
			System.out.println("객체 저장!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("////////////////////////////////////");
		
		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			Phone p = (Phone)oi.readObject();			//(phone) 다운캐스팅
			System.out.println(p.toString());
			String sn = (String)oi.readObject();
			System.out.println(sn.toString());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}//end main()

}//end class








