//객체지향언어이기 때문에 모든 코드는 클래스 안에 작성해야한다
// int count =0;

class Plane{
	String name="보잉747d";
	static int price = 9000;
	String color ="white";

	public void setPrice(){
		price =10;
	}

	public static void main(String[] args) {
		price = 5000;
		Plane p1 = new Plane();
		Plane p2 = new Plane();

		p1.price= 3000;
		System.out.println(p2.price);
		price = 5000;
		System.out.println(p1.price);
	}
}
