package Nov02;
//ArrayClass 7
//�˻�
import java.util.Arrays;

public class ArrayBinarySearch {
	public static void main(String[] args) {
		int[] ar = { 33, 55, 11, 44, 22 };
		Arrays.sort(ar); //Ž�� ������ ������ ����Ǿ�� �Ѵ�.

		for (int n : ar)
			System.out.print(n + "\t");
		System.out.println();

		int idx = Arrays.binarySearch(ar, 33); //�迭 ar���� 33�� ã�ƶ�.
		System.out.println("Indext of 33: " + idx);

	}

}
//sort�� binary �� �� �ϳ��� �������� ������ ��°��� ����.