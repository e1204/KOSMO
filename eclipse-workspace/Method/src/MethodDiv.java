//�޼ҵ� ����
//�ݵ�� �ϱ� !!!!
//div������ int�� �ϵ� double�� ���� �������

public class MethodDiv {

	public static void main(String[] args) {

		int num = div(6, 0);
		System.out.println(num);

	}

	public static int div(int num1, int num2) {

		int result;

		if (num2 == 0) {

			result = 0;
			System.out.println("0�� �ԷµǾ����ϴ�. �߸��� �Է��Դϴ�.");

		} else {

			result = num1 / num2;

		}

		return result;

	}

}
