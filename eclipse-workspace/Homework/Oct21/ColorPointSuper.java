package Oct21;

//���� 5��
public class ColorPointSuper extends PointSuper {

	private String color;

	public ColorPointSuper(int x, int y, String color) {
		super(x, y);
		this.color = color;

	}
	
/*	public String getColor() {
		return color;
	}*/
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public String toString() { //super.get���� ���;��ϳ�...
		
		String str = null;; //�̰� �� ����
		str = color + "���� (" + super.getX() + ","+super.getY()+")�� ��";
		//super.getX()�� 10, super.getY()�� 20
		 return str;
		
	}

}



/*
 * 
 * cp.setXY(10, 20); 
 * cp.setColor("RED"); 
 * String str = cp.toString();
 * System.out.println(str + "�Դϴ�. ");
 */
