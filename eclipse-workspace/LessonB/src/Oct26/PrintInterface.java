package Oct26;
//���ļ���
//interface�ؼ� MS OS�� ������.
//Print ���ۻ���� �� �ȿ��� ���ư����� ¥�� ��.  
//�� ������ print�� ������� ��. �Ծ�, ǥ���̶�� ��
//������� polyMorphism����. �Լ��������̵� Ȱ���ϱ� ���ؼ� 
interface Printable {
	public void print(String doc);
}

class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}

class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

public class PrintInterface {
	public static void main(String[] args) {

		String myDoc = "This is a report about...";

		// �Ｚ �����ͷ� ���
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);

		System.out.println();

		// �Ｚ �����ͷ� ���
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
