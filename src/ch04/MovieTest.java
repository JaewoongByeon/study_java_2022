package ch04;

class Movie {
	String title; // 필드
	double score;
	int year;
	public void print() { // 메서드(멤버함수)
		System.out.println("영화 제목: " + title);
		System.out.println("평점: " + score);
		System.out.println("발표 연도: " + year);
	}
	public Movie() { // 기본생성자 : 매개변수 없는 형태, 필드 초기화
		title = "알라딘"; score = 4.5; year = 2019;
	}
	public Movie(String title, double score, int year) {
		this.title = title; // 필드 = 매개변수
		this.score = score;
		this.year = year;
	}
}
public class MovieTest {

	public static void main(String[] args) {
		Movie m1 = new Movie(); m1.print();
		Movie m2 = new Movie("스물다섯, 스물하나", 5.0, 2021); m2.print();
	}
}
