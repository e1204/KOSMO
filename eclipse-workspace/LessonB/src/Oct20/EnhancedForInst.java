package Oct20;

class Box1 {

	private String contents;
	private int boxNum;

	public Box1(int boxNum, String contents) {
		this.boxNum = boxNum;
		this.contents = contents;
	}

	public int getBoxNum() { // int�� �ƴ϶� String���� �ؼ� �ȳ����� �־��� �� �Ф�
		return boxNum;

	}
	
	//���� ��� �Ǵ� �� ����. �׷��� ���������� ������ ���� ���� �ְ� ��.
	//�ֳ�? ������ �� ������� �𸣴ϱ�!
	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}

	public String toString() {
		return contents;
		//return contents + boxNum;
	}

}

public class EnhancedForInst {
	public static void main(String[] args) {

		Box1[] ar = new Box1[5];
		ar[0] = new Box1(101, "Coffee");
		ar[1] = new Box1(202, "Computer");
		ar[2] = new Box1(303, "Apple");
		ar[3] = new Box1(404, "Dress");
		ar[4] = new Box1(505, "Fairy-tale book");

		// �迭 ��� ��ü ���
		for (Box1 e : ar) {
			//�����Լ� ����� ���: �����Լ� + ������
			if (e.getBoxNum() == 505)
				System.out.println(e); //���������� toString�� ȣ���ϰ� �Ǿ�����. �׷��� �����ٰ� toString�Լ��� ���� ��.
		}
	}

}
