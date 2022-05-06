package ch03;

public class RandomArray {

	public static void main(String[] args) {
		int intArray[][]; // 2���� ���� �迭 ����
		intArray = new int[3][4]; // intArray�� 3��4 ���� �迭 ����

		// 12���� ������ �����ϰ� �߻����� �迭�� ������� �����Ѵ�.
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 4; j++)
				intArray[i][j] = (int) (Math.random() * 10); // 0~9�� ��������

		// 3��4 �迭�� ����Ѵ�.
		for (int i = 0; i < intArray.length; i++) { // length �ʵ带 �̿��϶�.
			for (int j = 0; j < intArray[0].length; j++) // length �ʵ带 �̿��϶�.
				System.out.print(intArray[i][j] + "\t"); // ���� [i][j] ���
			System.out.println(); // ���� �ٷ� �Ѿ
		}

		// 3��4 �迭�� ���� ���Ͽ� ����Ѵ�.
		int i = 0, sum = 0;
		while (i < intArray.length) { // 3���� �� �࿡ ���� �ݺ�
			for (int j = 0; j < intArray[0].length; j++) // for ���� ���
				sum += intArray[i][j]; // �� �����ϱ�
			i++; // i���� ����
		}
		System.out.println("���� " + sum);
	}
}
