package Nov01;

class Wrapper {
	public static void showData(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		int num = 10;
		Integer intObj = new Integer(num); // toString�� �Լ��������̵� �Ǿ Integer���� 3�� �Ѹ�
		showData(intObj);

		double dou = 10;
		dou = intObj.doubleValue();

		short sh = (short) num;
		sh = intObj.shortValue();

		// �Ǽ� 7.15�� ä���� ���� �ν��Ͻ� ����
		showData(new Double(7.15));

	}

}
