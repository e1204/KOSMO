//��������
//������ ������� 2�� ������� 3�� ����μ��� ���� ������ƴ� ;;	System.out.println();

public class FIFtimestable4 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				int result = i * j;

				if (result % 2 == 0 && result % 3 == 0) {
					count++;
					System.out.println(i + "*" + j + "=" + result + " ����:" + count); // ������� �̰�. ���⼭ ��� ������ �̾Ƴ���
				}

			}
			System.out.println();

		}
		System.out.println("������" + count);

		/*
		 * ��� ������ ��... int count=0 ; //���ڱ��� ��������� �ϴ� �߰�ȣ �� count++�Ҷ� ������ �ȶ� !!
		 * 
		 * for (int i =2; i <=9; i++) {
		 * 
		 * for(int j =1; j<= 9; j++) { int result = i*j;
		 * 
		 * if((result %2==0) && (result %3 ==0)) {
		 * 
		 * count++;
		 * 
		 * } }
		 * 
		 * System.out.println(count); //��� ���� .. 3 7 10 11 ...28����  ����
		 * 
		 * }
		 */

	}

}
