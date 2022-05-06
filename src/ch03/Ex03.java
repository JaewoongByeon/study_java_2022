package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하세요>>");
		try {
			n = scanner.nextInt();
			if (n % 2 == 0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하지 않아 프로그램을 종료합니다.");
		}
		scanner.close();
	}

}
