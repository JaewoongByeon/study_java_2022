package ch05;

abstract class Calc { // 추상메서드를 가진 클래스: 추상클래스
	public abstract int add(int a, int b); // 추상메서드: {}없음
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
class GoodCalc extends Calc{ // 추상메서드 오버라이딩하기
	public int add(int a, int b) { // a+b
		return a + b;
	}
	public int subtract(int a, int b) { // a-b
		return a - b;
	}
	public double average(int[] a) { // a배열의 원소들의 평균 리턴
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}

public class GoodCalcTest {

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		// Calc a = new Calc(); 오류, 추상 클래스는 객체 생성 불가(new 불가)
		System.out.println("2+3=" + c.add(2, 3)); // add 호출
		System.out.println("2-3=" + c.subtract(2, 3)); // sub 호출
		int[] arr = { 2, 3, 4 };
		System.out.println("2,3,4 평균=" + c.average(arr)); // avg 호출
	}

}
