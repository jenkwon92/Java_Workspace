package day1030.image;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ThumbImage extends Canvas implements MouseListener{
	Toolkit kit;
	Image img;
	DetailImage p_center;
	
	public ThumbImage(String path, DetailImage p_center) {
		kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(path);
		this.setPreferredSize(new Dimension(100,100));
		this.p_center = p_center;
		
		this.addMouseListener(this);
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(img,0,0,this);
	}
	
	public void mouseClicked(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
		p_center.setImg(img);
		p_center.repaint();
	}
	public void mouseEntered(MouseEvent e) {	
	}
	public void mouseExited(MouseEvent e) {	
	}
}
