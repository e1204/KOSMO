//�ݺ��� do While���� 
public class Repeat2DoWhile {

	public static void main(String[] args) {
		
		/*do while�� �ݵ�� �ȿ� ������ �ѹ��� �����Ѵ�
		 * do while�� ������ ���� �־ �׷���. 
		 * while�� ���ǿ� ���� ������ ���� ���� ����*/
		
		int num = 0;
		do {
			System.out.println("I like Java" + num);
			num++;
		} while(num<5);

		
	}
}


/*�ڵ��� ������ �� !!!!
 * while(num<5) { �̷������� while �ڿ��� ; �����ݷ��� ������ �ȵȴ�.
 * ;�� ���� ������ ���� ����. 
 * 
 * do while������while(num<5); �̷��� while ���� ; �����ݷ��� ��.
 * ������ ���̱� �����̴�. */
