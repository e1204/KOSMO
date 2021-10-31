package Oct29;

class MyPoint {
	private int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public String toString() {

		return "Point(" + x + "," + y + ")";

	}

	@Override
	public boolean equals(Object obj) {
		MyPoint point = (MyPoint)obj;
		
		if (this.x == ((MyPoint) obj).x && this.y == ((MyPoint) obj).y)
			return true;
		else
			return false;
	}

}

public class MyPointTest {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p);

		if (p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");

	}

}
