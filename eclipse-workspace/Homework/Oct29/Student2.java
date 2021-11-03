package Oct29;
import java.util.Scanner;

class Student2 extends Person2 {
	private String school, major;
	private int stuID;

	private double[] gpa = new double[8];

	// �츰 �̰� �����ڶ� �θ��� !
	public Student2(String name, int age, String addr, String school, String major, int stuID) {
		super(name, age, addr);
		this.school = school;
		this.major = major;
		this.stuID = stuID;

	}

	@Override
	public void printInfo() {
		super.printInfo();
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
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
			setGpa();// ����Լ�. �������� �ڱ��ڽ� �ٽ� ȣ��
		}

	}

}

