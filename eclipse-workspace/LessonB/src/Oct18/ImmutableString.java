package Oct18;

public class ImmutableString {
	public static void main(String[] args) {
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		// == ���������� ���� �� ��
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		// == ���������� ���� �� ��
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");
		
		//������ �ּҰ� �޶� �ٸ��ٰ� ��
		if(str1 == str3)
			System.out.println("str1�� str3�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str3�� �ٸ� �ν��Ͻ� ����");
		
		if(str1.equals(str4))
			System.out.println("���� ���� �Դϴ�.");
		else
			System.out.println("�ٸ� ���� �Դϴ�.");
		
		
		
		
		String str5 = "simple String";
		String str6 = "Simple String";	
		//��ҹ��ڵ� �ٸ���
		if(str5 == str6)
			System.out.println("str5�� str6�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str5�� str6�� �ٸ� �ν��Ͻ� ����");
	
		
		
		String str7 = str1 + str2 ;  //���ڿ����� ���ϱ�
		System.out.println(str1);
		System.out.println(str7 == str1);
		
		System.out.println(str2);
		System.out.println(str7 == str2);
		
		

		
	}

	
}
