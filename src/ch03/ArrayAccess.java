package ch03;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
		System.out.println("���� 5���� �Է��ϼ���.");

		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt(); // �Է� ���� ������ �迭�� ����
		
		int max = intArray[0]; // ���� ���� ū ��
		
		for (int i = 1; i < intArray.length; i++)
			if (intArray[i] > max)
				max = intArray[i]; // max ����
		System.out.print("���� ū ���� " + max + "�Դϴ�.");

		scanner.close();
	}

}
