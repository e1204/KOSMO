package Oct25;

class Cake{
	
}

class CheeseCake extends Cake{
	
}

class StrawberryCheeseCake extends CheeseCake{
	
}

public class InstanceOf {
	public static void main(String[] args) {
		Cake cake = new StrawberryCheeseCake();
 
		//���� �ش簴ü(������) instance of ������ class��
		if (cake instanceof Cake) {  //if (cake > Cake) 
			System.out.println("���� �ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ� \n");

		}
		//���� ��ü�� �������� ������ �ִ���
		if (cake instanceof CheeseCake) {
			System.out.println("ġ������ �ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ� \n");

		}
		if (cake instanceof StrawberryCheeseCake) {
			System.out.println("����ġ������ �ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ� \n");

			//���δ� true ����. 
			//��� �Ǹ� ���������� �ܿ�� ��.
			//~�� ��ü
			//instance: ~�� ���� ��� ��� ������ �ǹ�
	
			
		}

	}

}
