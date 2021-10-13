class Circle {

	double r;
	
	double getR() { // r�� ������ �Լ�
		return r;
	}

	void setR(double rad) { // �����ִ� ���� ���ø� ��
		r = rad;
	}

	double getArea() {
		return r * r * Math.PI;
	}
}


class Rectangle{
	
	int width; //int ����; ����
	int height; //int ����;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return height * width;
	}
	

	
}

public class AreaTest {
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.setHeight(10); // rec�ȿ� ���� 10 ���� 10�� �簢���� ����Ǵ� �Լ��� ��
		rec.setWidth(10); //set�Լ��� �ȿ� �ִ� �ν��Ͻ� ���� ���� �ִ� ��
		System.out.println(rec.getArea());
		
		rec.setHeight(20);
		rec.setWidth(20);
		System.out.println(rec.getArea());

		
		
		
		Circle circle = new Circle();

		circle.setR(10);
		double area = circle.getArea();
		System.out.println(area);

		circle.setR(20);
		System.out.println(circle.getArea());

	}

}
