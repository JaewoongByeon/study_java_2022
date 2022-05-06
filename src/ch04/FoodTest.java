package ch04;

import java.util.Scanner;

class Food {
	private String food;
	private int kal;
	public String getFood() { return food; }
	public int getKal() { return kal; }
	public void setFood(String food) { this.food = food; }
	public void setKal(int kal) { this.kal = kal; }
	
	public void print() {
		System.out.println("�����̸�: " + food);
		System.out.println("Į�θ�: " + kal + "kal");
	}
	public int cal(int amount) { return kal * amount; } // ���İ���=amount, �� Į�θ� ����
	public Food() { food = "���"; kal = 450; }
	public Food(String food, int kal) { this.food = food; this.kal = kal; }
}
public class FoodTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Food f1 = new Food();
		String str;
		int kal;
		while(true) {
			System.out.println("�����̸�: " + f1.getFood());
			System.out.println("Į�θ�: " + f1.getKal());
			System.out.print("�����̸� �Է� (exit:����, demo:����) >>");
			str = in.next();
			if (str.equals("exit")) break;
			if (str.equals("demo")) {
				Food f2 = new Food("������", 500); f2.print();
				System.out.println("������ ���� ����: 5, ��Į�θ�=" + f2.cal(5));
				break;
			}
			f1.setFood(str);
			System.out.print("Į�θ� �Է� >>");
			kal = in.nextInt();
			f1.setKal(kal);
		}
		System.out.println("�����մϴ�...");
		in.close();
	}

}
