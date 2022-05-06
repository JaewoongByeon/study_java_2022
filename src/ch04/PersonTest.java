package ch04;

import java.util.Scanner;

class Person {
	private String name, tel;
	public static int total=0; // ��ȭ��ȣ ��ϵ� ��ü ���� ī��Ʈ
	public Person() { name="ȫ�浿"; tel="010-1234-1234"; total++; }
	public Person(String name, String tel) {
		this.name = name; this.tel = tel;
		total++; // ��ü ���� ī��Ʈ
	}
	public void print() { System.out.println(name + "\t" + tel); }
	// ������, ������ �����
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getTel() { return tel; }
	public void setTel(String tel) { this.tel = tel; }
}
public class PersonTest {

	public static void main(String[] args) {
		Person[] arr = new Person[10]; // ũ����� �迭-->������ü�迭 7��,���׸�����
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("*** 1.����ó���� 2.����ó��� 3.���� ***");
			System.out.print("�޴�(1,2,3)�Է�>>");
			String menu = in.nextLine();
			if(menu.equals("3"))break;
			if(menu.equals("1")) { // �����Ͱ� 10�������� ���尡��
				if(Person.total == 10) {
					System.out.println("��ȭ��ȣ�ΰ� ���� á���ϴ�. ���� �Ұ�");
					continue; // �ٽ� �޴�(while�� ������)�� �̵�
				} else {
					System.out.print("�̸� �Է�>>"); String n = in.nextLine();
					System.out.print("��ȭ��ȣ �Է�>>"); String t = in.nextLine();
					arr[Person.total] = new Person(n, t);
				}
			} else if (menu.equals("2")) { // ����ó ���
				System.out.println("�̸�\t��ȭ��ȣ\n------------------");
				for (int i = 0; i < Person.total; i++)arr[i].print();
			}
			else System.out.println("�޴��� 1~3 �����Դϴ�. �ٽ� �Է��ϼ���.");
		}
		System.out.println("���α׷� ����");
		in.close();
	}

}
