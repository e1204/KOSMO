package Nov08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		list.iterator();

		ListIterator<String> litr = list.listIterator();
		String str;

		// ���ʿ��� ����������
		while (litr.hasNext()) {
			str = litr.next();
			System.out.println(str + '\t');

			if (str.equals("Toy"))
				litr.add("Toys2");
		}
		System.out.println();

		// �����ʿ��� ��������
		while (litr.hasPrevious()) {
			str = litr.previous();
			System.out.println(str + '\t');

			if (str.equals("Robot"))
				litr.add("Robot2");
		}
		System.out.println();

		// �ٽ� ���ʿ��� ����������
		for (Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next() + '\t');

		System.out.println();

	}

}
