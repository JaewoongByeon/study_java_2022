package ch04;

import java.util.Scanner;

class Rect {
	private int width, height;
	public void setWidth(int w) {width = w;} //������ setter
	public void setHeight(int h) {height = h;}
	public int getWidth() {return width;} // ������ getter
	public int getHeight() {return height;}
	public Rect(int width, int height) { // ������
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}

public class RectArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Rect[] r = new Rect[4]; // ��ü�迭 ���� �� ����
		int sum = 0;
		for (int i = 0; i < r.length; i++) {
			System.out.print((i + 1) + "  �ʺ�� ���� >>");
			r[i] = new Rect(in.nextInt(), in.nextInt()); // ��ü����
			sum += r[i].getArea(); // ���� ����
		}
		System.out.println("�����Ͽ����ϴ�...");
		System.out.println("�簢���� ��ü ���� " + sum);
		in.close();
	}

}
