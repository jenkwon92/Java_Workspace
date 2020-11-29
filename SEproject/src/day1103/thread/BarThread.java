package day1103.thread;

import javax.swing.JProgressBar;

public class BarThread extends Thread{
	int n;
	JProgressBar bar;
	
	//이 쓰레드를 이용하고자하는 자는 바를 넘기시오
	public BarThread(JProgressBar bar, int interval) {
		this.bar = bar;
		this.interval =interval;
	}
	
	public void run() {
		while(true) {
			n++;
			bar.setValue();
			try {
				Thread.sleep(50); //non-runnable 에 빠졌다가 o.5초뒤 복귀하라는 명령
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
