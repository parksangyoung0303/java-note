package chapter01;

import java.util.Scanner;

public class B_IO {

	public static void main(String[] args) {
	
		// 콘솔 출력
		// System.out.print(출력할 데이터); : 콘솔에 출력 후 라인 변경X
		// System.out.print(출력할 데이터;  : 콘솔에 출력 후 라인 변경O
		
		System.out.print(1234);
		System.out.print(641);
		System.out.println(5242);
		System.out.println(724);
		
		// 콘솔 입력
		// java.util.Scanner 클래스의 인스턴스 생성해서 nexXXX() 메서드로 입력을 받음
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : " );
		final int INPUT = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + INPUT);
		
		// 시스템으로 부터 받은 자원을 반환
		scanner.close();
	}

}
