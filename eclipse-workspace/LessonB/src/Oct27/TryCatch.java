package Oct27;
//Exception

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);


		   
			try {
				System.out.println("0 ������ ��");
				
				System.out.println(1/0);
				
				System.out.println("0 ������ ��");
				
			} catch(ArithmeticException ex) {
				System.out.println("ArithmeticException �����Դϴ�.");
				ex.printStackTrace();
				
			} catch(Exception e) {
				System.out.println("�����Դϴ�.");
				//e.printStackTrace();
			}
		System.out.println("Good bye");

	}

}
