package java0912_collection;

import java.util.ArrayList;

public class java184_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		String listString = " ";
		aList.add(new String("oracle"));
		
		aList.add(new String("mysql"));
		
		aList.add(new String("mssql11"));
		
//		System.out.println(aList);
//		System.out.println(aList.split(","));
		
		String[]arr = display(aList);
		
		for(String data : arr)
			System.out.println(data);
		
		

	}//end main
	
	public static String[] display(ArrayList<String> aList) {
		//ArrayList ->string []
		////////////////////////////////////////////////
/*		
		String[] stn = new String[aList.size()];
		for(int i=0; i<stn.length; i++) {
			stn[i] = aList.get(i);
		}
			return stn;
		////////////////////////////////////////////////
*/
		
	/*	
		Object[] obj = aList.toArray();
		String[] sg = new String[obj.length];
		for(int i = 0; i<sg.length; i++) {
			sg[i] = (String)obj[i];
		}
		return sg;
	*/
		////////////////////////////////////////////////
	/*
		String[] arr = new String[aList.size()];
		String[] line = aList.toArray(arr);
		return line;
	*/
		
		return aList.toArray(new String[aList.size()]);
		
		

	}//end display

}//end class
