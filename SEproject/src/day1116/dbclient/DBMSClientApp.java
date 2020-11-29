package day1116.dbclient;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DBMSClientApp extends JFrame {
	JPanel p_west;
	Choice ch_users;
	JPasswordField t_pass;
	JButton bt_login;

	JPanel p_center; // 그리드가 적용될 센터패널
	JPanel p_upper; // 테이블과 시퀀스를 포함할 패널(그리드 레이아웃 적용)
	JTable t_tables; // 유저의 테이블 정보를 출력할 JTable
	JTable t_seq; // 유저 시퀀스 정보를 출력할 JTable

	JScrollPane s1, s2;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "system";
	String password = "1234";
	Connection con;

	// 테이블을 출력할 벡터및 컬런
	Vector tableList = new Vector();
	Vector<String> tableColumn = new Vector<String>();

	// 시퀀스에 필요한 벡터들
	Vector seqList = new Vector();
	Vector<String> seqColumn = new Vector<String>();
	
	//선택한 테이블에 대한 레코드 출력에 필요한 벡터들
	Vector recordList = new Vector(); //레코드를 담게될 벡터들
	

	public DBMSClientApp() {
		p_west = new JPanel();
		ch_users = new Choice();
		t_pass = new JPasswordField();
		bt_login = new JButton("접속");

		p_center = new JPanel();
		p_upper = new JPanel();
		p_center.setLayout(new GridLayout(3, 1)); // 2층에 1호수
		p_upper.setLayout(new GridLayout(1, 2)); // 1층에 2호수

		// 컬럼 정보 초기화하기
		tableColumn.add("table_name");
		tableColumn.add("tablespace_name");
		t_tables = new JTable(tableList, tableColumn);

		// 시퀀스의 생성자에 벡터 적용하기
		seqColumn.add("sequence_name");
		seqColumn.add("last_number");
		t_seq = new JTable(seqList, seqColumn);
		s1 = new JScrollPane(t_tables);
		s2 = new JScrollPane(t_seq);

		p_west.setPreferredSize(new Dimension(150, 350));
		ch_users.setPreferredSize(new Dimension(145, 30));
		t_pass.setPreferredSize(new Dimension(145, 30));
		bt_login.setPreferredSize(new Dimension(145, 30));
		ch_users.setPreferredSize(new Dimension(145, 30));
		ch_users.setPreferredSize(new Dimension(145, 30));

		// 조립
		p_west.add(ch_users);
		p_west.add(t_pass);
		p_west.add(bt_login);
		p_upper.add(s1);
		p_upper.add(s2);
		p_center.add(p_upper);

		add(p_west, BorderLayout.WEST);
		add(p_center);

		setSize(700, 750);
		setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE); //프로그램닫을때 오라클 연동을 끊어야하기때문에
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				disConnect(); // 시스템 종료전에 닫을 자원이 있을때 먼저 닫으려고 호출함
				System.exit(0);
			}
		});

		bt_login.addActionListener((e) -> {
			login();
		});

		// 테이블과 리스너 연결
		t_tables.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				// 선택한 좌표의 테이블명 얻기
				int row = t_tables.getSelectedRow();
				int col = t_tables.getSelectedColumn();
				System.out.println(t_tables.getValueAt(row, col));
			}
		});

		setLocationRelativeTo(null);

		connect();
		getUserList(); // 유저목록 구해오기
		

	}

	// 오라클에 접속하기
	public void connect() {
		try {
			Class.forName(driver); // 드라이버로드
			con = DriverManager.getConnection(url, user, password);
			if (con == null) {
				JOptionPane.showMessageDialog(this, user + "계정의 접속에 실패하였습니다");
			} else {
				this.setTitle(user + "계정으로 접속 중"); // 프레임 제목에 성공 출력
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 유저목록가져오기
	public void getUserList() {
		// pstmt, result는 소모품이므로 매 쿼리마다 소모됨
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT USERNAME FROM DBA_USERS ORDER BY USERNAME ASC";
		try {
			pstmt = con.prepareStatement(sql); // 쿼리문 준비하기
			rs = pstmt.executeQuery(); // 반환형을 먼저 적으면 이클립스가 알맞는 메서드를 찾아줌
			while (rs.next()) {
				ch_users.add(rs.getString("username"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 현재 접속 유거의 테이블 목록 가져오기
	public void getTableList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT TABLE_NAME, TABLESPACE_NAME FROM USER_TABLES";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector vec = new Vector(); // tableList벡터에 담겨질 벡터
				vec.add(rs.getNString("table_name"));
				vec.add(rs.getString("tablespace_name"));

				tableList.add(vec); // 멤버 변수 벡터에 벡터를 담았으니, 멤버변수 벡터는 이차원 벡터가됨
			}
			t_tables.updateUI();
			// 테이블의 레코드와 컬럼갯수 확인(여전히 0인지 확인)
			// 현재 테이블이 컬럼을 몇개로 인식하고 있는지 조사
			System.out.println("컬럼수는 : " + t_tables.getColumnCount());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 시퀀스 가져오기
	public void getSeqList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT SEQUENCE_NAME, LAST_NUMBER FROM USER_SEQUENCES";

		try {
			pstmt = con.prepareStatement(sql);// 쿼리 준비
			rs = pstmt.executeQuery();
			// rs의 내용을 벡터로 옮기자 즉, 이차원벡터로 만들자
			while (rs.next()) {
				Vector vec = new Vector(); // 레코드를 담을 벡터준비 (일차원)
				vec.add(rs.getString("sequence_name"));
				vec.add(rs.getString("last_number"));
				seqList.add(vec); // 기존 시퀀스 벡터에 추가해서 이차원벡터로 만들자
			}
			t_seq.updateUI(); // 만들어진벡터를 테이블에 반영한 결과를 업데이트하자
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 로그인
	public void login() {
		// 현재 유지되고있는 접속 객체인 Connection을 끊고 다른 유저로 접속을 시도한다
		disConnect(); // 접속끊기
		user = ch_users.getSelectedItem(); // 현재 초이스 컴포넌트에서 선택된 아이템값
		password = new String(t_pass.getPassword()); // 비밀번호 설정
		connect(); // 접속하기 (고정된 멤버변수를 초이스 값으로 교체)
		
		getTableList();
		getSeqList(); // 시퀀스 구하기
		
		System.out.println("보유한 테이블 " + tableList.size());
	}

	// 오라클에 접속 끊기
	public void disConnect() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new DBMSClientApp();
	}
}
