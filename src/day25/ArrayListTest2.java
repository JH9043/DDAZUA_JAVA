package day25;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
//		Person person1 = new Person();
//		System.out.println(person1);
//		Person person2 = new Person("ȫ�浿", 20);
//		System.out.println(person2);
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("ȫ�浿", 20));				//add(value) : ArrayList�� value�� �� �ڿ� �߰��Ѵ�
		list.add(new Person("�Ӳ���", 40));				
		list.add(new Person("����", 31));				
		list.add(new Person("������", 16));				
		list.add(new Person("�Ӳ���", 40));				//�ߺ��Ǵ� �����ͷ� �Էµȴ�
		System.out.println(list.size() + " : " + list); //size() : ArrayList�� ����� �������� ������ ���´�
		
		list.add(1, new Person("��ûõ", 48));			//add(index, value) : ArrayList�� index��° ��ġ�� value�� ����
		System.out.println(list.size() + " : " + list); 
	
		System.out.println(list.get(1));				//get(index) : ArrayList�� index��° ��ġ�� value�� ���´�
		
		list.set(2, new Person("������", 16));			//set(index, value) : ArrayList�� index��° ��ġ�� value�� ����
		System.out.println(list.size() + " : " + list); 
		
		list.remove(2);									//remove(index) : ArrayList�� index��° ��ġ�� value�� ����
		System.out.println(list.size() + " : " + list); 
		
		list.clear();									// clear() : ArrayList�� ��� �����͸� ����
		System.out.println(list.size() + " : " + list); 
	}
}
