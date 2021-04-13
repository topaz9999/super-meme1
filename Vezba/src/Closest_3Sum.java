import java.util.TreeMap;

public class Closest_3Sum {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>();
		tree.put(1, tree.getOrDefault(1, 0) + 1);
		System.out.println(tree.toString());
		
		

	}

	public static int[] closestSumumThree(int num, int[] arr) {
		int[] result = new int[3];
		int difference = Integer.MAX_VALUE;
		int temp;
		int sum = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum > num) {
						temp = sum - num;
					} else {
						temp = num - sum;
					}

					if (temp < difference) {
						difference = temp;
						result[0] = arr[i];
						result[1] = arr[j];
						result[2] = arr[k];
					}
					if (temp == 0) {
						return result;
					}
				}
			}
		}
		return result;
	}



	}


