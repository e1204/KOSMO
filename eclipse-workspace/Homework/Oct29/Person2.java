package Oct29;
public class Person2 {
	private String name, addr;
	private int age;

	public Person2(String name, int age, String addr) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println();
		System.out.println("�ּ� : " + addr);
	}

}
