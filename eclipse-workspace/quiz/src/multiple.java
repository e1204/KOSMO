package Inclass;

public class multiple {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 10000; i++) {
			if ((i % 5 == 0) && (i % 7 == 0)) {
				count++; // 5�� 7�� ����� count����
			}
		}
		System.out.println(count + "��"); // ����� 285 

//���2 		
		int count1 = 0;
		for (int j = 1; j <= 10000; j++) {
			if ((j % 5 != 0) || (j % 7 != 0)) {
				continue; // 5�� ����� �ƴϸ� �׳� continue, 7�� ����� �ƴϾ continue
			}
			count1++; // 5�� 7�� ����� count����
		}
		System.out.println(count1 + "��"); // ����� 285 

	}

}
