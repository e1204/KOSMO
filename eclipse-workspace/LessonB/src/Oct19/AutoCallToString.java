package Oct19;

class Box{
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	
	@Override  //<< ������ �̰� �ٿ��ִ°� ����
	public String toString() {
		
		return conts; //���ڿ� ��ȯ
		
		//System.out.println("������ ȣ���ϰ� �ִ�");
		//return"Camera";
		
		
	}	
}

public class AutoCallToString {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb); //stb��� ��ü�� �־���
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		
		//box = null; //�޸𸮿� ���踦 ���´�.
		
		System.out.println(box);

		

	}
}
