/*
 * 문서파일을 열고, 저장이 간으한 텍스트 에디터 만들기
 * 한들이 퐘된 문서 파일을 대상으로 하므로, 당연히 문자기반 스트림을 사용하면 좋다*/
package day1102.io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Editor extends JFrame implements ActionListener {
	JMenuBar bar;
	JMenu menu;
	JMenuItem item_new, item_open, item_save, item_saveas;
	JTextArea area;
	JFileChooser chooser;
	FileReader reader;
	FileWriter writer;
	File selectedFile; // 지금 열어놓고 있는 파일

	public Editor() {
		// 생성
		bar = new JMenuBar();
		menu = new JMenu("파일");
		item_new = new JMenuItem("새파일");
		item_open = new JMenuItem("열기");
		item_save = new JMenuItem("저장");
		item_saveas = new JMenuItem("다른 이름으로 저장");
		area = new JTextArea();
		chooser = new JFileChooser("D:/workspace/java_workspace/SEproject/src");

		// 스타일

		// 조립
		setJMenuBar(bar);
		bar.add(menu);
		menu.add(item_new);
		menu.add(item_open);
		menu.add(item_save);
		menu.add(item_saveas);
		add(area); // 센터에 부착

		// 아이템들과 버튼과 리스너 연결
		item_new.addActionListener(this);
		item_open.addActionListener(this);
		item_save.addActionListener(this);
		item_saveas.addActionListener(this);

		setSize(800, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 정가운데
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == item_new) {

		} else if (obj == item_open) {
			// JOptionPane.showMessageDialog(this, "열려고?");
			open();
		} else if (obj == item_save) {
			save();
		} else if (obj == item_saveas) {

		}
	}

	// 파일 열기
	public void open() {
		// 파일 탐색기 띄운다
		int result = chooser.showOpenDialog(this);
		// System.out.println(result); //0이 확인, 1이 취소
		if (result == JFileChooser.APPROVE_OPTION) { // 확인버튼 눌렀다면
			// 선택한 파일에 스츠림을 꽂아서 읽기작업 시도
			selectedFile = chooser.getSelectedFile();// 유저가 추저로부터 선택한 파일정보를 File 클래스로반환받음

			// 윈도우에 제목으로 파일 이름을 출력
			this.setTitle(selectedFile.getAbsolutePath());

			try {
				reader = new FileReader(selectedFile); // 선택한 파일에 대한 스트림 생성
				// 생성된 스트림으로 부터 데이터를 읽어와서, area에 출력하자!
				int count = 0;
				int data;
				while (true) {
					data = reader.read();
					count++;
					System.out.println(count);
					if (data == -1)
						break;
					// 기본 데이터형 ->객체자료형, Wrapper
					area.append(Character.toString((char) data)); // String이 와야함
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						if (writer != null) {
							try {
								writer.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}

	// 실행중인 프로그램에서 데이터를 파일에 출력해야됨 (출력스트림이 필요함)
	public void save() {
		try {
			writer = new FileWriter(selectedFile);
			writer.write(area.getText()); // textarea의 string을 파일에 출력!
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Editor();
	}
}
