package ch03;

public class foreachEx {

	public static void main(String[] args) { // k�� n[0], n[1], ..., n[4]�� �ݺ�
		int[] n = { 1, 2, 3, 4, 5 }; // �ݺ��Ǵ� k �� ���
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("���� " + sum);

		String f[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };
		for (String s : f) // s�� f[0], f[1], ..., f[5]�� �ݺ�
			System.out.print(s + " ");
	}

}
