package day04;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
//		length() : ������ ����� ���ڿ��� �����ϴ� ������ ������ ���´�
		System.out.println("�Է��� ���ڿ��� ũ�� : " + str.length());
//		trim() : ���ڿ� ��, ���� ���ʿ��� ������ ����
		System.out.println("�Է��� ���ڿ����� ���ʿ��� ������ ������ ���ڿ��� ũ�� : " + str.trim().length());
//		toUpperCase() : �����ڸ� ������ �빮�ڷ� ��ȯ
		System.out.println("������ �빮�ڷ� ��� : " + str.toUpperCase());
//		toLowerCase() : �����ڸ� ������ �ҹ��ڷ� ��ȯ
		System.out.println("������ �빮�ڷ� ��� : " + str.toLowerCase());
//		charAt(index) : ���ڿ����� index��° ���� 1���ڸ� ���´�.
//		������ ��ġ�� ����� �� �� ���� ���� index�� 0���� ���۵ȴ�
		System.out.println("3��° ���� : " + str.charAt(2));
		
		sc.close();
		
	}
}
