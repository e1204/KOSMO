package Oct19;

//FormatString
//������ ������ �� �ִ�.
public class PrintF {

	public static void main(String[] args) {
		int age = 21;
		double height = 180.2;
		String name = "CHOI BEOM GYU";
		
		System.out.printf(" name: %s \n", name); //%s�� String�� ����
		System.out.printf(" age: %d \n height: %e \n\n", age, height); //%e�ε� �Ҽ���
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf(" %g \n", 0.00014); //�Ҽ��� �ڸ��� 6�ڸ� ���ϸ� %g
		System.out.printf(" %g \n", 0.000014);

	}

}
