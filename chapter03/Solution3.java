package chapter03;

public class Solution3 {
	
	public int solution(int number) {
		if (number <= 0 ) {
			return 0;
		}
		int num = 0;
		while (number > 0) {
			num += number % 10;
			number /= 10;
			
		} 
		return num;
	}
	
	 public static void main(String[] args) {
		 Solution3 solution3 = new Solution3();
		 
		 System.out.println(solution3.solution(123456789));
		 System.out.println(solution3.solution(-123456789));
	 }
}
