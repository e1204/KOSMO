package Oct25;
//Polymorphism �����ϱ�

public class Regular extends Employee {

	public Regular(String name, int age, String address, String dept) {
		super(name, age, address, dept);
	}

	/*public int getSalary() {
		return salary;
	}*/

	public void setSalary(int sal) {
		super.salary = sal;

	}

	public void printInfo() {
		super.printInfo();
		System.out.println("������ ����: " + super.salary);

	}

}
