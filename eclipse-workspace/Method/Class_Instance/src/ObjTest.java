
class A{	
	int num;
	
	//n�� 10�� �ް� �Ǹ� num�� 10�� �����Ѵ�. �׷� num���� 10�Ǿ� �޸𸮷� �ö�
	void setNum(int n) { 
		num =n;
	}
	
	//�ݵ�� void�� �ƴ϶� int. �ֳ��� int num�� �޾ƿð���. �ֳ�. ���� num �󸶸� �־����� ���������Ҷ� ���
	int getNum(){
		return num;
	}
	
	void printNum() {
		System.out.println(num); //(2)
	}
}


public class ObjTest {
	public static void main(String[] args) {
		
		A a; 
		a = new A();  //��������
		
		//a.num = 10;
		a.setNum(10);
		int num = a.getNum();
		a.printNum(); //����� 10�� �ǵ��� > num���� �Ѹ��� �Լ��� ������ (1)
		
		//a.num = 10; 
		//a.num = 20; //������ �ִ� ������ ��ü����
		
		//System.out.println(a.num);
		
	}
}


