/*
�ڵ����� �����Ѵ�
class �� car
����
����
�ڵ������⿩��
�޸��� 
�����
*/
class Car{
	//�Ʒ��� ������ũ�����κ��� �ν��Ͻ��� ������ ��, �ش� �ν��Ͻ��� ���ԵǾ����� 
	//�ν��Ͻ� �����ν�, ������� �ش� �ν��Ͻ��� �Ҹ�� ������ �Բ��Ѵ�.

	//�ڵ����� ��ǰ�̹Ƿ�, �ڵ����� ������ �����Ѵ�.
	//�̷��� ��������� , �ʱ�ȭ ���������� �����Ϸ��� �ּ����� ������ ���� �ڵ��ʱ�ȭ�Ѵ�.
	String color; //null�� �ʱ�ȭ��
	int price; //������ �ּ����� �� 0���� �ʱ�ȭ 
	boolean autoPilot; //�ּ����� ���� false�� �ʱ�ȭ
	public void go(){
	}
	public void stop(){
	}

	Car c = new Car();
	System.out.println("color: "+c.color);
	System.out.println("price: "+c.price);
	System.out.println("autoPilot: "+c.autoPilot);
}
