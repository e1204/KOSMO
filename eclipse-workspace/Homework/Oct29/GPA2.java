package Oct29;
public class GPA2 {
	public static void main(String[] args) {
		Student2 st = new Student2("�����", 20, "����� ���Ǳ�", "���缭����б�", "���������а�", 20132222);
		st.printInfo();
		System.out.println();

		st.setGpa();
		System.out.println("8�б� �� ��� ������ " + st.averaege() + "�Դϴ�.");

	}

}
