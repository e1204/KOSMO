package Oct18;

public class SubString {

	public static void main(String[] args) {
		String st1 = "abcdefg";
		
		//2�̻� �κ� ���� ���ʹ� 01234�� 2�� 3�� �ǹ�[
		String st2 = st1.substring(2);
		System.out.println(st2);
		
		//2�̻� 4�̸� ����
		String st3 = st1.substring(2, 4);
		System.out.println(st3);

	}

}
