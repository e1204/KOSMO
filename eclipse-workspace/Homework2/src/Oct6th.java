
public class Oct6th {

	public static void main(String[] args) {
		
		
//5��
				int num1 = 10, num2 = 20, num3 = 30;
				num1 = num2 = num3;    

				/*
		      = �����ڴ� ���� ������ �����ʿ��� �������� ����ȴ�.  ->
		      ���� ���� ������ ������ ����. 
		      num1 = (num2 = num3);        
		    */
		    
			    System.out.println(num1);	
			    System.out.println(num2);
			    System.out.println(num3);
			    
			    System.out.println("=================");
			    
			    
			    
//6��
			    int result = 3 + 6;
				System.out.println("3 + 6 = " + result);  
				result += 9;
			    System.out.println("3 + 6 + 9 = " + result);
			    result += 12;
			    System.out.println("3 + 6 + 9 + 12 = " + result);
			    
			    System.out.println("=================");
			    
			    
			    
			    
//11��	

				int num11 = 38476285;
			
				if (num11%2==0) {
					System.out.println("¦�� �Դϴ�");
				} else {
					System.out.println("Ȧ�� �Դϴ�");
				}
				System.out.println("=================");
				
				
				
				
//10��		
				/* int ���� 3�� ���� 
			      ���� �� ���� ����
			      
			      �� �� 3���� �� �� �ִ밪�� ��� 
			      90 100 60
			      
			      ���:
			      �ִ밪�� 100�Դϴ�. */
				
				int n1= 60;
				int n2 = 90;
				int n3 = 100;
			
				if ((num1 > num2) &&(num1>num3)) {
					System.out.println("�ִ밪�� "+ n1 + "�Դϴ�");
				} else if ((n2 > n1)&&(n2 >n3)) {
					System.out.println("�ִ밪�� " + n2+ "�Դϴ�");
				} else {
					System.out.println("�ִ밪�� " + n3 + "�Դϴ�");
				}
				System.out.println("=================");
				
			//���� if�� �����ϰ� �ٿ�����
				int r1 = 60;
				int r2 = 90;
				int r3 = 100;
			
				if (r1>r2) {
					System.out.println("�ִ밪�� 60�̴�");
				} else if (r2>r3) {
					System.out.println("�ִ밪�� 90�̴�");
				} else {
					System.out.println("�ִ밪�� 100�̴�");
				}
				System.out.println("================="); 
				
			//���׿����� �̿�
				int w1 = 60;
				int w2 = 90;
				int w3 = 100;
				int Max;
				
				Max = ((w3>w2)&&(w3>w1)) ? w3 : w2;
				System.out.println(Max);
				
			
				
				
					
	}
		
		

}

	