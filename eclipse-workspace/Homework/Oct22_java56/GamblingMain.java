package Oct22_java56;
/*�� ����� ������ �����Ѵ�. 
�̵��� �̸��� Ű����� �Է� ������ 
�� ����� Person Ŭ������ �ۼ��϶�. 
�׷��Ƿ� ���α׷����� 2���� Person ��ü�� �����Ǿ�� �Ѵ�.

 �� ����� ������ ���鼭 ������ �����ϴµ� 
�� ����� �ڱ� ���ʿ��� <Enter> Ű�� �Է��ϸ�, 
3���� ������ �߻��ǰ� �� ���ڰ� ��� ������ ���ڰ� �ǰ� 
������ ������.
 ������ ������ �ʹ� ũ�� ������ 3���� ���ڰ� 
��ġ�ϰ� ���� ���ɼ��� ���� ������ ������ ������ 
1~3������ �Ѵ�.*/
import java.util.Scanner;

//��Ű�� �ٸ��� ��� import Oct22_Sub.GamblePerson;

public class GamblingMain {
	public static void main(String[] args) {
		
		//while(true) { �̰� �ؿ��� �� �Ф� 
			
		//Person[] person = new Person[3]; << ���� �Ф� ȸ���� �ϰ��̾��µ� �Ф� 
		
		Scanner sc = new Scanner(System.in);
		
		
	
		
		/*���� �۷��̵� �Ф�
		 for (int i = 0; i<person.length; i++);
	
		System.out.println("�̸�(����/����)�� �Է��ϼ���.");
		int ���� = sc.nextInt();
		int ���� = sc.nextInt();
		
		person[i] = new Person(����, ����);*/
		
		
		
		
		System.out.println("1���� ���� ���(����/����)>>");
		String name = sc.next();
		//ù��° ����� ��ü����
		GamblePerson p1 = new GamblePerson(name);
		
		
		System.out.println("2���� ���� ����(����/����)>>");
		name = sc.next();
		//name�� �̿��ؼ� �� �����
		GamblePerson p2 = new GamblePerson(name);
		
		
		//����Ű�� ���� �ִ� ���� �� ���� ���� ��? sc.nextLine���� �� �� �����
		String buffer = sc.nextLine();
		
		
		while(true) {
			System.out.print("[" + p1.getName() + "]:"); 
			//name�� ���� ���ͼ��� ���鷯 ����~ public�̴ϱ� ��� ����
			
			//enter�� �޾ƾ���. �� �ٿ� �ִ� buffer�� �� �޾ƾ� ��.
			//�̷��� next�� �� ����. ���ڸ� �޾Ƴ��°� �ƴ϶�.
			//���� �޾Ƴ��� ���� �ڵ尡 sc.nextLine();
			buffer = sc.nextLine();
			
			if(p1.game()) {
				System.out.println("[" + p1.getName() + "]:" + "���� �̰���ϴ�."); 
				break; //�̰����� ��ü�� ��������. ���� ��������
			}
			System.out.println("�ƽ�����"); //���� p2�� Ȯ���ϸ� while�� ��������~ 
			
			System.out.print("[" + p2.getName() + "]:"); 
			buffer = sc.nextLine();
			
			if(p2.game()) {
				System.out.println("[" + p2.getName() + "]:" + "���� �̰���ϴ�."); 
				break;
			}
			System.out.println("�ƽ�����");  
			

		}
	}

}
