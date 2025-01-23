package chapter01;

public class E_Controll_If {

	public static void main(String[] args) {

		// 코드 블럭
		// 코드들의 묶음 (여러 구문을 하나의 묶음으로 취)
		// {}로 표현
		{
			int a = 10;
			int b = 20;
			int result = a + b;
			System.out.println(result);

			// int a = 0;
		}
		int a = 0;
		{
			// int a = 0;
			int b = 0;
		}

		// 제어문 : 조건에 따라서 코드의 흐름을 결정 하는 것

		// 조건문 : 특정 조건이 만족하면 해당 코드 블럭 실행하는 것
		// if문 : 주어진 논리표현식(조건)이 true이면 코드 블럭을 실행하게 하는 것
		// if (논리표현식) { 논리 표현식이 true 일때 실행할 코드블럭 }

		System.out.println("if문 시작");

		int number = 10;

		if (number > 0) {
			System.out.println("양수");
		}
		System.out.println("if문 종료");

		// else문 : if문 의 논리표현식이 false 일때 코드 블럭을 실행하게 하는 것
		// if (논리표현식) { true 일 때 실행할 코드블럭 }
		// else { false일 때 실행 할 코드 블럭 }
		// 주의 !
		// 1. else 문은 반드시 if문 이후에 와야함 (else 문 단독 사용 불가능)
		// 2. else 문에는 논리표현식을 작성하지 않음

		System.out.println("if-else문 시작");
		number = 5;
		if (number > 0) {
			System.out.println("양수");
		} else {
			System.out.println("양수가 아님");
		}
		System.out.println("if-else문 종료");

		System.out.println();

		System.out.println("여러 조건");

		number = 1;
		if (number > 0) {
			System.out.println("양수");
		} else {
			if (number < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		}
		System.out.println("여러 조건 종료");
		
		System.out.println();
		
		// 국적 나이 성별 - ex) 한국 성인 > 19, 남성 => 현역
		String country = "대한민국";
		int age = 23;
		String gender = "남성";
		
//		방법 1
//		if (country.equals("대한민국")) {
//			if (age > 19) {
//				if (gender.equals("남성")) {
//					System.out.println("축 현역 !");
//				}
//			}
//		}
//		방법 2
//		if (country.equals("대한민국") && age > 19 && gender.equals("남성"))
//					{
//			System.out.println("축 현역 !");
//			}
//		방법 3
		boolean isActive = country.equals("대한민국") && age > 19 && gender.equals("남성");
//		if (isActive) {
//			System.out.println("축 현역 !");
//		}
		if (!isActive) {
			return;
		}
		System.out.println("축 현역 !");
	}
}
