import java.util.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		LinkedList<Integer> first = new LinkedList<Integer>();
		first.add(5);
		first.add(3);
		first.add(6);
		first.add(1);
		LinkedList<Integer> second = new LinkedList<Integer>();
		second.add(4);
		second.add(1);
		second.add(2);
		second.add(8);
		
		System.out.println(addTwoNumbers(first, second));

	}
	
	
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> first, LinkedList<Integer> second){
		int a = 0;
		int b = 0;
		
		while(!first.isEmpty()) {
			a = a * 10 + first.pollLast();
			b = b * 10 + second.pollLast(); 
		}
		
		int res = a + b;
		LinkedList<Integer> result = new LinkedList<Integer>();
		while(res > 0) {
			result.add(res % 10);
			res /= 10;
		}
		
		return result;
	}




	}


