
public class Num06 {

	public static void main(String[] args) {

		char grade;
		double avg = 80;

		grade = getGrade(avg);

		System.out.println(grade + " �Դϴ�.");

	}

	public static char getGrade(double avg) {

		char grade;

		if (avg >= 90) {
			grade = '��';

		} else if (avg >= 80) {
			grade = '��';

		} else if (avg >= 70) {
			grade = '��';

		} else if (avg >= 60) {
			grade = '��';

		} else {
			grade = '��';
		}

		return grade;

	}

}

//�����: �� �Դϴ�.
