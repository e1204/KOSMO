//�ݺ��� for ���� 
public class Repeat3For {

	public static void main(String[] args) {
		
		 for(int i = 0; i<5; i++) System.out.println("I love Java" + i);
		 
		 System.out.println("============");
		 

	//����1. 9���� �����ÿ� 1*9 = 9 1*2=18 ....
		
		 int dan = 9; 
		 for(int j=1 ; j<10; j++) // ++i�� �����ѵ� ���������� i1++��
		 System.out.println(j + " * " + dan + " = " + (j*dan));
		 
		 System.out.println("============");
		 
		 
	//����2. 1���� 100������ ���� ���ϴ� ���α׷����� �Ͻÿ�.
			
			int sum = 0;  //i���� ��� �� ���� ����
			 
			for (int k = 1; k <= 100; k++) {
				sum +=k;         //sum = sum + k;�� ����
			}
			System.out.println("sum : " + sum); 
		
		
		

	}
}
