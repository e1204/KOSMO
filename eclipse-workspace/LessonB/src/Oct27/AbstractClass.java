package Oct27;

abstract class A {
	// �Ϲ����� Ŭ���������� �Լ��� ��� �����ؾ� ��.
	public void one() {
		System.out.println("�޼ҵ� �ϳ�");
	}

	public abstract void two(); // �������� ����. �ڼ��� �����ض�

}

class B extends A {
	@Override
	public void two() {
		System.out.println("�޼ҵ� ��");
	}

}

public class AbstractClass {
	public static void main(String[] args) {

		B b = new B();
		b.one();
		b.two();
		
		//polyMorphism�����غ���
		//�޸𸮿� �ø��°� �ȵ����� �ڼ��� ���ؼ��� ������
		A a = new B();
		a.one();
		a.two();

	}

}
