package Oct29;

//���� �ȳ��� ���� ;;
//7��
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();

		Calc cal = null;// ÷�� null�� ����

		switch (op) {
		case "+":
			cal = new Add();
			break;
		case "-":
			cal = new Sub();
			break;
		case "*":
			cal = new Mul();
			break;
		case "/":
			cal = new Div();
			break;

		default:
			System.out.println("�߸��� ������ �Է��Դϴ�.");
		}
		cal.setValue(a, b); // polymorphism ����. ab�� ���� �����
		System.out.println(cal.calculate());

	}
}
