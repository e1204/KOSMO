//quiz

public class GradeMain{

	public static void main(String[] args) {
		/* 
		 ����:50, ����:70, ����:95
		 ������ ����� ���Ͻÿ�. ��, ����� �Ҽ������� �������� �Ͻÿ�.
		 */
		
		int kor, eng, math; //������ ���� ! 
		kor = 50; 
		eng = 70;
		math = 95;
		
		int total = kor + eng + math;
		System.out.println("����: " + total);
		
		 double avg = (double) total / 3; //��ȣ ������ ���� ������
		 // double avg = total / 3.0; �̷��� �ص� �� ����
		 System.out.println("���: " + avg);
		
		
		
		
		

	}

}
