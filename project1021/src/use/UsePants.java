package use;

//����� ����.. �Ʒ�ó�� ����ϸ� d: ��΋����� ������ �߻�
// �� �ڹ� �ڵ�� ������, ������,�ƿ��� ��� ����Ǿ���ϹǷ�, ��θ� Ư�� os �� �������� ��η�
// ����ϸ� �ȵȴ�.
//import D:\workspace\java_workspace\project1021\bin\fashion\Pants; //����ϰ��� Ŭ������ ��ġ ��� src(x)? bin(o)?
//osȯ�溯��: path �����ϰ��� ������ ����� ��ġ
//				classpath�����ϰ��� Ŭ���������� ����� ��ġ
import fashion.down.Pants;

class UsePants{
	public static void main(String[] args){
		//���� Ŭ�����ʹ� ���������� �������ִ�, �� �ٸ� ��Ű���� ����ִ�
		//Ŭ���� ����غ���
		//js: <script src="����/���ϸ�"></script>
		Pants p = new Pants();
		System.out.println(p);
	}
}
