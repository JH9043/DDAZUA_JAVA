package day03;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		
//		Ű���带 ���ؼ� �����͸� �Է¹޴� ��ĳ��
		Scanner sc = new Scanner(System.in);
		
//		next() : ���ڿ��� �Է¹޴´�. *���� ������
//		nextLine() : ���ڿ��� �Է¹޴´�. *�� �� ��ü�� �Է¹޴´�
//		nextLine() �޼ҵ�� Ű���� ���۰� ������� ��� �Է��� �䱸�ϸ� ����ϰ�
//		Ű���� ���۰� �������� ������ Ű���� ���� ��ü�� ������ �о���δ�
		
		String addr = "";
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		addr = sc.next();
		String name = "";
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		System.out.println(name + "���� " + addr + "�� ��ϴ�.");
		
		sc.close();
	}
}