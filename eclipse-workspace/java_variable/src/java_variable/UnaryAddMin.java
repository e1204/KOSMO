
public class UnaryAddMin {

	public static void main(String[] args) {
		short num1 =5;
		System.out.println(+num1); //��������� ���ʿ��� + ����
		System.out.println(-num1); //��ȣ�� �ٲ㼭 ���� ����� ���
		
		short num2 = 7;
		short num3 = (short)(+num2); // �� ��ȯ ���� ������ ���� �߻�
		short num4 = (short)(-num2);  //�� ��ȯ ���� ������ ���� �߻�
		System.out.println(num3);
		System.out.println(num4);
		
		
		short num5 =10;
		short num6 = num5;
		/*short num7 = +num5; //���� +�ٿ��ٰ� ������ ��. */
		short num8 = (short)+num5;
		
		

	}

}
