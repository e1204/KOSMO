package Oct20;
//7��

/*
 ���α׷��� �ϼ� �Ͻÿ�.

- 5���� ���ڸ� ���� ���� �޾� �迭�� ����
- 5���� ���� �� ���� ū ���� ���
 */

public class MaxNumArr {
	public static void main(String[] args) {

		// enhanced for
		int[] num = new int[5];
		int max = num[0]; //�̰� �ٽ�

		for (int e : num) {
			e = (int) (Math.random() * 100 + 1);
			System.out.print(e + " ");

			if (e > max) {
				max = e;
				
			}
			
		}
		System.out.println();
		System.out.println("�ִ밪��: " + max);

	}
}
