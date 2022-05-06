package ch04;

import java.util.Scanner;

class Player { // ������ ǥ���ϴ� Ŭ����
	private String name;
	public Player(String name) { this.name = name; }
	public String getName() { return name; }
}
public class GamblingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] p = new Player[2]; // Player Ÿ���� ��ü�迭 ����
		for(int i = 0; i < p.length; i++) {
			System.out.print("���� �̸� �Է� >>");
			p[i] = new Player(scanner.next()); // ��ü�迭 ���� Player ��ü ����
		}
		int n = 0; // ������ ������ ��Ÿ���� ����
		while(true) {
			System.out.print(p[n].getName() + "��, <Enter �� �ƹ�Ű�� ġ����>");
			scanner.next();
			int [] val = new int [3];
			for(int i = 0; i < val.length; i++) {
				val[i] = (int)(Math.random()*3);
				// 0.0 ~ 0.999 *3 >> 0.0 ~ 2.999 >> (int) 0 ~ 2 ����
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if((val[0] == val[1]) && (val[1] == val[2])) {
				System.out.println(p[n].getName() + "���� �¸��Ͽ����ϴ�.");
				break;
			}
			n++; // ���� ���� �Է��� ���� ���� ����, 0��, 1���� ����(2������ ���� ��)
			n = n%2; // 2�� ���� ������ ���� 0,1�� ����
		}
		scanner.close();
	}

}
