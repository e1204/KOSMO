package Oct26;
//��������
//16��
class UnivFriend {
	private String name, major, phone;

	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;

	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);
	}

}

class CompFriend {
	private String name, department, phone;

	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;

	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("�μ�: " + department);
		System.out.println("��ȭ: " + phone);
	}

}

public class SocialBook {
	public static void main(String[] args) {
		// ���� ��â ������ ���� �迭�� ����
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;

		// ���� ���� ������ ���� �迭�� ����
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0;

		// ���� ��â�� ���� ����
		ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

		// ���� ������ ���� ����
		// 0��° ��
		cfrns[ccnt++] = new CompFriend("YOON", "R&D", "02-123-999");
		// 1��° ��, ���������̶� ccnt�� ��ü���� �� �迭�� ���� ���� �� ����
		cfrns[ccnt++] = new CompFriend("PARK", "Sales", "02-321-777");

		// ��� ��â �� ������ ���� ��ü ���
		// 0���� 1��° ���̶� ucnt�� 2�� ��Ȳ
		for (int i = 0; i < ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
		}

		for (int i = 0; i < ccnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}

	}

}
