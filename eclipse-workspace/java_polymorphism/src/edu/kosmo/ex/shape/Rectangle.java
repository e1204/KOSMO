package edu.kosmo.ex.shape;

public class Rectangle extends Shape {

	private int width, height;
	
	public Rectangle (int width, int height) {
		this.height = height;
		this.width = width;
	}

	//�ݵ�� double���ϰ� �Լ��̸� getArea()�� ������
	//Circle class�� �Լ��������̵� ��ų�Ŷ� 
	public double getArea() {
		return width * height;
	}

}
