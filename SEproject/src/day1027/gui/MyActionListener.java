package day1027.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*Action은 범위가 넓다(버튼에는 클릭, 텍스트박스에는 엔터 등)
 * 버튼에 클릭이벤트를 감지해보자 */
public class MyActionListener implements ActionListener{
	JTextArea area; 
	JTextField t_input; //null 주소값이 없는 상태
	JButton bt;
	
	//텍스트필드와 area는 기존꺼를 가져와야함. 새롭게 생성하면 안됨
	//매개변수로 가져오기
	public MyActionListener(JTextArea area,JTextField t_input,JButton bt) {
		this.area = area;
		this.t_input = t_input;
		this.bt = bt;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("나 눌렀어? ");
		
		Object obj = e.getSource();
		if(obj == bt) {
			//System.out.println("bt을 눌렀네요");
			String msg = t_input.getText(); //텍스트필드 값을 구하자
			area.append(msg+"\n");
			t_input.setText(""); //빈텍스트 초기화
		}
		
	}
		
}

