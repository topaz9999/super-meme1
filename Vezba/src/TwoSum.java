
public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 8, 9, 1, 4, 15, 6, 17, 8, 23, 2, 21, 14, 5, 6, 7, 18, 9 };
		int[] res = twoSum(arr, 35);

		System.out.println(res[0] + ", " + res[1]);

	}

	public static int[] twoSum(int[] arr, int target) {
		int[] res = new int[2];
		loop: for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					res[0] = arr[i];
					res[1] = arr[j];
					break loop;
				}
			}
		}
		return res;
	}




	}


