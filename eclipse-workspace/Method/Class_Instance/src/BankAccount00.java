//Ŭ����, �ν��Ͻ� ���� ����


class BankAccount00 {	
	public static void printNum(int num) {
		System.out.println(num);
	}	
	
	public static void printBank(BankAccount acc) { //printBank���� jung�� �Ѱ�ٴ� ��
		acc.checkMyBalance();
	}
	
		
	
	public static void main(String[] args) {	
		printNum(10);
			
		// �� ���� �ν��Ͻ� ����
		BankAccount yu = new BankAccount();
		BankAccount jung = new BankAccount();
		
		
		yu.setName("������"); 
		jung.setName("������");
		
		
		 System.out.println(yu.getName());
		

		// @�ؽ��ڵ�� jvm�� �����ϴ� ��¥ �ּ�. �޸� �ּҸ� Ȯ���ϴ� ���
		System.out.println(yu);

		// �� �ν��Ͻ��� ������� ������ ����
		yu.deposit(5000);
		jung.deposit(3000);

		// �� �ν��Ͻ��� ������� ��� ����
		yu.withdraw(2000);
		jung.withdraw(2000);

		// �� �ν��Ͻ� ��� �ܾ� ��ȸ
		yu.checkMyBalance();
		jung.checkMyBalance();
			
		printBank(yu);
		
		
		//null �� üũ
		//����Ű�� �ּҰ� ����. ���踦 ���´�.
		yu = null;
		
		if (yu == null) {
			yu = new BankAccount();
		}else {
			yu.deposit(5000);
		}  
		
		
		
	
	
	}

}

