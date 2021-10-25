package Oct20;

//10��
/*
 Rectangle �� �迭�� 3�� ����

�ش� ��ü�� �ε��� ������� ���� ���� ���� - 
�̹����� �ݵ�� scanner �� �Է� ������

�ش� �迭�� �ִ� Rectangle �� �ѳ����� ���� ���Ͻÿ�.

���� �Ʒ��� �Լ��� �����(static ���� �����)
- �Ķ���͸� Rectangle �迭�� �޾Ƽ� �ش� �迭�� ��� �մ� 
Rectangle �鿡 �� ���̸� ���� �ϴ� �Լ��� ����ÿ�. 
 */

import java.util.Scanner;

class Rectangle {

	private int width, height;

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

public class RecArr {
	public static void main(String[] args) { // �����ڸ� �� �������. �̰� �ٽ�

		Scanner sc = new Scanner(System.in);

		Rectangle[] rec = new Rectangle[3];

		// rec.length �������ư���. >> for������ �� 6�� �Է�
		for (int i = 0; i < rec.length; i++) {
			System.out.println("����: ");
			int width = sc.nextInt();
			
			System.out.println("����: ");
			int height = sc.nextInt();
		
			rec[i] = new Rectangle(width, height);
			
			System.out.println("�簢��" + (i+1)+"�� ����: " + rec[i].getArea());
			System.out.println();

		}

		System.out.println("�� ����: " + Rectangle.getRecArea(rec));
		
	}
}
