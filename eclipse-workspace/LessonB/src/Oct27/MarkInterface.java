package Oct27;

interface Sea {}// ��Ŀ �������̽�
interface Ground {}// ��Ŀ �������̽�

interface Serializable {
	// ���� ���簡 ���� ��ǥ���� ��ũ�������̽�
	// f3ġ�� ���� ��������ver ������ ����
}

interface Location {
	void printLive();
}

class Fish implements Location, Sea {
	@Override
	public void printLive() {
		System.out.println("�ٴٿ� ��ϴ�.");
	}

}

class Tiger implements Location, Ground {
	@Override
	public void printLive() {
		System.out.println("������ ��ϴ�.");
	}

}

public class MarkInterface {
	// ������ ���Ե� �ش� Ŭ�������ٰ� �Լ� ������ϸ�
	// static �ٿ��� ��������. 
	// �ֳ� static���� �����Լ����� �̾Ƴ��� �ٽ� �Լ� ����°Ŵϱ�
	public static void printLocation(Location loc) {
		if (loc instanceof Sea) {
			System.out.println("�ٴٿ� ��ϴ�.");
		} else if (loc instanceof Ground) {
			System.out.println("������ ��ϴ�.");
		} else {
			System.out.println("�ܰ�����Դϴ�.");
		}
	}

	public static void main(String[] args) {
		Location loc1 = new Fish();
		Location loc2 = new Tiger();

		printLocation(loc1);
		printLocation(loc2);

	}

}
