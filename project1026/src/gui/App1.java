package gui;
import java.awt.Frame; //사용하려는 클래스위 위치 등록
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.Image;



class App1{
	public static void main(String [] args){
		/*윈도우 생성*/
		/*난생처음 보는 클래스를만났을떄 대처법

			대응, 대처자세0> "사용하려는 클래스가 대충 어떤 목적으로 지원되는것인지 그 용도파악"
			대응, 대처자세1> "자바의 모든 댇체는 결국 3가지 유형밖에 없다"
			대응, 대처자세2> "클래스는 쓰라고 만든 것이다. 따라서, 메모리에 올리는 법을 알면된다"


			1)일반클래스 : new하면 된다.new뒤의 생성자 조사(api문서를 통해)
			2)추상클래스: new 불가하므로, 
							자식을 정의해서 new하거나 이미 구현한 인스턴스를 이용하면된다(api문서를 통해)
			3)인터페이스: new불가하므로, 
							자식을 정의해서 new하거나 이미 구현한 인스턴스를 이용하면된다(api문서를 통해)
		*/

		//처음보지만 일반이기떄문에 new 다음에 오는 생성자를 조사해서 사용하면됨
		Frame frame= new Frame(); //자바 윈도우 프로그래밍에서의 윈도우
		//프레임은 디폴트가 눈에 보이지 않는 상태임, 따라서 보이도록 메서드 호출
		frame.setVisible(true); //Window객체로부터 상속받은 메서드
		//매개변수로는 논리값을 사용할 수 있다.
		//윈도우의 너비,높이를 지정할 수 있는 메서드 찾기
		frame.setSize(300,400); //api찾아보기

		//윈도우가 생성되었으므로, 윈도우 안에 배치할 각종 컴포넌트 올려놓아보자
		//버튼 button (일반, 추상, 인터조사 후 일반 new생성자 조사)	
		Button  bt = new Button("나 버튼");

		//버튼을 부착하기 전에 , 레이아웃 스타일을 지정해야하는데 레이아웃은 추후 배울거니까
		//일단 FlowLayout을 사용해보자
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow); //윈도우에 플로우 방식을 배치적용

		//버튼을 윈도우 컨테이너에 부착하자
		frame.add(bt); //add메서드인 매개변수는 Component형이므로
		//Button Component의 자식이기 때문에 같은 자료형에 해당하여 , add()의 인수로 올수 있다

		//html에서의 input type= "text"는 자바에서는 TextField라한다
		TextField text = new TextField("회원정보",10);
		frame.add(text);

		//Checkbox
		Checkbox ch1 = new Checkbox("독서");
		Checkbox ch2 = new Checkbox("수영");
		Checkbox ch3 = new Checkbox("컴퓨터");
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);

		//Textarea
		TextArea area = new TextArea(5,20);
		frame.add(area);

		//그냥 텍스트
		Label la = new Label("회원가입 양식입니다.");
		frame.add(la);

		//이미지 넣기
		//Image는 추상클래스이며, 플랫폼(ain,mac,linux)이 지정한 방식으로 얻을 수 있다.
		//플랫폼에 맞게 가져오려면 Toolkit클래스로부터 자원을 얻어야한다
		Toolkit kit= Toolkit.getDefaultToolkit(); //static 메서드! 따라서 클래스명으로 접근할 수있다.
		
		//툴킷은 이미지를 로컬상의 경로로 부터 얻어올 수있다.
		//경로사용시 주의할 점: 역슬래시는 윈도우os에서만 사용하는 표기이므로,
		//지금 이 자바토드가 모든 oc에서 실행되려면 사실 중립적인 경로로가야한다
		Image img  = kit.getImage("D:/workspace/java_workspace/project1026/src/res/1.png");
		System.out.println("이미지 주소값은"+img); //null나오면 못가져온거임

		//화면에 출력하는 수업은 오늘 불가 .. 왜? 지금까지 html에서는 이미지를
		//html문서에 덧붙여서 구현했으나, 자바와 같은 일반적인 컴파일 기반의 프로그래밍 언어에서는 
		//랜더링(직접그리는 작업) 을 해야하기 때문이다.


	}
}
