//for������ ��ǥ ���� �����ﰢ��

public class StarRTleft {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// �ϴ� �ʱⰪ 4��
			for (int j = 4; j >= i; j--) { // ���� ���

				System.out.print(" "); // ���� �ȳ��� ������ �����̽��ٸ� �ȴ����� ��� for�� ����

			}

			for (int j = 1; j <= i; j++) { // �� ���

				System.out.print("*");
			}

			System.out.println();

		}

		/*
		 * �����
    *
   **
  ***
 ****
*****
		 * �̷��� ����
		 */

		/*
		 * for (int i = 1; i <= 5; i++) {
		 * 
		 * for (int j =1; j<i; j++) { //���� ���
		 * 
		 * System.out.print("");
		 * 
		 * }
		 * 
		 * for (int j = 1; j <= i; j++) { // �� ���
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */

//hint ����4�� ���� 3�� ���� 2�� ...

	}

}
