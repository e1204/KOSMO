package Nov02;

import java.util.Arrays;

class Rectangle implements Comparable {
	private int x, y;

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getArea() {
		return x * y;
	}

	@Override
	public int compareTo(Object o) {
		Rectangle rec = (Rectangle) o;
		return rec.getArea() - this.getArea();
		//�ٷ� ����ȯ ���Ѽ� ȣ�� ((Rectangle) o).getArea() - this.getArea(); ������ ���

	}
	
	/*@Override
	public String toString() {
		return String.valueOf(getArea());
	}*/


}

public class ArraysRecArea {
	public static void main(String[] args) {

		Rectangle[] recArr = { new Rectangle(6, 6), new Rectangle(5, 5), new Rectangle(10, 10),
									new Rectangle(12, 12), new Rectangle(11, 11) };

		Arrays.sort(recArr); //���Ľ���
		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}
		
		//���ٷ� ������ ������ �̰� ���� System.out.println(Arrays.toString(recArr)); 
		//�ٸ� toString ��Ծ���ϴϱ� �������̵� ����� ��

	}

}
