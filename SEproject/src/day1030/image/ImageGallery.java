package day1030.image;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageGallery extends JFrame implements ActionListener{
	String dir = "D:/workspace/java_workspace/project/res/travel2/";
	String[] path= {"aa.jpg","ab.jpg","ax.jpg","bm.jpg","et.jpg","kg.jpg","mx.jpg"};
	
	JPanel p_north;
	JPanel p_east; //썸네일
	JPanel p_south; //버튼 
	JButton bt_prev, bt_next; //이전 , 다음 버튼
	DetailImage p_center;
	ThumbImage[] thumb = new ThumbImage[path.length];
	
	public ImageGallery() {
		p_north = new JPanel();
		p_east = new JPanel();
		p_south = new JPanel();
		bt_prev = new JButton("이전 사진");
		bt_next = new JButton("다음 사진");
		p_center = new DetailImage();
		
		for(int i=0; i<thumb.length; i++) {
			thumb[i] = new ThumbImage(dir+path[i],p_center);
			p_east.add(thumb[i]);
		}
		
		add(p_north,BorderLayout.NORTH);
		add(p_east,BorderLayout.EAST);
		
		p_south.add(bt_prev); //패널에 이전버튼 넣기
		p_south.add(bt_next); //패널에 다음버튼 넣기
		add(p_south,BorderLayout.SOUTH);
		
		add(p_center);
		
		bt_prev.addActionListener(this);//이전버튼과 리스너연결
		bt_next.addActionListener(this);//다음버튼과 리스너연결
		
		setSize(770,600);
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
		new ImageGallery();
	}
}
