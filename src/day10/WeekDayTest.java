package day10;

import java.util.Scanner;

public class WeekDayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ����� ��, ��, �� : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

//		1�� 1�� 1�Ϻ��� �Է��� �⵵�� ���⵵ 12�� 31�ϱ��� ���� ��¥�� ����Ѵ�
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

//		���⵵ 12�� 31�ϱ��� ���� ��¥���� ���� ���ޱ��� ���� ��¥�� ���Ѵ�
		int m [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
		for (int i = 1; i < month; i++) {
			/*
			switch (i) {
			case 2:
				sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
				break;
			case 4, 6, 9, 11: // ª�� ��
				sum += 30;
				break;
			default: // �� ��
				sum += 31;
				break;
			}
			*/
			sum += m[i - 1];
		}
		
//	���ޱ��� ���� ������ ���� ���Ѵ�
		sum += day;

//	1�� 1�� 1�Ϻ��� �Է��� ��¥���� ���� ��¥�� �հ踦 7�� ���� �������� ���� ���� ����  (0-��, 1-��, 2-ȭ, 3-��, 4-��, 5-��, 6-��)
		/*
		switch(sum%7) {
		case 0: System.out.println("�Ͽ���");break;
		case 1: System.out.println("������");break;
		case 2: System.out.println("ȭ����");break;
		case 3: System.out.println("������");break;
		case 4: System.out.println("�����");break;
		case 5: System.out.println("�ݿ���");break;
		case 6: System.out.println("�����");break;
		}
		 */
//		�迭�� ������ �� new�� ������� �ʰ� {}�ȿ� �ʱ�ġ�� �����ϸ� �ʱ�ġ�� ������ŭ �ڵ����� �迭�� ����� �ʱ�ġ�� �ʱ�ȭ �����ش�
//		String[] week = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };
		char[] week = { '��', '��', 'ȭ', '��', '��', '��', '��' };
		System.out.println(week[sum % 7] + "����");
	}

}
