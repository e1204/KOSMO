package classwork; // �����ﰢ��, �����������ﰢ��, ���������ﰢ��, �����������ﰢ��, �����

public class Oct11thAnswer2 {

	public static void main(String[] args) {

		//1. �ٱ��� for���� �ܼ� �� ��°Ŵ�(�׳� 5�� ������ �ټ� �� �ุ ǥ���� ��)
		//2. ���� for���� ���� ���� (��������� �ſ� �翬...
		//3. blank(�����̽�"" Ȥ�� "0")�� �������� �ʰ�, ���� �� ���� ��ŭ ��´�. 
		//4. �� ���� �����̽��� ������ �����̽��� ����Ͽ� for���� ÷���Ѵ�.

		for (int i = 1; i <= 5; i++) {
			
			for (int j = i; j < 5; j++) {

				System.out.print("0");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println("");

		}

	}

}


/*�����:
	0000*
	000**
	00***
	0****
	*****
	
	*/
