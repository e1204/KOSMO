package Oct27;

import java.util.Scanner;

//6��
//try catch �ִ� ���� �ٽ�
public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int result = 0;

		// char op = 0; �� ������.
		String op = null; // ���ڿ��� ���� �� ����. String �ȿ� ��û �� �Լ����� �ֱ� ������ ���ڿ��� �ٷ� �� ����.

		while (true) {

			try {

				Scanner sc = new Scanner(System.in);

				System.out.println("*** ���� ***"); // Ÿ��Ʋ ���
				System.out.println("��1 : ");
				num1 = sc.nextInt();

				System.out.println("��2 : ");
				num2 = sc.nextInt(); // ���� �ݵ�� num2�� ����

				System.out.println("���� : ");
				op = sc.next(); // x+-% ������ ���� �޴� ��

				switch (op) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;

				default:
					System.out.println("�߸��� ������ �Է��Դϴ�.");
					result = 0;
				}

				System.out.println("��� ���: " + result);

				System.out.println("��� �Ͻðڽ��ϱ�? ��� : Y  |  ���� : N");
				String finish = sc.next();

				if (finish.equals("N") || finish.equals("n")) {
					break;
				}

			} catch (Exception e) {

				System.out.println("�߸��� �Է��Դϴ�. ó������ �ٽ� �Է��ϼ���.");
				continue;

			}
		}

		System.out.println("��� ���: " + result);
	}
}
