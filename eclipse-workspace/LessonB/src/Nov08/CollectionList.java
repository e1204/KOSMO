package Nov08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CollectionList {
	public static void main(String[] args) {
		
		//�� �� ���� �迭�� arraylist�� �ٲٴ� �۾��̴�.
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator();
		String str;
		
		//���ʿ��� ���������� 
		while(litr.hasNext()) {
			str = litr.next();
			System.out.println(str + '\t');
			
			if(str.equals("Toys"))
				litr.add("Toys2");
		}
		System.out.println();
		
		//�����ʿ��� �������� 
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.println(str + '\t');
			
			if(str.equals("Toys"))
				litr.add("Toys2");
		}
		
		

	}

}
