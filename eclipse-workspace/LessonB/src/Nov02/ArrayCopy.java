package Nov02;
//ArrayClass 2
import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		double[] org = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double[] cpy = new double[3];
		
		//�迭 org�� �ε��� 1���� �迭 cpy �ε��� 0���� 
		System.arraycopy(org, 1, cpy, 0, 3);


	
		for (double d : cpy)
			System.out.print(d + "\t");
		System.out.println();


	}

}
