package ch04;

class Movie {
	String title; // �ʵ�
	double score;
	int year;
	public void print() { // �޼���(����Լ�)
		System.out.println("��ȭ ����: " + title);
		System.out.println("����: " + score);
		System.out.println("��ǥ ����: " + year);
	}
	public Movie() { // �⺻������ : �Ű����� ���� ����, �ʵ� �ʱ�ȭ
		title = "�˶��"; score = 4.5; year = 2019;
	}
	public Movie(String title, double score, int year) {
		this.title = title; // �ʵ� = �Ű�����
		this.score = score;
		this.year = year;
	}
}
public class MovieTest {

	public static void main(String[] args) {
		Movie m1 = new Movie(); m1.print();
		Movie m2 = new Movie("�����ټ�, �����ϳ�", 5.0, 2021); m2.print();
	}
}
