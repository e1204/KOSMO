package Oct22;
//2��° ����

class Cake {
	public void sweet() {}
}

class CheeseCake extends Cake{
	public void milky() {}
}

class StrawberryCheeseCake extends CheeseCake{
	public void sour() {}
}

public class OverRiding {
	public static void main(String[] args) {
		
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1; //���� ! �θ�� �ڽ��̴� (o)
		
		Cake ca3 = new CheeseCake();
		CheeseCake ca4 = ca3; //�Ұ��� ! �ڽ��� �θ��..?(x)
		

	}

}
