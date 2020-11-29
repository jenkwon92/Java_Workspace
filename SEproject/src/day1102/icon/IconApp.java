/*
 * 자바의 컴포넌트에 이미지를 넣어보자! (이미지 아이콘)
 * */

package day1102.icon;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class IconApp extends JFrame{
	JButton bt;
	ImageIcon icon; //ImageIcon is Icon
	
	public IconApp() {
		icon = new ImageIcon("D:/workspace/java_workspace/project/res/data/twitter.png");
		bt = new JButton(icon);
		//bt.setPreferredSize(new Dimension(150, 270));
		
		//Image 클래스는 이미지의 크기를 조정할 수 있는 기능이있음 getScaledInstance
		Image img = icon.getImage();
		img.getScaledInstance(100, 45, Image.SCALE_SMOOTH);
		icon.setImage(img);
		bt.setPreferredSize(new Dimension(100, 45));
		
		setLayout(new FlowLayout());
		add(bt);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IconApp();
	}

}
