package ch04;
class Song {
	String title; // 필드
	public Song(String title) { this.title = title; } // 생성자 목적 --> 필드 초기화(세팅)
	public String getTitle() { return title; }
}
public class SongTest {

	public static void main(String[] args) {
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("공주는 잠 못 이루고");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("네 노래는 " + yourSong.getTitle());
	}

}
