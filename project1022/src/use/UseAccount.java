package use;

//현재 클래스는 public으로 공개? 사용을하려는 쪽은 공개가 될 필요가 없음
//시용당하는 쪽만 공개하면됨
//UseAccount(사용하려는 객체) -> Account(사용당할 객체) 


import bank.Account; //bank이전의 경로는 이미 classpath에 등록
class UseAccount{
	public static void main(String[] args){
		Account acc = new Account(); //계좌 클래스 생성 (public이라 여기까지 무조건 가능)

		System.out.println(acc.bank); //public 이므로 잘나옴

		//System.out.println(acc.customer); //protected로 선언되어있으므로 상속관계에 있거나
			//같은 패키지인 경우에만 접근 가능 지금은 데이터 접근 불가능

		//System.out.println(acc.num); //계좌번호num 변수는 개발자가 아무것도 명시하지 않았는데 
			// 이러한 접근제한자를 default 접근제한자라하고ㅡ default라는 키워드를 개발자가 명시하면 안됨
			//그래도 두어야함 
			//default 접근 제한자는 같은 패키지에 있는 클래스끼리만 접근을 허용해주므로 
			//protected보다 한단계 더 까다롭
			//즉, 상속관계라도 같은 패키지가 아니면 접근 불가임
			// num is not public in Account, cannot be accessed from outside package
			//공개되어있지 않으므로 외부에서 접근이 불가능 메세지
			//지금 까지 실습해온 클래스가 모두 default였고, 같은 디렉토리에서 실습을 해왔기때문에 에러를 만나지 않았던것 뿐
		
		//System.out.println(acc.balance);
		//balabce는 가장 강력한 접근제한자인 private이 적용 
		//Account 클래스 스스로만 접근이 가능 완전히 폐쇄적
		//balance has private access in Account
		//acc.balance = 10; //이방법 접근 불가능
		acc.setBalance(10); //메서드통해 접근가능
		//잔고 수정완료
		//잔고 어떻게 확인? 변수 접근 막혔으니
		// 잔고 수정이아니라 잔고에 접근하려는것 또한 메서드를 제공해주어야함
		//마치 리모콘에서 채널 전환버튼만 있는게 아니라 현재 채널 확인 버튼도 있듯이

		//잔고 확인
		System.out.println(acc.getBalance());
	}
}
