package Oct20;

//5��
/*
 public static void main(String[] args) {
	Box[] ar = new Box[5];
	ar[0] = new Box(101, "Coffee");
	ar[1] = new Box(202, "Computer");
	ar[2] = new Box(303, "Apple");
	ar[3] = new Box(404, "Dress");
	ar[4] = new Box(505, "Fairy-tale book");

	for (Box e : ar) {
		if (e.getBoxNum() == 505)
			System.out.println(e);
	}
}
  */
class Box{
	
	//�������
	private int num;
	private String word;
	
	//��ü���� = ������ ����
	Box(int num, String word){
		this.num = num;
		this.word = word;
		
	}
	
	
	public int getBoxNum() {
		
		return num;
		
	}
	
	public String toString(){  //toString �ּҰ��� ���ڿ��� ��ȯ
		return word;
	}

	
}


public class BoxClass {
	public static void main(String[] args) { 
		
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		

		for (Box e : ar) {
			if (e.getBoxNum() == 505)
				System.out.println(e);
		}
	}
		
		
}
