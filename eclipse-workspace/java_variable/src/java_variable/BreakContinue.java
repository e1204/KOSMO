//����� ������ ���� ����
public class BreakContinue {

	public static void main(String[] args) {

	//����1. 1�� 1000 ������ ���� �� 2�� ������� 3�� ����� ���� ù�� ° ���� ���

			int num = 1;
			boolean search = false;
	
			while (num <= 1000) {
				if ((num % 2 == 0) && (num % 3 == 0)) {
					search = true;
					break;
				}
				num++;
			}
			if (search)
				System.out.println("2�� ������� 3�� ����� ���� ù�� ° ��: " + num);
			else
				System.out.println("ã�� ���߽��ϴ�.");
	
			System.out.println("====================");

			
	//����1-1. FOR�� ���� 
		 
			int i;
			for (i = 1; i <= 1000; i++) {
				if ((i % 2 == 0) && (i % 3 == 0)) {
					break;
				}
			}
			System.out.println(i);
	
			System.out.println("====================");
			

	//����2. 1�� 1000 ������ ���� �� 2�� ������� 3�� ����� ��� �� ������ ���
		
			int num1 = 1;
			int count = 0;
	
			while ((num1++) <= 1000) {
				if ((num1 % 2 != 0) || (num1 % 3 != 0))
					continue;
				count++;
			}
			System.out.println("2�� ������� 3�� ����� ����: " + count + "��");
			
			System.out.println("====================");
			

	//����2-2. FOR�� ���� 

			int count1 = 0;
			for (int j = 1; j <= 1000; j++) {
	
				if ((j % 2 != 0) || (j % 3 != 0)) {
					continue;
				}
				count1++;
			}
			System.out.println(count1);

			
	}
}
