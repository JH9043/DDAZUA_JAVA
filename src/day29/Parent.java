package day29;
// �θ�(����, ����, ���)  Ŭ����
public class Parent {
//	private String name;
//	private boolean gender;

	protected String name;
	protected boolean gender;
	
	public Parent() {
		this("����", false);
	}

	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return name + "(" + (gender ? "��" : "��") + ")";
	}
	
}
