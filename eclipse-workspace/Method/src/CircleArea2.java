//�޼ҵ� ����
//���� ����

public class CircleArea2 {

	public static void main(String[] args) {

		double area = getCircleArea(10);

		System.out.println(area);

	}

	// ����Ÿ�� �Լ���
	public static double getCircleArea(double r) { // area�� �ƴ϶� r

		final double PI = 3.14; // ��� �������
		double area = r * r * PI;

		return area; // �̰� ����.. �̰� �ؾ� ���� �Լ��� ���� ���� ������ �ȶ�.

	}

}