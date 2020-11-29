package bank; 

/*고객의 계좌를 정의한다 : 업무가 신중해짐 예민한 데이터를 많이 다룸*/
//패키지에 넣은 클래스를 public으로 공개하지 않으면, 다른 어떠한 클래스도 이 클래스 사용불가
//이건 보안이 아니라 그냥 의미없는 짓
//클래스는 쓰라고 만드는것이기때문에 public으로 공개하되, 그안의 내용들에 대해 보안처리하면됨
//따라서 public으로 공개
public class Account{
	
	//접근제한자적용
	//이 클래스의 접근제한자가 어떤 작용을 하는지 외부의 클래스에서 데이터에접근하는 실습을한다.
	public String bank ="기업은행";//은행명
	protected  String customer; //고객이름
	String num="022-388-85465"; //계좌번호
	private int balance=100000; //계좌금액
	
	//private으로 선언된 변수는 절대 아무도 외부에서 접근할 수 없으므로
	//변수에 접근하려면, 메서드를 이용해야한다
	// 이 변수에 대해 간접적으로 접근할 수 있는 방법은 메서드를 통해 

	//balance 아무도 못쓰게 막았으니, 현재 Account 클래스 스스로만 접근가능
	//따라서 멤버메서드를 제공해줌 
	//아래의 메서드는 public 이므로 모든 객체가 접근가능
	//잔고를 수정하고 , 출력도 해보자
	public void setBalance(int balance){
		this.balance = balance;
	}

	//잔고확인 메서드 정의
	//이와 같이 private 으로 선언됨 변수의 값을 리턴하는 메서드를 가리켜 getter라 함
	// 그리고 위와같이 setBalance 처럼 private변수의 값을 변경하는 메서드를 가리켜 setter라 함
	//게터와 세터는 아주아주 유명한 메서드 정의 기법
	public int getBalance(){
		return balance;
	}

	
}
