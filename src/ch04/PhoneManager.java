package ch04;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�ο���>>");
		int n = in.nextInt();
		Phone[] arr = new Phone[n]; // �Է��� �ο�����ŭ �迭 ũ�� ����
		for (int i = 0; i < arr.length; i++) { // i���� for �ȿ����� ��밡��
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			arr[i] = new Phone(in.next(), in.next());
	}
		System.out.println("����Ǿ����ϴ�...");
		// ���ѷ��� --> exit �Է��ϸ� ���� while(true){ if()break; }
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name = in.next(); // �̸��Է�
			if (name.equals("exit")) break; // exit �Է��ϸ� ����
			int i; // while{} �ȿ��� ��밡��
			for (i = 0; i < arr.length; i++) {
				if (name.equals(arr[i].getName())) { 
					System.out.println(name + "�� ��ȣ�� " + arr[i].getTel() + "�Դϴ�.");
					break;
				}
			}
			if(i==arr.length)System.out.println(name+"��(��) �����ϴ�.");
		}
		System.out.println("�����մϴ�...");
		in.close();
	}
}
