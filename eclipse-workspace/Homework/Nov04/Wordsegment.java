package Nov04;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Wordsegment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");

		while (true) {
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
				//sc.nextLine(); ���۷� ����ְ� 
			
			}
		}

		
	}
}
