package day1103.game;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	GamePanel gamePanel; //실제 게임이 그려질 패널
	
	public GameWindow() {
		gamePanel = new GamePanel();
		setLayout(new FlowLayout());
		add(gamePanel);
		
		pack(); //윈도우안에있는 내용물까지 줄어듬
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GameWindow();
	}

}
