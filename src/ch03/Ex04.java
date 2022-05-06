package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char day[] = { '일', '월', '화', '수', '목', '금', '토' };
		int n;
		while (true) {
			System.out.print("정수를 입력하세요>>");
			try {
				n = scanner.nextInt();
				if (n > 0) {
					System.out.println(day[n % 7]);
				} else {
					System.out.println("프로그램 종료합니다...");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("수를 입력하지 않았습니다.");
				scanner.next();
			}
		}
		scanner.close();
	}

}
