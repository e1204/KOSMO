package Oct21;

//���� 6��
public class ColorTVSuper extends TVSuper {

	private int color;

	public ColorTVSuper(int size, int color) {
		super(size);
		this.color = color;

	}

	public void printProperty() {

		System.out.println(getSize() + "��ġ " + color + "�÷�");

	}

}
