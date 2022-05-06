package ch03;

import java.util.Scanner;

public class Pr02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 10개 입력>>");
		int intArray[] = new int[10];
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt();
		for (int j = 0; j < intArray.length; j++)
			if (intArray[j] % 3 == 0)
				System.out.print(intArray[j] + " ");
		scanner.close();
	}
}
