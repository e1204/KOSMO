import java.util.Scanner;

class Rectangle{
	
	private int width, height; //private �� ���� �� 
	
	public Rectangle(int width, int height) {
		
		this.height = height;
		this.width = width ;		
	}
	
	public int getArea() {
		return width * height ;
		
	}
	
}

public class RecTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� �ϼ���");
		int width = sc.nextInt();
		System.out.println("���� �Է� �ϼ���");
		int height = sc.nextInt();
		
		Rectangle rec = new Rectangle (width, height);
		System.out.println("���̴� " + rec.getArea() + " �Դϴ�.");
		

	}

}
