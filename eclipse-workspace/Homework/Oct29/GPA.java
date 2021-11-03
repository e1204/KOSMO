package Oct29;
//6��
import java.util.Scanner;

class Person {
	private String name, addr;
	private int age;

	public Person(String name, int age, String addr) {
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

	/*
	 * ���ͼ��� ���°� ������ ��Ÿ�� 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getAddr() { return addr; }
	 * 
	 * public void setAddr(String addr) { this.addr = addr; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 */

}

class Student extends Person {
	private String school, major;
	private int stuID;
	private double[] gpa = new double[8]; // �̰� ���⿡ �� �� ..��

	// �츰 �̰� �����ڶ� �θ��� ~
	public Student(String name, int age, String addr, String school, String major, int stuID) {
		super(name, age, addr);
		this.school = school;
		this.major = major;
		this.stuID = stuID;

	}

	@Override
	public void printInfo() {
		super.printInfo();

		/*������ ����� ���ͼ��� ���� �̷��� ���� ��. 
		 * �̷� ��� @Override �Ⱦ� �� �κ��� �� ����� ����
		 * System.out.println("�̸� : " + super.getName()); 
		 * System.out.println("���� : " + super.getAge()); 
		 * System.out.println(); 
		 * System.out.println("�ּ� : " +super.getAddr());
		 */

		System.out.println("�б� : " + school);
		System.out.println("�а� : " + major);
		System.out.println("�й� : " + stuID);
	}

	public double averaege() {
		double sum = 0;
		double avg = 0;

		for (double d : gpa) {
			sum += d;
		}
		avg = sum / gpa.length;
		return avg;
	}

	// ���ͼ��� ���⵵ �ȸ����� �Ф̤�
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public double[] getGpa() {
		return gpa;
	}

	public void setGpa(double[] gpa) {
		this.gpa = gpa;
	}

	public void setGpa() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("8�б� ������ �Է��� �ֽñ� �ٶ��ϴ�.");

			for (int i = 0; i < gpa.length; i++) {
				System.out.print((i + 1) + "�б� ���� �� ");
				gpa[i] = sc.nextDouble();
			}
			
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
			setGpa();// ����Լ�. �������� �ڱ��ڽ� �ٽ� ȣ��
		}

	}

	/*�� ���. �� �κ��� ������ ����� �ξ� ���� 
	 * public static void average() { 
	 * 
	 * Scanner sc = new Scanner(System.in); 
	 * System.out.println("8�б� ������ �Է��� �ֽñ� �ٶ��ϴ�.");
	 * 
	 * double[] gpa = new double[8]; 
	 * double sum = 0; 
	 * 
	 * for (int i = 0; i < gpa.length;i++) { 
	 * System.out.print((i + 1) + "�б� ���� �� "); 
	 * gpa[i] = sc.nextDouble(); 
	 * sum+= gpa[i]; 
	 * } double avg = sum / gpa.length;
	 * 
	 * System.out.println("8�б� �� ��� ������ " + avg + "�Դϴ�.");
	 * }
	 */

}

public class GPA {
	public static void main(String[] args) {
		Student st = new Student("�����", 20, "����� ���Ǳ�", "���缭����б�", "���������а�", 20132222);
		st.printInfo();
		System.out.println();

		// st.average();
		st.setGpa();

		System.out.println("8�б� �� ��� ������ " + st.getGpa() + "�Դϴ�.");

	}

}
