
public class SCE {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result; //boolean result = false;
		
		result = false && true;
		
		result = ((num1 += 10) < 0  && (num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = " +num2 + '\n');
		
		result = true && true;
		result = ((num1 +=10) >0 || (num2 += 10)>0);
		System.out.println("result = " + result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
//or���� ���� ��� �ϳ��� true�� true�� �����. �׷��� �տ� �����Ͱ� �̹� true�� �ڿ� ������ ��� ���ع��� ����
		
		
	}

}
