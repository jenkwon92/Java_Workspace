/* 
�ڹٵ� �ٸ� ���� ���������� �迭�� �����Ѵ�
��, �ڹٴ� ���������� ����� �ƴ� ������ ����� �������α׷����ν�
�迭 ����� �ݵ�� �ڷ����� �����ؾ��Ѵ�. (js�ʹ� Ʋ��)
*/
class ArrayTest1{
	public static void main(String[] args){
		//int�� ����
		// var arr = new Array();
		//�ڹٽ�ũ��Ʈ�ʹ� �޸�, �ڹٿ����� �迭�� ���������� ���� ���� �� ����, 
		//�ݵ�� �� ������ ������ Ÿ�Ը� ���� �� �ִ�.
		int[]arr = new int[3]; //�ݵ�� �ڷ����� ũ�� ���
		arr[0] =7;
		arr[1] =23;
		arr[2] =9;

		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

		//var arr=["���","�ٳ���","����"];
		String[]fruit ={"���","�ٳ���","����"}; //�迭 ��������ÿ� �ʱ�ȭ
		System.out.println("������ ����" +fruit.length);

		for(int i =0; i<fruit.length; i++){
			System.out.println(arr[i]);
		}

	}
}
