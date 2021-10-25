
public class Java56 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Tv2());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ�" +p+"�� �� �����ϴ�." ); 
			return; //�߰�
		}else {
			money = money - p.price;
		}
		add(p);		
	}

	void add(Product p) {
		if(i >= cart.length ) {
			Product[] tmp = new Product[cart.length*2]; //cart ���� tmp
			
			System.arraycopy(cart, 0, tmp, 0, cart.length); //������ ����
			
			 cart = tmp; // tmp�� �� �� �����ϰ� ������
			
	
		}
		cart[i++]=p; //������ ������ ����
				
			
			
	}

	void summary() {

		System.out.print("������ ����: " );
		for(Product e: cart) {  //��������
			System.out.print(e +" "); 
		}
		System.out.println(); 
		
		
		int sum = 0;
		for( Product p : cart) { //Product p�� �ƴ϶� int i�� �� ... 
			sum = sum + p.price;  //p.price�� �ƴ϶� p�� �� ..
			 
		}
		
		System.out.println("����� �ݾ�: " + sum);
		System.out.println("���� �ݾ�: " + money );
	}
}

class Product {
	int price; 

	Product(int price) {
		this.price = price;
	}
}

class Tv2 extends Product {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv2";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
