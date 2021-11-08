package Past;
interface Fruit {

	public void print();

};

class Grape implements Fruit {

	@Override
	public void print() {
		System.out.println("���� �����̴�.");
	}
}

class Apple implements Fruit {
	@Override
	public void print() {
		System.out.println("���� ����̴�.");
	}
}

class Pear implements Fruit {
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
