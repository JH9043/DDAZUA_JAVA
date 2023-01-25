package day21;

public class MagicSquare {
	public static void main(String[] args) {
		int data[][] = new int[5][5];
//		�������� ù ��° ����(1)�� ä������ �ڸ��� ù �� ��� ���̴�
		int i = 0, j = 2;

//		Math.pow(5, 2) : x�� y������ ���
		for (int k = 1; k <= Math.pow(5, 2); k++) {
			data[i][j] = k;
//			��� �迭�� ä�� ����(k)�� 5�� ����� ���� ���ڰ� ä���� ��ġ�� �ุ 1 ����
//			5�� ����� �ƴϸ� ���� ���ڰ� ä���� ��ġ�� ������ �� ����(���� -1, ���� +1)�� ����
			if (k % 5 == 0) {
				i++;
			} else {
				if (--i < 0) {
//					���� �迭�� ������ ����� ������ ������ ����
					i = 4;
				}
				if (++j == 5) {
//					���� �迭�� ������ ����� 0��° ���� ����
					j = 0;
				}
			}
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("%2d ", data[i][j]);
			}
			System.out.println();
		}
	}
}
