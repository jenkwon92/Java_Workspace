package day1103.thread;

/*
 * 개발자는 독립적으로 수행하고 싶은 코드가 있을때 쓰레드를 상속받아 
 * run()재정의하면된다 즉, run() 에 개발자가 작성하고자하는 로직을 작성하면 된다*/

public class MyThread extends Thread{
	
	//jvm 이 아래의run() 메서드를 수행해주며, 이때를 가리켜 running상태라한다
	public void run() {
		 while(true){
			 System.out.println("★");
		 }
	 }
}
