package Oct27;
//��� �մ�� ���� �𸣰��� ������ �Ф� 
interface Printable3 {
	static void printLine(String str){
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc); //�������̽��� static �޼ҵ� ȣ��
	}
}

//���� Ŭ���� ���� ���ʿ�
class SPrinterDriver3 implements Printable3 {
	@Override
	public void print(String doc) {		
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}
//���� Ŭ���� ���� ���ʿ�
class LPrinterDriver3 implements Printable3 {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

//���ο� ������ ����̹�
class Prn909Drv3 implements Printable3 {
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

public class StaticInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		Printable3 prn = new Prn909Drv3();
		prn.print(myDoc);

		System.out.println();
		prn.printCMYK(myDoc);

	}

}
