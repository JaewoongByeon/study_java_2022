package ch04;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = in.nextInt();
		Phone[] arr = new Phone[n]; // 입력한 인원수만큼 배열 크기 설정
		for (int i = 0; i < arr.length; i++) { // i변수 for 안에서만 사용가능
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			arr[i] = new Phone(in.next(), in.next());
	}
		System.out.println("저장되었습니다...");
		// 무한루프 --> exit 입력하면 종료 while(true){ if()break; }
		while(true) {
			System.out.print("검색할 이름>>");
			String name = in.next(); // 이름입력
			if (name.equals("exit")) break; // exit 입력하면 종료
			int i; // while{} 안에서 사용가능
			for (i = 0; i < arr.length; i++) {
				if (name.equals(arr[i].getName())) { 
					System.out.println(name + "의 번호는 " + arr[i].getTel() + "입니다.");
					break;
				}
			}
			if(i==arr.length)System.out.println(name+"이(가) 없습니다.");
		}
		System.out.println("종료합니다...");
		in.close();
	}
}
