package music;
import riding.Wing;

//����Ŀ�� ����� ����̽�����. ��Ʈ���̴�.
//���ΰ� ���� �ڷ����̴�
//���ΰ� ����ȯ�� �����ϴ�(�ڡڡڡڡڡ�)
public class Speaker extends AudioDevice implements Wing{
							/* is a                              is a */
							//����̶� ? �θ��� ��� ����� �ڽ��� �����޴� ����
							//				�θ�Ŭ������ �ҿ����� �߻�Ŭ������ ���, �̰� ����� �ƴ϶� �����̴�!
							//				��, �θ��� �߻����� �޼����� �ϼ��� �ڽĿ��� ���ѱ� ���̴�.
							//���� �ڽ�Ŭ���������� �θ��� �ҿ����� �޼��带 ������ �������ؾ� ������ ũ�������ȴ�
							//�����������Ѵ�.
	boolean ooper; //������������
	String dolor="red";

	public void sound(){
	}

	//pm��û�� ����..��ɴ�������
	public void setVolume(){//�극�̽��� �����ϱ⸸ �ص� �����Ǹ� �ϼ��� ����
		System.out.println("������ �����ؿ�");
	}
	public void playMP3(){
		System.out.println("MP3 ���� ����");
	}
	public void fly(){
		System.out.println("�ϴ��� ���ƿ�");
	}
}
