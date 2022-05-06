package ch04;

import java.util.Scanner;

class Food {
	private String food;
	private int kal;
	public String getFood() { return food; }
	public int getKal() { return kal; }
	public void setFood(String food) { this.food = food; }
	public void setKal(int kal) { this.kal = kal; }
	
	public void print() {
		System.out.println("¿ΩΩƒ¿Ã∏ß: " + food);
		System.out.println("ƒÆ∑Œ∏Æ: " + kal + "kal");
	}
	public int cal(int amount) { return kal * amount; } // ¿ΩΩƒ∞≥ºˆ=amount, √— ƒÆ∑Œ∏Æ ∏Æ≈œ
	public Food() { food = "∂Û∏È"; kal = 450; }
	public Food(String food, int kal) { this.food = food; this.kal = kal; }
}
public class FoodTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Food f1 = new Food();
		String str;
		int kal;
		while(true) {
			System.out.println("¿ΩΩƒ¿Ã∏ß: " + f1.getFood());
			System.out.println("ƒÆ∑Œ∏Æ: " + f1.getKal());
			System.out.print("¿ΩΩƒ¿Ã∏ß ¿‘∑¬ (exit:¡æ∑·, demo:µ•∏) >>");
			str = in.next();
			if (str.equals("exit")) break;
			if (str.equals("demo")) {
				Food f2 = new Food("∂±∫∫¿Ã", 500); f2.print();
				System.out.println("∂±∫∫¿Ã ∏‘¿∫ ∞≥ºˆ: 5, √—ƒÆ∑Œ∏Æ=" + f2.cal(5));
				break;
			}
			f1.setFood(str);
			System.out.print("ƒÆ∑Œ∏Æ ¿‘∑¬ >>");
			kal = in.nextInt();
			f1.setKal(kal);
		}
		System.out.println("¡æ∑·«’¥œ¥Ÿ...");
		in.close();
	}

}
