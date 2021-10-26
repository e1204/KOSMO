package java_interface;
//Oct26 �������� ������
//17��

interface Printable{ //class�ڸ��� interface 
	public abstract void print(String doc);  //������ public abstract //�߰�ȣ�� ����. ���°� ���� �ٸ���
}

class Printer implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}

}

public class InterfaceTest {
	public static void main(String[] args) {
		Printable printable = new Printer();
		printable.print("Hello World");
		

	}

}
