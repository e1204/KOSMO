//1. �Լ� ����� ��(����) 2.�Լ� ��Դ� ��(ȣ��)
public class Method2 {

	public static void main(String[] args) {

		double myHeight = 175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		byEveryone();

	}

	public static void hiEveryone(int age, double height) { //�Ķ���� ���� �� �� �� ����

		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� Ű�� " + height + "cm �Դϴ�.");

	}

	public static void byEveryone() { //�Ķ����(�Ű�����)�� ����~

		System.out.println("������ �˰ڽ��ϴ�.");

	}

}

//�Լ���� ���� �⺻������ '���'�� ����
//byEveryone�̶�� ����� "������ �˰ڴ�"��� ������ ���� ����̰�
//hiEveryone�� Ű�� ����ϴ� ��� ����
// �Լ� is the ���//public static�� �Լ� �ƴ�