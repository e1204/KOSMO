package Oct22_java56;
//5��

public class Buyer {

	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; // �ٽ�. i �� ��� ��Ʈ���ϳ�


	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product p) {
	
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+ p +"�� �� �� �����ϴ�.");
			return;
		} 
		money = money - p.price;
		add(p); 

	}

	public void add(Product p) {
		// [i] = p; cart�� ù��° iĭ�� p�� �ִ°� ����
		// i++; �̰� �ٽ�

		if (i >= cart.length) {
			//temp�� ���ϰ� cart�߾���..
			Product[] tmp = new Product[cart.length*2];
			//int i = 0;
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			
			cart = tmp;
		}

			//for (i = 0; i >= tmp.length; i++) {
				//tmp[i] = p;
				//i++;
			//}
		cart[i++]=p;
			
	}

	public void summary() {
		
		//for(int i =0; i < cart.length ; i ++) {
			//System.out.print("������ ���: " + cart[i] + " ");
		//}
		//System.out.println();
		System.out.print("������ ���: " );
		for(Product e: cart) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		
		int sum= 0;
		for(Product p :  cart) {
			sum = sum + p.price;
		}
		
		
		System.out.println("���ݾ�: " + sum);
		System.out.println("�����ݾ�: " + money );
	}

}










