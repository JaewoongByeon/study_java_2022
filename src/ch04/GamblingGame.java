package ch04;

import java.util.Scanner;

class Player { // 선수를 표현하는 클래스
	private String name;
	public Player(String name) { this.name = name; }
	public String getName() { return name; }
}
public class GamblingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] p = new Player[2]; // Player 타입의 객체배열 생성
		for(int i = 0; i < p.length; i++) {
			System.out.print("선수 이름 입력 >>");
			p[i] = new Player(scanner.next()); // 객체배열 원소 Player 객체 생성
		}
		int n = 0; // 선수의 순서를 나타내는 변수
		while(true) {
			System.out.print(p[n].getName() + "님, <Enter 외 아무키나 치세요>");
			scanner.next();
			int [] val = new int [3];
			for(int i = 0; i < val.length; i++) {
				val[i] = (int)(Math.random()*3);
				// 0.0 ~ 0.999 *3 >> 0.0 ~ 2.999 >> (int) 0 ~ 2 랜덤
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if((val[0] == val[1]) && (val[1] == val[2])) {
				System.out.println(p[n].getName() + "님이 승리하였습니다.");
				break;
			}
			n++; // 다음 선수 입력을 위해 순번 증가, 0번, 1번만 존재(2명으로 게임 중)
			n = n%2; // 2로 나눈 나머지 값은 0,1만 존재
		}
		scanner.close();
	}

}
