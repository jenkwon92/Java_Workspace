package day1110.network.unicasting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JTextArea;

//이쓰레드는 대화용 쓰레드이므로 입출력 스트림을 각각의 인스턴스가 보유해야한다
public class MessageThread {
	Socket socket; //각각의 쓰레드는 대화용 소켓을 보유해야 스트림을 봅을 수있으므로, 접속자가 감지되면
	JTextArea area;
	//해당 소켓을 인수로 넘겨받자
	BufferedReader buffr; // 듣기
	BufferedWriter buffw; // 말하기
	
	public MessageThread(JTextArea area, Socket socket) {
		this.socket = socket;
		try {
			buffr=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			buffw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	// 메세지 받기(청취)
		public void listen() {
			String msg = null;
			try {
				while (true) {
					msg = buffr.readLine(); // 현재로서는 한번만 듣는다
					area.append(msg + "\n");
					send(msg);// 클라이언트에게 다시 보내야 한다(서버의 의무)
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	// 클라이언트에게 메시지 보내기
		public void send(String msg) {
			try {
				buffw.write(msg + "\n");
				buffw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}
