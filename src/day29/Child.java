package day29;

// �ڽ� (����, ����, �Ļ�) Ŭ����
// Parent Ŭ������ ��ӹ޾� Child Ŭ������ �����
public class Child extends Parent {

//	Parent Ŭ������ ��ӹ޾����Ƿ� Parent Ŭ������ ��� ��� ������ �޼ҵ带 ������ �������� �ʾƵ� ����� �� �ִ�.
//	�θ� Ŭ������ private ������ ���� ����� ����� �޾����� ������ �� ����.
	private int age;
	private String nickName;

	public Child() {
	}
//	�ڵ� �ϼ� ����� ����ص� ���� Ŭ�������� ���� �Է��� �������� ���� ����� ������ �ʴ´�.
//  �θ� Ŭ�����κ��� ��ӹ��� ��� ������ ���� ������ private�� ��� �θ� Ŭ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ��Ų��.

//	public Child(String name, boolean gender, int age, String nickName) {
//		super(name, gender);
//		this.age = age;
//		this.nickName = nickName;
//	}

//  �θ� Ŭ�����κ��� ��ӹ��� ��� ������ ���� ������ private�� ��� �θ� Ŭ������ setter �޼ҵ尡 �ۼ��Ǿ� �ִٸ�
//	setter �޼ҵ带 ����ؼ� �ʱ�ȭ��ų �� �ִ�
	
//	public Child(String name, boolean gender, int age, String nickName) {
//		setName(name);
//		setGender(gender);
//		this.age = age;
//		this.nickName = nickName;
//	}
	
//	�θ� Ŭ�����κ��� ��ӹ��� ����� ���� ������ protected�� ��� �ڽ� Ŭ���������� �����Ӱ� ������ �� �����Ƿ�
//	�Ϲ� ��� ������ �ʱ�ȭ ��Ű���� this�� ����� �ʱ�ȭ�� �����ϴ�.
	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
//		�θ� Ŭ�����κ��� ��ӹ��� ��� ������ ���� ������ private�̸� ������ �� �����Ƿ� getter �޼ҵ带 ����ؾ� �Ѵ�
//		return getName() + "(" + (isGender() ? "��" : "��") + ") - " + age + ", " + nickName;
//		�θ� Ŭ�����κ��� ��ӹ��� ����� ���� ������ protected�� ��� �ڽ� Ŭ���������� �����Ӱ� ������ �� �����Ƿ�
//		getter �޼ҵ带 ������� �ʾƵ� �ȴ�
		return name + "(" + (gender ? "��" : "��") + ") - " + age + ", " + nickName;
	}

}
