//Switch���� ����. 
public class SwitchBreak {

	public static void main(String[] args) {
		/* ��(1����, 2���� ..)�� ��� ���� ����
		1, 2, 3, 4 ���Դϴ� ���
		5, 6, 7, 8 �����Դϴ�
		9, 10, 11, 12 �ܿ��Դϴ� ��� 
		1~12�� �ƴ� ���� �߸��� �Է��Դϴ� */
		
			int month=1;
			switch (month) {
			case 1:
				System.out.println("1, 2, 3, 4 ���Դϴ�");
			case 2:
				System.out.println("5, 6, 7, 8 �����Դϴ�");
			case 3:
				System.out.println("9, 10, 11, 12 �ܿ��Դϴ�");		
				break;
	
			default: System.out.println();
				break;
			}
			System.out.println("======================");
		//������ �ؼ�
			int m = 9; //�ִ� ���ڿ� ���� ������ ���� �޶���.
			
			switch (m) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("���Դϴ�.");
				break;
			case 5:case 6:case 7:case 8:
				System.out.println("�����Դϴ�.");
				break;
			case 9, 10, 11, 12: //�ֽŹ����̶� ���� �ǹ������� �� �Ⱦ�
				System.out.println("�ܿ��Դϴ�.");
				break;
				

			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break; //�� ���� break �־ ���� ��� ����
			}
			
			System.out.println("======================");
			
		

	
			

	}
}
