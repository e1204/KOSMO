package Oct21;


class SuperClass {
	protected static int count = 0; //Ŭ���� ����
	
	public SuperClass() {
		count++; //Ŭ���� �������� ���� ������ ����
		System.out.println("ȣ���");
	}	
}

//SubCLS obj3 = new SubCLS();
//obj3.showCount();
class SubClass extends SuperClass { //�ϴ� ����� �ްԵǸ� �θ� �ִ� ���� �޸𸮿� �ø�. �����ڸ� �ݵ�� ȣ��
	
	public SubClass() {
		super(); //�ڡڡ������Ϸ��� �־��ش�. �׷��� count++�� 3�� �Ǿ ȣ���
	}
	public void showCount() {
		System.out.println(count); //���� Ŭ������ ��ġ�ϴ� Ŭ���� ������ ����
	}
} //�׷��� ���� Ŭ�������� �̸������� ���� ����! ���� ���� �����ڿ��� ����Ѵٸ� !

class ForInFor{
	public static void main(String[] args) {
		
		SuperClass obj1 = new SuperClass();
		SuperClass obj2 = new SuperClass();
		SubClass obj3 = new SubClass();
		
		obj3.showCount();
		

	}

}
