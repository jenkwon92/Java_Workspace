package day1116.pubapi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MTMain extends JFrame {
	JPanel p_west;
	JTextField t_name;
	JTextField t_op1;
	JTextField t_op2;
	JTextField t_op3;
	JButton bt;
	
	Vector data = new Vector();
	// 컬럼 제목 정보를 담는 벡터
	Vector <String> columnName = new Vector<String>();
	
	JTable table;
	MountainModel model;
	JScrollPane scroll;

	public MTMain() {
		init() ; //데이터 채우기
		p_west = new JPanel();
		t_name = new JTextField(15);
		t_op1 = new JTextField(15);
		t_op2 = new JTextField(15);
		t_op3 = new JTextField(15);
		bt = new JButton("검색");
		
		table = new JTable(data, columnName);
		scroll = new JScrollPane(table);

		p_west.setPreferredSize(new Dimension(200, 600));
		p_west.setBackground(Color.WHITE);
		t_name.setPreferredSize(new Dimension(190,30));
		t_op1.setPreferredSize(new Dimension(190,30));
		t_op2.setPreferredSize(new Dimension(190,30));
		t_op3.setPreferredSize(new Dimension(190,30));

		p_west.add(t_name);
		p_west.add(t_op1);
		p_west.add(t_op2);
		p_west.add(t_op3);
		p_west.add(bt);
		add(p_west, BorderLayout.WEST);
		add(scroll);

		setSize(900, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//벡터값을 초기화 하자
	public void init() {
		Vector v = new Vector();
		v.add("1");
		v.add("설악산");
		v.add("강원도");
		v.add("3000");
		data.add(v);
		
		//컬럼정보채우고 
		columnName.add("아이디"); //산 아이디
		columnName.add("산이름"); //산 이름
		columnName.add("소재지"); //산 소재지
		columnName.add("높이"); //산 높이
	}
	public static void main(String[] args) {
		new MTMain();
	}
}
