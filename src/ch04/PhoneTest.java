package ch04;

import java.util.Scanner;

class Phone {
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
	public void setName(String name) { this.name = name; }
	public void setTel(String tel) { this.tel = tel; }
}	
public class PhoneTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >>");
		Phone p1 = new Phone(in.next(), in.next());
		System.out.print("이름과 전화번호 입력 >>");
		Phone p2 = new Phone(in.next(), in.next());
		System.out.println(p1.getName() + "의 번호 " + p1.getTel());
		//p1.tel=""; private 접근지정자는 외부 접근 불가
		System.out.println(p2.getName() + "의 번호 " + p2.getTel());
		/* 이름과 전화번호 필드가 private로 보호되어 있기 때문에
		 * setter 메소드로 변경할 수 있게 처리 */
		in.close();
	}

}
