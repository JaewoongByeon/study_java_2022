package ch04;

import java.util.Scanner;

class Rect {
	private int width, height;
	public void setWidth(int w) {width = w;} //설정자 setter
	public void setHeight(int h) {height = h;}
	public int getWidth() {return width;} // 접근자 getter
	public int getHeight() {return height;}
	public Rect(int width, int height) { // 생성자
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
		Rect[] r = new Rect[4]; // 객체배열 선언 및 생성
		int sum = 0;
		for (int i = 0; i < r.length; i++) {
			System.out.print((i + 1) + "  너비와 높이 >>");
			r[i] = new Rect(in.nextInt(), in.nextInt()); // 객체생성
			sum += r[i].getArea(); // 넓이 저장
		}
		System.out.println("저장하였습니다...");
		System.out.println("사각형의 전체 합은 " + sum);
		in.close();
	}

}
