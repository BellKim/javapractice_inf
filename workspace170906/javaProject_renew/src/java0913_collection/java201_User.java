package java0913_collection;
/*
 * 	1. 와일드카드(?)를 제공하는 이유
 * 		: 컬렉션에 저장되어있는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은
 * 			저장할 수 없는 상태였다. 하지만 때로는 기존과 같은 모든 객체들을 
 * 			저장해야 할때가 있다. 
 * 	2. 와일드카드의 구성
 * 		<?> : 모든 객체자료형에 대한 배치를 의미한다.
 * 		<? super 객체자료형> : 명시된 객체자료형이나 
 * 			객체자료형의 상위 객체들의 배치를 의미한다.
 * 		<? extends 객체자료형> : 명시된 객체자료형이나 
 * 			객체자료형으로 부터 상속받은 하위객체들의 배치를 의미한다.
 * 
 * 실질적으로 프로젝트에선 잘안쓰이기도함.
 */

class Seoul{
	public void showYou() {
	System.out.println("seoul !!!!!!");
	}
}//end seoul!!!!!!!!

class Fruits extends Seoul{
	
	public void showYou() {
		System.out.println("Fruits!!!!!!!");
	}
	
}	//end class fruits

class Apple extends Fruits{
	@Override
	public void showYou() {
		System.out.println("apple");
	}
}//end apple!!!!!!!!!!

class Orange extends Fruits{
	@Override
	public void showYou() {
		System.out.println("orange");
	}
}

class FruitBox<T>{
	T item;
	
	public void store(T item) {
		this.item = item;
		
	}
	
	public T pullout() {
		return item;
		
	}
}//end class FruitBox




public class java201_User {

	public static void main(String[] args) {
		FruitBox<Apple> fApple = new FruitBox<Apple>(); 
		fApple.store(new Apple());
		openAndFruitBox(fApple);
		
		FruitBox<Seoul> fSeoul = new FruitBox<Seoul>(); 
		fSeoul.store(new Seoul());
//		openAndSeoul(fSeoul);
		
		
		

	}//end main()
	
	public static void openAndFruitBox(FruitBox<? extends Fruits> param) {
		param.pullout().showYou();
	}
	public static void openAndSeoul(FruitBox<? super Seoul> param) {
		((Seoul)param.pullout()).showYou();
		//pullout 은 fruit로 리턴
		
		
	}

}//end class










