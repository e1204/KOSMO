package Oct26;
//��������
//16��
class Friend {

	private String name, phone;

	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ: " + phone);

	}

}

class UniFriend extends Friend {
	private String major;

	public UniFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("����: " + major);
	}

}

class ComFriend extends Friend {
	private String department;

	public ComFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�μ�: " + department);
	}

}

public class SocialBookPM {
	public static void main(String[] args) {
		int cnt = 0;

		Friend[] frns = new Friend[10];
		

		// ��� ��â �� ������ ���� ��ü ���
		frns[cnt++] = new UniFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UniFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new ComFriend("YOON", "R&D", "02-123-999");
		frns[cnt++] = new ComFriend("PARK", "Sales", "02-321-777");

		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
			System.out.println();
		}

	}

}
