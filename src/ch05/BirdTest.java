package ch05;

class Animal {
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public Animal(String name) { this.name = name; }
	public void eat() { System.out.println("�Ļ縦 �ؿ�."); }
}
class Bird extends Animal {
	public void fly() { System.out.println(getName() + ": �� �� �־��."); }
	@Override
	public void eat() { // �������̵�: �θ� �޼��� ���� �״�� �����ؼ� {}�� ���ۼ�
		super.eat();
		System.out.println("������ �Ծ��.");
	}
	public void eat(String food) { // �����ε�: �޼��� �̸��� eat() ����, �Ű������� �ٸ�
		System.out.println(food + "��(��) �Ծ��.");
	}
	public Bird(String name) {
		super(name);
	}
}
public class BirdTest {

	public static void main(String[] args) {
		Bird b = new Bird("±±��");
		b.eat();
		b.fly();
		b.eat("������");
	}

}
