
public class practice {

	public static void main(String[] args) {
/* 1��. int ���� ���� �� ���Ƿ� ���� ����
		�ش� ���� ¦�� �̸� "¦�� �Դϴ�" ���
		�ش� ���� Ȧ�� �̸� "Ȧ�� �Դϴ�" ���*/
		
		int num = 38476285;
		if (num%2==0) {
			System.out.println("¦�� �Դϴ�");
		} else {
			System.out.println("Ȧ�� �Դϴ�");
		}
		
/*2��. int ���� 3�� ���� 
      ���� �� ���� ����
      
      �� �� 3���� �� �� �ִ밪�� ��� 
      90 100 60
      
      ���:
      �ִ밪�� 100�Դϴ�. */
		
		int sis= 60;
		int bro = 90;
		int papa = 100;
	
		if ((sis > bro) &&(sis>papa)) {
			System.out.println("�ִ밪�� "+ sis + "�Դϴ�");
		} else if ((bro > sis)&&(bro > papa)) {
			System.out.println("�ִ밪��" + bro+ "�Դϴ�");
		} else {
			System.out.println("�ִ밪��" + papa + "�Դϴ�");
		}
		
		
		
		
		

	}

}
