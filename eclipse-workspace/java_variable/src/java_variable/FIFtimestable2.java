//��������
//������ Ȧ��, ¦���� ���

public class FIFtimestable2 {

	public static void main(String[] args) {

		// ¦��
		for (int i = 2; i < 10; i++) {

			if (i % 2 != 0) {
				continue;
			}

			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		System.out.println('\n');
		

		// Ȧ��
		for (int k = 2; k < 10; k++) {
			if (k % 2 != 1) {
				continue;
			}

			for (int j = 1; j < 10; j++) {
				System.out.println(k + "x" + j + "=" + (k * j));
			}
		}

	}

}
