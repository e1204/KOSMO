package Nov08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InterableTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		// �ν��Ͻ� ����
		list.add("Toy"); list.add("Box");
		list.add("Robot"); list.add("Box");

		// �ݺ���(iterator) ȹ��
		Iterator<String> itr = list.iterator();

		// �ݺ��ڸ� �̿��� ������ ����
		while (itr.hasNext())
			System.out.print(itr.next() + '\t');

		System.out.println();

		// �ݺ��� �ٽ� ȹ��
		itr = list.iterator();

		// "Box"�� ����
		String str;
		while (itr.hasNext()) { //hasNext ���� ���� true false�� üũ
			str = itr.next();

			if (str.equals("Box"))
				itr.remove();
		}

		// �ݺ��� �ٽ� ȹ��
		itr = list.iterator();

		// ���� �� ��� Ȯ��
		while (itr.hasNext())
			System.out.print(itr.next() + '\t');

		System.out.println();

	}

}
