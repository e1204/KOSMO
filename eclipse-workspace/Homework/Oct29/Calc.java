package Oct29;
//7��
abstract class Calc {
	protected int a, b; //����ҰŶ� protected
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}

