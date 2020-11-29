package test;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * 1.javaFx
 * 2.Swing
 * 3.중립적 크래스
 */

public class AppMain extends Application {
	/* javaFX 어플리케이션을 정의하기 위해서는 반드시 Application 추상클래스를 상속받아야한다 */

	/* FX Application 은 생명주기 메서드가 지원됨 */
	public AppMain() {
		System.out.println("AppMain() 메서드 호출");
	}

	public void start(Stage stage) throws Exception {
		System.out.println("start() 메서드호출");
		// 매개변수로 받은 stage 변수가 어플리케이션의 윈도우이다
		stage.setMaxWidth(500);
		stage.setMaxHeight(500);
		stage.show(); // 윈도우 보이게

	}

	/*
	 * 어플리케이션 시작 전, 초기화를 담당하는 메서드이다. 따라서 초기화할 게 없다면 재정의는 필수는 아니다 생성자 vs init 생성자:
	 * 인스턴스가 태어날 떄 호출되는 메서드 (시점이 더 빠르다) 
	 * init : 태어난 이후에 초기화 작업에 사용되는 메서드
	 */
	public void init() throws Exception {
		System.out.println("init() 메서드 호출");
	}

	public void stop() throws Exception {
		System.out.println("stop() 메서드호출");

	}

	public static void main(String[] args) {
		launch(args); // 실행명령어
	}
}
