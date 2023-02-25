package day29;

public class InheritanceTest {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println(parent1);
		Parent parent2 = new Parent("ÀÌ¸ù·æ", true);
		System.out.println(parent2);
		
		Child child = new Child("¼ºÃáÇâ", false, 16, "ÀÌ»ÛÀÌ");
		System.out.println(child);
		
	}
}
