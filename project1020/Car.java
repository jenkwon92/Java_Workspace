/*
자동차를 정의한다
class 명 car
색상
가격
자동주행모듈여부
달린다 
멈춘다
*/
class Car{
	//아래의 변수는크래스로부터 인스턴스가 생성될 때, 해당 인스턴스에 포함되어지는 
	//인스턴스 변수로써, 생명력은 해당 인스턴스가 소멸될 때까지 함께한다.

	//자동차의 부품이므로, 자동차와 생명을 같이한다.
	//이러한 멤버변수는 , 초기화 하지않으면 컴파일러가 최소한의 관여로 값을 자동초기화한다.
	String color; //null로 초기화됨
	int price; //정수는 최소한의 값 0으로 초기화 
	boolean autoPilot; //최소한의 값은 false로 초기화
	public void go(){
	}
	public void stop(){
	}

	Car c = new Car();
	System.out.println("color: "+c.color);
	System.out.println("price: "+c.price);
	System.out.println("autoPilot: "+c.autoPilot);
}
