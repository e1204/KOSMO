package Oct19;

import java.util.Arrays;

/*
�� �ζ� ��ȣ ���ϱ� ��
1. int ��� 6�� �迭 ����
2. ������ �迭�� �������� 1 ~ 45 (�����Լ� ���)
3. �ߺ� ���� (���� �߿� ����) �ؼ� 6�� ���
*/




public class Lottery {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		System.out.println("���� ��ȣ�� �˷� �帳�ϴ�.");
		
	
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45+1);	
			
			for(int j = 0; j < i; j++) { 
                if (lotto[i] == lotto[j]) {
                    i--;	   
                    break;     
                }
               
			}			
			
		}
		System.out.println(Arrays.toString(lotto));
		// System.out.println(lotto); << �̷��� ���� ������ ���� �������� ���� 
		 
		 
		//for (int i = 0; i < lotto.length; i++) {
			//System.out.println(lotto[i]);  <<���̶� ���ǿ��� �Ѱ� �̰�
		//}

		
		
	}
}
