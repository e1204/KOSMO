//���� ������
public class RelationalOp {

	public static void main(String[] args) {
		
		System.out.println("3>=2: "+(3>=2));
		System.out.println("3<=2: "+(3<=2));
		System.out.println("7.0==7: "+(7.0==7)); // ���� ���� �ų�
		System.out.println("7.0!=2: "+(7.0!=7)); // ���� �ٸ��ų�
		
		
		boolean bool=(3>=2);
		System.out.println("3>=2: "+bool);
		
		bool=true && false; 
		System.out.println(bool);
		
		bool=true && true;
		System.out.println(bool);

		
	}

}
