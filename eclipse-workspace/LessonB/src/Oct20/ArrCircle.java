package Oct20;


//���� § �ڵ� ! ������ �ڵ�� LessonA�� ����

class Circle {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}

public class ArrCircle {
	public static void main(String[] args) {

		Circle[] cir = new Circle[5]; // int�� �ƴϰ� Circle����. ���� Ŭ���� Circle�س��� ���� ������
		cir[0] = new Circle(5);
		cir[1] = new Circle(6);
		cir[2] = new Circle(7);
		cir[3] = new Circle(8);
		cir[4] = new Circle(9);

		int cnum = 0;
		for (int i = 0; i < cir.length; i++)
			cnum += cir[i].getArea(); // length�� �ƴϰ� getArea. ���� getArea�� ���⿡ ��

		System.out.println("�� ���� ��: " + cnum);

	}
}
