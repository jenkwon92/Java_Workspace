/*
�ʱ�ȭ ��
*/
class InitialBlock{
	int sum=0;

	//�ν��Ͻ��� ������ ��, �ݺ����� ������ ������ �־��ְ� �ʹ�
	//Ŭ�������� ����,�޼��常 ������ ���ִ�.
	//��� �����ȿ� {����ȭ} �������� ���� �ǹ̴�?
	{
		for(int i=1; i<10; i++){
			sum+=i;
		}
		// �� Ŭ������ �ν��Ͻ��� ������ ������ �� ������ ȣ���ϰԵ�
		//�ν��Ͻ� �ʱ�ȭ ���̶��Ѵ�
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ��");
	}
	//static �ʱ�ȭ ��
	//main() �޼��忡 ���� ���� ������ ,����Ǵ� �ʱ�ȭ ��
	static{
		System.out.println("�����ϱ� �� �ʱ�ȭ�� �����ϰڽ��ϴ�");
	}
	public static void main(String[] args){
		new InitialBlock();
		new InitialBlock();
		new InitialBlock();

		int a =3;
		//�׳� ��ȭ ���ѳ��� ���� Ȥ���� �� �ȿ� ������ �����ϸ� �ش���������� ��ȿ�ϴ�
		/*
		{
		int b = 5;
		}
		System.out.println(b);
		*/
		
	}
}
