//Oct20
package edu.kosmo.ex.shape;

public class CircleArr {

	private double r;

	public CircleArr(double r) {
		this.r = r;

	}

	// ������ Ȯ���ϰ� ���� �� �߰��ؼ� r�� �̾Ƴ���.
	public double getR() {
		return r;
	}

	// ������ Ȯ���ϰ� ���� �� �߰��ؼ� r�� �̾Ƴ���.
	public void setR(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}
	
/*�ݹ� ���� Circle Ŭ������ �Ʒ��� �Լ��� ����ÿ�.
-�Ķ���͸� Circle �迭�� �޾Ƽ� �ش� �迭�� ��� �ִ� Circle�鿡 
�� ���̸� ���� �ϴ� �Լ��� ����ÿ�. */
	
	//static ���̸� �޸𸮿� ���� �ö�.
	//�׷��� �� �� ����� �� ������
	public static double getArrArea(CircleArr[] cirArr) {
		double sum = 0;
		
		for(int i =0; i < cirArr.length; i++) {
			sum += cirArr[i].getArea();
			System.out.println("������: " + cirArr[i].getR());
		}
		return sum;
		
		
	}

}
