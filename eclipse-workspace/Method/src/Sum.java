//�޼ҵ� ����
//���������� ��

public class Sum {

	public static void main(String[] args) {

		int sum = getHap(1, 100);

		System.out.println(sum);

	}

	public static int getHap(int i, int j) { // getHap�� geHap���� ��Ÿ���� �������� �Ф�
		// (int start, int end)�������� �̷��� �������� ��

		int sum = 0;
		for (i = 1; i <= j; i++) { // for (int i = start; i <= end; i++)
			sum = sum + i; // <-�̰��� �ٽ�. �ϱ��Ͻÿ� ^��^
		}

		return sum; // return�� result��� �Ἥ �ڲ� �������� ��

	}

}
