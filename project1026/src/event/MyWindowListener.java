package event;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class MyWindowListener implements WindowListener{
	//현재 창을 활성화시킬때 (즉, 커서가현재 창에 올라와 사용중일때)
	public void	 windowActivated(WindowEvent e){
	System.out.println("windowActivated 호출");
	}

	//창이 닫히면
	public void	 windowClosed(WindowEvent e){
	System.out.println("windowClosed 호출");
	}

	//닫기 버튼을 누를때 (창이 닫히지는 않음)
	public void	 windowClosing(WindowEvent e){
	System.out.println("windowClosing 호출");
	}

	// 아이콘화의 반대
	public void	 windowDeactivated(WindowEvent e){
	System.out.println("windowDeactivated 호출");
	}

	public void	 windowDeiconified(WindowEvent e){
	System.out.println("windowDeiconified 호출");
	}

	public void	 windowIconified(WindowEvent e){
	System.out.println("windowIconified 호출");
	}
	//창이 뜰떄
	public void	 windowOpened(WindowEvent e){
	System.out.println("windowOpened 호출");
	}
}
