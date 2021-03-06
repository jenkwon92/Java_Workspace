package car;

 public class Taxi extends Car{
	//이미 car를 상속받았으므로 택시만이 갖는 특징만 추가하면 됨
	//oop언어의 목적은 바로 상속

	// 눈에 보이지는 않지만 컴파일러에 의해 디폴트 생성자가 아래와 같이 아무것도 없는 로직 상태로 존재
	//근데 문제 발생 책시가 초기화하기 보다 앞서 먼저 car 가 먼저 초기화가 되어야 상식적으로 맞음
	// sun사에서는 눈에 보이지는 않지만 자식의 디폴트 생성자에 보이지 않는 생성자 호출을 살짝 넣어둠
	/*
	public Taxi(){
		super(); // 이 생성자 호출이 숨어있음
		super는 부모클래스를 의미  super()는 부모의 생성자 의미(js와 동일)
	}
	*/

	// sun 사에 의해 디폴트 생성자가 부모의 생성자를 호출하는지 증명
	//부모인 car에서 디폴트 생성자가 아닌 매개변수 있는 생성자만 둘 경우 조심해야함
	//taxi클래스의 디폴트 생성자에서 무조건 super()가 들어있으므로 매개변수 없는 생성자인 
	//Car()를 호출하고 있는것과 같음
	//따라서 현재 Car에는 Car()생성자 대신에 Car(String brand)만 존재하므로 생성자 호출시 에러

	
	//해결책> 현재 디폴트 생성자는 우리에세 아무런 도움을 모주므로 , 이제 개발자가 주도해서 원하는 생성자 호출을 직접해야함
	// 디폴트 생성자에 의존하지 말라는 이야기

	//부모의 매개변수 있는 새성자를 직접 호출해주기 위해 개발자가 생성자를 정의하고 있는것임
	//public Taxi(){
	//	super("Benz"); //매개변수 잇는 생성자 호출. 이렇게하면 존재하는 생성자를 제대로 호출하는 것이므로 
							// 더이상 에러가 나지않음 컴파일하고 useCat다시 실행
	//}


	//위와 같이 개발자가 직접 알맞는 생성자를 정의하는 방법을 추구하지만
	//부모 클래스에 생성자를 여러개 정의하는 경우도 있음 ---오버로딩


	public void pass(){
		System.out.println("승객을 태워요");
	}
}
