package day07;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("3���� ������ �Է��ϼ��� : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();

		int total = java + jsp + spring;
		double average = (double) total / 3;

//		key ���� ������ ����ϴ� ���� �Ǵ� ���� ����� ������ ����, �ڹ� 1.7 ���ʹ� ���ڿ��� �����ϴ�
//		switch (key) {
//			case value:		// ":"���� ����
//				key�� value�� ��ġ�� ��� ������ ����;
//				...;
//				[break;]	// if���� ������ ������ ����� {} ����� Ż���Ѵ�
//			...;
//			[default:
//				key�� ��ġ�ϴ� value�� ���� ��� ������ ����;
//				...
//				break;]
		// }

		switch ((int) average / 10) {
		case 10:
			System.out.println("�����߾��");
//			System.out.println("��");
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
//				���� �۾��� �ϴ� case�� ������ �� �ִ�.
//			case 5: case 4: case 3: case 2: case 1: case 0:
		default:
			System.out.println("��");
			break;
		}

	}
}
