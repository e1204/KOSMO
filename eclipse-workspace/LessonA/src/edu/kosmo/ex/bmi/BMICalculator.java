//Oct19
package edu.kosmo.ex.bmi;

/*����ڷκ��� Ű�� �Է� �޾Ƽ� ǥ�� ü���� ����� �Ŀ� ������� ü�߰� ���Ͽ� 
��ü������, ǥ�� ����, ��ü�������� �Ǵ��ϴ� ���α׷��� �ۼ��϶�. 
ǥ�� ü�� ������ ������ ����϶�.
ǥ��ü��(kg) = ( Ű(cm) - 100 ) * 0.9

�Է�:
Ű(cm)�� �Է��ϼ���. : 193
ü��(kg)�� �Է��ϼ���. : 25
���:
ǥ�� ü���� 83.7�Դϴ�.
����� ��ü�� �Դϴ�.  */

public class BMICalculator{
	
	private double height;
	private double weight;
	
	public BMICalculator (double height, double weight){
		this.height = height;
		this.weight = weight;
	} 
	
	public void printResult() {
		double mWeight = ( height - 100 ) * 0.9; //�̰� ǥ�� ü��. 0.9���ؾ��ؼ� double
		
		System.out.println("ǥ�� ü���� " + mWeight +"�Դϴ�.");
		
		if ( weight > mWeight ) {
			System.out.println("����� ���Ȱ��Դϴ�.");
		}else if( weight < mWeight ) {
			System.out.println("����� ��ġ�Դϴ�.");	
		}else {
			System.out.println("����� ǥ�� ü���Դϴ�.");
		}
		
	}
	
			
			

		
	

}
