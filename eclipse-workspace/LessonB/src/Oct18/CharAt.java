package Oct18;
import java.util.Scanner;

//ABCD �Է� �ϰ� �Ǹ�
//DCBA ���
public class CharAt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		String word = sc.next();

		
		for(int i = word.length() -1; i>=0; i--  ) {
			System.out.print(word.charAt(i));
			
			
		}
		//������ �װ��� �װ� �� ������ �ε����� �ٸ�.
		
		

	}

}
