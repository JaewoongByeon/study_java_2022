package ch03;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		// { {1-1, 1-2}, {2-1, 2-2}, {3-1,3-2}, {4-1, 4-2} }
		double sum = 0;

		for (int year = 0; year < score.length; year++) // �� �г⺰�� �ݺ�, ���ȣ
			for (int term = 0; term < score[0].length; term++) // �� �г��� �б⺰�� �ݺ�, ����ȣ
				sum += score[year][term]; // ��ü ���� ��

		int n = score.length;		// �迭�� �� ����, 4
		int m = score[0].length;	// �迭�� �� ����, 2

		System.out.println("4�� ��ü ���� ����� " + sum / (n * m));
	}

}
