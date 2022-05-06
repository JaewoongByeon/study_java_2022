package ch05;

class Point3 {
	private int x, y;
	public Point3(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint3 extends Point3 {
	private String color;
	public ColorPoint3(int x, int y, String color) { super(x, y); this.color = color; }
	public void setPoint(int x, int y) { move(x, y); }
	// private 멤버는 super.x와 같이 접근 불가
	public void setColor(String color) { this.color = color; }
	public void show() { System.out.println(color + "색으로(" + getX() + "," + getY() + ")"); }
}
public class Ex04 {

	public static void main(String[] args) {
		ColorPoint3 cp = new ColorPoint3(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}

}
