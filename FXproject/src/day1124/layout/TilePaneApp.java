package day1124.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

//TilePane : 동일한 크기의 셀을 갖는 배치방법
public class TilePaneApp extends Application{
	public void start(Stage stage) throws Exception {
		TilePane parent = new TilePane();
		
		
		
		showWindow(stage, parent);
	}
	public void showWindow(Stage stage, Parent parent) {
		Scene s = new Scene(parent);
		stage.setScene(s);// 생성된 씬을 윈도우에 적용
		stage.setWidth(500); // 너비
		stage.setHeight(500); // 높이
		stage.show(); // 윈도우 보여주기
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
