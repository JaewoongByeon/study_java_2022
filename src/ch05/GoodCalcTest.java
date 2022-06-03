package ch05;

abstract class Calc { // �߻�޼��带 ���� Ŭ����: �߻�Ŭ����
	public abstract int add(int a, int b); // �߻�޼���: {}����
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
class GoodCalc extends Calc{ // �߻�޼��� �������̵��ϱ�
	public int add(int a, int b) { // a+b
		return a + b;
	}
	public int subtract(int a, int b) { // a-b
		return a - b;
	}
	public double average(int[] a) { // a�迭�� ���ҵ��� ��� ����
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
		// Calc a = new Calc(); ����, �߻� Ŭ������ ��ü ���� �Ұ�(new �Ұ�)
		System.out.println("2+3=" + c.add(2, 3)); // add ȣ��
		System.out.println("2-3=" + c.subtract(2, 3)); // sub ȣ��
		int[] arr = { 2, 3, 4 };
		System.out.println("2,3,4 ���=" + c.average(arr)); // avg ȣ��
	}

}
