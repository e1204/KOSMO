package num08.money;

class Money {

	private int money;

	Money(int money) {
		setMoney(money);
	}

	public void setMoney(int money) {
		if (money < 0) {
			System.out.println("잘못된 입력입니다.");
			this.money = 0;

			return;
		}
		this.money = money;

	}

	public void show() {
		System.out.println("오만원: " + (money / 50000) + "장");
		money = money % 50000;
		System.out.println("만원: " + (money / 10000) + "장");
		money = money % 10000;
		System.out.println("오천원: " + (money / 5000) + "장");
		money = money % 5000;
		System.out.println("천원: " + (money / 1000) + "장");
		money = money % 1000;
		System.out.println("오백원: " + (money / 500) + "장");
		money = money % 500;
		System.out.println("백원: " + (money / 100) + "장");
		money = money % 100;

	}

}
