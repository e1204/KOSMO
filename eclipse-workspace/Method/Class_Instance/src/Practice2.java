//BankAccount ������ ����
class Grade {

	int math;
	int science;
	int english;
	double average;

	Grade(int math, int science, int english) {

		this.math = math;
		this.science = science;
		this.english = english;

	}

	public double average() {
		return average = (math + science + english) / 3.0;
	}

	public String getGrade() {
		double avg = average();
		String str;

		if (avg >= 90) {
			str = "�� �Դϴ�";
		} else if (avg >= 80) {
			str = "�� �Դϴ�";

		} else if (avg >= 70) {
			str = "�� �Դϴ�";

		} else if (avg >= 60) {
			str = "�� �Դϴ�";

		} else {
			str = "�� �Դϴ�";
		}
		
		return str;

	}

}

public class Practice2 {

	public static void main(String[] args) {

		int math, science, english;
		math = 90;
		science = 80;
		english = 80;

		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());

		String grade = me.getGrade();
		System.out.println(me.getGrade()); // �� �Դϴ�

	}

}
