package ch05;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect2 extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverridingEx {
	static void paint(Shape p) {
		// Shape�� ��ӹ��� ��ü���� �Ű� ������ �Ѿ�� �� ����
		p.draw(); // p�� ����Ű�� ��ü�� �������̵��� draw() ȣ��.
		//�������ε�
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line�� draw() ����. "Line" ���
		
		paint(new Shape()); // Shape�� draw() ����. "Shape" ���
		paint(new Line()); // �������̵� �� �޼ҵ� Line�� draw() ����
		paint(new Rect2()); // �������̵� �� �޼ҵ� Rect2�� draw() ����
		paint(new Circle()); // �������̵� �� �޼ҵ� Circle�� draw() ����
	}

}
