package music;
import riding.Wing;

//스피커는 오디오 디바이스이자. 제트윙이다.
//서로간 같은 자료형이다
//서로간 형변환이 가능하다(★★★★★★)
public class Speaker extends AudioDevice implements Wing{
							/* is a                              is a */
							//상속이란 ? 부모의 모든 재산을 자식이 물려받는 제도
							//				부모클래스가 불완전한 추상클래스인 경우, 이건 재산이 아니라 빚더미다!
							//				즉, 부모의 추상적인 메서드의 완성을 자식에게 떠넘긴 것이다.
							//따라서 자식클래스에서는 부모의 불완전한 메서드를 완전히 재정의해야 완전한 크래스가된다
							//구현강제라한다.
	boolean ooper; //우퍼지원여부
	String dolor="red";

	public void sound(){
	}

	//pm요청을 누락..기능누락상태
	public void setVolume(){//브레이스가 존재하기만 해도 재정의를 완성한 것임
		System.out.println("볼륨을 조절해요");
	}
	public void playMP3(){
		System.out.println("MP3 파일 실행");
	}
	public void fly(){
		System.out.println("하늘을 날아요");
	}
}
