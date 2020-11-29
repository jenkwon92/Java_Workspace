class UseCat{

	public static void main (String[] args){

		Cat c1 = new Cat(); //고양이 인스턴스 1개 생성
		System.out.println("고양이 탄생 성공");
		System.out.println("name: "+c1.name);
		System.out.println("age: "+c1.age);
		System.out.println("Married: "+c1.getMarried);

		c1.walk();
		c1.cry();
	}
}
