package Nov03;

class DBox<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;

	}

	@Override
	public String toString() {
		return left + " & " + right;
	}

}

class DDBox<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;

	}

	@Override
	public String toString() {
		return left + "\n" + right;
	}

}

public class DDBoxDemo {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);

		System.out.println(ddbox);
	

	}

}
