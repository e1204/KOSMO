package Oct28;

interface ICalculator {
	int add(int x, int y);

	int sub(int x, int y);

	int mul(int x, int y);

	int div(int x, int y);
}

class Calculator implements ICalculator {

	@Override
	public int add(int x, int y) {

		return x + y;
	}

	@Override
	public int sub(int x, int y) {

		return x - y;
	}

	@Override
	public int mul(int x, int y) {
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		return x / y;
	}

}

public class CalculatorMain {

	public static void main(String[] args) {
		ICalculator cal = new Calculator();

		try {
			System.out.println(cal.add(6, 5));
			System.out.println(cal.sub(6, 5));
			System.out.println(cal.mul(6, 5));
			System.out.println(cal.div(6, 0));
		} catch (Exception e) {
			e.printStackTrace(); // �����޼����� ���
		} finally {
			System.out.println("���� ����");
		}

	}
}
