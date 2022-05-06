package ch04;

class Dog {
	String breed; // ÇÊµå ¼±¾ð(¸â¹ö º¯¼ö)
	int age;
	String color;
	public void print() {
		System.out.println("Á¾: " + breed + ", ³ªÀÌ: " + age + ", »ö»ó: " + color);
	}
	public void barking() {
		System.out.println("¸Û¸Û Â¢´Â´Ù.");
	}
	public void eat(String food) {
		System.out.println(food + "À»(¸¦) ¸Ô´Â´Ù.");
	}
}
public class DogTest {

	public static void main(String[] args) {
		Dog puppy = new Dog();
		puppy.breed = "Çªµé";
		puppy.age = 11;
		puppy.color = "°ËÁ¤";
		puppy.print();
		puppy.barking();
		puppy.eat("°í±â");
	}

}
