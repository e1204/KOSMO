
public class Num12 {

	public static void main(String[] args) {

	

		getSeason(3); // ���Դϴ�. ���

	}

	public static void getSeason(int m) {

		switch (m) {
		case 3:
		case 4:
		case 5:
			System.out.println("�� �Դϴ�.");

			break;

		case 6:
		case 7:
		case 8:
			System.out.println("���� �Դϴ�.");

			break;

		case 9:
		case 10:
		case 11:
			System.out.println("���� �Դϴ�.");

			break;

		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ� �Դϴ�.");

			break;

		default:
			break;
		}

	}
}


//�����: �� �Դϴ�.

