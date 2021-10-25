package Oct21;
//2���� ���� �� ���� ǥ���ϴ� Point Ŭ����

//Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�.

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class ColorPoint extends Point {
	private String color;
	private int i;
	private int j;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setXY(int i, int j) {
		this.i = i;
		this.j = j;
		
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		
		return getColor() + "���� "+ "(" + i+ ", "  + j+ ")" +"�� ��";
		
	}

}
/*
 * RED���� (10,20)�� ���Դϴ�.
 */
public class ExColorPoint {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�. ");

	}

}
