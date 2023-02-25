package day29;

import java.util.Scanner;

// �������̶� �ϳ��� �޼ҵ尡 ���� �ٸ� Ŭ�������� �پ��ϰ� ���Ǵ� ���� ���Ѵ�
// �������� ������ �޼ҵ带 ������ Ŭ������ ���� �θ� Ŭ������ ������ �Ѵ�
// �θ� Ŭ������ �ڽ� Ŭ������ �ݵ�� ���� �̸��� �޼ҵ尡 �־�� �ϰ� �ڽ� Ŭ������ �̸� �ݵ�� �������̵� �ؼ� ����ؾ� �Ѵ�
// �θ� Ŭ������ ��ü�� �ڽ� Ŭ������ ��ü�� �����ؼ� �����ؾ� �Ѵ�
abstract class Shape {
	public abstract void draw(); // �������� ������ �޼ҵ�, �߻� �޼ҵ�

}

class Point extends Shape {
	@Override
	public void draw() {
		System.out.println("���� ��´�");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
}

class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
//		Shape shape = new Point();
//		shape.draw();
		
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �޴��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();
	}
}
