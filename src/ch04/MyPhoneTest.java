package ch04;

import java.util.Scanner;

class MyPhone {
	private int year, vol; // �ʵ�(����)
	public void setYear(int year) { this.year = year; } // �޼���(�Լ�)
	// year �� ����, setter
	// ���������� ���ϰ�Ÿ�� �Լ��̸�(�Ű�����){ ���� }
	public int getYear() { return year; } // ������, getter
	public void setVol(int vol) { this.vol = vol; } // setter
	public int getVol() { return vol; } // getter
	public void showMakeDate() { System.out.println("��ó⵵: " + year + "��"); }
	public void volUp() { vol += 10; }
	public void volDown() { vol -= 10; }
	// ������: Ŭ���� �̸��� ������ �̸��� �޼ҵ�, ����Ÿ�� ���Ұ�
	// ���������� Ŭ�����̸�(�Ű�����){ �ʵ� �ʱ�ȭ }
	public MyPhone() { year = 2022; vol = 10; } // �⺻������, ���Ƿ� ������ ����
	public MyPhone(int year, int vol) { this.year = year; this.vol = vol; }
}

public class MyPhoneTest {

	public static void main(String[] args) {
		MyPhone p1 = new MyPhone(); p1.showMakeDate();
		MyPhone p2 = new MyPhone(2021, 9); p2.showMakeDate();
		System.out.println("p1 ���� : " + p1.getVol());
		System.out.println("p2 ���� : " + p2.getVol());
		Scanner in = new Scanner(System.in);
		System.out.print("p2�� ��ó⵵ ����>>");
		p2.setYear(in.nextInt());
		System.out.print("p2�� ���� ����>>");
		p2.setVol(in.nextInt());
		System.out.println("p2�� ��ó⵵: " + p2.getYear() + ", ����: " + p2.getVol());
		in.close();
	}

}
