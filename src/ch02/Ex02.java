package ch02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 층인지 입력하세요:");
		int floor = scanner.nextInt();
		System.out.println((floor * 5) + "m 입니다.");
		
		scanner.close();
	}
}
