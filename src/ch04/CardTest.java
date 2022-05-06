package ch04;
class Card{
	private String kind;
	private int num;
	public static int w=100, h=250;
	public void showInfo() {
		System.out.print(kind + " ����:" + num);
	}
	public void showSize() {
		System.out.println(" ī�������:"+ w + "X" + h);
	}
	public static void setSize(int width, int height) {
		w = width; h = height;
		System.out.println("ī������� ����!!");
	}
	public Card() { kind = "Spade"; num = 1; }
	public Card(String kind, int num) {
		this.kind = kind; this.num = num;
	}
	// setter, getter ������, ������
	public void setKind(String kind) { this.kind = kind; }
	public String getKind() { return kind; }
	public void setNum(int num) { this.num = num; }
	public int getNum() { return num; }
}
public class CardTest {

	public static void main(String[] args) {
		System.out.println("ī���� ���� " + Card.w + ", ���̴� " + Card.h);
		Card c1 = new Card("Heart", 4);
		Card c2 = new Card("Spade", 7);
		System.out.print("C1�� ����:"); c1.showInfo(); c1.showSize();
		System.out.print("C2�� ����:"); c2.showInfo(); c2.showSize();
		Card.setSize(50, 80);
		System.out.print("C1�� ����:"); c1.showInfo(); c1.showSize();
		System.out.print("C2�� ����:"); c2.showInfo(); c2.showSize();
	}

}
