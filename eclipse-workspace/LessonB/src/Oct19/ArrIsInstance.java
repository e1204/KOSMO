package Oct19;



public class ArrIsInstance {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		 //5�� ���������� return���ִ� �ְ� arr.length�� 5���� �־ �� �ڸ��� arr.length �־���
		for(int i =0; i< arr.length; i++) {   
			arr[i] = i;			
		}
		
		for(int i =0; i<5; i++) {
			System.out.println(arr[i]);			
		}

		
		
	}
}
