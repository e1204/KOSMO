package Nov02;
//ArrayClass 1
import java.util.Arrays;

public class ArrayCopyOf {
	public static void main(String[] args) {
		double[] arOrg = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		// �迭 ��ü�� ����
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);

		// ����° ��ұ����� ����
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		
		// Arrays toString�ȿ� �迭�� ��������� �Ѳ����� ���� ���� ���� ���
		System.out.println(Arrays.toString(arOrg)); 
		System.out.println(Arrays.toString(arCpy1)); 
		System.out.println(Arrays.toString(arCpy2)); 
		
		
		/*
		for (double d : arCpy1)
			System.out.print(d + "\t");
		System.out.println();

		for (double d : arCpy2)
			System.out.print(d + "\t");
		System.out.println();*/

	}

}
