package Nov01;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {

		String str = "ABCD" + "�����ٶ󸶹ٻ�";
		String str2 = new String("String"); // �迭�� ��
		System.out.println(str);
		System.out.println(str2);

		// ===============================

		Integer num = 10;
		num++; // new Integer(new.intValue()+1);
		System.out.println(num); // ���� �ڽ̰� ���� ��ڽ� ���� ����

		num += 3; // new Integer(new.intValue()+1-3)
		System.out.println(num); // ���� �ڽ̰� ���� ��ڽ� ���� ����

		int r = num + 5;
		Integer rObj = num - 5;

		System.out.println(r);
		System.out.println(rObj);

	}

}
