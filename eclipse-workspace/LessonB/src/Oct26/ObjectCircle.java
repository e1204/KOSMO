package Oct26;

//���� ���� Ǯ�̿��µ� �ᱹ �ذ���� �Ф� 
class Circle {

	private int r;

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public String toString() {

		return (r * r * Math.PI) + "�Դϴ�.";
	}

}

public class ObjectCircle {
	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);

	}

}
