package java0929_jdbc_review;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedQueue queue = new LinkedQueue();
		
		//음식 버튼 각각 누를 때 마다 큐에 삽입 
		queue.insert_food("김밥",2000);
		//현재까지 큐에 들어있는값 출력
		System.out.println();
		queue.print_savefood();
		queue.insert_food("김밥",2000);
		System.out.println();
		//현재까지 큐에 들어있는값 출력
		queue.print_savefood();
		queue.insert_food("김밥",2000);
		System.out.println();
		//현재까지 큐에 들어있는값 출력
		queue.print_savefood();
		queue.insert_food("떡볶이", 3000);
		//현재까지 큐에 들어있는값 출력
		queue.print_savefood();
		System.out.println();
		

		
		//주문버튼 눌렀을 때 DB로 보내기
		while(!queue.isEmpty()) {			
			QueueNode temp =queue.select_food();
			System.out.printf("DB에 전송될 값=%s, %d, %d\n",temp.food_name,temp.food_number,temp.food_price);
			
		}
	}
}

class QueueNode{
	String food_name;
	int food_number;
	int food_price;
	QueueNode link;
}

class LinkedQueue{
	
	QueueNode front;
	QueueNode rear;
	
	LinkedQueue(){
		front =null;
		rear =null;
	}//end LinkedQueue
	
	public boolean isEmpty() {
		return (front==null); //참이면 1반환, 거짓이면 0 반환 
	}//end isEmpty
	
	public void insert_food(String name,int price) {
		
			QueueNode newNode = new QueueNode();
			newNode.food_name = name;
			newNode.food_number = 1; 
			newNode.food_price = price;
			newNode.link = null;
		
			if(isEmpty()) {
				front = newNode;
				rear = newNode;
			} else {
				if(rear.food_name==name) {
					rear.food_number+=1;
					rear.food_price+=price;
				} else {
					rear.link = newNode;
					rear = newNode;
				}
			}
	}//end insert_food
	
	public void delete_food() {
		if(isEmpty()) {
			System.out.println("선택한 상품이 없습니다.");
		} else {
			front = front.link;
			if(front ==null)
				rear =null;
		}
	}//end delete_food
	
	public QueueNode select_food() {
		if(isEmpty()) {
			System.out.println("선택한 상품이 없습니다. 상품을 먼저 선택해 주세요.");
			return null;
		}else {
			QueueNode select = front;
			front = front.link;
			if(front==null)
				rear=null;
			
			return select;
		}
	}//end select_select_foodfood
	
	public void print_savefood() {
		if(isEmpty()) {
			System.out.println("큐가 비어 있습니다. ");
		} else {
			QueueNode temp = front;
			while(temp!=null) {
				System.out.printf("%s, %d, %d",temp.food_name,temp.food_number,temp.food_price);
				System.out.println();
				temp = temp.link;
			}
		}
	}//end LinkedQueue
	
	
	
	
	
	
	
}//end LinkedQueue 