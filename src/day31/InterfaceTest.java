package day31;

import java.security.cert.PolicyNode;

class Point {
	int x, y;

	public void move() {

	}
}

class Shape {
//	���� �տ� final�� ������ �� ������ ���α׷����� ���� ������ �� ����.
//	���α׷����� ���� ����ϴ� �����ʹ� ������ ������� ����ϸ� ���ϰ� ���α׷����� ���Ƿ� ���� ������ �� ������ ����� ����� ����Ѵ�
	public static final double PI = 3.141592; // ���� ��� ����, ���

	public void draw() {
	}

	public void erase() {
	}
}

//class Line extends Point, Shape{}	// �ڹٴ� ���� ����� ������� �����Ƿ� ������ �߻�

// �������̽��� ����(static) ��� ������ �߻� �޼ҵ�θ� ������ Ŭ������ Ư���� ����
interface Draw{
	public static final double PI = 3.141592;
//	�������̽��� ��� ���� ����� ���� ������ �Ʒ��� ���� �����ص� �ڵ����� public static final�� �ٿ��ش�
	int LIMIT = 1000;
	public abstract void moveTo();		// �߻� �޼ҵ�
//	�������̽��� �޼ҵ� ����� ���� ������ �����ϸ� �ڵ����� public abstract�� �ٿ��ش�
	void erase();
}

interface Graphic {
	void rotate();
	void resize();
}

//class Line extends Draw {} 			//Ŭ������ �������̽��� ��ӹ��� �� �����Ƿ� ������ �߻�

//interface Graphics extends Point {}	//�������̽��� Ŭ������ ��ӹ��� �� �����Ƿ� ������ �߻�
// Ŭ������ Ŭ�������� �������̽��� �������̽����� ����� ���Ѿ� �Ѵ�

interface Graphices extends Draw, Graphic {	//�������̽��� ���� ����� ����Ѵ�
	//�ƹ��� ���뵵 ������ �ʴ� �������̽��� ǥ��(marker) �������̽��� �θ���
}

// Ŭ���� ���� �� �������̽����� ������ ������ ����Ϸ��� ���(exnteds)�� ����� �� ���� ����(implements)�� ����Ѵ�
// Line Ŭ������ Point Ŭ������ ��ӹް� Draw �������̽��� Graphic �������̽��� �����ؼ� �����

class Line extends Point implements Draw, Graphic {

	@Override
	public void rotate() {
	}

	@Override
	public void resize() {
	}

	@Override
	public void erase() {
	}

	@Override
	public void moveTo() {
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println(Shape.PI);
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);
	}

}
