package Nov02;
//ArrayClass 6

//Comparable, compareTo

import java.util.Arrays;

//�ڹٿ��� ��ü�� ���Ľ�Ű�� ����
//�׷��� implments comparable
class Person implements Comparable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		// return this.age - p.age; //��������, �ڱ��ڽ� �������� �ϸ�
		// return p.age - this.age; //��������, ������ �������� �ϸ�
		
		// return p.name.length() - this.name.length(); //�̸��� ���� ������� ����
		
		//������ ���� lexicographically
		return name.compareTo(p.name);
		//return p.name.compareTo(this.name); ������ ���


	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

}

public class ArrayComparable {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Jake", 29);
		ar[1] = new Person("Avery", 15);
		ar[2] = new Person("Elizabeth", 37);

		// ���⼭ ���� ������ ��
		Arrays.sort(ar);
		for (Person p : ar)
			System.out.println(p);
		System.out.println();

		System.out.println(Arrays.toString(ar));

	}

}
