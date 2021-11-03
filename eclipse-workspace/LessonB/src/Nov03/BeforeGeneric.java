package Nov03;

class Apple1 {

	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange1 {

	@Override
	public String toString() {
		return "I am an orange.";
	}
}

//���� ���ڴ� ����� �������� ���� �� �ִ�.
class Box1 {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class BeforeGeneric {
	public static void main(String[] args) {

		// ��ü�� �ڽ� ����
		Box1 aBox = new Box1();
		Box1 oBox = new Box1();

		// ������ �ڽ��� ���� ���ϱ�?
		aBox.set("Apple");
		oBox.set("Orangea");

		// �ڽ����� ������ ����� ���� �� ������?
		Apple1 ap = (Apple1) aBox.get(); // �ݵ�� ����ȯ. object�� �Ǿ��ֱ⋚��
		Orange1 og = (Orange1) oBox.get();

		System.out.println(ap);
		System.out.println(og);

		// ���� ��� �ڽ� ����
		AppleBox1 aBox = new AppleBox1();
		OrangeBox1 oBox = new OrangeBox1();

		// ������ �ڽ��� ��´�.
		aBox.set(new Apple1());
		oBox.set(new Orange1());

		// �ڽ����� ������ ������.
		Apple1 ap = aBox.get();
		Orange1 og = oBox.get();

		System.out.println(ap);
		System.out.println(og);

	}

}
