package Oct21;
//���� 5��
public class PointSuper {

	private int x, y;

	public PointSuper(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public void setXY(int x, int y) { //���Ͱ� ����� �;���
		this.x = x;
		this.y = y;
		
	}

}