//���׿����� ( if ? : )

public class ThreewayOperators {

	public static void main(String[] args) {

		int num1;
		int num2 = 100;
		int num3 = 10;
		
		num1 = (num2>num3) ? num2 : num3 ;  // �̰� ������ ����
			//   ��1          ��2     ��3
		/*����ǥ �տ� �������� ��. if�� ����. �׷��� true false�� ��
		 * ���� true�� num2���� ������ false�� num3���� �Ѿ� ��*/
		System.out.println(num1);
		
		
		num1 = (num2<num3) ? num2 : num3 ;
		System.out.println(num1);
		
		
		num1 = (num2>num3) ? (num2-num3) : (num3-num2) ;
		System.out.println(num1);
		
		
		num1 = (num2<num3) ? (num2-num3) : (num3-num2) ;
		System.out.println(num1);
		
		
		
	}
}

