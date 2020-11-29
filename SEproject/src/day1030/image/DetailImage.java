package day1030.image;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class DetailImage extends JPanel{
	private Image img;
	
	public void setImg(Image img) {
		this.img = img;
		this.img = this.img.getScaledInstance(770, 500, Image.SCALE_SMOOTH);
	}

	public void paintAll(Graphics g) {
		g.drawImage(img, 0,0,this);
	}
}
