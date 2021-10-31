package Oct28;

interface Shape {
	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + r + "�� ���Դϴ�.");
		
	}

	public double getArea() {
		return r * r *PI;

	}

}

class Oval implements Shape {

	private int width, height;

	public Oval(int width, int height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println(width + " x " + height + " �簢���� �����ϴ� Ÿ��");
		
	}

	public double getArea() {
		return width * height * PI;

	}

}

class Rect implements Shape {

	private int width, height;

	public Rect(int width, int height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println(width + " x " + height + " ũ���� �簢��");

	}

	public double getArea() {
		return width * height;

	}

}

public class ShapeInterface {
	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());

	}

}
