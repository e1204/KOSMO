package Oct19;

public class ArrayIsInstance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���̰� 5�� int�� 1���� �迭�� ����
		int[] ar1 = new int[5];
		
		//���̰� 7�� double�� 1���� �迭�� ����
		double[] ar2 = new double[7];
		
		//�迭�� ���������� �ν��Ͻ� ���� �и�
		float[] ar3;
		ar3 = new float [9];
		

		//�迭�� �ν��Ͻ� ���� ����
		System.out.println("�迭ar1 ����: " + ar1.length);  // <<�迭�� �Լ��� �ƴ�!! ���� �� �״��!!!
		System.out.println("�迭ar2 ����: " + ar2.length);
		System.out.println("�迭ar3 ����: " + ar3.length);
		
		/* cf
		String str = "1234"
		System.out.println("�迭ar1 ����: " + str.length()); // << ��� �Լ��� ~! 
		*/
		
		/*Ŭ������ �迭�� ���� �� �ִ�.
		class Box{ }
		Box[] ar = new Box[5];
		 */
		
		
		

	}

}
