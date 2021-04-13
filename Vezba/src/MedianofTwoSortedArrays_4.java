import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianofTwoSortedArrays_4 {

	public static void main(String[] args) {

		int[] niz1 = { 1, 4, 7, 3, 6, 2 };
		int[] niz2 = { 5, 9, 3, 2, 0, 4 };
//0 1 1 2 2 3 3 4 4 5 6 7 9
		System.out.println(mediana(niz1, niz2));

	}

	public static double mediana(int[] arr1, int[] arr2) {
		double mediana = 0;
		int[] res = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];

		}
		for (int i = 0; i < arr2.length; i++) {

			res[i + arr1.length] = arr2[i];

		}

		res = sortArray(res);

		int size = res.length;
		if (size % 2 == 0) {

			mediana = (double)(res[(size / 2)-1] + (res[size / 2])) / 2;

		} else {
			mediana = res[size / 2];
		}

		return mediana;
	}

	public static int[] sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		return arr;
	}

}



