package day1110.network.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	Socket socket; // 대화용 소켓
	String ip = "localhost";
	int port = 8989;
	Thread thread;

	public EchoClient() {
		// 소켓은 생성시 접속을 시도한다
		// 따라서 소켓의 인스턴스가 얻어졌다는 것은, 이미 서버와의 접속이 된 상태이다.
		try {
			socket = new Socket(ip, port); // 접속
			System.out.println("접속성공");

			// 받는 용. 즉, 듣는 용
			InputStream is = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(is);
			BufferedReader buffr = new BufferedReader(reader);

			// 보내는용 , 즉, 말하는 용
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(out);
			BufferedWriter buffw = new BufferedWriter(writer);

			thread = new Thread() {
				public void run() {
					// 얻어진 스트림을 이용하여 서버에 메시지 보내기
					while (true) {
						try {
							buffw.write("야호\n");// 서버에 메시지 출력
							//버퍼처리된 출력스트림의 경우, 스트림안의 데이터를 모두
							//비워버리는것
							buffw.flush();
							Thread.sleep(1000);
						} catch (IOException e) {
							e.printStackTrace();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoClient();
	}
}