package animal;
public class Duck extends Bird{
	//Duck is a Bird
	//Duck형은 Bird형이다
	//오리는 새다

	String name ="난 오리";

	public void quack(){
		System.out.println("꽥꽥");
	}

	public static void main(String[] args){
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		Bird b = new Bird();

		Duck a = new Duck();
		Bird r = new Bird();
		r = a; //가능
		r = (Bird)Duck; //upcasting 작은자료형에서 큰 자료형으로 올라감
		a = (Duck)r; //강제형변환-객체형 downcasting  /자료형일경우는 demotion
	}
}
