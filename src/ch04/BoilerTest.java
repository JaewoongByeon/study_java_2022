package ch04;

import java.util.Scanner;

class Boiler {
	int temp; // �ʵ�, ����µ��� �����ϴ� ����
	public Boiler() { // �⺻������
		temp = 0;
	}
	public Boiler(int temp) { this.temp = temp; } // ������
	public int tempUp() { temp++; return temp; } // ���� �µ��� 1�� �ø��� ���� �µ��� ��ȯ(return)
	public int tempDown() { temp--; return temp; } // ���� �µ��� 1�� ������ ���� �µ��� ��ȯ(return)
	public int tempUpDown(int temp) {
		//�Ű����� temp ������ ���� �µ��� �Ű������� ���� ���� ���ϰ� ���� �µ��� ��ȯ(return)
		this.temp += temp; // this.temp = this.temp + temp;
		return this.temp; // ���� �µ��� ��ȯ
	}
}
public class BoilerTest {

	public static void main(String[] args) {
		Boiler b1 = new Boiler(); // 0��
		int x = b1.tempUp();
		System.out.println("b1 1�� ������ �µ�: " + x);
		Scanner in = new Scanner(System.in);
		System.out.print("���� �µ� �Է� >>");
		Boiler b2 = new Boiler(in.nextInt());
		System.out.println("b2 �µ�: " + b2.temp);
		System.out.print("��ȭ��ų �µ� �Է� >>");
		int y = b2.tempUpDown(in.nextInt());
		System.out.println("b2 �ٲ� �µ�: " + y);
		in.close();
	}
}
