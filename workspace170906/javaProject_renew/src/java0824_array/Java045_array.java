package java0824_array;

public class Java045_array {

	public static void main(String[] args) {
		int[] data1 = new int[3];			//0기본값
		long[] data2 = new long[3];			//0L
		float[] data3 = new float[3];		//0.0F
		double[] data4 = new double[3];		//\u0000(공백)
		boolean[] data6=new boolean[3];		//false
		String[] data7=new String[3];		//null
		
		
		for(int i = 0; i< data4.length; i++) {
			System.out.println(data1[i]);
			System.out.println(data2[i]);
			System.out.println(data3[i]);
			System.out.println(data4[i]);
			System.out.println(data6[i]);
			System.out.println(data7[i]);
		}
		
		

	}

}
