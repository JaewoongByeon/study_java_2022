package ch02;

public class LogicalOperator {
	@SuppressWarnings("unused") // line 22 ���� �ȶ߰�
	public static void main(String[] args) {
		System.out.println('a' > 'b');	//false
		// ������ ASCII �ڵ尪 ��
		System.out.println(3 >= 2); 	// true
		// ������ ũ�� ��
		System.out.println(-1 < 0); 	// true
		// ������ ũ�� ��
		System.out.println(3.45 <= 2); 	// false
		// �Ǽ��� ũ�� ��
		System.out.println(3 == 2); 	// false
		// 3�� 2�� ������
		System.out.println(3 != 2); 	// true
		// 3�� 2�� ���� ������
		System.out.println(!(3 != 2)); 	// false
		// (true)�� ����
		System.out.println((3 > 2) && (3 > 4)); 	// false
		// (true)�� (false)�� AND ���� 
		System.out.println((3 != 2) || (-1 > 0));	// true
		// (true)�� (false)�� OR ����
		System.out.println((3 != 2) ^ (-1 > 0));	// true
		// (true)�� (false)�� XOR ����
	}
}
