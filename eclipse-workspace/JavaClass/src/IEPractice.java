
public class IEPractice {

	public static void main(String[] args) {


	/*1��. ���� 50 ���� 60 ���� 90
	 * ���� ���
	 * ��� 90�̻��̸� ��
	 * ����� 80 ~90 80�̻� 90�̸��̸� ��
	 * ����� 70~80 70�̻� 80�̸��̸� ��
	 * 70�� �̸� ��*/
		
		int kor=50, eng=60, math=90;
		int total = kor + eng + math;
		double avg = ((double)total/3);
		System.out.println(avg);
		
		if(avg>=90) {
			System.out.println("��");
		}
		else if(avg >= 80) {   //else if ���鼭 (70<avg<80)�̷������� ��ȣ �� �� ���ϱ� ������
			System.out.println("��");
		}
		else if(avg >= 70) {
			System.out.println("��");
		}
		else{
			System.out.println("��");  //else�� ��ȣ ����
		}
		System.out.println("==========");
	/*if else�� ���������� if�� �ȿ� else�� if�� ��� ǰ�� �� �ִ�.*/
		int num=10;
		if(num<0) {
			System.out.println("0���� �۴�");
		}else {
			if(num<100) {
				System.out.println("100���� �۴�");
			}else {
				System.out.println("100���� ũ��");
			}
		}
		System.out.println("==========");
		/*���� ���� ����(?)�ϰ� ���� �� */
		int num2=10;
		if(num2<0) {
			System.out.println("0���� �۴�");
		}else if(num2<100) {
				System.out.println("100���� �۴�");
			}else {
				System.out.println("100���� ũ��");
			}
		}
		
		
	}

