package ch04;

import java.util.Scanner;

class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
	public void setName(String name) { this.name = name; }
	public void setTel(String tel) { this.tel = tel; }
}	
public class PhoneTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		Phone p1 = new Phone(in.next(), in.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		Phone p2 = new Phone(in.next(), in.next());
		System.out.println(p1.getName() + "�� ��ȣ " + p1.getTel());
		//p1.tel=""; private ���������ڴ� �ܺ� ���� �Ұ�
		System.out.println(p2.getName() + "�� ��ȣ " + p2.getTel());
		/* �̸��� ��ȭ��ȣ �ʵ尡 private�� ��ȣ�Ǿ� �ֱ� ������
		 * setter �޼ҵ�� ������ �� �ְ� ó�� */
		in.close();
	}

}
