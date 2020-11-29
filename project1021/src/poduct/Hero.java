public class Hero {
	int hp=10;
	boolean fly=false;
	String name="메가맨"; // has a 맞미만, 워낙 빈도수가 높으니, 그냥 일반자료형처럼 사용됨
	Bullet bullet; //객체이므로 has a 관계

	
	public void setHp(int hp) { //hp 값을 변경하고 싶다 --매개변수 이용 /자료형을 명시해야함
		this.hp=hp;
	}

	public void setFly(boolean fly) {//fly 값을 변경하고 싶다
		this.fly=fly;
	}

	public void setName(String name) {//name 값을 변경하고 싶다	
		this.name=name;
	}

	public void fire(Bullet bullet){//bullet 을 다른 무기로 변경하고 싶다
		this.bullet=bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHp(500);
		hero.setFly(true);
		hero.setName("앤트맨");
		hero.fire(new Bullet());		
	}	
}