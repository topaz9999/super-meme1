import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 6, 2, 3, 7, 5, 10, 1, 4, 3,1 };
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = fourSum(arr, 20);
		System.out.println(result.toString());

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);

		if (nums.length < 4)
			return res; // no solution

		boolean left = true;
		int rout, lin, rin, sum;
		rout = nums.length - 1;
		for (int lout = 0; lout < rout; lout++) {

			for (int j = lout + 1; j < nums.length - 2; j++) {

				lin = j;
				rin = rout - 1;

				while (lin < rin) {
					sum = nums[lout] + nums[lin] + nums[rin] + nums[rout];
					if (sum == target) {// result found
						res.add(Arrays.asList(nums[lout], nums[lin], nums[rin], nums[rout]));
						lin++;
						rin--;
						// skip same values nearby
						while (lin < rin && nums[lin] == nums[lin - 1])
							lin++;
						while (lin < rin && nums[rin] == nums[rin + 1])
							rin--;
					} else if (sum < target) {
						lin++;
					} else {
						rin--;
					}

				}
				if (left) {
					lout++;
					left = false;
				} else {
					rout--;
					left = true;
				}

				// skip same value nearby
				while (lout < rout - 2 && nums[lout] == nums[lout - 1])
					lout++;
				while (rout > lout + 2 && left == true && nums[rout] == nums[rout + 1])
					rout--;
			}

		}
		return res;

	}



	}


