
public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] array = {1,8,6,2,5,4,8,3,7,9};
		
		System.out.println(largestContainer(array));

	}

	public static int largestContainer(int[] arr) {
		int max = 0;
		int y = 0;
		int x = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < 2) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < 2) {
					continue;
				}

				if (arr[i] < arr[j]) {
					y = arr[i];
				} else {
					y = arr[j];
				}
				x = j - i;
				int area = y * x;
				
				if (area > max) {
					max = area;
				}
			}
		}

		return max;
	}




	}


