package Oct20;
//9��

/*
 ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� 
�迭�� �����϶�. 
�׸��� �迭�� �� ���ڵ�� ����� ����϶�.

������ ������ : 3 6 3 6 1 3 8 9 6 9
����� 5.4
 */

class ArrAvg{
	private int[] arr = new int [10];
	
	//������ �����
	public ArrAvg() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); 
		}
	}
	
	public void resultPrint() {
		double avg = 0;
		double sum = 0;
		
		for(int i : arr) {
			//������ ������ : 3 6 3 6 1 3 8 9 6 9
			sum = sum + i;
			System.out.print(i + " ");
			
		}
		System.out.println();
		avg = sum / arr.length;
		System.out.println("���: " + avg);
	}
	
	
}


public class NumArr {
	public static void main(String[] args) {
		ArrAvg arrAvg = new ArrAvg();
		arrAvg.resultPrint();
		
		
	}
}




/* ���� �������� �� ���... �������� Ŭ���� ������ ��ȣ��. ��� �����̰ڴ��϶�.
public class NumArr {
	public static void main(String[] args) {

		int[] num = new int[10];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);

			sum = sum + num[i];

		}

		double avg = (double)sum / num.length; //sum�� ����ȯ ��

		System.out.print("���� ���� : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("���: " + avg);

	}
}*/
