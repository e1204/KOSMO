package Oct21;
//���� 5��
public class ColorPointMain {
	public static void main(String[] args) {
		
		ColorPointSuper cp = new ColorPointSuper(5, 5, "YELLOW");
		
		cp.setXY(10, 20);
		cp.setColor("RED");
		
		String str = cp.toString();
		
		System.out.println(str + "�Դϴ�. ");

	}

}


/*
=======================
RED���� (10,20)�� ���Դϴ�.
*/