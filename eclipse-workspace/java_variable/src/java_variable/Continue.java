//continue
//����� ã��
public class Continue {

	public static void main(String[] args) {
		
	//While ���
			int num = 0;
			int count = 0;
	
			while ((num++) < 100) {
				if (((num % 5) != 0) || ((num % 7) != 0))
					continue;
				count++;
				System.out.println(num);
			}
			System.out.println("count: " + count);
			
			System.out.println("======================");
			
	//For ���
			
		// ((i%2)!=0) || ((i%3)!=0)
			int i;
			int count2 = 0;
			// i=6
			for (i = 1; i <= 1000; i++) {
				// 0 !== 0!=0
				if ((i % 2 != 0) || (i % 3 != 0)) {              // or �̿��ؼ� continue ���
					continue;
				}
				count2++;
			}
			System.out.println(count2);
			
			System.out.println("======================");
			
			
		// ((i%2)==0) && ((i%3==0)
			int j;
			int count3 = 0;
			// i=6
			for (j = 1; j <= 1000; j++) {
	
				if ((j % 2 == 0) && (j % 3 == 0)) {              //and �̿��ϸ� continue���� �ٷ� count���
					count3++;
				}
	
			}
			System.out.println(count3);
				
			
			
		
	}
}
