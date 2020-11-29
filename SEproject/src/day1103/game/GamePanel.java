package day1103.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

//사실상 게임의 모든 그래픽처리는 패널이 담당하게됨
public class GamePanel extends JPanel{
	Thread loopThread; //게임 루프를 무한루프로 실행할 쓰레드
	public static final int WIDTH =1600;
	public static final int HEIGHT =900;
	int x,y;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		loopThread = new Thread() {
			public void run() {
				while(true) {
					gameLoop();
					try {
						Thread.sleep(1); //1/1000초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		loopThread.start();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; //2D에 더 적합한 그래픽스 객체로 형변환!
		
		g2.setColor(Color.RED);
		g2.fillRect(x, y, 100, 45);
		
	}
	//물리량 변경
	public void tick() {
		x++;
		y++;
	}
	public void render() {
		this.repaint();
	}
	//모든 게임의 tick(), render()를 호출! 즉 게임 엔진
	public void gameLoop() {
		System.out.println("gameLoop() called..");
	}
}
