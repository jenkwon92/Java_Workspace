package car;

//이 클래스는 모든 자동차류의 최상ㅟ 클래스로서 가장 보편적인 기능과 속성들만을 보유
public class Car{
	//자동차의 보편적인 메서드
	
	String brand; //제조사 - 정해져있으면 안되니까 비워둠

	public Car(){
		System.out.println("자식의 super()호출");
	}

	//개발자가 매개변수 있는 생성자만 정의함, 개발자가 생성자를 정의하면 컴파일러에 의한 디폴트 생성자
	//자동 삽입은 없음
	//따라서 Car 클래스는 생성자가 오직 딱 1개만 있게됨
	public Car(String brand){ //매개변수 있는 생성자라서 new Car("벤츠") 등 방법으로 호출해야함
		this.brand = brand;
	}

	public Car(){// 매개변수 없는 생성자도 추가한다 생성자가 2개이상 추가되면 마치 중복정의처럼
						//보이지만, 자세히 보면 매개변수의 갯수가틀리므로 오버로딩으로 인정받는다
						// 이렇게 하면 , taxi() 생성자에서 매개변수 없는 super() 호출시 이 디폴트 생성자를 호출하게 되어
						// 에러가 나지 않게된다 
	
	}

	public void move(){ //자동차의 필수적인 요건
		System.out.println("자동차가 갑니다");
	}
}
