package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("������ �Է��ϼ���>>");
		try {
			n = scanner.nextInt();
			if (n % 2 == 0)
				System.out.println("¦��");
			else
				System.out.println("Ȧ��");
		} catch (InputMismatchException e) {
			System.out.println("������ �Է����� �ʾ� ���α׷��� �����մϴ�.");
		}
		scanner.close();
	}

}
