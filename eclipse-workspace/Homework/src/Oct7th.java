
public class Oct7th {

	public static void main(String[] args) {
			
/* 1��.  switch ������ �Ʒ��� ���α׷����� ¥�ÿ�.
1234 �� ���Դϴ�. ��� 5678 �� �����Դϴ�.��� 9 10 11 12 �� �ܿ� �Դϴ�. ���*/
				int n = 101;
				switch (n) {
				case 1:case 2:case 3:case 4:
					System.out.println("���Դϴ�."+ '\n');
					break;
					
				case 5:case 6:case 7:case 8:
					System.out.println("�����Դϴ�."+ '\n');
					break;
					
				case 9:case 10:case 11:case 12:
					System.out.println("�ܿ��Դϴ�."+ '\n');
					break;
				
				default:
					System.out.println("ã�� �� �����ϴ�."+ '\n');
					break;
				}
				
	
		
/* 2��. int num = -10 �� �Ҵ� �� �ش� ������ ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���밪�� ��� �Դϴ�.*/
				
				int num = -10;
				if(num<0) {
					num=-num;
				}
				System.out.println("-10�� ���밪: " +num);
				
			// ���밪 ���� �̿�		
				int num2 = -10;
				int result = Math.abs(num2);
				System.out.println(result);
	
				System.out.println('\n');
				
			/*	�Ϻ��� ���� ����.. ���� �ȳ��� 
			 * int num = -10;				
				for (num = -10 ; num <100 ; num++) {
					num = 10;
				
				} System.out.println(num+ '\n');
				*/
				
				
				

/* 5. ������ 6���� ��� �ϴ� ���α׷��� ¥�ÿ�.*/
				int i ;
				int dan = 6; 
					for( i =1 ; i <10 ; i++ ) {
						System.out.println(dan + " * " + i + " = " + i*dan);
					}
		
		System.out.println('\n');
				
				
/*6. 1���� 10000 ������ ���� ���ϴ� ���α׷��� ¥�ÿ�.*/
				int j;
				int sum =0;
					for (j=1 ; j <= 10000 ; j++) {
						sum = j + sum;
					}System.out.println("1���� 10000������ ��: " + sum+ '\n');
				
							
				
/* 7��. 1���� 10000 ������ ���� �� Ȧ�� �� ���� ���ϴ� ���α׷��� ¥�ÿ�.*/
			
				int sum2 = 0;
				for (int k = 1; k <= 10000; k++) {
					if (k % 2 == 1) {
						sum2=sum2+k;
					}
				}
				System.out.println("1���� 10000������ ��: " + sum2 + '\n');

		/*���� ����
		 * if(k%2==0)�� �ƴ϶� if(k%2==1)��� �߾�� ��. 
		 * if �߰�ȣ �ۿ� �ִ°� �߰�ȣ �ȿ� ���� ��.
				int k;
				int sum2 = 0;
					for(k=1 ; k <=10000; k++) {
						if(k%2==0) {
							k=0;
						}
						sum2= k +sum2;
						
					} System.out.println("1���� 10000������ ��: " + sum2 + '\n');
				*/
							
					
							
/* 9��. 1�� 100 ������ ���� �� 5�� ������� 7�� ����� ù���� ����(���α׷��� �Ͻÿ�)*/
					int m;
					
					for(m=1; m<100; m++) {
						if( (m%5==0) && (m%7==0) ) {
							break;
						}
					} System.out.println("5�� ������� 7�� ����� ù���� ��: " + m+ '\n');
				
							
						/*���� ����
						 * continue�� break��ġ, continue�����ϱ� �� 1����  
						    int m;
							for(m=1; m<100; m++) {
								if( (m%5==0) && (m%7==0) ) {
									continue;             
								}break;
							} System.out.println(m); */
							
														
														
							
/* 10��. 1�� 10000 ������ ���� �� 5�� ������� 7�� ����� ù���� ����(���α׷��� �Ͻÿ�) count ���*/
					
					int p;
					int count = 0;
					for (p = 1; p < 10000; p++) {
						if ((p % 5 == 0) && (p % 7 == 0)) {
							break;
						}
						count++;
					}
					System.out.println("5�� ������� 7�� ����� ù���� ��: " + p+ '\n');

				/* ���� ���� 
				 * ù��° ���� �ƴ϶� �� ���� ���ϰ� ������ Ʋ�� count ���� ������ �ϰ� ���� ���� ����. count++��ġ Ʋ�� 
				 * int = p; 
				 * int = count; 
				 * 	for(p=1; p<10000; p++) { 
				 * 		if((p%5!=0)||(p%7!=0)) { 
				 * 			continue; 
				 * 		} 
				 * 	} count++; //�ڲ� ���� ��
				 * System.out.println(count); */
				
				/* ���� ���ϴ� ���� ��� 
				 * int p; 
				 * int count=0; 
				 * 	for(p=1; p<10000; p++) {
				 * 		if((p%5!=0)||(p%7!=0)) { 
				 * 			continue; 
				 * 		} count++; 
				 * 	}
				 * System.out.println(count); */
		
		

	}

}
