package java0912_collection.prob;

import java.util.ArrayList;

/*
 * 2 
 * 10 
 * 4 
 * 6
 */

public class Prob004_ArrayList {

   public static void main(String[] args) {
      int[] arr = { 5, 9, 3, 2, 7 };
      int[] num = { 1, 10, 15, 4, 6 };
      ArrayList<Integer> v = merge(arr, num);
      for (Integer it : v)
         System.out.println(it);
   }// end main()

   public static ArrayList<Integer> merge(int[] arr, int[] num) {
      // arr,num배열을 병합한후 2의 배수만 리턴하는 프로그램을 구현하시오.
     
	   ArrayList<Integer> aList = new ArrayList<Integer>();
      ArrayList<Integer> twoList = new ArrayList<Integer>(); // 2의 배수 저장
      
      for(int i =0; i<arr.length+num.length ; i++){
         //aList사이즈가 arr길이보다 작으면 추가!
         // 길이보다 크면 num길이에서 빼야지!
         if(aList.size() < arr.length){
            aList.add(new Integer(arr[i]));
         }else{
            aList.add(new Integer(num[i-arr.length]));
         }
      }
      
      for(int i =0; i<aList.size(); i++){
         if(aList.get(i) % 2 ==0){
            twoList.add(aList.get(i));
         }
      }
      return twoList;

   }// end merge();

}









