package Oct29;

public class EqualsString {
	public static void main(String[] args) {

		String str1 = new String("So Simple");
		String str2 = new String("So Simple");

		// ���� ��� ���ϴ� if else�� >> �ּҰ� ��
		if (str1 == str2)
			System.out.println("str1, str2 ���� ��� �����ϴ�.");
		else
			System.out.println("str1, str2 ���� ��� �ٸ���.");

		// �� �ν��Ͻ� ���� ���ϴ� if else�� >> ���ڿ� ��
		if (str1.equals(str2))
			System.out.println("str1, str2 ���� �����ϴ�.");
		else
			System.out.println("str1, str2 ���� �ٸ���.");

	}

}
