package ch04;
class Card{
	private String kind;
	private int num;
	public static int w=100, h=250;
	public void showInfo() {
		System.out.print(kind + " 숫자:" + num);
	}
	public void showSize() {
		System.out.println(" 카드사이즈:"+ w + "X" + h);
	}
	public static void setSize(int width, int height) {
		w = width; h = height;
		System.out.println("카드사이즈 변경!!");
	}
	public Card() { kind = "Spade"; num = 1; }
	public Card(String kind, int num) {
		this.kind = kind; this.num = num;
	}
	// setter, getter 설정자, 접근자
	public void setKind(String kind) { this.kind = kind; }
	public String getKind() { return kind; }
	public void setNum(int num) { this.num = num; }
	public int getNum() { return num; }
}
public class CardTest {

	public static void main(String[] args) {
		System.out.println("카드의 폭은 " + Card.w + ", 높이는 " + Card.h);
		Card c1 = new Card("Heart", 4);
		Card c2 = new Card("Spade", 7);
		System.out.print("C1의 무늬:"); c1.showInfo(); c1.showSize();
		System.out.print("C2의 무늬:"); c2.showInfo(); c2.showSize();
		Card.setSize(50, 80);
		System.out.print("C1의 무늬:"); c1.showInfo(); c1.showSize();
		System.out.print("C2의 무늬:"); c2.showInfo(); c2.showSize();
	}

}
