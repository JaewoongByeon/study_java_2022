package ch04;

import java.util.Scanner;

class Person {
	private String name, tel;
	public static int total=0; // 전화번호 등록된 개체 개수 카운트
	public Person() { name="홍길동"; tel="010-1234-1234"; total++; }
	public Person(String name, String tel) {
		this.name = name; this.tel = tel;
		total++; // 객체 개수 카운트
	}
	public void print() { System.out.println(name + "\t" + tel); }
	// 설정자, 접근자 만들기
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getTel() { return tel; }
	public void setTel(String tel) { this.tel = tel; }
}
public class PersonTest {

	public static void main(String[] args) {
		Person[] arr = new Person[10]; // 크기고정 배열-->동적객체배열 7장,제네릭구조
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("*** 1.연락처저장 2.연락처출력 3.종료 ***");
			System.out.print("메뉴(1,2,3)입력>>");
			String menu = in.nextLine();
			if(menu.equals("3"))break;
			if(menu.equals("1")) { // 데이터가 10개까지만 저장가능
				if(Person.total == 10) {
					System.out.println("전화번호부가 가득 찼습니다. 저장 불가");
					continue; // 다시 메뉴(while문 시작점)로 이동
				} else {
					System.out.print("이름 입력>>"); String n = in.nextLine();
					System.out.print("전화번호 입력>>"); String t = in.nextLine();
					arr[Person.total] = new Person(n, t);
				}
			} else if (menu.equals("2")) { // 연락처 출력
				System.out.println("이름\t전화번호\n------------------");
				for (int i = 0; i < Person.total; i++)arr[i].print();
			}
			else System.out.println("메뉴는 1~3 사이입니다. 다시 입력하세요.");
		}
		System.out.println("프로그램 종료");
		in.close();
	}

}
