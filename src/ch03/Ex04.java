package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char day[] = { '��', '��', 'ȭ', '��', '��', '��', '��' };
		int n;
		while (true) {
			System.out.print("������ �Է��ϼ���>>");
			try {
				n = scanner.nextInt();
				if (n > 0) {
					System.out.println(day[n % 7]);
				} else {
					System.out.println("���α׷� �����մϴ�...");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("���� �Է����� �ʾҽ��ϴ�.");
				scanner.next();
			}
		}
		scanner.close();
	}

}
