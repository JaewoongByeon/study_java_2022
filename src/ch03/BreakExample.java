package ch03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String text = scanner.next();
			if(text.contentEquals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while ���� ���
		}
		
		System.out.println("�����մϴ�...");
		scanner.close();
	}

}
