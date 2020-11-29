package day1030.gallery;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TotalGallery extends JFrame implements ActionListener{
	DetailPanel p;
	
	JPanel p_north;
	JPanel p_east;
	JPanel p_south;
	JButton bt_prev, bt_next;
	
	public TotalGallery() {
		p = new DetailPanel();
		p_north = new JPanel();
		p_east = new JPanel();
		p.setBackground(Color.YELLOW);
		p_south = new JPanel();
		bt_prev = new JButton("이전사진");
		bt_next = new JButton("다음사진");
		
		add(p_north,BorderLayout.NORTH);
		add(p_east,BorderLayout.EAST);
		add(p); //중앙에 패널
		p_south.add(bt_prev); 
		p_south.add(bt_next); 
		add(p_south,BorderLayout.SOUTH);
		
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		Object obj =e.getSource(); //이벤트를 일으킨 이벤트소스 구하기
		//이벤트 소스란? 이벤트를 일으킨 컴포넌트를 의미
		
		if(obj == bt_prev) {
			//다음버튼이면 AlbumPanel.n을 증가
			p.n--;
		}else if(obj == bt_next){			
			//이전버튼이면 AlbumPanel.n을 감소
			p.n++;
		}
		//화면 갱신(직접 AlbumPanel의 paint() 호출 불가)
		//갱신하도록 요청
		p.repaint(); //다시그려주세요 update()->paint()
	}
	
	public static void main(String[] args) {
		new TotalGallery();
	}
}
