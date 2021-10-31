package Oct29;
//Clone�� ����ؼ� ��ü������


class Point implements Cloneable { // ���� ��������� ���� jvm���� �˷��ִ� ��
	private int xPos; // x��ǥ
	private int yPos; // y��ǥ

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Object Ŭ������ clone �޼ҵ� ȣ��
	}

}

 class InstanceCloning {
	public static void main(String[] args) {
		// ���� ���� ���� ��ü����

		Point org = new Point(3, 5); // ���²� ��ü�����Ϸ��� new�� ��
		Point cpy; // ��ü������ �ϴ� �� �ٸ� ���. �� Clone�ϴ� ���. �޸𸮿� �ö�

		try {
			cpy = (Point) org.clone(); // Clone�ؼ� cpy�� ���� �־�
			org.showPosition();
			cpy.showPosition();  //cpy���� ��ü ���� �Ǿ��ٴ� ��

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
