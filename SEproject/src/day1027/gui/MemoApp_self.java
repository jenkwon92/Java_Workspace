package day1027.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


//GUI 즉 보여지는 객체들은 거의 일반 클래스
public class MemoApp extends JFrame{
	JMenuBar bar; //메뉴들을 올려놓을 막대
	JMenu m_file,m_edit,m_style,m_view,m_help;
	//객체자료형도 자료형이므로 배열이 가능
	JMenuItem[] item;
	JTextArea area;
	JScrollPane scroll; //area 에 붙여질 스크롤
	
	public MemoApp() {
		bar = new JMenuBar();
		
		//메뉴들 생성
		m_file = new JMenu("파일");
		m_edit = new JMenu("편집");
		m_style = new JMenu("서식");
		m_view = new JMenu("보기");
		m_help = new JMenu("도움말");
		
		 f_new= new JMenuItem("새로만들기");
		 f_window= new JMenuItem("새 창");
		 f_open= new JMenuItem("열기");
		 f_save= new JMenuItem("저장");
		 f_saveAs= new JMenuItem("다른 이름으로 저장");
		 f_pageSetting= new JMenuItem("페이지 설정");
		 f_print= new JMenuItem("인쇄");
		 f_exit= new JMenuItem("끝내기");
		
		
		area = new JTextArea();
		scroll = new JScrollPane(area); //스크롤 달고싶은 컴포넌트를 생성자 매개변수로 넣는다
	
		//바에 메뉴들 부착
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		m_file.add(f_new);
		m_file.add(f_window);
		m_file.add(f_open);
		m_file.add(f_save);
		m_file.add(f_saveAs);
		m_file.add(f_pageSetting);
		m_file.add(f_print);
		m_file.add(f_exit);
		
		//바는 워낙 특수성이 있기 떄문에 배치관리자와 상관없이 언제나 윈도우의 상단영역에 붙여진다
		this.setJMenuBar(bar); //JFrame에 바 부착

		//프레임에 scroll 부착 (얼피 보기엔 area를 부착해야할 것처럼 보이지만 , scroll이 area를 포함하고 있으므로
		//scroll을 붙여야한다.)
		add(scroll);
		
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MemoApp();
	}
}
