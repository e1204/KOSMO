package Oct22_java56;
/*���� 5�� ���� ������ n���� �ϵ��� �����϶�.
���� ���ÿ� ���� ���ӿ� �����ϴ� ������ ���� �Է� �ް� �� ������ �̸��� 
�Է� �޵��� �����϶�.

�׺� ���ӿ� ������ ���� ����>>3  �迭�� 3�� 
1��° ���� �̸�>>Ȳ
2��° ���� �̸�>>��
3��° ���� �̸�>>��*/
import java.util.Scanner;

//��Ű�� �ٸ��� ��� import Oct22_Sub.GamblePerson;


public class GamblingMainMany {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�÷��̾� �� �Է�");
		int num = sc.nextInt(); //�̰� ���� ����
			
		//�׺� ���ӿ� ������ ���� ����>>3  �迭�� 3�� 
		GamblePerson[] user = new GamblePerson[num]; 
		//�迭�ϸ� �ݵ�� 120���� for�� ��.
		for(int i =0; i < user.length; i++) {
			System.out.println( (i+1) + "���� �÷��̾�>>"); //i�� 0���� �Ѿ���ϱ� i+1
			String name = sc.next(); //name �ް�
			user[i] = new GamblePerson(name); //i���� 0�������ٰ� ���� �ְ� 
			
		}
		
		String buffer = sc.nextLine(); // ���� �־ �� ����
		
		
		while(true) {
			for(int i = 0; i < user.length; i++) {
				
			System.out.print("[" + user[i].getName() + "]:"); 
			
			//���� �޾� ���� ���� �Է� 
			buffer = sc.nextLine();
			
			if(user[i].game()) {
				System.out.println("[" + user[i].getName() + "]:" + "���� �̰���ϴ�."); 
				 
				//break;�ϸ� for������ ���������� �ٽ� ���ư�. �׷��鼭 while �� ���鼭 �ٽ� for�� ��. 
				//�׷��� return�ؼ� ���� ����. return�� main�� ���� return
				return; 
			}
			System.out.println("�ƽ�����"); 
	
			}
		}
	}

}
