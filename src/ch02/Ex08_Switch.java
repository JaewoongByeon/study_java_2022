package ch02;

import java.util.Scanner;

public class Ex08_Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ŀ�� �ֹ�(�޴�, �ܼ�)>>");
		String coffee = scanner.next();
		int n = scanner.nextInt();
		
		switch(coffee) {
		case "����������":
			System.out.println(n * 2000 + "���Դϴ�.");
			break;
		case "�Ƹ޸�ī��":
			System.out.println(n * 2500 + "���Դϴ�.");
			break;
		case "īǪġ��":
			System.out.println(n * 3000 + "���Դϴ�.");
			break;
		case "ī���":
			System.out.println(n * 3500 + "���Դϴ�.");
			break;
		default:
			System.out.println("���� �޴��Դϴ�!");
			
		}
		
		scanner.close();
	}
}
