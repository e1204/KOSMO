package Oct22_java56;
/*6��.
 �� ����� ������ �����Ѵ�. 
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

/*7��
 ���� 6�� ���� ������ n���� �ϵ��� �����϶�.
���� ���ÿ� ���� ���ӿ� �����ϴ� ������ ���� �Է� �ް� �� ������ �̸��� 
�Է� �޵��� �����϶�.

�׺� ���ӿ� ������ ���� ����>>3
1��° ���� �̸�>>Ȳ
2��° ���� �̸�>>��
3��° ���� �̸�>>��*/
public class GamblePerson {
	
	
	//������ ��� �ݵ�� ���ϰ�
	//������ ��� ��Ʈ�� �� �Լ� ����
	//pesron�� new �� �� 
	private String name;
	private int num1, num2, num3; //���� ���� 3���� ����
	//private int ����, ����;
	
	
	
	
	public GamblePerson (String name){
		this.name = name;
	} 
	
	/*public Person(int ����, int ����) {
		this.���� = ����;
		this.���� = ����;
	}*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//�������� ���� �ְ� num123 ���ؼ� ������ �� ������ �����ϴ� �Լ� �����
	public boolean game() {
		
		//��ü�� int�� ����ȯ
		//���� 3�� +1
		num1 =(int)(Math.random()*3+1); 
		num2 =(int)(Math.random()*3+1); 
		num3 =(int)(Math.random()*3+1); 
		
		System.out.print("\t" +num1 +" " + num2 +" " + num3 );
		//3�� ������ ǥ���� ��. ��. �� �Ʒ��� ����
		//(num1 == num2 == num3) �̷��� �ȵ� ���������� ������ ������
		if(num1 == num2 && num2 == num3) {
			return true;
		}
		return false;
		
	}

/* ���� �������� .. ������� ���� �ڵ�... �׸��� ����� �鸲 ������ 
	public String toString() {
		String str ; 
	 	if (���� == ����) {
			str = "�̰���ϴ�.";
		}else if (���� != ����) {
			str = "��";
		}else if (���� == ����) {
			str = "�̰���ϴ�.";
		}else{
			str= "��";
		};
		
		return str;*/
		

				
		
	
	
}
