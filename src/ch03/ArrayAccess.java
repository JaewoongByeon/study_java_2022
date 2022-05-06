package ch03;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
		System.out.println("정수 5개를 입력하세요.");

		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt(); // 입력 받은 정수를 배열에 저장
		
		int max = intArray[0]; // 현재 가장 큰 수
		
		for (int i = 1; i < intArray.length; i++)
			if (intArray[i] > max)
				max = intArray[i]; // max 변경
		System.out.print("가장 큰 수는 " + max + "입니다.");

		scanner.close();
	}

}
