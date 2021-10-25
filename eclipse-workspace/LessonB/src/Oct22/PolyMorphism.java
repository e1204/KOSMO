package Oct22;
//ù��° ����
class MobilePhone {
	protected String number; // ��ȭ��ȣ

	public MobilePhone(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer; // �ȵ���̵� �ü�� ����(����)

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}

}

public class PolyMorphism {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");

		ph1.answer(); // ��ȭ�� �޴´�.
		ph1.playApp(); // ���� �����ϰ� �����Ѵ�.
		System.out.println();
		
		
		//������
		//�θ�
		int a = 100; //32��Ʈ
		double num =a ; //64��Ʈ �ڵ�����ȯ
		
		//���۷��� Ÿ�Կ��� ��Ģ�� ����.
		//���� �θ�              ������ �ڽ�
		//�θ� = �ڽ�. (feat. ����ȯ����)(������)
		//�ڵ�����ȯ ���� �Ǵ���. ������ζ�� MobilePhone ph2 = (SmartPhone)new SmartPhone(); �䷡��
		MobilePhone ph2 = new SmartPhone("010-999-333", "Nougat");
		ph2.answer(); // ph2.playApp();�̰� ������ ������ ��

	}

}
