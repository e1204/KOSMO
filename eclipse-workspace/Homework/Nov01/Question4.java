package Nov01;

class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) { // ����ȯ �������� ���� ��

			Person person = (Person) obj;
			if (this.name.equals(person.name)) {
				return true;
			}
		}
		return false;
	}
}

public class Question4 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
						// equals�� �������̵� ���� ������ �ּҰ����� ���Ѵ�.
		System.out.println(p1.equals(new Person("ȫ�浿")));
		System.out.println(p1.equals(new Person("�ָ���")));

	}

}
