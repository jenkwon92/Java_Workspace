class Car{
	String name = "Benz";
	int price = 500;
	String color="red";
	//�繰�� �繰���� ���迡 has a ���踦 ����������
	Wheel wheel=null; //���ڵ尡 ������ ���� ����?
	//Ŭ���� �ȿ��� �ڷ����� �� �� �ִµ� �ڹ��� �ڷ����� �� 4�� �̴�.
	//���� �� Ŭ���� �ȿ��� ����, ����,���� �̿ܿ��� ��ü���� �� �� �ִ�.
	//��ü �ڷ����� �ڷ����̴ϱ�

	//Ŭ���� ��� ������ �̸��� �޼��带 ������ �����ڶ��ϰ�,
	// �����ڴ� �̸������� �� �� �ֵ���, ��ü�� ���� Ÿ�ӿ� ���� �ʱ�ȭ �۾��� ������,
	// �۾��� �����ϴ� �뵵�� �ż����̴�.
	public Car(){
		this.wheel = new Wheel(); //this ��������
	}

	public static void main(String[] args){
		// �ڵ����� �����ϰ�,
		// �� �ڵ����� �̸� ����ϰ� , 
		// �� �ڵ��� ������ �귣��, ����, ������ ��±��� �Ͻÿ�

		Car c = new Car();
		System.out.println(c.name);
		
		
		//c.wheel = new Wheel(); //Ī�� but �ڵ��� ���� ���Ŀ� ���� ������
		System.out.println(c.wheel.brand);
		System.out.println(c.wheel.color);
		System.out.println(c.wheel.price);


	}

}
