package use;

//���� Ŭ������ public���� ����? ������Ϸ��� ���� ������ �� �ʿ䰡 ����
//�ÿ���ϴ� �ʸ� �����ϸ��
//UseAccount(����Ϸ��� ��ü) -> Account(������ ��ü) 


import bank.Account; //bank������ ��δ� �̹� classpath�� ���
class UseAccount{
	public static void main(String[] args){
		Account acc = new Account(); //���� Ŭ���� ���� (public�̶� ������� ������ ����)

		System.out.println(acc.bank); //public �̹Ƿ� �߳���

		//System.out.println(acc.customer); //protected�� ����Ǿ������Ƿ� ��Ӱ��迡 �ְų�
			//���� ��Ű���� ��쿡�� ���� ���� ������ ������ ���� �Ұ���

		//System.out.println(acc.num); //���¹�ȣnum ������ �����ڰ� �ƹ��͵� ������� �ʾҴµ� 
			// �̷��� ���������ڸ� default ���������ڶ��ϰ�� default��� Ű���带 �����ڰ� ����ϸ� �ȵ�
			//�׷��� �ξ���� 
			//default ���� �����ڴ� ���� ��Ű���� �ִ� Ŭ���������� ������ ������ֹǷ� 
			//protected���� �Ѵܰ� �� ��ٷ�
			//��, ��Ӱ���� ���� ��Ű���� �ƴϸ� ���� �Ұ���
			// num is not public in Account, cannot be accessed from outside package
			//�����Ǿ����� �����Ƿ� �ܺο��� ������ �Ұ��� �޼���
			//���� ���� �ǽ��ؿ� Ŭ������ ��� default����, ���� ���丮���� �ǽ��� �ؿԱ⶧���� ������ ������ �ʾҴ��� ��
		
		//System.out.println(acc.balance);
		//balabce�� ���� ������ ������������ private�� ���� 
		//Account Ŭ���� �����θ� ������ ���� ������ �����
		//balance has private access in Account
		//acc.balance = 10; //�̹�� ���� �Ұ���
		acc.setBalance(10); //�޼������� ���ٰ���
		//�ܰ� �����Ϸ�
		//�ܰ� ��� Ȯ��? ���� ���� ��������
		// �ܰ� �����̾ƴ϶� �ܰ� �����Ϸ��°� ���� �޼��带 �������־����
		//��ġ �����ܿ��� ä�� ��ȯ��ư�� �ִ°� �ƴ϶� ���� ä�� Ȯ�� ��ư�� �ֵ���

		//�ܰ� Ȯ��
		System.out.println(acc.getBalance());
	}
}
