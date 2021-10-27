package Oct27;

interface Printable2 {
	void print(String doc);
	default void printCMYK(String doc) {} //����Ʈ �޼ҵ�
}

//���� Ŭ���� ���� ���ʿ�
class SPrinterDriver2 implements Printable2 {
	@Override
	public void print(String doc) {		
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}
//���� Ŭ���� ���� ���ʿ�
class LPrinterDriver2 implements Printable2 {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

//���ο� ������ ����̹�
class Prn909Drv2 implements Printable2 {
	@Override
	public void print(String doc) {			//������
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {		//�÷����
		System.out.println("CMYK ver");
		System.out.println(doc);
	}

}

public class DefaultInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		Printable2 prn = new Prn909Drv2();
		prn.print(myDoc);

		System.out.println();
		prn.printCMYK(myDoc);

	}

}
