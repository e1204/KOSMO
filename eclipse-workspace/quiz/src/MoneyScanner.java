import java.util.Scanner;

class Money{
	
	private int m_500, m_100, m_50, m_10, m_5, m_1, money, tmp;
	
	public Money(int money) {
		setMoney (money);
		
	}
	
	public void setMoney(int money) {
		
		if (money<0) {
			this.money=0;
			System.out.println("�߸��� �Է��Դϴ�.");		
			
			return;
		}	
		this.money=money;
	}
	
	public void show() {
		m_500 = money / 50000;
		tmp = money - m_500 * 50000;

		m_100 = tmp / 10000;
		tmp = tmp - m_100 * 10000;

		m_50 = tmp / 5000;
		tmp = tmp - m_50 * 5000;

		m_10 = tmp / 1000;
		tmp = tmp - m_10 * 1000;

		m_5 = tmp / 500;
		tmp = tmp - m_5 * 500;

		m_1 = tmp / 100;

		System.out.println("������: " + m_500 + "��");
		System.out.println("����: " + m_100 + "��");
		System.out.println("��õ��: " + m_50 + "��");
		System.out.println("õ��: " + m_10 + "��");
		System.out.println("�����: " + m_5 + "��");
		System.out.println("���: " + m_1 + "��");
		
		
	}
	
	
}

public class MoneyScanner {
	public static void main(String[] args) {
		
		while(true) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("�ݾ��� �Է��Ͻÿ�.");
		int money = sc.nextInt();
		
		
		Money m = new Money(money);
		m.show();
		System.out.println( "��� Y ::  �ߴ� N");
		
		char ch = sc.next().charAt(0);
		
		if ( ch == 'N'  || ch ==  'n')
			break;
		
		}
		System.out.println("�����Դϴ�.");
		
		
		
		

	}

}
