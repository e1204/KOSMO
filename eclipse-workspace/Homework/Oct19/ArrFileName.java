package Oct19;

import java.util.Scanner;

/*
 �Ʒ��� ���α׷��� �Ͻÿ�.
"Hello.java" ���ڿ����� ���ϸ�� Ȯ������ java�� �и���Ű�� ���α׷��� ¥�ÿ�.

�Է�: Hello.java
���: �����̸���: Hello �̸� Ȯ���ڴ� java �Դϴ�.

�Է�: Java.avi
���: ���� �̸���: Java �̸� Ȯ���ڴ� avi �Դϴ�.
 */

public class ArrFileName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("OOO.java�� �Է��ϼ���." + "\n" + "(OOO���� ��� �ܾ �����մϴ�.)");
		String word = sc.next();
		
		
		//Hello.java ��ο� �̾Ƴ��� �ڹ� �̾Ƴ��� 
		//substring(0, 5);
		//substing(�� +1, word.length());
		
		int dot = 0; //�� ��ġ ����
		for(int i = 0; i< word.length(); i++) {
			if(word.charAt(i) == '.') {  //charAt�� ���ڸ� ����. ���ڿ��� �ƴϰ� �����ε�?
				dot = i;
			}
		}
		
		int index = word.indexOf('.');
		System.out.println(index);
		System.out.println(dot);
		
		//String fileName = word.substring(0, index);
		//String extention = word.substring(index+1, word.length());
		
		String fileName = word.substring(0, dot);
		String extention = word.substring(dot+1, word.length());
		
		System.out.println(fileName);
		System.out.println(extention);
		

	}

}





