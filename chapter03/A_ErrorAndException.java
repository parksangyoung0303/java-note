package chapter03;

import java.util.Scanner;

// 에러 : 주로 프로그램에서 복구할 수 없는 심각한 문제, 자원 부족이 큰 원인을 차지함, 개발자가 대처 할 수 없는 수준

// - 컴파일 에러 : 소스 코드의 문법을 준수하지 않았을 때 발생
// 1. 문법 오류 : 괄호, 세미콜론 등의 잘못된 사용
// 2. 타입 불일치 : 변수의 타입이나 메서드의 반환 타입이 일치하지 않을 때
// 3. 미선언 변수 : 선언하지 않은 변수나 메서드, 클래스를 사용하려 할 때 (오타가 대부분)

// - 런타임 에러 : 프로그램 실행 중에 발생
// 1. 외부 서비스와의 연결 실패
// 2. 라이브러리 버전 불일치

// 예외 : 프로그램이 정상적으로 실행 중인 상태에서 발생할 수 있는 예상치 못한 상황
// 에러는 발생시 프로그램 실행 자체가 안되지만 예외는 정상적으로 실행된 상태에서 발생
// 개발자가 직접 처리 및 예방할 수 있음
public class A_ErrorAndException {
	// throws : 메서드의 호출부에 예외처리에 대한 강제성을 부여
	private static void exceptionMethod() throws Exception {
		// throw : 강제로 예외를 발생 시키는 키워드
		// throw new 예외클래스("메세지");
		throw new NullPointerException("예외!!!");
	}

	public static void main(String[] args) {
		// 예외 처리 방법
		// try-catch 구문을 사용하여 처리 가능
		
		// try {예외가 발생 할 수 있는 구문 작성}	
		// catch(예외클래스 변수) {특정 예외가 발생하면 실행 되는 구문}
		
		Scanner scanner = new Scanner(System.in);
		// 방법 1. 새로 초기화
//		double first = 0;
//		double second = 0;
		try {
			System.out.print("첫번째 숫자 : ");
			// 예외 발생 가능 위치
			double first = scanner.nextDouble();
			System.out.print("두번째 숫자 : ");
			// 예외 발생 가능 위치
			double second = scanner.nextDouble();
			
			// 방법2. try-catch문 밖에 있던 코드를 try 구문 안에 넣기
			double addingResult = first + second;
			double subtractionResult = first - second;
			double multiplicationResult = first * second;
			double divisionResult = first / second;
			
			System.out.println("덧셈 결과 >>>  " + addingResult);
			System.out.println("뺄셈 결과 >>>  " + subtractionResult);
			System.out.println("곱셈 결과 >>>  " + multiplicationResult);
			System.out.println("나눗셈 결과 >>> " + divisionResult);
			
		} catch (Exception e) {
			// exception.printStackTrace(); - 예외 코드도 같이 출력 하는 코드
			System.out.println("숫자만 입력하세요.");
		} finally {
			// finally - 예외가 발생하든 않하든 실행 코드, 대부분 자원 반납을 명시할 떄 사용됨
			scanner.close();
			System.out.println("Scanner 반납");
		}
		System.out.println("연산이 완료되었습니다.");
		
		try {
			exceptionMethod();
		} catch (Exception e) {
			// exception.printStackTrace();
		}
		System.out.println("연산이 완료되었습니다.");
	}

}
