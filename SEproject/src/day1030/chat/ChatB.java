/* import :컴트롤 +Shift+ o 한꺼번에 import*/

package day1030.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener,ActionListener{
			/*			is a 			   is a */
	JTextArea area;
	JScrollPane scroll;
	JPanel p_south;
	JTextField t_input;
	JButton bt;
	JButton bt_open;//대화상대방을 띄우는 버튼
	private ChatA chatA;
	private ChatC chatC;

	
	public ChatB(){
		//나보다 부모가 먼저 태어나야함  super()생략 , JFrame("부모창")
		//생성
		super("난 B");
		area = new JTextArea();
		scroll  = new JScrollPane(area);
		p_south = new JPanel();
		t_input = new JTextField(10);
		bt = new JButton("send");
		bt_open = new JButton("open");
		
		//패널 조립 (패널은 디트가 FlowLayout)
		p_south.add(t_input);
		p_south.add(bt);
		p_south.add(bt_open);
		
		add(scroll); //센터에 스크롤 부착
		add(p_south,BorderLayout.SOUTH); //남쪽에 패널부착
		
		//스타일 적용
		area.setBackground(Color.YELLOW);
		t_input.setBackground(Color.BLUE);
		t_input.setForeground(Color.WHITE);
		bt.setBackground(Color.BLACK);
		bt.setForeground(Color.WHITE);
		
		t_input.setPreferredSize(new Dimension(250,30));
		
		//보여주기 전에 미리 연결해놓자 (컴포넌트와 리스너 연결)
		t_input.addKeyListener(this);//내가 리스너 . 프레임이 곧 리스너다
		
		//send버튼에 리스너 연결
		bt.addActionListener(this); //현재 프레임이 곧 리스너이기도하다
		//open버튼에 리스너 연결
		bt_open.addActionListener(this); 
		
		//setSize(300,400);
		setBounds(500, 150, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	//어노테이션이다 java5부터 지원되는 일종의 주석 . 일반적인 주석은 프로그램에 관여하지않지만
	//어노테이션 프로그래밍에서 어떤 표시를 하기 위함이므로 자주 사용됨

	public void keyTyped(KeyEvent e) {		
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		//엔터키를 누르면, area에 입력 데이터를 반영하자 (누적하자)
		int key = e.getExtendedKeyCode(); //키코드값 반환
		System.out.println(key+"키눌렀어?");
		if(key ==10) {
			send();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		JButton btn = (JButton)obj; //하위 자료형으로 변환 down casting . 필수는 아님
		//조건문
		if(btn == bt) { //누른버튼과 send버튼의 주소값이 같다면
			System.out.println("send 버튼 눌렀어?");	
			send();
		}else if(btn.equals(bt_open)) { //누른 버튼과 열기버튼이 같은버튼이라면			
			System.out.println("open 버튼 눌렀어?");
			open();
		}
	}
	
	//메세지창에 대화내용 누적하기
	public void send() {
		//나에대한 채팅처리
		//System.out.println("area에추가");
		String msg = t_input.getText(); //텍스트필드 값을 구하자
		area.append(msg+"\n");
		t_input.setText(""); //빈텍스트 초기화
		
		//너에대한 채팅처리
		chatA.area.append(msg+"\n");
		chatC.area.append(msg+"\n");
	}
	//대화할 상대방 윈도우 띄우기
	public void open() {
		//CahtClient2를 화면에 띄우기
	}
	
	public void setChatA(ChatA chatA) {
		this.chatA = chatA;
	}
	public void setChatC(ChatC chatC) {
		this.chatC = chatC;
	}
	
	public static void main(String[] args) {
		//new JFrame("부모창");
		new ChatB();
	}

}
