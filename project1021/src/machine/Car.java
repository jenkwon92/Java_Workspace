class Car{
	String name = "Benz";
	int price = 500;
	String color="red";
	//사물과 사물과의 관계에 has a 관계를 가지고있음
	Wheel wheel=null; //이코드가 낯설지 않은 이유?
	//클래스 안에는 자료형을 둘 수 있는데 자바의 자료형은 총 4개 이다.
	//따라서 이 클래스 안에는 문자, 숫자,논리값 이외에도 객체형도 올 수 있다.
	//객체 자료형도 자료형이니까

	//클래스 명과 동일한 이름의 메서드를 가리켜 생성자라하고,
	// 생성자는 이름에서도 알 수 있듯이, 객체의 생성 타임에 무언가 초기화 작업이 있을때,
	// 작업을 수행하는 용도의 매서드이다.
	public Car(){
		this.wheel = new Wheel(); //this 생략가능
	}

	public static void main(String[] args){
		// 자동차를 생성하고,
		// 이 자동차의 이름 출력하고 , 
		// 이 자동차 바퀴의 브랜드, 색상, 가격을 출력까지 하시오

		Car c = new Car();
		System.out.println(c.name);
		
		
		//c.wheel = new Wheel(); //칭찬 but 자동차 생상 이후에 함참 지나서
		System.out.println(c.wheel.brand);
		System.out.println(c.wheel.color);
		System.out.println(c.wheel.price);


	}

}
