package ch02;

import java.util.Scanner;

public class Ex10_If {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ŀ�� �ֹ�(�޴�, �ܼ�)>>");
		String coffee = scanner.next();
		int n = scanner.nextInt();

		if (coffee.equals("����������")) {
			if (n >= 10)
				System.out.println((int) (n * 2000 * 0.95) + "���Դϴ�.");
			else
				System.out.println(n * 2000 + "���Դϴ�.");
		} else if (coffee.equals("�Ƹ޸�ī��")) {
			System.out.println(n * 2500 + "���Դϴ�.");
		} else if (coffee.equals("īǪġ��")) {
			System.out.println(n * 3000 + "���Դϴ�.");
		} else if (coffee.equals("ī���")) {
			System.out.println(n * 3500 + "���Դϴ�.");
		} else {
			System.out.println("���� �޴��Դϴ�!");
		}

		scanner.close();
	}
}