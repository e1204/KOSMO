package Oct21;
//14�� ��� extend

class Man {
	String name;
	
	Man(String name){
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("my name is " + name);
	}

}

//Man Ŭ������ �� �� �����ڴ�.
class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {
		super(name); //�θ� �ִ� ������ ȣ�� Man(String name){this.name = name;}
		
		this.company = company;
		this.position = position;
	}

	public void tellYouInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}

public class ExtendBasic {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("Avery", "Hybrid ElD", "Staff Eng.");

		man.tellYourName();

	}

}
