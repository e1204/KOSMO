package Oct20;

import java.util.Scanner;

class Rectangle {

	private int width, height;
	
	//������ ����
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int getArea() {
		return width * height;
	}


	public static int getRecArea(Rectangle[] rec) {
		int sum = 0;
		for (int i = 0; i < rec.length; i++) {
			sum += rec[i].getArea();
			
		}
		return sum;

	}

}

public class ArrRec {
	public static void main(String[] args) { 
		
		Rectangle[] rec = new Rectangle[3];
		
		//�Է¹ޱ� ���� Scanner ����
		Scanner sc = new Scanner(System.in);
		
		//�ش� Rectangle �迭�� �游ŭ for���� ������.
		for (int i = 0; i < rec.length; i++) {
			
			System.out.println("���ο� ���θ� �Է��ϼ���");
			int width = sc.nextInt();
			int height = sc.nextInt();
		
			//width height�� �Է¹��������� ���� �Է¹޴� �� ����
			rec[i] = new Rectangle(width, height);

		}
		
		// static�Լ� ���� ���� �ؿ� �׳� ������ �Ǵµ�
		// ����ƽ �Լ� �߰��Ϸ����ϱ� �̰� �״�� ctrl x �ؼ� static�Լ��� ������ ��
		/*
		 int sum =0;
		for (int i = 0; i < rec.length; i++) {
			sum = sum + rec[i].getArea();
		}
		System.out.println(sum);
		*/


		System.out.println("�� ����: " + Rectangle.getRecArea(rec)); //�ش� Rectangle�迭�� �־����
	
	}
}
