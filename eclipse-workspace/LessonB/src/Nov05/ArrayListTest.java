package Nov05;

//1���� 100���� arrayList�� ����ְ� ����ϱ�
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++)
			list.add(i);

		// �ν��Ͻ� ���� (���)
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

	}

}
