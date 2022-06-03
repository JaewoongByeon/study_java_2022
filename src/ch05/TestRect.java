package ch05;

class Rect {
	private int width;
	private int height;
	public int getWidth() { return width; }
	public void setWidth(int width) { this.width = width; }
	public int getHeight() { return height; }
	public void setHeight(int height) { this.height = height; }
	public int area() {
		return width * height;
	}
	public int around() {
		return ( width + height ) * 2;
	}
	public Rect() {
		width = 1;
		height = 1;
	}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
}

class Vol extends Rect {
	private int depth;
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int volume() {
		return area() * depth;
	}
	@Override
	public int around() {
		return ( getWidth() + getHeight() + depth) * 4;
	}
	public Vol() { // �����Ϸ��� �ڵ����� �θ��� �⺻������ ȣ��
		// super(); ���� ����
		depth = 1;
	}
	public Vol(int width, int height, int depth) {
		super(width, height);
		this.depth = depth;
	}
}
public class TestRect {

	public static void main(String[] args) {
		// Rect obj = new Rect(); // Rect obj = new Rect(10, 20);
		Vol v = new Vol(); // Vol v = new Vol(10, 20, 30);
		System.out.println("����:" + v.getWidth() + ", ����:" + v.getHeight());
		System.out.println("����:" + v.getDepth() + ", ����:" + v.volume());
		System.out.println("���簢���� �ѷ� �Ǵ� ������ü �𼭸��� ��:" + v.around());
	}

}
