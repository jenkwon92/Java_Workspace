/*
 * JavaFX는 이벤트 처리를 전담할 구 있는 객체를 지원한다(이를 컨트롤러라한다)
 * Initializable 인터페이스를 구현해야한다*/
package day1127.youtube;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.web.WebView;

public class MainUIController implements Initializable {
	// 개발자가 직접 lookup()하는 것이 아니라, 시스템에 의해 자동으로 객체를 주입(injection)받자
	// @는 annotation(어노테이션) 이라 부르는 일종의 주석인데, 이 주석은 우리가 알고있던 일반 주석과는 달리 프로그램에서 사용된다
	// jdk5버전부터 지원하기 시작

	@FXML
	TextField t_url;

	@FXML
	TextField t_title;

	@FXML
	Button bt;

	@FXML
	TilePane tilePane;

	// 이 메서드는 현재 클래스가 생성될 때, 자동으로 호출되는 초기화 메서드이다
	// URL은 이 응용프로그램이 사용중인 layout.xml 의 경로가 넘어온다
	public void initialize(URL location, ResourceBundle resources) {
		// System.out.println("location값은 "+location);
		// System.out.println("resources값은 "+resources);

		// System.out.println("bt"+bt);

		bt.setOnAction((e) -> {
			System.out.println("눌렀어?");
			createThumb();
		});
	}

	// 유투브 썸네일 생성하기
	public void createThumb() {
		try {
			BorderPane borderPane = (BorderPane) FXMLLoader
					.load(this.getClass().getClassLoader().getResource("day1127/youtube/thumb.fxml"));
			// 부착전에, 유튜브와 제목을 썸네일에 적용하자
			WebView webView = (WebView) borderPane.lookup("#webView");
			Label la_title = (Label) borderPane.lookup("#la_title");
			
			//webView.getEngine().load(t_url.getText());
			//StringBuffer sb = new StringBuffer();
			
			
			webView.getEngine().loadContent(t_url.getText(), "text/html");
			la_title.setText(t_title.getText());

			// 로드된 유튜브 썸네일을 타일컨테이너에 부착
			tilePane.getChildren().add(borderPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
