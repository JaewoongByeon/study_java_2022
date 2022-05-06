package ch04;

import java.util.Scanner;

class Boiler {
	int temp; // 필드, 현재온도를 저장하는 변수
	public Boiler() { // 기본생성자
		temp = 0;
	}
	public Boiler(int temp) { this.temp = temp; } // 생성자
	public int tempUp() { temp++; return temp; } // 현재 온도를 1씩 올리고 현재 온도를 반환(return)
	public int tempDown() { temp--; return temp; } // 현재 온도를 1씩 내리고 현재 온도를 반환(return)
	public int tempUpDown(int temp) {
		//매개변수 temp 가져와 현재 온도에 매개변수로 받은 값을 더하고 현재 온도를 반환(return)
		this.temp += temp; // this.temp = this.temp + temp;
		return this.temp; // 현재 온도를 반환
	}
}
public class BoilerTest {

	public static void main(String[] args) {
		Boiler b1 = new Boiler(); // 0도
		int x = b1.tempUp();
		System.out.println("b1 1도 증가한 온도: " + x);
		Scanner in = new Scanner(System.in);
		System.out.print("현재 온도 입력 >>");
		Boiler b2 = new Boiler(in.nextInt());
		System.out.println("b2 온도: " + b2.temp);
		System.out.print("변화시킬 온도 입력 >>");
		int y = b2.tempUpDown(in.nextInt());
		System.out.println("b2 바뀐 온도: " + y);
		in.close();
	}
}
