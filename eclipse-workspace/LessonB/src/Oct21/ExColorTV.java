package Oct21;

class TV {
	private int size; // private�� ���� protected�� ���ƴµ� ..

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

}

class ColorTV extends TV {
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;

	}

	public void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�");

	}

}

//���� main()�޼ҵ�� ���� ����� �����Ͽ� TV�� ��ӹ��� ColorTV Ŭ������ �ۼ��϶�.
public class ExColorTV {
	public static void main(String[] args) {

		ColorTV myTV = new ColorTV(32, 1024);

		myTV.printProperty();

	}

}

//32��ġ 1024�÷�
