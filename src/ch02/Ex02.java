package ch02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ���:");
		int floor = scanner.nextInt();
		System.out.println((floor * 5) + "m �Դϴ�.");
		
		scanner.close();
	}
}
