package Nov08;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.List;
import java.util.Set;

public class HashSetE {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//List<String> set = new ArrayList<>(); ���� �ߺ��Ǿ� �ν��Ͻ� ���� 4�� ��µȴ�.
		set.add("Toy"); set.add("Box");
		set.add("Robot"); set.add("Box");
		System.out.println("�ν��Ͻ� ��:" + set.size());

		// �ݺ��ڸ� �̿��� ��ü ���
		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();

		// for-each���� �̿��� ��ü ���
		for (String s : set)
			System.out.print(s + '\t');
		System.out.println();

	}

}
