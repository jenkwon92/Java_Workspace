//��ü�������̱� ������ ��� �ڵ�� Ŭ���� �ȿ� �ۼ��ؾ��Ѵ�
// int count =0;

class Plane{
	String name="����747d";
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
