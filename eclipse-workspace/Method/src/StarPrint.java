//�޼ҵ� ����
//6������ 6��ž

public class StarPrint {

	public static void main(String[] args) {

		starPrint(5); // ������ �ƴϰ� 5���� ���������� �ø��°Ŷ� return�� ���ʿ�. �׷��� void���
		starPrint(6);
		starPrint(3);
		starPrint(10);

	}

	public static void starPrint(int num) { // return type�� �Լ����� �Է�

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
