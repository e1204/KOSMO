package Oct25_PMpractice;

//2��, 2-1��
//���� LessonB
public class Employee {
	private String name, addr, dept;
	private int age;
	protected int salary;

	public Employee(String name, int age, String addr, String dept) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.dept = dept;

	}

	public void printInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + addr);
		System.out.println("�μ�: " + dept);

	}

}
