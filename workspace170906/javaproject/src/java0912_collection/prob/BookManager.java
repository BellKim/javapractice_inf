package java0912_collection.prob;

import java.util.ArrayList;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		
        int total = 0;

        for(int i=0; i<bookList.size(); i++){

           if(bookList.get(i).getKind().equals(kind)){

               total += bookList.get(i).getRentalPrice();

            }

        }
        return total;
    }//end getRentalPrice()
}//end class
		


