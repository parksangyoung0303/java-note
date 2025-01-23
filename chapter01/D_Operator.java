package chapter01;

public class D_Operator {

	public static void main(String[] args) {
			
		int a = 15, b = 2;
		double c = 15.0, d = 7.0;
		
		int intResult = 0;
		double doubleResult = 0.0;
		
		// 산술 연산자 : 사칙연산을 수행하는 연산자
		// 더하기 : + -> 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		System.out.println(intResult); // 17
		doubleResult = c + d;
		System.out.println(doubleResult); //  22.0
		
		// intResult = a + c; 
		doubleResult = a + c;
		System.out.println(doubleResult); // 30,0
		
		// 빼기 : - -> 좌항에 우항을 뺸 값을 반환
		intResult = a - b;
		System.out.println(intResult);  // 13
		doubleResult = a - c;
		System.out.println(doubleResult); // 0.0
		
		// 곱하기 : * -> 좌항에 우항을 곱한 결과를 반환
		intResult = a * b;
		System.out.println(intResult);  // 30
		doubleResult = a * c;
		System.out.println(doubleResult); // 225.0
		
		// 나누기 : / -> 좌항에 우항을 나눈 결과를 반환
		doubleResult = a / b;
		System.out.println(doubleResult); // 7.0 정수와 정수를 나누면 실수부가 소멸함
		doubleResult = a /  (double)b;
		System.out.println(doubleResult); // 7.5 두개가 정수이지만 하나를 형변환하여 실수부까지 나오게 만들수 있음
		doubleResult = c / b; 
		System.out.println(doubleResult); // 7.5
		
		// 나머지 : % -> 좌항에서 우항을 나눈 나머지를 반환
		intResult = a % b;
		System.out.println(intResult);  // 1
		doubleResult = a % d;
		System.out.println(doubleResult);  // 1.0
		
		// 증감 연산자
		// 피연산자 값을 1 증가 혹은 감소
		// 단항연산자, 피연산자는 반드시 변수이어야함 상수는X
		// 증가 연산자 : ++
		// 감소 연산자 : --
		int number = 7;
		System.out.println(number); // 7
		number++;
		System.out.println(number); // 8
		number--;
		System.out.println(number); // 7
		++number;
		System.out.println(number); // 8
		
		// number : 8
		// 선행 증감 연산은 증감 연산을 먼저 수행하고 다른 연산을 진행
		// 후행 증감 연산은 다른 연산을 먼저 진행하고 증감 연산을 수행
//		System.out.println(10 + ++number); // 19
		System.out.println(10 + number++); // 18
		System.out.println(number); // 9
		
		final int NUMBER = 7;
		// NUMBER++;
		// 7++;
		
		// 대입 연산자 : 좌항에 우항을 할당
		
		// 일반 대입 연산자 : = -> 좌항에 우항의 연산 결과를 할당
		// 좌항에 일반 변수와 상수형 변수 모두 올 수 있음
		// 단, 상수형 변수에는 초기화 시에만 사용 가능
		number = 10 + 5;
		
		// 복합 대입 연산자 : 타 연산자= ex) + - * / %
		// 좌항에 우항의 연산 결과를 좌항에 할당
		// 좌항은 반드시 초기화가 이루어진 일반 변수이어야 함
		number += 3;
		System.out.println(number);  // 18
		number %= 5;
		System.out.println(number);  // 3
		
		// 불가능 예시
		// int number2;
		// number2 += 1;
		// final int NUMBER2 = 10;
		// NUMBER2 += 1;
		
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리 값으로 반환
		boolean booleanResult = true;
		
		// 같다, 다르다 연산자
		// == : 좌항이 우항과 같으면 true, 다르면 false 반환
		// != : 좌항이 우항과 다르면 true, 같으면 false 반환
		// a : 15, b : 2, c : 15.0, d : 7.0
		booleanResult = a == b;
		System.out.println(booleanResult); // false
		booleanResult = a != b;
		System.out.println(booleanResult); // true
		booleanResult = a == c;
		System.out.println(booleanResult); // true
		
		// 작다, 작거나 같다 연산자
		// < : 좌항이 우항보다 작으면 true, 크거나 같으면 false
		// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < c;
		System.out.println(booleanResult); // false
		booleanResult = a <= c;
		System.out.println(booleanResult); // true
		
		// 크다, 크거나 같다 연산자
		// > : 좌항이 우항보다 크면 true, 작거나 같으면 false
		// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		booleanResult = d > b;
		System.out.println(booleanResult); // true
		booleanResult = d >= b;
		System.out.println(booleanResult); // true
		
		
		// 논리 연산자 : 피연산자가 모두 논리값인 연산자, 피연산자를 조합 
		// 논리 AND 연산자 : && - 좌항과 우항이 모두 true 일때 true 반환, 하나라도 false 이면 false 반환
		booleanResult = true && false; 
		System.out.println(booleanResult);  // false
		booleanResult = (a == b) && (c == d); 
		System.out.println(booleanResult);  // false
		// 논리 OR 연산자 : || - 좌항과 우항중 하나라도 true 이면 true 반환, 아니면 false 반환
		booleanResult = true || false;
		System.out.println(booleanResult);
		booleanResult = (a > b) || (c < d); 
		System.out.println(booleanResult);
		// 논리 NOT 연산자 : ! - 피연산자가 true 이면 false, false 이면 true
		System.out.println(!booleanResult);
		
		// AND 연산의 경우 좌항이 false 이면 우항의 코드는 Dead code 가 됨
		// OR 연산의 경우 좌항이 true 이면 우항의 코드는 Dead code 가 됨
		// Dead code 가 될 경우 실행되지않고 넘어감
		System.out.println(a);
		booleanResult = false && (a++ > b);
		System.out.println(booleanResult);
		System.out.println(a);
		
		// 삼항 연산자 : 조건에 따라 지정한 결과를 반환하는 연산자
		// 조건(논리식) ? 참일때 결과 : 거짓일때 결과
		String ResultString = true ? "참" : "거짓";
		System.out.println(ResultString);
	}

}
