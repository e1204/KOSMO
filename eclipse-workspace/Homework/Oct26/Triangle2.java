package Oct26;

//10��
public class Triangle2 implements AreaGetable {
	private int width, height;

	public Triangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height * (0.5);
	}

}
