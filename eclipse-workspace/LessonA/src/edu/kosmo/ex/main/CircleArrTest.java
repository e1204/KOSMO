//Oct20
package edu.kosmo.ex.main;

import edu.kosmo.ex.shape.CircleArr;

public class CircleArrTest{
	public static void main(String[] args) {
		
		CircleArr c = new CircleArr(3);
		System.out.println(c.getArea());
		
		
		//�迭�����ؼ��� �����ڰ� ����. �׷��� �׳� �ټ��� �����÷� �����־�
		CircleArr[] cirArr = new CircleArr[5]; 
		
		//Circle�� ���� �ټ� �� ���� ����
		cirArr[0] = new CircleArr(1);
		cirArr[1] = new CircleArr(1);
		cirArr[2] = new CircleArr(1);
		cirArr[3] = new CircleArr(1);
		cirArr[4] = new CircleArr(1);
		
		//��������� �� �Է�
		for(int i = 0; i<cirArr.length; i++) {
			int r = (int)((Math.random()*100)+1);
			cirArr[i] = new CircleArr(r);
			
		}
		
		//�� ������ ���
		double sum = 0;
		
		for(int i =0; i < cirArr.length; i++) {
			sum = sum + cirArr[i].getArea();
			//sum += cirArr[i].getArea();
			
			//������ Ȯ���ϰ� ���� �� class ArrCircle�� ���ͼ��� �Լ� ����� ��.
			System.out.println("������: " + cirArr[i].getR());
			
		}
		System.out.println("�� ����: " + sum);
		
		//CircleArr[] cirArr = new CircleArr[5]; �̰Ÿ� �ִ°�
		System.out.println("�� ����: " + CircleArr.getArrArea(cirArr));
		System.out.println("�� ����: " + cirArr[1].getArrArea(cirArr));
		
	}

}



