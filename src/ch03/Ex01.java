package ch03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ĺ� �ҹ��� �ϳ� �Է�>>");
		String s = scan.next();
		char c = s.charAt(0);

		for (char i = 'a'; i <= c; i++) {
			for (char j = i; j <= c; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		scan.close();
	}

}
