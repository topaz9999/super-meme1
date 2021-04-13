import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4, 4, -2, -3 };
		sumThree(nums);

		List<List<Integer>> res = new ArrayList<>();
		res = threeSum(nums);

		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void sumThree(int[] arr) {

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("arr[" + i + "](" + arr[i] + ") + arr[" + j + "](" + arr[j] + ") + arr[" + k
								+ "](" + arr[k] + ") = 0");
					}
				}
			}
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();

		if (nums.length < 3)
			return res; // no solution

		Arrays.sort(nums);

		int l, r, sum;
		for (int i = 0; i < nums.length - 1; i++) {
			l = i + 1;
			r = nums.length - 1;

			while (l < r) {
				sum = nums[i] + nums[l] + nums[r];
				if (sum == 0) {// result found
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
					r--;
					// skip same values nearby
					while (l < r && nums[l] == nums[l - 1])
						l++;
					while (l < r && nums[r] == nums[r + 1])
						r--;
				} else if (sum < 0) {
					l++;
				} else {
					r--;
				}

			}

			// skip same value nearby
			while (i < nums.length - 1 && nums[i] == nums[i + 1])
				i++;
		}
		return res;
	}




	}


