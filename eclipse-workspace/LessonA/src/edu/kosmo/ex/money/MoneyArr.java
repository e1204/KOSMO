//Oct20
package edu.kosmo.ex.money;
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

public class MoneyArr{
	private int money;
	//private int[] coin = new int[4];
	private int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};// ���̷�Ʈ�� �ʱ�ȭ
	
	public MoneyArr(int money) {
		this.money = money;
		//coin[0] = 500;
		//coin[1] = 100;
		//coin[2] = 50;
		//coin[3] = 10;
		
	}
	
	public void show() {
		for(int i=0; i < coin.length; i++) {
			System.out.println(coin[i] + "�� " + money/coin[i] + "��"); //�� ���� �ϴ� �� 
			money =money % coin[i];
			
		}
		
	}
	
	




		
	

}
