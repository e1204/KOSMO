//BankAccount ������ ����
class TV {
	
	String brand;
	int year;
	int inch;
	
	//������
	TV(String brand, int year, int inch){		
		this.brand = brand;
		this.year = year;
		this.inch = inch;
				
	}	
	
	//show�Լ� 
	public void show(){
		System.out.println(brand + "���� ���� " + year + "�� " +inch+"��ġ" );
				
	}

}

public class Practice{
	public static void main(String[] args) {
				    //������(TV)�� ��� ���� �ʱ�ȭ;					
		TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ
		
		myTV.show();
		
		
		
		TV yourTV = new TV("�Ｚ", 2021, 70);
		yourTV.show();
		
						
	}
}

/*
 * ��°�
 * LG���� ���� 2017�� 32��ġ
 */