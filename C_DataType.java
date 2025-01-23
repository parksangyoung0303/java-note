package chapter01;

public class C_DataType {

	public static void main(String[] args) {

		// 변수의 데이터 타입
		// 기본형 데이터 타입, 참조형 데이터 타입

		// 기본형 데이터 타입
		// 1. 정수형 데이터 타입 : 실수부가 존재하지 않음, 부호를 가지고 있음
		// byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입 -128 ~ +127
		byte byte1 = -100;
		// byte byte2 = 128; byte 허용수치 초과

		// short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입 -32,768 ~ +32,767
		short short1 = -129;
		// short short2 = 400000; short 허용수치 초과

		// int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입 -2,147,483,648 ~ +2,147,483,647
		int int1 = 40000;
		// int int2 = 2_200_000_000L; int 허용수치 초과

		// long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입 -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
		long long1 = 2_200_000_000L;

		// 2. 실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		// float : 4byte(32bit)의 크기를 가지는 실수형 데이터 타입 소수점 아래 6~7자리에서 오차가 발생
		float float1 = 0.123456789F;
		System.out.println(float1);

		// double : 8byte(64bit)의 크기를 가지는 실수형 데이터 타입 소수점 15~17자리에서 오차가 발생
		double double1 = 0.123456789;
		System.out.println(double1);

		// 3. 문자형 데이터 타입 : 문자 하나를 저정 할 수 있는 데이터 타입
		// char : 2byte(16bit)의 크기를 가지는 문자형 데이터 타입 0 ~ 65,535
		// 문자를 리터럴로 표현할 땐 ''로 묶어서 표현
		char char1 = 'A';
		char char2 = 65;
		char char3 = '\u0041';
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);

		// 4. 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		// boolean : 1byte(8bit)의 크기를 가지는 논리형 데이터 타입 true or false
		boolean boolean1 = true;
		boolean boolean2 = false;

		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		// 자동 형변환 : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		// 강제 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생

		int number1 = 300;
		long number2 = number1;
		number1 = (int) number2;

		byte number3 = (byte) number2;
		System.out.println(number3);

		double number4 = 3.1415;
		number1 = (int) number4;
		System.out.println(number1);

		number4 = number3;
		System.out.println(number4);

		// 배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		// new 연산자를 이용해서 컨테이너를 먼저 생성해야함
		// 한번 생성된 컨테이너의 크기는 변경할 수 없음

		// 배열 변수 선언 -> 데이터[] 배열변수명;
		// 배열 생성 -> new 데이터타입[배열의 길이];
		int[] numbers;
		numbers = new int[3];
		System.out.println(numbers);

		int[] numbers2 = { 1, 2, 3 };
		int[] numbers3 = new int[] { 1, 2, 3 };
		System.out.println(numbers2);
		System.out.println(numbers3);

		// 배열의 요소에 접근 혹은 사용할 때는 '인덱스' 사용
		// 배열의 시작 인덱스는 0, 종료 인덱스는 길이 -1
		int number = numbers3[1];
		System.out.println(number);
		numbers3[1] = 22;
		System.out.println(numbers3[1]);

		// 배열의 길이를 초과하는 인덱스에 접근할 시 예외 발생
		// System.out.println(numbers3[99]);

		// 배열의 길이를 확인하고자 할떈 .length
		System.out.println(numbers3.length);

		int lastIndex = numbers3.length - 1;
		System.out.println(numbers3[lastIndex]);
		
		int[] example1 = new int[] {0,0,0};
		int[] example2 = example1;
		System.out.println(example1);
		System.out.println(example2);
		
		example1[0] = 99;
		System.out.println(example1[0]); // 99
		System.out.println(example2[0]); // 99
		
		System.out.println(example1); // 107,108번 라인에서 특정 인덱스 값은 바뀌어도 주소값은 변하지 않는다
		
		char[] chars = {'e','x','a','m'};
		System.out.println(chars);
		
		// String : 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
		// 선언방식 - String 변수명; , 생성 - new String(문자열); , 초기화 - 변수명 = "문자열";
		String string1;
		string1 = "맑음";
		String string2 = "오후";
		
		// String 객체는 불변성(변경이 불가능)을 가짐
		String string3 = "exam";
		System.out.println(string3);
		chars[0] = 'd';
		// string3[0] ='d';
		string3 = "dxam";
		
		
		// String 클래스의 주요 기능
		String statement = "  My Name Is Loki  ";
		
		// 1. 문자열 결합
		// + 혹은 concat(문자열)으로 두 문자열을 연결할 수 있음
		System.out.println(statement + "@@@@" );
		System.out.println(statement.concat("!!!!"));
		
		// 2. 문자열 비교
		// == 혹은 equals(문자열) : 두 문자열이 동등한지 비교
		// compareTo(문자열) : 두 문자열을 사전순으로 비교 (대소문자 구분)
		// compareToIgnoreCase(문자열) : 두 문자열을 사전순으로 비교 (대소문자 구분X)
		System.out.println(statement.equals("My Name Is Loki"));  // false 띄워쓰기도 인식함
		System.out.println(statement.compareTo("  My Name Is Loki  "));
		
		// 3. 문자열 길이
		// length() : 문자열의 길이 반환
		System.out.println(statement.length());
		
		// 4. 문자열 변환
		// toUpperCase() : 모두 대문자로 변환
		System.out.println(statement.toUpperCase());
		
		// toLowerCase() : 모두 소문자로 변환
		System.out.println(statement.toLowerCase());
		
		// trim() : 앞뒤 공백 제거
		System.out.println(statement.trim());
		
		// replace(찾을문자열, 바꿀문자열) : 특정 문자열을 찾아 변환
		System.out.println(statement.replace("Loki", "Hulk"));  // 모든 문자 변경은 .replaceAll(); 사용
		
		// toString() : 정수를 문자열로 변환
		
		// 5. 문자열 찾기
		// indexOf(문자열) ; 찾고자 하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
		// lastIndexOf(문자열) : 찾고자 하는 문자열의 마지막 위치의 인덱스 번호를 반환
		statement = "내가 그린 기린 그림은 잘 그린 기림 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
		System.out.println(statement.indexOf("그림")); // 9 반환
		System.out.println(statement.indexOf("사진")); // 없는 단어는 -1 반환
		System.out.println(statement.lastIndexOf("그림")); // 36 반환
		
		// 6. 부분 문자열
		//subString(시작인덱스), substring(시작인덱스, 종료인덱스) : 문자열을 원하는 크기만큼 추출
		System.out.println(statement.substring(13));
		System.out.println(statement.substring(13, 23));
		
		
		// 참조형 데이터 타입
		// 주소를 가지는 변수의 데이터 타입
		// null을 가질 수 있음(null : 아무것도 지정되지 않은 상태)
		// 배열, 클래스, 인터페이스. 열거형이 참조형 데이터 타입에 속함
		String string4 = null;
		// string4.substring(0); // NullPointerException이 발생
	}
}
