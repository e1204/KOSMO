package Oct29;

class Circle{
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.radius=radius;
		this.x=x;
		this.y=y;
		
	}
	
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")"+ "������"+radius;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Circle) {
		
		Circle circle = (Circle)obj;
		
		if( ( this.x == circle.x ) && ( this.y == circle.y ) )
			return true;
		}
			return false;
		
	}
	
	
}
public class CirclePointTest {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5); //�߽� (2,3)�� ������ 5�� ��
		Circle b = new Circle(2, 3, 30); //�߽� (2,3)�� ������ 30�� ��
		
		System.out.println("�� a : " +a);
		System.out.println("�� b : " +b);
		
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");

	}

}
