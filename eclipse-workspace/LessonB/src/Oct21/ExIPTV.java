package Oct21;

class TV2 {
	private int size;

	public TV2(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV2 extends TV2 {
	private int color;

	public ColorTV2(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize() + "��ġ " + color + "�÷�");

	}

}

class IPTV extends ColorTV2 {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	public void printProperty() {
		System.out.print(ip + " �ּҿ� ");
		//System.out.println(ip + " �ּҿ� " + super.getSize() + "��ġ, " + this.color + "�÷�");
		super.printProperty();

	}
}

//192.1.1.2 �ּҿ� 32��ġ, 2048�÷�

public class ExIPTV {
	public static void main(String[] args) {

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

		iptv.printProperty();

	}

}
