package ch04;

class Dog {
	String breed; // �ʵ� ����(��� ����)
	int age;
	String color;
	public void print() {
		System.out.println("��: " + breed + ", ����: " + age + ", ����: " + color);
	}
	public void barking() {
		System.out.println("�۸� ¢�´�.");
	}
	public void eat(String food) {
		System.out.println(food + "��(��) �Դ´�.");
	}
}
public class DogTest {

	public static void main(String[] args) {
		Dog puppy = new Dog();
		puppy.breed = "Ǫ��";
		puppy.age = 11;
		puppy.color = "����";
		puppy.print();
		puppy.barking();
		puppy.eat("���");
	}

}
