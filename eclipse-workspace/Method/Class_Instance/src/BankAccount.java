//Ŭ����, �ν��Ͻ� ���� ����

class BankAccount {
	
	
	String accNumber; //���¹�ȣ
	String ssNumber; //�ֹι�ȣ
	
	String name;
	
	int balance = 0; // ���� �ܾ�
	BankAccount(){
		System.out.println("������ ȣ��");
		
	}
	
	//������ �Լ� ���� �� �Ķ���� �ѱ� �� ����
	BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
		
	//�ʱ�ȭ�� ���� �޼ҵ�
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal; //���� ���� �� ���ݾ����� �ʱ�ȭ
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("�ܾ� : " + balance);
		return balance;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {		
		this.name=name;
	}
	
	


}
