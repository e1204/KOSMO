package Oct28;


class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize(); // ���� Ŭ������ finalize �޼ҵ� ȣ��
		System.out.println("destroyed: " + name);
		System.out.println("���Ϸ� ��� �Ǿ���");
	}
}

public class FinalizeObject {

	
	public static void main(String[] args) {
		Person p1 = new Person("Yoon");
		Person p2 = new Person("Park");
		
		p1 = null; // ��������� ������ �÷����� ������� ����
		p2 = null; // ��������� ������ �÷����� ������� ����
		
		System.gc(); //jvm �ȿ� �ִ� garbage collector. �޸� �����ּ��� �ϴ� �Լ�
		//System.runFinalization();

		System.out.println("end of program");

	}

}
