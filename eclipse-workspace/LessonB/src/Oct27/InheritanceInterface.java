package Oct27;

interface Printable {
	void print(String doc);
}

//�������̽� �� ��ӵ� extends�� ǥ��
interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

//���� Ŭ���� ���� ���ʿ�
class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}

//���� Ŭ���� ���� ���ʿ�
class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

//���ο� ������ ����̹�
class Prn909Drv implements ColorPrintable {
	@Override
	public void print(String doc) { // ������
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) { // �÷����
		System.out.println("CMYK ver");
		System.out.println(doc);
	}

}

public class InheritanceInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);

		System.out.println();
		prn.printCMYK(myDoc);

	}

}
