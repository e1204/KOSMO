package Nov01;

import java.security.Identity;

public class AutoBoxing {
	public static void main(String[] args) {

		Integer iObj = new Integer(10); // �ڽ�
		Double dObj = new Double(3.14); // �ڽ�

		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();

		int num1 = iObj.intValue(); // ��ڽ�
		double num2 = dObj.doubleValue(); // ��ڽ�

		iObj = new Integer(iObj.intValue() + 10);
		dObj = new Double(dObj.doubleValue() + 1.2);

		System.out.println(num1);
		System.out.println(num2);

	}

}
