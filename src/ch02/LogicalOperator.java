package ch02;

public class LogicalOperator {
	@SuppressWarnings("unused") // line 22 오류 안뜨게
	public static void main(String[] args) {
		System.out.println('a' > 'b');	//false
		// 문자의 ASCII 코드값 비교
		System.out.println(3 >= 2); 	// true
		// 정수의 크기 비교
		System.out.println(-1 < 0); 	// true
		// 정수의 크기 비교
		System.out.println(3.45 <= 2); 	// false
		// 실수의 크기 비교
		System.out.println(3 == 2); 	// false
		// 3과 2가 같은가
		System.out.println(3 != 2); 	// true
		// 3과 2가 같지 않은가
		System.out.println(!(3 != 2)); 	// false
		// (true)의 부정
		System.out.println((3 > 2) && (3 > 4)); 	// false
		// (true)와 (false)의 AND 연산 
		System.out.println((3 != 2) || (-1 > 0));	// true
		// (true)와 (false)의 OR 연산
		System.out.println((3 != 2) ^ (-1 > 0));	// true
		// (true)와 (false)의 XOR 연산
	}
}
