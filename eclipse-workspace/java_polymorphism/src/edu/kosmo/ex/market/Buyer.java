package edu.kosmo.ex.market;


public class Buyer {

	int money = 1000;
	
	//shape[] shape = {new Rectangle(10,10), new Circle(10)}�̶� ����
	Product[] cart = new Product[3];
	
	//�迭, index��� ��. []�ȿ� ��, ��Ʈ�� �� �ε����� ����
	int i = 0; // �ٽ�. i �� ��� ��Ʈ���ϳ�


	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+ p +"��/�� �� �� �����ϴ�.");
			return; //������ 
		} //���� money�� price���� ũ�� �ڸ� �������.
		money = money - p.price; //�ڱⰡ ���� ���ݿ��� ����.
		add(p); //add�ϰ� p ȣ��

	}
	
	//public void add(Product p = new Tv()) �θ�� �ڽ��ؼ� Product[] �� �ȿ� �־� �� 
	public void add(Product p) {
		// ��Ʈ [i] = p; cart�� ù��° iĭ�� p�� �ִ°� ����
		// ��Ʈ i++; �̰� �ٽ�
		
		//�۰ų� ũ��? ������ if
		//i�� ��ٱ��� ũ�� ��.
		//��ٱ��� ũ�� ��� ���Ѵ�? cart.length
		if (i >= cart.length) { //i���� 3�̻��϶� ����
			//tmp�� ���ϰ� cart�߾���..
			Product[] tmp = new Product[cart.length*2]; //���� ��ٱ��Ϻ��� 2��
			
			//īƮ 0������ tmp0������ ������ �� ��? 3��. 
			//cart[0]�� ����(source) tmp[0]�� ������? ����ī����...(desc)
			System.arraycopy(cart, 0, tmp, 0, cart.length); 
			
			//�� ��û �߿�!!! ���Ŷ� ������ �ٲ�ġ�� !!! ��
			cart = tmp;
		}
		
		//���ٽɡ�
		//cart[i++]=p; ���� ���� �̰ǵ� �̷��Ե� ����. �ؿ� �Ÿ� ��ģ��
		cart[i] = p;
		i++;
			
	}

	public void summary() {
		
	
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

/*������ ���

 public void summary() {
 String itemList = "";
 int sum=0;
 for (Product product : cart) {
	 itemList = itemList + product.toString();
	 sum = sum + product.price;
 }
 
 System.out.println("���� ����" + itemLIST);
 System.out.println("��� �ݾ�" + sum);
 System.out.println("���� �ݾ�" + money);
 
}
 
*/







