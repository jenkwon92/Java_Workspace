package event;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class MyWindowListener implements WindowListener{
	//���� â�� Ȱ��ȭ��ų�� (��, Ŀ�������� â�� �ö�� ������϶�)
	public void	 windowActivated(WindowEvent e){
	System.out.println("windowActivated ȣ��");
	}

	//â�� ������
	public void	 windowClosed(WindowEvent e){
	System.out.println("windowClosed ȣ��");
	}

	//�ݱ� ��ư�� ������ (â�� �������� ����)
	public void	 windowClosing(WindowEvent e){
	System.out.println("windowClosing ȣ��");
	}

	// ������ȭ�� �ݴ�
	public void	 windowDeactivated(WindowEvent e){
	System.out.println("windowDeactivated ȣ��");
	}

	public void	 windowDeiconified(WindowEvent e){
	System.out.println("windowDeiconified ȣ��");
	}

	public void	 windowIconified(WindowEvent e){
	System.out.println("windowIconified ȣ��");
	}
	//â�� �㋚
	public void	 windowOpened(WindowEvent e){
	System.out.println("windowOpened ȣ��");
	}
}
