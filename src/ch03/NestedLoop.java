package ch03;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) { // �ܿ� ���� �ݺ�. 1�ܿ��� 9��
			for (int j = 1; j < 10; j++) { // �� ���� ����
				System.out.print(i + "*" + j + "=" + i * j); // ������ ���
				System.out.print('\t'); // �ϳ��� ������ ���
			}
			System.out.println(); // �� ���� ������ ���� �ٷ� Ŀ�� �̵�
		}
		//�ٸ� ���
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%1d*%1d=%2d",i,j, i * j);
				System.out.print('\t');
			}
			System.out.println();
		}

	}

}
