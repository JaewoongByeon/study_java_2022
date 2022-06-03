package ch05;

abstract class Food {
	private String foodName;
	public String getFoodName() { return foodName; }
	public void setFoodName(String foodName) { this.foodName = foodName; }
	public abstract void cook();
	public abstract void taste();
	public Food(String foodName) { this.foodName = foodName; }
}

class Noodle extends Food {
	public Noodle(String foodName) { super(foodName); }
	public void cook() {
		System.out.println("���� ���� ��� ������ �ְ� 2�а� ���δ�.");
	}
	public void taste() {
		System.out.println("�����ϰ� ������ ���� ����.");
	}
}

class FriedRice extends Food {
	public FriedRice(String foodName) { super(foodName); }
	public void cook() {
		System.out.println("��� ���� ��ä�� �⸧�� ���´�.");
	}
	public void taste() {
		System.out.println("���� �����ϰ� �� ������ ��ä�� �� ��췯����.");
	}
}
public class FoodTest {

	public static void main(String[] args) {
		Food[] f = new Food[2];
		f[0] = new Noodle("���");
		f[1] = new FriedRice("������");
		
		for(int i = 0; i < f.length; i++) {
			System.out.println("���ĸ�:" + f[i].getFoodName());
			System.out.print("�丮��:");
			f[i].cook();
			if (f[i] instanceof Noodle)
				System.out.println("�ĸ� �ִ´�.");
			System.out.print("���ĸ�:");
			f[i].taste();
			System.out.println("****************************************");
		}
	}

}
