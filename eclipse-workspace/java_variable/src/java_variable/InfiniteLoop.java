//���ѷ���: 

public class InfiniteLoop {

	public static void main(String[] args) {

//do while ������ ���� �ݺ�
		do {
			
			System.out.println("Hello World");
			
		} while (true);

		
		
// while�� break�� ���ѷ���
	//6�� ����鼭 14�� ����� ���� ���� �ڿ��� ã��
		int num = 1;

		while (true) {
			
			if ((num % 6 == 0) && (num % 14 == 0))
				
				break; // ���� �ݺ����� break���� ���� �������� �� ����.
			
			num++;
		
		}

	}
}
