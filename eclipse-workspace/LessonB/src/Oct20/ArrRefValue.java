package Oct20;

//������� ��Ȳ���� ���� �ؿ�ó�� ������ �˾ƾ���
public class ArrRefValue {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int sum = sumOfAry(ar); //�迭�� ���� �� ����
		
		
		//�ؿ� �Լ� ��������� ��Ծ����. �ٵ� ��� ��������? >> �̷��� ���
		int[] arr2 = makeNewIntAry(5); //new int[5];
		int[] arr3 = makeNewIntAry(6);
		
		System.out.println(arr2[0]);
				

	}
	
	//�Լ� �̸����Ͱ� sumOfAry. ���� �迭�ϴ� ���� �����ִ� ���ΰ�? �ϰ� ���� ����
	static int sumOfAry(int[] ar) { 
		int sum = 0;
		for(int i = 0; i < ar.length; i++)
			sum += ar[i]; //ar���鿡 ���� �������ְ� �վ�
		return sum;
		
	}
	
	
	//�ؿ� �Լ� ��������� ��Ծ����. �ٵ� ��� ��������?
	static int[] makeNewIntAry(int len) {
		int [] ar = new int[len];
		return ar;
		
	}
	


}
