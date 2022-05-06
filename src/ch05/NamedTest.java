package ch05;

class Circle33 {
	private int radius;
	public Circle33(int radius) { this.radius = radius; }
	public int getRadius() { return radius; }
	public void setRadius(int radius) { this.radius = radius; }
}

class NamedCircle extends Circle33 {
	private String name;
	public NamedCircle(int radius, String name) {
		super(radius); this.name = name;
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public void show() {
		System.out.println(name + ", ¹ÝÁö¸§ = " + getRadius());
	}
}
public class NamedTest {

	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}

}
