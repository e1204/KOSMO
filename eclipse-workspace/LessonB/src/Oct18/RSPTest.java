package Oct18;
//�𸣰����� �׳� �ϱ��Ͻÿ�.

import java.util.Scanner;

class Player {   //�� ȭ�鿡 public class�� �� ���� ���� ����.
	// 1�� ����, 2�� ����, 3�� ��
	private int rsp;
	// private String rsp;�� ���ڷ� ��Ƶ� ��.

	// �����ڸ� �����.
	public Player(String rsp) {
		// rsp == "����" �ڹ� ������ �̰� �ȵ�. ���� �Ǽ� �ϴ� ��.
		if (rsp.equals("����"))
			this.rsp = 1;
		else if (rsp.equals("����"))
			this.rsp = 2;
		else
			this.rsp = 3;

	}

	public Player() {
		this.rsp = (int) (Math.random() * 3 + 1); // �����Լ�(����), *3 +1 means 1���� 3����
	}
	
	private String getRSPString(int rsp) {
		String str = "";

		if (rsp == 1)
			str = "����";
		else if (rsp == 2)
			str = "����";
		else
			str = "��";

		return str;
	}

	public void result(Player player) {
		
		System.out.println("����:" +  getRSPString(this.rsp) + " �����:" + getRSPString(player.rsp));

		if (this.rsp == player.rsp) {
			System.out.println("�����ϴ�.");
			return;
		}

		// 1.���� 2.���� 3.��
		if (this.rsp == 1 && player.rsp == 2) {
			System.out.println("���� �����ϴ�.");
		} else if (this.rsp == 1 && player.rsp == 3) {
			System.out.println("���� �̰���ϴ�.");
		} else if (this.rsp == 2 && player.rsp == 1) {
			System.out.println("���� �̰���ϴ�.");
		} else if (this.rsp == 2 && player.rsp == 3) {
			System.out.println("���� �����ϴ�.");
		} else if (this.rsp == 3 && player.rsp == 1) {
			System.out.println("���� �����ϴ�.");
		} else if (this.rsp == 3 && player.rsp == 2) {
			System.out.println("���� �̰���ϴ�");
		}

	}



}

public class RSPTest {
	public static void main(String[] args) {
		
		while (true) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� ���� �Է��ϼ���.");
		String rsp = sc.next();

		// �÷��̾� you�� �����ڷ� �޴´�. �����ڷ� �޾ƾ� ������������ ��¼�� �� �� �ִ�.
		// ��ǻ�ʹ� ���� �Է� �� �ʿ䰡 ����.
		Player you = new Player(rsp);
		Player com = new Player();

		com.result(you);
		
		//Ż������
		System.out.println("�Լ� Y ::�ߴ� N");
		char ch = sc.next().charAt(0); //���ڿ��� �޴µ� ù������
		
		if(ch == 'N' || ch =='n')
			break;
	
		}
		System.out.println("���� ���� �Դϴ�.");

	}
		
		

}
