package Oct25;
//Polymorphism �����ϱ�

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee("YuJung", 28, "Seoul", "R&D");
		emp.printInfo();
		System.out.println();
		
		
		Regular rgl = new Regular("Jung", 29, "London", "Marketing");

		rgl.setSalary(1000); //���� �߿�
		
		rgl.printInfo();

	}

}
