/* 
자바도 다른 언어와 마찬가지로 배열을 지원한다
단, 자바는 인터프리터 방식이 아닌 컴파일 기반의 응용프로그램으로써
배열 선언시 반드시 자료형을 선언해야한다. (js와는 틀림)
*/
class ArrayTest1{
	public static void main(String[] args){
		//int령 선언
		// var arr = new Array();
		//자바스크립트와는 달리, 자바에서는 배열이 데이터형을 섞어 넣을 수 없고, 
		//반드시 한 종류의 데이터 타입만 담을 수 있다.
		int[]arr = new int[3]; //반드시 자료형과 크기 명시
		arr[0] =7;
		arr[1] =23;
		arr[2] =9;

		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

		//var arr=["사과","바나나","딸기"];
		String[]fruit ={"사과","바나나","딸기"}; //배열 선언과동시에 초기화
		System.out.println("과일의 갯수" +fruit.length);

		for(int i =0; i<fruit.length; i++){
			System.out.println(arr[i]);
		}

	}
}
