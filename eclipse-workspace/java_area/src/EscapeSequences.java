
public class EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C');
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB" + '\n' + 'C');
		System.out.println("AB" + '\r' + 'C');
		
		char ch = 65;
		System.out.println(ch + "\'Hello\'");
		
		
		int num1 = 100;
		long num2 = 3100000000L; 
		//��ǻ�ʹ� �����ؼ� �ݵ�� ����� �� ���� ���� ��ġ��Ų��.
		//����? ����� �� ���� Ÿ���� �ٸ� �ܿ�
		
		long result = num1 + num2;
		System.out.println(result);
		
		
		float num3 = 1.12f;
		//System.out.println(l);
		
		double pi = 3.14;
		int num4 = (int)pi;
		System.out.println(num1);
		
		/*
		long 1 = 3100000000L;  //ū �� �ڸ��� ������ �����ϰ� �ؾ���
		num5 = (int)num5 ; 
		*/
		
		
		
	}

}
