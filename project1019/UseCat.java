class UseCat{

	public static void main (String[] args){

		Cat c1 = new Cat(); //����� �ν��Ͻ� 1�� ����
		System.out.println("����� ź�� ����");
		System.out.println("name: "+c1.name);
		System.out.println("age: "+c1.age);
		System.out.println("Married: "+c1.getMarried);

		c1.walk();
		c1.cry();
	}
}
