package ch02;

import java.util.Scanner;

public class Ex08_If {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("커피 주문(메뉴, 잔수)>>");
		String coffee = scanner.next();
		int n = scanner.nextInt();
		
		if(coffee.equals("에스프레소")) {
			System.out.println(n * 2000 + "원입니다.");
		} else if (coffee.equals("아메리카노")) {
			System.out.println(n * 2500 + "원입니다.");
		} else if (coffee.equals("카푸치노")) {
			System.out.println(n * 3000 + "원입니다.");
		} else if (coffee.equals("카페라떼")) {
			System.out.println(n * 3500 + "원입니다.");
		} else {
			System.out.println("없는 메뉴입니다!");
		}
		
		scanner.close();
	}
}
