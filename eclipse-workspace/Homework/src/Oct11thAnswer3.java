package classwork; // �����ﰢ��, �����������ﰢ��, ���������ﰢ��, �����������ﰢ��, �����

public class Oct11thAnswer3 {

	public static void main(String[] args) {
		
		//1��. ����⵵ blank �������ϰ� ���� ���� �����Ѵ�. �׷��� �������� 13579�� ������
		//2��. �� ���� blank�� �����Ѵ�. ���������ﰢ���� blank�� ���� �Ȱ���.

		for (int i = 1; i <= 5; i++) {
			
			for (int j = i; j <5 ; j++) {   

				System.out.print("0");
			}


			for (int j = 1; j <= i; j++) {   

				System.out.print("*");      //��������� ���������ﰢ��
			}
			


			for (int j = 1; j <i ; j++) {  //�� ���� ���� 1234�� �ٿ��� ����� �ϼ�

				System.out.print("*");
			}

			System.out.println("");

		}

	}

}

/*�����:
0000*
000***
00*****
0*******
*********

*/