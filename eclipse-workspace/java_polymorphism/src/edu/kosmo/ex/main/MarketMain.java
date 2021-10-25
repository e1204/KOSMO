package edu.kosmo.ex.main;

import edu.kosmo.ex.market.Audio;
import edu.kosmo.ex.market.Buyer;
import edu.kosmo.ex.market.Computer;
import edu.kosmo.ex.market.TV;

public class MarketMain {
	public static void main(String[] args) {
		
		Buyer b = new Buyer(1000);
		//�Ķ����(��ȣ ��)�� �� �ٸ�. 120% PolyMorphism ����ߴٴ� �ǹ�.
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