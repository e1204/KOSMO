
public class Oct5th {

	public static void main(String[] args) {
//����2��
		System.out.println(3147483647L + 3147483648L);
//����4��
		int a = 3;
		int b = 4;
		double result1 = (double)a/b;
		double result2=a/(double)b;
		System.out.println(result1);
		System.out.println(result2);
//����6��		
		System.out.println('A'); 
		System.out.println('A' + 'A');
//���� 8��
		/* "1 �ʰ� 100�̸��ΰ�?"�� �ڵ����� ǥ���ϸ�? */
		int num8 = 43;
		boolean result8=((num8>1)&&(num8<100));
		System.out.println("1 �ʰ� 100�̸��ΰ�? "+result8);
				
//9��
		/* "2�� ��� �Ǵ� 3�� ���?" �� �ڵ����� ǥ�� �ϸ�? */
		int num9 = 21;
		boolean result9 = ((num9%2)==0)||((num9%3==0));
		System.out.println("2�� ��� �Ǵ� 3�� ���?" +result9);
//����10��
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
//����11��		
		/*���� : 50
		  ���� : 70
		  ���� : 95
		  
		������ ����� ���Ͻÿ�.
		-�� ����� �Ҽ��� ���� �������� �Ͻÿ� */
		
		int kor=50;
		int eng=70; 
		int math=95;
		
		int total=kor+eng+math;
		System.out.println("����: "+total);
		
		double avg=(double)total/3;
		System.out.println("���: "+avg);
				
		
		

	}

}
