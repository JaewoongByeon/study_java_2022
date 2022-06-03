package ch05;

class Animal {
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public Animal(String name) { this.name = name; }
	public void eat() { System.out.println("식사를 해요."); }
}
class Bird extends Animal {
	public void fly() { System.out.println(getName() + ": 날 수 있어요."); }
	@Override
	public void eat() { // 오버라이딩: 부모 메서드 원형 그대로 복사해서 {}만 재작성
		super.eat();
		System.out.println("곤충을 먹어요.");
	}
	public void eat(String food) { // 오버로딩: 메서드 이름은 eat() 동일, 매개변수가 다름
		System.out.println(food + "을(를) 먹어요.");
	}
	public Bird(String name) {
		super(name);
	}
}
public class BirdTest {

	public static void main(String[] args) {
		Bird b = new Bird("짹짹이");
		b.eat();
		b.fly();
		b.eat("지렁이");
	}

}
