//�ݺ��� for ���� 
public class ForBasic {

	public static void main(String[] args) {

	// ����3. 1���� 100������ �� �߿��� Ȧ���� ���� ���ϴ� ���α׷����� �Ͻÿ�.

			int sum = 0;
			for (int i = 1; i <= 100; i++) {   //j++ ��� ó������ +2�� ���൵ �ȴ�.
	
				if (i % 2 == 1) { 				// sum�� �ƴ϶� i�� �־�
					sum = sum + i;
				}
			}
			System.out.println("sum : " + sum);
	
			System.out.println("============");
						
	
	// ����3-1. 1���� 100������ �� �߿��� ¦���� ���� ���ϴ� ���α׷����� �Ͻÿ�.
			
			int sum2 = 0;
			for (int j = 1; j <= 100; j++) {
	
				if (j % 2 == 0) {
					sum2 = sum2 + j;
				}
			}
			System.out.println("sum : " + sum2);
			
			System.out.println("============");
			
			
	//����4. 1�� 1000 ������ ���� �� 2�� ������� 3�� ����� ���� ��		
			
			int sum3 = 0;
			for (int k = 1; k <= 1000; k++) {
		
				if ((k % 2 == 0) && (k % 3 == 0)) {
					sum3 = sum3 + k;
					System.out.println(k);
				}
			}
		
			System.out.println("sum : " + sum3);

		

	}
}
