//�޼ҵ� ����
//���� ����̾簡 
//������ �ϱ�~~ 

public class Grade {

	public static void main(String[] args) {

		char grade;
		double avg =30;

		grade = getGrade(avg);
		// �� �Դϴ�. �� ���
		System.out.println(grade + "�Դϴ�.");

	}

	public static char getGrade(double avg) { // ����Ÿ�� ĳ���� ! grade ���ҰŴϱ�

		char grade; // �̰� �ȽἭ �ڲ� ������

		if (avg >= 90) {

			grade = '��'; // ���� �� �� System.out.println("��"); �׷��� ���� ��� �̻�����..

		} else if (avg >= 80) {

			grade = '��';
		} else if (avg >= 70) {

			grade = '��';
		} else if (avg >= 60) {

			grade = '��';

		} else {

			grade = '��';

		}

		return grade; //�Լ� �տ� void�� �ƴ� �̻� returnŸ���� �ʿ���

	}

}