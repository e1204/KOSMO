package Oct26;

//10��
public class Circle2 implements AreaGetable {
	private int r;

	public Circle2(int r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}

}
