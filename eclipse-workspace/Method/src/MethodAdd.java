//�޼ҵ� ����
//�ݵ�� �ϱ� !!!!

public class MethodAdd {

	public static void main(String[] args) {

		int num = add(3, 7); // ȣ���ϴ� ��. �׷����� �Լ��� �־�� ��
		System.out.println(num);

	}

	// ȣ���̴� ������ ������ �����, �Լ��� ������ ���� �����.
	// �װ��� �ٷ� �����̴�.
	// void�� �ϸ� ���� �� ����..����

	public static int add(int num1, int num2) { // 3�� 7�� �޸𸮿� �ø� �� �ִ� ���� ������ �ݵ�� �ؾ� ��

		// �Լ� �� �տ� �ִ� ����Ÿ���� ��������� ��.
		// add��� �Լ��� ���� �Ѱ��ְ� ����.�׷����� �ݵ�� return�� �־�� ��
		// return�� �������� returnŸ�Ե� �־����. �ݵ��
		int result = num1 + num2;
		return result; // ����� ���� int�� ���� ��. Ȥ�� �ٷ� return num1 + num2; �� ����

	}

}
