package edu.kosmo.ex.main;
//10�� 22�� ���ļ���

//��
//- ���� Sparrow
//- ��ѱ� 
//- ����

class Bird{
	
	public void fly() {
		System.out.println("���� ���� �ٴմϴ�.");
	}
	
}



class Sparrow extends Bird {
	public void fly() {
		System.out.println("�� ���� 100���͸� ���� �ٴմϴ�.");
	}
}

class Pizone extends Bird  {
	public void fly() {
		System.out.println("�� ���� 2000���͸� ���� �ٴմϴ�.");
	}
}

class RubBird extends Bird  {
	public void fly() {
		System.out.println("���� �� �մϴ�.");
	}
}

public class PolyTest {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.fly();
		
		//PolyMorphism ����
		bird = new Sparrow();
		bird.fly();
		
		bird = new Pizone();
		bird.fly();

		
		//�ǹ����� �̷��� §��.
		//�迭�� �Լ���������¡�� �����ϰ� ��췯��. 
		Bird[] arrBir = {new Bird(), new Sparrow(), new Pizone()};
		for (Bird bird2 : arrBir) {
			bird2.fly();
		}
				

	
	}

}
