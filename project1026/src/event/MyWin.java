package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Choice;

class MyWin extends Frame{
			//MyWin is a Frame

	Button bt; //MyWin has a bt
	TextField t;
	Choice ch; // html에서의 select박스와 동일

	public MyWin(){
		bt = new Button("나눌러봐");
		t = new TextField(15);
		ch = new Choice();

		//ch의 아이템채우기
		ch.add("Java Programming");
		ch.add("Jsp Programming");
		ch.add("Android Programming");
		ch.add("Spring Framework");
		ch.add("Mybastis Framework");


		this.setLayout(new FlowLayout());
		//버튼을 윈도우에 부착
		this.add(bt); //프레임은 디폴트가 BorderLayout 이므로, 센터영역에 크게 붙음
		this.add(t);

		
		bt.addActionListener(new MyListener()); //버튼과 리스너 연결
		t.addKeyListener(new MyKey());//텍스트 박스와 리스너와 연결
		this.addMouseListener(new MyMouse());	//프레임과 리스너 연결
		ch.addItemListener(new Item()); //초이스와 리스너연결
		addWindowListener(new MyWindowListener());//프레임과 리스너 연결
		
		this.setSize(300,400);
		this.setVisible(true);

	}
	public static void main(String[] args){
		new MyWin();
	}
}
