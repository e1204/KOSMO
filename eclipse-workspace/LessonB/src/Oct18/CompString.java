package Oct18;

public class CompString {

	public static void main(String[] args) {
		
		String st1 = "Lexicographically"; //lexicographically �� ������ ���ϴ� �ܾ�
		String st2 = "lexicographically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		
		cmp = st1.compareTo(st2);
		if(cmp == 0)
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		else if (cmp <0) //������ ���ڽ��� ��뺸�� ��. ���� 1�� 3�� > 1����� 3���� ���̳ʽ� 2�� ���� �׷��� ����
			System.out.println("������ �տ� ��ġ�ϴ� ����: " + st1);
		else
			System.out.println("������ �տ� ��ġ�ϴ� ����: " + st2);
		
		
		//���̽��� �����ض�. ���⼭�� ��ҹ��ڴϱ� ��ҹ��� ����
		if(st1.compareToIgnoreCase(st2) == 0)
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		

	}

}
