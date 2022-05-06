package ch04;

import java.util.Scanner;

class MyPhone {
	private int year, vol; // 필드(변수)
	public void setYear(int year) { this.year = year; } // 메서드(함수)
	// year 값 설정, setter
	// 접근지정자 리턴값타입 함수이름(매개변수){ 구현 }
	public int getYear() { return year; } // 접근자, getter
	public void setVol(int vol) { this.vol = vol; } // setter
	public int getVol() { return vol; } // getter
	public void showMakeDate() { System.out.println("출시년도: " + year + "년"); }
	public void volUp() { vol += 10; }
	public void volDown() { vol -= 10; }
	// 생성자: 클래스 이름과 동일한 이름의 메소드, 리턴타입 사용불가
	// 접근지정자 클래스이름(매개변수){ 필드 초기화 }
	public MyPhone() { year = 2022; vol = 10; } // 기본생성자, 임의로 개발자 설정
	public MyPhone(int year, int vol) { this.year = year; this.vol = vol; }
}

public class MyPhoneTest {

	public static void main(String[] args) {
		MyPhone p1 = new MyPhone(); p1.showMakeDate();
		MyPhone p2 = new MyPhone(2021, 9); p2.showMakeDate();
		System.out.println("p1 볼륨 : " + p1.getVol());
		System.out.println("p2 볼륨 : " + p2.getVol());
		Scanner in = new Scanner(System.in);
		System.out.print("p2의 출시년도 변경>>");
		p2.setYear(in.nextInt());
		System.out.print("p2의 볼륨 변경>>");
		p2.setVol(in.nextInt());
		System.out.println("p2의 출시년도: " + p2.getYear() + ", 볼륨: " + p2.getVol());
		in.close();
	}

}
