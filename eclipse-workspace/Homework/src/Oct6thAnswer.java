
public class Oct6thAnswer {

	public static void main(String[] args) {
		
//���� 10�� �ؼ�. �� �� �� ū �� ã��
			int a = 60;
			int b = 90;
			int c = 100;
			
			int max; //�ִ밪 ����
		
			if (a>b) {
				if(a>c) {      //if �� �ȿ� if �ִ°� �״��� ���� ����
					max=a;
				}else {
					max = c;
				}
			}else {
				if(b>c) {
					max=b;
				}else {
					max=c;
				}
			}
			System.out.println(max);			
			System.out.println("=============");
	
		//��� 2. ���� �� ���. 
			if((a>b)&&(a>c)) {
				max = a;
			}else if((b>a)&&b>c) {
				max=b;
			}else {
				max=c;
			}
			System.out.println(max);
			System.out.println("=============");
			
		//��� 3. �� �� �ٿ�����. ������ ���.
			max = a; //a�� max������ �����س��� b�� ��
			if(b>max) {
				max=b;
			}
			if (c>max) {
				max = c;
			}
			System.out.println(max);
			System.out.println("=============");
			
		//���׿����� �̿�
			//a�� b�� �ϴ� �񱳸� ��. a�� �� ũ�� ��
			max = (a>b) ? (a>c?a:c) : (b>c? b:c); 
			System.out.println(max);
			
			System.out.println("=============");

	}

}
