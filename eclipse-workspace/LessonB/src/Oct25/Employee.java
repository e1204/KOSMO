package Oct25;
//Polymorphism �����ϱ�

public class Employee {
	
	// Employee�� ���� �� ����������private
	// Regular�� ���� �� ���������� protected
	private String name, address, dept;
	private int age;
	protected int salary;

	public Employee(String name, int age, String address, String dept) {
		this.address = address;
		this.age = age;
		this.name = name;
		this.dept = dept;
	}

	public void printInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + address);
		System.out.println("�μ�: " + dept);

	}

}
