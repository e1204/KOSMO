package Oct19;

public class BuildString {

	public static void main(String[] args) {
		//���ڿ� "123"�� ����� �ν��Ͻ��� ����
		StringBuilder stbuf = new StringBuilder("123");
		
		//���ڿ� �����̱�
		stbuf.append(45678);
		System.out.println(stbuf.toString());
		//12345678
		
		//���ڿ� �Ϻ� ����
		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());
		//345678
		
		//���ڿ� �Ϻ� ��ü
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		//AB678
		
		//���ڿ� ���� ������
		stbuf.reverse();
		System.out.println(stbuf.toString());
		//876BA
		
		//�Ϻθ� ���ڿ��� ��ȯ
		String sub = stbuf.substring(2, 4);	
		System.out.println(sub);
		//6B
	
		

	}

}
