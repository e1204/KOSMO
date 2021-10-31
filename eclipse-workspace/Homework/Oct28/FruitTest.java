package Oct28;

/*interface Fruit { //�������̽� �ȿ���...(������ .. 
	public abstract void print();
}*/

abstract class Fruit { 
	public abstract void print();
	
	public void print2() {
		System.out.println("�߻�Ŭ���� �ȿ��� �Ϲ� �Լ��� �����ϴ�.");
	}

};

class Grape extends Fruit {

	@Override
	public void print() {
		System.out.println("���� �����̴�.");
	}
}

class Apple extends Fruit {
	@Override
	public void print() {
		System.out.println("���� ����̴�.");
	}
}

class Pear extends Fruit {
	@Override
	public void print() {
		System.out.println("���� ���̴�.");
	}
}

public class FruitTest {
	public static void main(String[] args) {

		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry)
			f.print();

	}

}
