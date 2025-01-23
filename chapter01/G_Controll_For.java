package chapter01;

public class G_Controll_For {

	public static void main(String[] args) {
		
		// 반복문 : 특정 조건에 만족하는 동안 지정한 코드 블럭을 반복 실행하도록 하는 것
		
		// for : 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문
		// for (조건에 사용할 변수 초기화; 논리표현식; 조건에 사용할 변수 증감) {반복 실행 할 코드블럭}
		
//		for (int count = 1; count <= 10; count++) {
//			System.out.println("안녕하세요.");
//		}

		for (int n = 2; n <= 9; n++) {
			for (int m = 1; m <= 9; m++) {
				System.out.println(n + " * " + m + " = " + (n*m));
			}
		}
		
		// 배열 반복문
		String[] fruits = new String[] {"apple", "banana", "cacao"};
//		System.out.println(fruits[0]);
//		System.out.println(fruits[1]);
//		System.out.println(fruits[2]);
		
		for (int index = 0; index < fruits.length; index++) {
			System.out.println(fruits[index]);
		}
		
		for (int index = 0; index < fruits.length; index++) {
			fruits[index] += " add";
		}
		
		// for-each : 컬렉션(배열)의 각 요소를 하나씩 변수에 복사해서 사용하는 반복문
		// for (배열요소의타입 변수명: 배열) {반복할 코드 블럭}
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		
		// for-each는 컬렉션의 실제 요소에 대해서 읽기전용 작업에 적합
		// 변경하는 작업에 수행할 땐 적합하지 않음
		for (String fruit: fruits) {
			fruit += "  add";
		}
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
