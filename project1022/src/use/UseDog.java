package use;

//������workspace/java_workspace/project1022/bin/use
//�ٵ� use �տ� bin������ ȯ�溯���� ����ϸ� ��

//���ʹ� �ٸ� ��ο� �ִ� Ŭ������ �ݵ�� import���� �Բ� �ۼ��ؾ���
//Ŭ���� package ����� �Ʒ��� ����ϰ��� Ŭ���� ���
//import bin ������ ��θ� ������
import animal.Dog;//Dog�̶�� Ŭ���� package ����θ� �״�� �������
// ��Ű���� �� Ŭ������ ����� �ܺο��� ������ �� �ֵ��� ���������� Ǯ�������
//Dog Ŭ������ �ܺο��� ���� �Ҽ��̵��� public

class UseDog{
	public static void main(String[] args){
		//���� Ŭ�����ʹ� �ٸ� ��ο� �ִ� Ŭ������ ����ؾ��ϴµ�,
		//�����Ϸ��� ��� Dog.class �� ã�� �� �ִ��� �˾ƾ��Ѵ�
		//����μ��� �����Ϸ��� UseDog �� ���� ���ڸ��� ã�� ���.
		//���� �Ʒ��� �ڵ�� can't find symbol ���� ��
		//�� ������ �ذ��Ϸ���, Ŭ������ ��θ� �˷�����ϴµ� 
		//�Ϲ������� ��θ� ����� ���� ȯ�溯�� �̿�
		//��ΰ� �Ϲ� ������ ���� pathȯ�溯��������
		//��ΰ� Ŭ���� ������ ���� classpath ȯ�溯���� �̿��ϸ��
		//�� ��, classpath ȯ�溯���� ��� ��δ� ����ؾ����� ����
		//�ܿ������� ������ ����
		//���� UseDog Ŭ������ DogŬ���������츮�� ������ ��ΰ� �������� Ȯ��
		Dog d = new Dog ();

		d.run(); //�ż��� ȣ�� �߰��ϰ� �� ������
	}
}