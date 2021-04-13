import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists_21 implements Comparator<Integer> {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		l1.add(2);
		l1.add(22);
		l1.add(3);
		l1.add(6);
		l1.add(97);
		l1.add(47);
		l2.add(1);
		l2.add(15);
		l2.add(4);
		l2.add(99);
		l2.add(42);
		l2.add(31);
		l2.add(9);
		l2.add(8);
		
		List<Integer> res = new LinkedList<Integer>();
		res = mergeLinkedLists(l1, l2);
		
		System.out.println(res.toString());
	}

	public static List<Integer> mergeLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		List<Integer> result = new LinkedList<Integer>();

		l1.addAll(l2);

		Collections.sort(l1, new MergeTwoSortedLists_21());
		result = l1;
		return result;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return 1;
		} else if (o1 < o2) {
			return -1;
		} else {
			return 0;
		}

	}
	

}

