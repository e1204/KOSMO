//���� ������
public class PostfixOp {

	public static void main(String[] args) {

		
		int num=5;
		System.out.print((num++) + ""); //��� �� �� ����. (num)���� �ڿ� ++ ���� ��. �׷��� �� �������� (num)������ �ϸ� �������� ����� ������� ����.  
		System.out.print((num++) + ""); //��� �� �� ����
		System.out.print(num + "\n");
		
		System.out.print((num--) + ""); //��� �� �� ����
		System.out.print((num--) + ""); //��� �� �� ����
		System.out.print(num);
	//print�� println �ٸ�. print�� Ⱦ���� ������ println�� ���� ����. 		
		System.out.println("\n");
		
//���� �����ڿ� ���� ������ ���� //		
	//���� ������
		int num1 = 2;  //num1 = num1 +1 �� ���� ���� �� ���
		System.out.println(++num1);
		System.out.println(num1);
		System.out.println("=========");
	// ����������
		int num2 = 2; // ��� �� num = num+1 ����
		System.out.println(num2++);
		//System.out.println(num2)��� �� num2= num2+1 ���⿡�� ���� ����;
		System.out.println(num2);
		
	
	}

}
