/*
고양이를 정의하세요
클래스명 :Cat
이름 : 묘
나이: 3
결혼여부: 미혼
걷는 동장
우는 동작

UseCat 클래스로 Cat의 정보를 화면에 출력해본다
*/
class Cat{
	String name="묘";
	int age =3;
	boolean getMarried =false;


	public void walk() {
		System.out.println("살금살금 고양이가 걸어요");
	}

	public void cry(){
		System.out.println("야옹");
	}
}

