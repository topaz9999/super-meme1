
public class IntegerToRoman {

	public static void main(String[] args) {
		System.out.println(integerToRoman(3));
		System.out.println(integerToRoman(4));
		System.out.println(integerToRoman(9));
		System.out.println(integerToRoman(58));
		System.out.println(integerToRoman(888));
		System.out.println(intToRoman(800));
		System.out.println(integerToRoman(5555));

	}

	public static String integerToRoman(int number) {
		String small = "I";
		String medium = "V";
		String large = "X";
		String result = "";

		for (int i = 0; i < 4; i++) {
			if (number > 0 && i == 1) {
				small = "X";
				medium = "L";
				large = "C";
			} else if (number > 0 && i == 2) {
				small = "C";
				medium = "D";
				large = "M";
			}else if (number > 0 && i == 3) {
				for (int j = 0; j < number; j++) {
					result = large + result;
				}
				return result;
			}

			int res = number % 10;

			if (res == 4) {
				result = small + medium + result;
			} else if (res == 9) {
				result = small + large + result;
			} else if (res == 5) {
				result = medium + result;
			} else if (res < 5) {
				for (int j = 0; j < res; j++) {
					result = small + result;
				}
			} else {
				for (int j = 0; j < res - 5; j++) {
					result = small + result;
				}
				result = medium + result;
			}

			number = number / 10;

		}

		return result;
	}
	
	public static String intToRoman(int num) {
        String[] dict = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = new int[]      {1000, 900, 500, 400,  100,  90,  50,   40,  10,   9,    5,   4,    1 };
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int i = 0;
            while (nums[i] > num) {
                i++;
            }
            result.append(dict[i]);
            num -= nums[i];
        }
        return result.toString();
    }




	}


