package Oct26;

//4��
public class PrinterInterface {
	public static void main(String[] args) {
		String myDoc = "This is a report about..";

		// ���� ������
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// ���� ������
		prn = new LPrinterDriver();
		prn.print(myDoc);

	}

}
