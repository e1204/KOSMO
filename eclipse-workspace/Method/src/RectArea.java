//�޼ҵ� ����
//���簢�� ����

public class RectArea {

	public static void main(String[] args) {

		double width = 100;
		double height = 100;

		double area = getRectArea(width, height);

		System.out.println(area);

	}

	public static double getRectArea(double w, double h) { // ���������� ����� �ص� ��. Ÿ���� double�� �ݵ�� ���������

		return w * h;

	}

}