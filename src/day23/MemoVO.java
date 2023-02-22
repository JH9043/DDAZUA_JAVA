package day23;

import java.util.Date;

public class MemoVO {
	private int no; // ��ü�� ������ ������ �ڵ����� 1�� ����
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate; // ��ü�� �����Ǵ� ������ ��¥�� �ð�

//	������ �޼ҵ�(���� ������)
//	������ �̸��� �ݵ�� Ŭ���� �̸��� ���ƾ� �Ѵ�
//	�����ڴ� return�� ������ �ʴ´�. return�� ������ �ʴ� �޼ҵ�� ���� ���ѿ� "void"�� �Է��ϴµ� �����ڴ� ���� ������ ���� �ʴ´�
//	�����ڸ� �������� ������ �ڹ� �����Ϸ��� �ƹ��� �ϵ� ���� �ʴ� �⺻ �����ڸ� ����� �ش�. ������ ����ڰ� �����ڸ� �����ϸ� �⺻ �����ڴ�
//	�ڵ����� �������� �ʴ´�
//	�����ڴ� ��ü�� ������ �� �ڵ����� ����Ǹ� ��� ������ �ʱ�ȭ��Ű�� �������� ���
//	public MemoVO() {
//		
//	}
	public MemoVO() {
//		System.out.println("�⺻ �����ڰ� ����˴ϴ�");
//		name = "����";
//		gender = false;
//		memo = "����";
		this("����", false, "����");	//MemoVO(String name, boolean gender, String memo)�� �����Ѵ�
	}

	public MemoVO(String name, boolean gender, String memo) {
//		���� {} ��Ͽ� ���� �̸��� ������ ���� ������ ��� ������ ���� ��� ���� ������ �켱���� �ش�
//		super() : �θ� Ŭ������ �����ڸ� �ǹ�. �����ϸ� super()�� �����Ϸ��� �ڵ����� �־���
//		this() : ���� Ŭ������ �����ڸ� �ǹ�
//		super()�� this()�� �ݵ�� �������� ù �ٿ� �ڵ��ؾ� ��
//		super : �θ� Ŭ������ �ǹ�
//		this : ���� Ŭ������ �ǹ�
		this.name = name;
		this.gender = gender;
		this.memo = memo;
	}

	@Override
	public String toString() {
		return name + "(" + (gender ? "��" : "��") + ")�� ���� �� " + memo;
	}

//		��ü�� ����� ������ ����ؾ� �Ѵٸ� toString() �޼ҵ带 override(������) �Ѵ�.

}
