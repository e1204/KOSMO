package Oct18;

public class StringClass {
	//�Լ� ���� �ε� = �츮�� ���� ���� ��ǥ���� �Լ� println�Լ�
	public static void main(String[] args) {
		String str1 = new String ("Simple String");
		String str2 = "The Best String";
		
		//println �޼ҵ尡 �پ��� ���ڸ� ���޹��� �� �ִ� ������ �޼ҵ� �����ε�
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(13);  //'�� ��'
		System.out.println(3.14);
		System.out.println('A');
		System.out.println();
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		
		showString("Funny String");

	}
	
	public static void showString(String str) {
		
		System.out.println(str);
		System.out.println(str.length());
		
	}

	
}
