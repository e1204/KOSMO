package Oct19;
/*
�Ʒ��� �迭�� Ȱ���Ͽ� ���α׷��� ¥�ÿ�.
ȭ��ż� ���ϱ�
- 1�� ���� 5000 �� ���� �������� ����.
- 500�� 100 �� 50 �� 10���� �迭�� ���� �Ͽ� ���� 

�ش� ���������� ȭ�� �ż��� �Ʒ��� ���� ���
2860�� 

���
500�� : 5�� 
100�� : 3�� 
50�� : 1�� 
10�� : 1��
*/
class MoneyArr {
	
	private int currency;
	private int[] money = new int[4];
	
	public MoneyArr(int currency) {
		this.currency = currency;
		money[0] = 500;
		money[1] = 100;
		money[2] = 50;
		money[3] = 10;
	}
	
	public void show() {
		for(int i =0; i< money.length; i++) {
		System.out.println(money[i] + "��" + " : "+ currency / money[i]  + "��");
		currency = currency % money[i];			
		}
	}

	
}


public class MoneyRandom {
	public static void main(String[] args) {
		
		int money = 2860;
		
		MoneyArr moneyArr = new MoneyArr(money); //MoneyArr ��ü����
		moneyArr.show();
		
		

	}
}
