package ch04;
class Song {
	String title; // �ʵ�
	public Song(String title) { this.title = title; } // ������ ���� --> �ʵ� �ʱ�ȭ(����)
	public String getTitle() { return title; }
}
public class SongTest {

	public static void main(String[] args) {
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());
	}

}
