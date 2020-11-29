package use;

//원래는workspace/java_workspace/project1022/bin/use
//근데 use 앞에 bin까지를 환경변수로 등록하면 됨

//나와는 다른 경로에 있는 클래스는 반드시 import문도 함께 작성해야함
//클래스 package 선언부 아래에 사용하고픈 클래스 등록
//import bin 이하의 경로를 명시함
import animal.Dog;//Dog이라는 클래스 package 선언부를 그대로 적으면됨
// 패키지에 들어간 클래스는 번드시 외부에서 접근할 수 있도록 접근제한을 풀어줘야함
//Dog 클래스를 외부에서 접근 할수이도록 public

class UseDog{
	public static void main(String[] args){
		//현재 클래스와는 다른 경로에 있는 클래스를 사용해야하는데,
		//컴파일러가 어떻게 Dog.class 를 찾을 수 있는지 알아야한다
		//현재로서는 컴파일러가 UseDog 과 같은 디렉코리만 찾아 헤맵.
		//따라서 아래의 코드는 can't find symbol 에러 남
		//이 문제를 해결하려면, 클래스의 경로를 알려줘야하는데 
		//일반적으로 경로를 등록할 때는 환경변수 이용
		//경로가 일반 파일일 경우는 path환경변수이지만
		//경로가 클래스 파일일 경우는 classpath 환경변수를 이용하면됨
		//이 때, classpath 환경변수에 어느 경로는 등록해야할지 고민
		//외우지말고 간단히 생각
		//현재 UseDog 클래스와 Dog클래스에서우리가 생략한 경로가 무엇인지 확인
		Dog d = new Dog ();

		d.run(); //매서드 호출 추가하고 재 컴파일
	}
}
