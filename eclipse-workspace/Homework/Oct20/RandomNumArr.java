package Oct20;
//6��

/*
 ���α׷��� �ϼ� �Ͻÿ�.
���� ���� 100���� ���� �����Ͽ�, �迭�� �����ϰ�, 
�迭�� �ִ� ���� �߿��� 3�� ����� ����� ����. 
 */

public class RandomNumArr {
	public static void main(String[] args) {

		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10000 + 1);
			if (i % 3 == 0) {
				System.out.println(num[i]);

			}

		}

	}
}
