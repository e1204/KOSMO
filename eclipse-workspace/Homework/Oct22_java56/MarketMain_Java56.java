package Oct22_java56;
//5��

//��Ű�� �ٸ��� �̵� ������ import Oct22_java56.Audio; 
public class MarketMain_Java56 {
	public static void main(String[] args) {
		
		Buyer b = new Buyer(1000);
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new TV());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
			
		b.summary();
		

	}

}

//�ܾ��� �����Ͽ� Computer�� �� �� �����ϴ�.
//������ ����: Ƽ��, ��, Ƽ��, �����, ��, ��
//�ÿ�ݾ�: 850
//�����ݾ�: 150