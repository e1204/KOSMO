package Oct25_PMpractice;

//2��, 2-1��
//���� LessonB
public class Regular extends Employee {

	public Regular(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);

	}

	public void setSalary(int sal) {
		super.salary = sal;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("������ ����: " + super.salary);

	}

}
