package Nov04;

import java.util.Scanner;
import java.util.StringTokenizer;

class TokensCount {
	public void run() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���.");

			try {
				String words = sc.nextLine();
				// �ѱ��� ��ü�� �������� nextLine

				if (words.equals("�׸�")) {
					System.out.println("�����մϴ�.");
					break;
				}
				// words�� ������ StringTokenizer ���
				StringTokenizer tokens = new StringTokenizer(words, " ");

				System.out.println("���� ��: " + tokens.countTokens());

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�߸��� �Է��̴� �ٽ� �Է��ϼ���.");
				continue;
				// sc.nextLine(); ���۷� ����ְ�

			}
		}

	}
}

public class Wordsegment2 {
	public static void main(String[] args) {

		TokensCount tc = new TokensCount();
		tc.run();

	}
}
