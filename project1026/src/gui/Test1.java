package gui;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


class Test1{
	public static void main(String [] args){
		Frame frame = new Frame();

		GridLayout layout=new GridLayout(2,3);
		frame.setLayout(layout);

		Panel p1= new Panel(); //���� ������ ���� 
		Panel p2= new Panel(); 

		TextField text1 = new TextField("ID",10);
	
		TextField text2 = new TextField("PASS",10);


		p1.add(text1);//�гο� ��ư �ֱ�
		p2.add(text2);
		frame.add(p1);//�����ӿ� �гγֱ�!!
		frame.add(p2);

			frame.setSize(300,200);
		frame.setVisible(true);
		
	}
	
}
